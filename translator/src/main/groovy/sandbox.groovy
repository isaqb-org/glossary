/************************************************************************
 * This is free software - without ANY guarantee!
 *
 *
 * Copyright Dr. Gernot Starke, arc42.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *********************************************************************** */

def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(
        '{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}'
)

assert result.person.name == "Guillaume"
assert result.person.age == 33
assert result.person.pets.size() == 2
assert result.person.pets[0] == "dog"
assert result.person.pets[1] == "cat"



def translations = '''
{ "terms": [
  { "en":"Building block",
       "de":"Baustein"

  },
  { "en": "Tradeoff",
       "de": ["Kompromiss", "Abwägung"]
  }
]
}'''

def res2 = slurper.parseText(translations)

println res2

Map<String,List> map1  = new HashMap<String,List>();
List list1 = new ArrayList();
list1.add("Kompromiss");
list1.add("Abwägung")
map1.put("Tradeoff", list1);
assert map1.get("Tradeoff") == list1;
assert map1.get("Tradeoff").size() == 2
