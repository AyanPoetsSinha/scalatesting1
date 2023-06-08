val hello: String= "Hellows"

var helloThere: String= hello


val numberOne: Int=1
val truth: Boolean= true
val letterA: Char= 'a'
val pi: Double= 3.14159265
val piSinglePrecision: Float = 3.1415926578f
val bigNumber: Long = 1234556
val smallNumber: Byte= 125


println("here is a mess: "+ numberOne + truth+ letterA + pi + piSinglePrecision)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"zero padding on the left $numberOne%05d")
println(s"I can use prefix variable like $numberOne $truth $letterA")
println(s"I can use prefix as numerical arguements ${1+2}")


// Reg expression

val Ultim: String= "To life, the universe, and everyhing 22 , the 42"

val pattern= """.* ([\d]+).*""".r

val pattern(answerString)= Ultim

val answer= answerString.toInt

println(answer)

/*
write some code
that takes the value of pi
doubles it
and then prints it within a string
with three decimal places of precision to
the righ
*/




val pi: Float= 3.141954900234f
val doublevalue: Double= pi*2
val doublevalueString: String = doublevalue.toString
println(doublevalueString)
println(f"the value of double of pi is $doublevalue%.3f")