package examples

fun main(args: Array<String>) {
  val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
  val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
  println(curries)
  val filtered = spices.filter { it.first()=='c' && it.last()=='e' }
  println(filtered)
  val cElements = spices.take(3).filter { it.startsWith('c') }

  val spice1 = SimpleSpice("curry")
  val spice2 = SimpleSpice("curry2", "aggressive")
  val spice3 = SimpleSpice("curry3")
  spice3.heat = 5

  val spiceObjects = listOf(spice1, spice2, spice3, makeSalt())
}

class SimpleSpice(var name: String, var spiciness: String = "mild" ) {

  var heat: Int
    get() = if (spiciness.equals("mild")) 5 else 7
    set(value) { if(value==5) spiciness="mild" }


  init {
    println("init0")
  }
  init {
    println("$name - $spiciness - $heat")
  }
  init {
    println("init2")
  }

}

fun makeSalt() = SimpleSpice("salt")
