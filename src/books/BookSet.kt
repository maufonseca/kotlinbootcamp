package books

fun main(args: Array<String>) {
  val allBooks = setOf("Livro1", "Hamlet", "Livro 3", "Livro 2")
  val library = mapOf("Shakespeare" to allBooks)

  println(library.values.any { it.contains("Hamlet") })

  val moreBooks = mutableMapOf("Shakespeare" to "Juliet")
  moreBooks.getOrElse("Schiller") { moreBooks.put("Schiller","Kipling") }
  println(moreBooks.toString())

}

