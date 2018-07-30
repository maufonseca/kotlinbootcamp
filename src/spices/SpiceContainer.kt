package spices

fun main(args: Array<String>) {
  val containers = listOf(SpiceContainer("curry"),SpiceContainer("salt"),SpiceContainer("Red curry"))
  for (element in containers) println(element.label)
}

data class SpiceContainer(val spice: String) {
  val label = "$spice container"
}