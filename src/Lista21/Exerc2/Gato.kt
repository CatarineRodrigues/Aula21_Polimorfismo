package Lista21.Exerc2

class Gato(val nome: String, val raça: String, val responsavel: String) : Petshop() {

    override fun registro(){
        println("Nome: $nome da raça $raça, tem como responsável $responsavel ")
    }

    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Comendo whiskas sachê")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }
}