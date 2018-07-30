package books

import java.time.Year

const val MAX_BORROW = 5

fun main(args: Array<String>) {
  val book = Book("O Livro", "Jaco", Year.now())
  val (title, author, year) = book.getInfoTriple() //destructuring
  println("O livro $title foi escrito por $author em $year")
  println(book.canBorrow(5))
  book.printURL()
}

class Book(val title:String, val author:String, val year:Year) {
  fun getInfoPair():Pair<String, String> {
    return title to author
  }
  fun getInfoTriple():Triple<String, String, Year> {
    return Triple(title, author, year)
  }
  fun canBorrow(numberOfBooks:Int=1) = numberOfBooks <= MAX_BORROW
  fun printURL() = println("$BASE_URL$title.html")

  companion object {
    val BASE_URL = "http://livraria.com/"
  }


}
