package lecture.part2oop

object OOBasics extends App{

  //instantiated the class
  val person= new Person("John", 26)
  println(person.age)


}

// constructor
class Person(name: String, val age: Int){
  //body
  

}


// class parameters are not fields