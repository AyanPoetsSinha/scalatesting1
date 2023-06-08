package checkNull

object nullHandling extends App {

  def nullHandle(testString: String): Unit = {
      if (testString==null)
        print("it is null")

      else
        println("Not Null")


   }

  nullHandle(null)



}