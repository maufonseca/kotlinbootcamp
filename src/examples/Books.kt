package examples

fun main(args: Array<String>) {
  println(Ebook("livro", "autor"))
}
open class Book(val title:String, val author:String) {
  var currentPage = 50

  open fun readPage() {
    currentPage += 1
  }
}

class Ebook(title:String, author:String, val format:String="text"): Book(title, author) {

  var currentWordCount = 1000

  override fun readPage() {
    currentWordCount += 250
  }

}