import scala.language.postfixOps

if (1>3) println("Impossible!") else println("the world makes sense")

if (1>3) {
  println("Impossible")
  println("Really")
}else{
  println("correct")

}


//Matching

val number =2

number match{

  case 1 => println("This is one")
  case 2 => println("this is 2")
}



for (x<- 1 to 4){

  val squared= x*x
  println(squared)
}

var d=3
/*
while (xs>= 0){
  println("Now it is"+x)
  x=x-1
}*/

/*
do{
  println(x);x+=1
}while (x<=10)
*/

//fibonacci series

val number1=7
  number1 match{
    case 0|1 => println(number1)
    case _ => println((number1-1)+(number1-2))
  }



}


