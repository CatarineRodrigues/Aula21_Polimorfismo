package Lista21.Exerc2

class Cachorro : Petshop() {

    override fun movimentar() {
        super.movimentar()
        println("Andando em 4 patas")
    }

    override fun comer() {
        super.comer()
        println("Comendo bife")
    }

    override fun dormir() {
        super.dormir()
        println("Dormindo na cama da Jéssica")
    }
}