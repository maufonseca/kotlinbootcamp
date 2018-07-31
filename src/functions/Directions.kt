package functions

enum class Directions {
  NORTH,
  SOUTH,
  EAST,
  WEST,
  START,
  END
}

class Game(var path:MutableList<Directions> = mutableListOf(Directions.START)) {
  val north = { path.add(Directions.NORTH) }
  val south = { path.add(Directions.SOUTH) }
  val east = { path.add(Directions.EAST) }
  val west = { path.add(Directions.WEST) }
  val end = {
    path.add(Directions.END)
    println("Game Over: "+path.toString())
    path.clear()
    false
  }

  fun move(where: () -> Boolean) {
    where.invoke()
  }

  fun makeMove(direction:String?) {
    when(direction) {
      "n" -> move(north)
      "s" -> move(south)
      "l" -> move(east)
      "o" -> move(west)
      else -> move(end)
    }
  }
}

fun main(args: Array<String>) {
  val game = Game()
  while (true) {
    print("Entre uma direção: n/s/l/o: ")
    game.makeMove(readLine())
    println(game.path.toString())
  }

}