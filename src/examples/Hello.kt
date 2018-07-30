package examples

import java.util.*

fun main(args: Array<String>) {
  dayOfWeek()
}

fun dayOfWeek() {
  println("What day is today?")

  var day: String
  when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
    1 -> day = "Sunday"
    2 -> day = "Mon"
    3 -> day = "Tue"
    4 -> day = "Web"
    5 -> day = "thu"
    6 -> day = "Fri"
    else -> day = "Saturday"
  }

  println("It's $day")
}