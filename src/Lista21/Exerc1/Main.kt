package Lista21.Exerc1

fun main() {

    println("-----Registro de livro-----")
    println("Quantos livros você quer registrar?")
    val qnt = readln().toInt()
    var i = 0
    while (i < qnt) {
        println("-----Registro de livro-----")
        println("Qual o gênero do livro?")
        val genero = readln().lowercase()
        println("Qual o nome do livro?")
        val nome = readln()
        println("Qual o código ISBN do livro?")
        val isbn = readln().toInt()
        println("Qual o nome da pessoa Autora do livro?")
        val autor = readln()

        when {
            (genero == "aventura") -> {
                GeneroAventura().registrarLivro(isbn)
                GeneroAventura().registrarLivro(isbn, nome)
                GeneroAventura().registrarLivro(isbn, nome, genero)
                GeneroAventura().registrarLivro(isbn, nome, genero, autor)
            }
            (genero == "romance") -> {
                GeneroRomance().registrarLivro(isbn)
                GeneroRomance().registrarLivro(isbn, nome)
                GeneroRomance().registrarLivro(isbn, nome, genero)
                GeneroRomance().registrarLivro(isbn, nome, genero, autor)
            }
            (genero == "ficção") -> {
                GeneroFiccao().registrarLivro(isbn)
                GeneroFiccao().registrarLivro(isbn, nome)
                GeneroFiccao().registrarLivro(isbn, nome, genero)
                GeneroFiccao().registrarLivro(isbn, nome, genero, autor)
            }
        }
        i++
    }

}