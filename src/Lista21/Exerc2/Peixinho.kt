package Lista21.Exerc2

class Peixinho(val nome: String, val raça: String, val responsavel: String) : Petshop() {

    override fun registro(){
        println("Nome: $nome da raça $raça, tem como responsável $responsavel ")
    }

    override fun movimentar() {
        println("Nadando")
    }

    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun dormir() {
        println("Dormindo de olho aberto")
    }
}