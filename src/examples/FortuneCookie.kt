package examples

fun main(args: Array<String>) {
  var fortune: String
  for (i in 1..10) {
    fortune = getFortune(getBirthday())
    println("\nYour fortune is: $fortune")
    if (fortune.contains("nice day")) break
  }
}

fun getFortune(birthday: Int) =  when(birthday) {
    28,31 -> "Youll have a nice day"
    in 1..7 -> "Enjoy life!"
    else -> "Be careful at the street" }

fun getBirthday() : Int {
  print("Birthday: ")
  var birthday : Int
  birthday = readLine()?.toIntOrNull() ?:1
  return birthday
}