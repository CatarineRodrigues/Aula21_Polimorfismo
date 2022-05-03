package Lista21.MiniDesafio

/*Para a conta corrente, considere o seguinte:
- O saldo deve começar de acordo com o valor que a pessoa usuária informar.
- A pessoa pode fazer um saque que deixe o saldo menor do que R$0,00. Por exemplo: a pessoa tem um
saldo de R$500.00 e tenta sacar R$ 550,00, o sistema deve permitir, o saldo deve ser atualizado
de acordo com a operação e exibir em tela o novo saldo.
- Para depósito, a pessoa não pode fazer um depósito cujo valor seja maior que R$5.000,00, se a
pessoa tentar fazer essa operação, deve aparecer a mensagem: “Operação inválida, procure a sua agência.”.
- Caso a pessoa tente fazer um depósito menor do que R$ 5.000,00 o saldo deve ser atualizado de acordo
com a operação e o novo saldo deve ser mostrado em tela.*/

class ContaCorrente: SistemaBancario() {
}