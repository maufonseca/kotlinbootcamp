package spices

fun main(args: Array<String>) {
  val spice = Curry("mild")
  spice.prepareSpice()
  spice.grind()
}

sealed class Spice (var name: String, var spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
  abstract fun prepareSpice()
}

class Curry(spiciness: String) :
    Spice ("Curry", spiciness, YellowSpiceColor), Grinder {

  override fun prepareSpice() {
    println("preparando curry $color")
  }

  override fun grind() {
    println("grinding")
  }

}

class Salt : Spice("Curry", "mild", YellowSpiceColor) {
  override fun prepareSpice() {
    println("preparando salt")
  }
}

interface Grinder {
  fun grind()
}

interface SpiceColor {
  val color: Color
}

object YellowSpiceColor : SpiceColor {
  override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
  RED(0xFF0000),
  GREEN(0x00FF00),
  YELLOW(0xFFFF00),
  BLUE(0x0000FF);
}