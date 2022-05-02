package Lista21.Exerc2

class Cachorro(val nome: String, val raça: String, val responsavel: String) : Petshop() {

    override fun registro(){
        println("Nome: $nome da raça $raça, tem como responsável $responsavel ")
    }

    override fun movimentar() {
        println("Andando em 4 patas")
    }

    override fun comer() {
        println("Comendo bife")
    }

    override fun dormir() {
        println("Dormindo na cama da Jéssica")
    }
}