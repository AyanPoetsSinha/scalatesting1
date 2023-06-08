package part2OOP

import scala.util.control.Exception.Catch

object Inheritance extends App {

  //Single class inheritance
  class Animal {
    val creatureType = "wild"

    protected def eat = println("nomnom")
  }
}
/*
  class Cat extends Animal{
    def crunch= {

      eat
      println("crunch crunch")
    }

  }

  val cat = new Cat
  cat.crunch
  // constructors


  class Person(name: String, age: Int){


    //auxilary constructor
    def this(name: String)= this(name,0)
  }
  class Adult(name: String, age: Int, IdCard: String) extends Person(name)



  //overriding

  class Dog (override val creatureType: String) extends Animal {

    override def eat= println("crunch, crunch")

   // override val creatureType= "domestic"

  }

  val dog= new Dog("K9")
  dog.eat
  println(dog.creatureType)


  //type substitution (broad: polymorphism)
  val unknownAnimal: Animal= new Dog("K9")
  unknownAnimal.eat
}
*/