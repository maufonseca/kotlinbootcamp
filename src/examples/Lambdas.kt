package examples

import java.lang.Math.random
import java.util.*

fun main(args: Array<String>) {

  println(random())
  println({ random() })
  gamePlay(rollDice(4))
  gamePlay(rollDice2(3))
}

val rollDice = { sides: Int-> Random().nextInt(sides)+1 }


val rollDice2: (Int) -> Int = { sides ->
  if(sides==0) 0
  else Random().nextInt(sides)+1
}


fun gamePlay(argument:Int) { println(argument) }