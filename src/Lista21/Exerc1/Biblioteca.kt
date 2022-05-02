package Lista21.Exerc1

open class Biblioteca() {

    open fun registrarLivro(isbn: Int){
        println("O livro foi registrado com o isbn $isbn")
    }

    open fun registrarLivro(isbn: Int, nomeLivro: String){
        println("O livro foi registrado com o isbn $isbn e o nome $nomeLivro")
    }

    open fun registrarLivro(isbn: Int, nomeLivro: String, genero: String ) {
        println("O livro foi registrado com o isbn $isbn, o nome $nomeLivro e o gênero $genero")
    }

    open fun registrarLivro(isbn: Int, nomeLivro: String, genero: String, pessoaAutora: String){
        println("O livro foi registrado com todos os atributos")
    }
}