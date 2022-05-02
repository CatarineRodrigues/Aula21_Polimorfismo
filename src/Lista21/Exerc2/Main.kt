package Lista21.Exerc2

fun main() {

    println("Quantos pets no total você quer registrar?")
    val qnt = readln().toInt()

    for (i in 1..qnt) {
        println("-----Registro Pet-----")
        println("Nome do pet:")
        val nome = readln()
        println("Raça do pet:")
        val raça = readln().lowercase()
        println("Nome do responsável pelo pet:")
        val responsavel = readln()
        when {
            (raça.equals("cachorro")) -> {
                println("------Cachorro-----")
                val cachorro = Cachorro(nome, raça, responsavel)
                cachorro.registro()
                cachorro.movimentar()
                cachorro.comer()
                cachorro.dormir()
            }

            (raça.equals("gato")) -> {
                println("------Gato-----")
                val gato = Gato(nome, raça, responsavel)
                gato.registro()
                gato.movimentar()
                gato.comer()
                gato.dormir()
            }
            (raça.equals("peixe")) -> {
                println("------Peixe-----")
                val peixe = Peixinho(nome, raça, responsavel)
                peixe.registro()
                peixe.movimentar()
                peixe.comer()
                peixe.dormir()
            }
            else -> { println("Raça não identificada")
            }
        }
    }
}