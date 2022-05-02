package Lista21.Exerc1

class GeneroFiccao: Biblioteca() {

    override fun registrarLivro(isbn: Int){
        println("Na sessão Ficção: O livro foi registrado com o isbn $isbn")
    }

    override fun registrarLivro(isbn: Int, nomeLivro: String){
        println("Na sessão Ficção: O livro foi registrado com o isbn $isbn e o nome $nomeLivro")
    }

    override fun registrarLivro(isbn: Int, nomeLivro: String, genero: String ) {
        println("Na sessão Ficção: O livro foi registrado com o isbn $isbn, o nome $nomeLivro e o gênero $genero")
    }

    override fun registrarLivro(isbn: Int, nomeLivro: String, genero: String, pessoaAutora: String){
        println("Na sessão Ficção: O livro foi registrado com todos os atributos")
    }

}