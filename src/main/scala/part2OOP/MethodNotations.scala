package part2OOP

import scala.language.postfixOps
object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String){
    def likes(movie: String): Boolean= movie== favouriteMovie
    def hangOutWith(person: Person): String= s"${this.name}is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck"
    def isAlive: Boolean= true

    def apply(): String = s"Hi, my name is ${this.name} and I like $favouriteMovie"

  }

  val mary= new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  //infix notation== operatior notation (Syntactic sugar)
  println(mary likes "Inception") //equivalent


  //"operators" in SCALA
  val tom= new Person("Tom", "fight Club")
  println(mary hangOutWith tom)



  /// all operators are methods
  // prefix notation
  val x= -1
  val y=1.unary_-

  // unary prefix only works with -+!~


  println(!mary)
  println(mary.unary_!)


  //postfix operator

  println(mary.isAlive)
  println(mary isAlive)


  //apply
  println(mary.apply())
  println(mary()) // equivalent

/*
  1. over load the + operator
      mary + the rockstar=> new person mary the rockstar
  2. add an age to he person class
      add a unary + operator => new person with the age+1
      +mary=> mary with the age incrementer
  3. add a "learns" method in the person class=> "Mary learns scala"
      add a learnsScala method, calls learns method with "Scala"

*/
}
