package Lista21.Exerc2

class Gato : Petshop() {

    override fun movimentar() {
        super.movimentar()
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        super.comer()
        println("Comendo whiskas sachê")
    }

    override fun dormir() {
        super.dormir()
        println("Dormindo na caixa")
    }
}