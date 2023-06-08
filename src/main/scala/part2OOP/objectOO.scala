package part2OOP

    object objectOO extends App {

      val person= new Person("John", 26)
      println(person.age)
      person.greet("Daniel")
      person.greet()
    }


    //constructors
    class Person(name: String, val age: Int) {
      //body
      val x = 2

      println(1 + 3)

      def greet(name: String): Unit =
        println(s"${this.name} says : Hi, $name")

      def greet(): Unit =
        println(s"Hi, I am ${this.name}")

      //constructors

      def this(name: String) = this(name, 0)

      def this() = this("John Doe")



      //class parameters are not fields until added val or var

      //class parameters and class fields are two different things
      //method overloading is sending same methods with diff
      //signatures. diff type of parameters, different number
      //of parameters

    //exercise

    /*
      writer: first name, surname, year
    method full name


    novel: name year, author
    - authorage
    -iswrittenbyauthor
    -copy(new year of release)= new instance of Novel
*/


    /*

    counter class
    - receives an int
    - method urrent count
    - method to increent dec- ne wcounter
    - overload inc dec to receive an amount





    */

    class Counter(val count: Int){
      def inc=new Counter(count+1) //immutability
      def dec= new Counter(count-1)

      def  inc (n: Int) = new Counter(count+n)
      def dec(n: Int)=  new Counter(count-n)
    }
    }