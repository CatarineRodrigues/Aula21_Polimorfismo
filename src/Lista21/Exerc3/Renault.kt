package Lista21.Exerc3

class Renault(
    val marc: String,
    val ano: Int,
    val valor: Double,
    val cor: String,
    val portas: Int,
    var velocidade: Int = 0
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
        println("Iniciando o motor... minha velocidade está em 0km/h")
    }

    override fun frear() {
        velocidade-=5
        println("Freando... minha velocidade está em ${velocidade}km/h")
    }

    override fun acelerar() {
        velocidade+=10
        println("Acelerando... minha velocidade está em ${velocidade}km/h")
    }


}