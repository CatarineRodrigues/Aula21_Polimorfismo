package Lista21.Exerc3

import kotlin.system.exitProcess

fun main() {

    val carroRenault = Renault("Renault", 2022, 55000.00, "preto", 4, 0)
    val carroFiat = Fiat("Fiat", 2022, 45900.00, "branco", 2, 3)
    val carroHyundai = Hyundai("Hyundai", 2023, 60000.00, "prata", 4, 5)

    for (i in 1..3) {
        println("Apresentação $i de 3")
        println("Qual marca deseja realizar a apresentação? \n R-Renault ou F-Fiat ou H-Hyundai")
        val marca = readln().uppercase()
        println("-----Demonstração Exemplo-----")
        when {
            (marca.equals("R")) -> {
                println("-------Carro Renault-------")
                carroRenault.testeCarro()
            }
            (marca.equals("F")) -> {
                println("-------Carro Fiat-------")
                carroFiat.testeCarro()
            }
            (marca.equals("H")) -> {
                println("-------Carro Hyundai-------")
                carroHyundai.testeCarro()
            }
            else -> {
                println("Não trabalhamos com essa marca")
            }
        }
        println("Deseja fazer outro teste? Sim ou Não?")

        when (readln().uppercase()){
            "SIM" -> println("Inicializando novamente")
            "NÃO" -> {
                println("Obrigado por usar nosso sistema")
                exitProcess(0)
            }
            else -> println("Resposta inválida!")
        }
    }
}