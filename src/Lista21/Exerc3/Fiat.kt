package Lista21.Exerc3

class Fiat(
    val marc: String,
    val ano: Int,
    val valor: Double,
    val cor: String,
    val portas: Int,
    var velocidade: Int = 3
) : ICarros(
    marc,
    ano,
    valor,
    cor,
    portas,
    velocidade
) {
    override fun atributosCarro(){
        println("Carro: $marc" +
                "Ano: $ano" +
                "Valor: $valor" +
                "Cor: $cor" +
                "Portas: $portas")
    }
    override fun iniciarPartidaMotor() {
        velocidade=3
        println("Iniciando o motor... minha velocidade está em ${velocidade}km/h")
    }

    override fun frear() {
        velocidade-=6
        println("Freando... minha velocidade está em ${velocidade}km/h")
    }

    override fun acelerar() {
        velocidade+=12
        println("Acelerando... minha velocidade está em ${velocidade}km/h")
    }
}