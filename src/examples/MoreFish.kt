package examples

fun main(args: Array<String>) {
  println(fitMoreFish(10.0, listOf(3, 3, 3)))
  println(fitMoreFish(8.0, listOf(2, 2, 2), hasDecoration = false))
  println(fitMoreFish(9.0, listOf(1, 1, 3), 3))
  println(fitMoreFish(10.0, listOf(), 7, true))
}

fun fitMoreFish(tankSize: Double, currentFish:List<Int>, fishSize: Int = 2, hasDecoration: Boolean = true) : Boolean {
  val limit = if(hasDecoration) tankSize*.8 else tankSize
  var currentFishSize = 0
  if(currentFish.isNotEmpty()) {
    val totalizar = { total: Int, atual: Int -> total + atual }
    currentFishSize = currentFish.reduce(totalizar)
  }

  return (currentFishSize + fishSize) <= limit
}
