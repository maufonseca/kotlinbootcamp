package books

import java.time.Year
import java.util.*

const val MAX_BORROW = 5

fun main(args: Array<String>) {
  val book = Book("O Livro", "Jaco", Year.now(), 809)
  val (title, author, year) = book.getInfoTriple() //destructuring
  println("O livro $title foi escrito por $author em $year")
  println(book.canBorrow(5))
  book.printURL()
  val puppy = Puppy()
  while (book.pages>0) {
    puppy.playWithBook(book)
    println(book.pages)
  }

}

class Book(val title:String, val author:String, val year:Year, var pages:Int = 50) {

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

fun Book.getWeight() = {pages*1.5}

fun Book.tornPages(pagesToTorn:Int) { pages -= pagesToTorn }

class Puppy {
  fun playWithBook(book:Book) {
    book.tornPages(Random().nextInt(book.pages+1))
  }
}
