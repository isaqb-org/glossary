#!/bin/bash

echo "Step 0: Check if script is running within correct environment"

echo "BASEPATH is $BASEPATH"

if [ ! -f "$BASEPATH/.gitmodules" ]; then
    echo "File .gitmodules does not exist in BASEPATH."
    echo "BASEPATH maybe incorrect. BASEPATH has to point to base path of iSAQB Glossary repository"

    BASEPATH=`pwd`
    if [ -f "$BASEPATH/.gitmodules" ]; then
      echo "Use current path as BASEPATH"
      echo "BASEPATH set to $BASEPATH"
    else
      echo "Abort!"
      exit -1;
    fi
else
    echo "File .gitmodules found in BASEPATH. Go ahead."
fi

cd "$BASEPATH/docs/1-terms"

# Cleanup maybe existing old temporary files
rm 0-structure_??_tmp?.adoc

parse_term_files() {
# Parse all term-files in subdirectories
# transform each term file into a sortable one liner for each supported language code

# structure: [SORTABLE CAPTION] ## [asciidoc fragment to include]
# asciidoc fragment to include could be: a) include-statement for term-file or b) caption/head line for new letter

  for f in $(find . -name 'term-*.adoc' -or -name 'term-*.asciidoc'); do
    echo "Processing $f file..."

    FILE=$f
    TERM=`cat $f | grep -E '\[#|tag::|end::|====' | grep -E '\[#'`
    CAPTION_EN=`cat $f | grep -E '\[#|tag::|end::|====' | grep -E -A 1 'tag::EN' | grep '====' | sed -e "s/[[:space:]]\{2,\}/ /g"`
    CAPTION_DE=`cat $f | grep -E '\[#|tag::|end::|====' | grep -E -A 1 'tag::DE'| grep '====' | sed -e "s/[[:space:]]\{2,\}/ /g"`
    echo $TERM $CAPTION_DE $CAPTION_EN $f

    echo "$CAPTION_DE  ## include::$f[{include_configuration}] $TERM" >> 0-structure_DE_tmp1.adoc
    echo "$CAPTION_EN  ## include::$f[{include_configuration}] $TERM" >> 0-structure_EN_tmp1.adoc
  done
}

process_language () {
# Parameter $1 - Language code
  echo "process language code $1"

# Add alphabet as captions (in format of regular terms, so it can be sorted)
  for x in {A..Z}
  do
      echo "==== $x ## === $x " >> 0-structure_$1_tmp1.adoc
  done

# sort terms case insensitiv
  sort -f 0-structure_$1_tmp1.adoc > 0-structure_$1_tmp2.adoc

# transform sortable term structure into regular adoc format by remove first part (sortable caption)
  sed 's/====.*## //g' 0-structure_$1_tmp2.adoc | sed 's/ \[#.*\]//g' > 0-structure-$1.adoc
}

echo "Step 1: parse all term files"
parse_term_files

echo "Step 2: create structure files for each language"
array=( "EN" "DE"  )
for i in "${array[@]}"
do
	process_language $i
done

echo "Step 3: Clean up (remove temporary files)"
rm 0-structure_??_tmp?.adoc