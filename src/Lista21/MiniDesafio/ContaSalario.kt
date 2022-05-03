package Lista21.MiniDesafio

/*Para a conta salário, considere o seguinte:
- O saldo deve começar no valor de um salário mínimo brasileiro (valor vigente do ano de 2022).
- A pessoa não pode fazer um saque que deixe o saldo menor do que R$0,00.
Por exemplo: a pessoa tem um saldo de R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
“Saldo insuficiente”.
- Se a pessoa atender as condições de fazer o saque, o saldo deve ser atualizado de acordo com a
operação e o novo saldo deve ser mostrado em tela.
- Para depósito, o sistema deve perguntar se quem está fazendo o depósito é a pessoa EMPREGADORA.
- Se sim, pode realizar o depósito, o saldo deve ser atualizado de acordo com a operação e o novo saldo
deve ser mostrado em tela.
- Caso contrário, deve apresentar a seguinte mensagem em tela “Conta Salário só pode receber depósito do
empregador”.*/

class ContaSalario: SistemaBancario() {
    private var saldo: Double = 1212.00

    override fun saldo(){
        println("Saldo atual da conta salário: $saldo")
    }
    override fun deposito(){
        println("Quem está fazendo o depósito é a pessoa empregadora? \n 1-Sim 2-Não")
        if (readln().toInt()== 1){
            println("Insira o valor a ser depositado")
            val deposito = readln().toDouble()
            saldo += deposito
        } else {
            println("Conta Salário só pode receber depósito do empregador")
        }
    }

    override fun saque(){
        println("Qual o valor do saque?")
        val saque = readln().toDouble()
        if ((saldo < saque) ) {
            println("Saldo insuficiente")
        }  else{
            saldo -= saque
        }
    }

}