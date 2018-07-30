package examples

fun main(args: Array<String>) {
  print("mood: ")
  val typed = readLine()
  println(whatShouldIDoToday(typed!!))
}

fun whatShouldIDoToday(mood:String, wheather:String="sunny", temperature:Int=24) =
    when {
      iAmHappyAndItsSunny(mood, wheather) -> "go for a walk"
      iAmSadAndItsRainy(mood, wheather) -> "Stay in bed"
      isTooHot(temperature) -> "go swimming"
      else -> "Stay home and read"
    }

fun iAmHappyAndItsSunny(mood:String, wheather:String) = mood=="happy" && wheather=="sunny"
fun isTooHot(temp:Int) = temp>35
fun iAmSadAndItsRainy(mood:String, wheather:String) = mood=="sad" && wheather=="rainy"

