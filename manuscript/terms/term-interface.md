{lang=en}
### Interface

Multiple meanings, depending on context:

  1. Boundary across which two building blocks interact or communicate with each other.
  2. Design construct that provides an abstraction of the behavior of concrete components, declares possible interactions with these components and constraints for these interactions.

An example for the second meaning is the programming language construct from the object-oriented language Java(tm):

{lang="java"}
~~~~~~~~
/* File name : Animal.java */
interface Animal {
   public void eat();
   public void move();
}

/* File name : Horse.java */
public class Horse implements Animal {

   public void eat() {
      System.out.println("Horse eats");
   }

   public void move() {
      System.out.println("Horse moves");
   } 
~~~~~~~~

