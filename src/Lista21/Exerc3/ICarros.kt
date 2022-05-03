package Lista21.Exerc3

import kotlin.system.exitProcess

open class ICarros(
    marc: String,
    ano: Int,
    valor: Double,
    cor: String,
    portas: Int,
    velocidade: Int
) {
    open fun atributosCarro() {}
    open fun iniciarPartidaMotor() {}
    open fun frear() {}
    open fun acelerar() {}

    fun testeCarro() {
        while (true) {
            println("Escolha a opção desejada")
            println("1-Iniciar a partida do motor")
            println("2-Frear")
            println("3-Acelerar")
            println("4-Parar")
            when (readln().toInt()) {

                1 -> iniciarPartidaMotor()
                2 -> frear()
                3 -> acelerar()
                4 -> {
                    println("-----Fim do Teste-----")
                    break
                }
            }
        }
    }

}