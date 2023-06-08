package part2OOP

object Objects extends App {
    //Scala doesnt have class level functionality static


    object Person{
      //static class level functionality
      val N_EYES=2
      def canFly: Boolean= false
    }
    class Person{

      // instance level functionality
    }

    //companions
    println(Person.N_EYES)
    println(Person.canFly)


    val mary= new Person
    val john= new Person





  // scala application --- scal object
  // def main(args: Array[String]):  Unit
    //Scala object is singleton instance
}
