package Lista21

/*Lista de exercícios

1. Elabore um sistema para biblioteca no qual a pessoa bibliotecária, possa registrar
pelo menos 3 tipos diferentes de gêneros de livros, o nome do livro, o ISBN e a pessoa
autora do livro. Crie alguns livros exemplo e mostre em tela as informações de cada livro criado.
Adicione também o método registrarLivro, onde seja possível registrar um livro apenas com o
ISBN e deve mostrar em tela a mensagem “O livro foi registrado com o isbn [ISBN]”.
Adicione também o método registrarLivro, onde seja possível registrar um livro apenas com o
ISBN e o nome do livro e deve mostrar em tela a mensagem “O livro foi registrado com o isbn
[ISBN] e o nome [NOME]”.
Adicione também o método registrarLivro, onde seja possível registrar um livro apenas com o
ISBN, nome do livro e o gênero e deve mostrar em tela a mensagem “O livro foi registrado com o isbn
[ISBN], o nome [NOME] e o gênero [GENERO]”.
Adicione também o método registrarLivro, onde seja possível registrar um livro com todos os
atributos e deve mostrar em tela a mensagem “O livro foi registrado com todos os atributos”.
Crie um objeto para cada método no método main.

Exercícios - Aula 21

2. Construa um sistema para petshop onde o cliente pode registrar o
nome, raça e responsável de cachorro, gato e passarinho.
Cada animal deve ter os métodos para se movimentar, comer e
dormir.
Para o cachorro, considere o seguinte:
- Quando o cachorro se movimentar, deve aparecer a
mensagem: “Andando em 4 patas”.
- Quando o cachorro comer, deve aparecer a mensagem:
“Comendo bife”.
- Quando o cachorro dormir, deve aparecer a mensagem:
“Dormindo na cama da Jéssica”.
Para o gato, considere o seguinte:
- Quando o gato se movimentar, deve aparecer a mensagem:
“Andando e saltando em 4 patas”.
- Quando o gato comer, deve aparecer a mensagem: “Comendo
whiskas sachê”.
- Quando o gato dormir, deve aparecer a mensagem:
“Dormindo na caixa”.
Para o peixe, considere o seguinte:
- Quando o peixe se movimentar, deve aparecer a mensagem:
“Nadando”
- Quando o peixe comer, deve aparecer a mensagem:
“Comendo ração molhada”
- Quando o peixe dormir, deve aparecer a mensagem:
“Dormindo de olho aberto”.

Crie dois objetos para cada tipo de animal, chame cada um dos métodos
para cada objeto criado e mostre em tela cada um dos resultados obtidos.

Exercícios - Aula 21

3. Após a sua formação no Catalisa, o pessoal te redirecionou para o
cliente chamado ICarros. No seu primeiro dia de trabalho , a sua tech
lead te pediu que crie um sistema simples de registro de carros para
que o time comece a catalogar os tipos de carros que o cliente
possui para financiamento. Ela te passou que, por enquanto, o cliente
trabalha apenas com 3 marcas de carros, sendo Renault, Fiat e
Hyundai e todos os carros possuem as seguintes informações:
- Marca;
- Ano;
- Valor;
- Cor;
- Portas;
- Velocidade.
Depois, sua tech lead te informou que todos os carros iniciam a
partida do motor, freiam e aceleram, porém, cada um faz isso de uma
forma diferente.
Para o carro Renault, considere o seguinte:
- Quando ele inicia a partida do carro, ele mostra a mensagem:
“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
e a velocidade é igual a zero km/h.
- Quando ele freia, ele mostra a mensagem: "Freando... minha
velocidade está em [VELOCIDADE]" e a velocidade perde
5km/h a cada chamada do freio, ou seja, a cada chamada do
método frear.
- Quando ele acelera, ele mostra a mensagem: “Acelerando...
minha velocidade está em [VELOCIDADE]”, a velocidade
aumenta em 10km/h a cada pisada no acelerador, ou seja, a
cada chamada do método acelerar.

Para o carro Fiat, considere o seguinte:

Exercícios - Aula 21

- Quando ele inicia a partida do carro, ele mostra a mensagem:
“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
e a velocidade é igual a 3 km/h.
- Quando ele freia, ele mostra a mensagem: "Freando... minha
velocidade está em [VELOCIDADE]" e a velocidade perde
6km/h a cada chamada do freio, ou seja, a cada chamada do
método frear.
- Quando ele acelera, ele mostra a mensagem: “Acelerando...
minha velocidade está em [VELOCIDADE]”, a velocidade
aumenta em 12km/h a cada pisada no acelerador, ou seja, a
cada chamada do método acelerar.

Para o carro Hyundai, considere o seguinte:
- Quando ele inicia a partida do carro, ele mostra a mensagem:
“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
e a velocidade é igual a 5km/h.
- Quando ele freia, ele mostra a mensagem: "Freando... minha
velocidade está em [VELOCIDADE]" e a velocidade perde
2km/h a cada chamada do freio, ou seja, a cada chamada do
método frear.
- Quando ele acelera, ele mostra a mensagem: “Acelerando...
minha velocidade está em [VELOCIDADE]”, a velocidade
aumenta em 15km/h a cada pisada no acelerador, ou seja, a
cada chamada do método acelerar.
Ela também te pediu para criar, ou seja, instanciar no método main,
pelo menos um exemplo de cada marca de carros feito para que, quando o
time rodar o programa, as pessoas possam ver como fica o registro e
comportamento desses carros no sistema.

MINI DESAFIO

4. Crie um sistema bancário de criação de contas, onde a pessoa possa

Exercícios - Aula 21

criar uma conta salário ou uma conta poupança ou conta corrente.
Cada conta deve ter os métodos depósito, saque e saldo.
Para a conta salário, considere o seguinte:
- O saldo deve começar no valor de um salário mínimo brasileiro
(valor vigente do ano de 2022).
- A pessoa não pode fazer um saque que deixe o saldo menor
do que R$0,00. Por exemplo: a pessoa tem um saldo de
R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
“Saldo insuficiente”.
- Se a pessoa atender as condições de fazer o saque, o
saldo deve ser atualizado de acordo com a operação e o
novo saldo deve ser mostrado em tela.

- Para depósito, o sistema deve perguntar se quem está fazendo
o depósito é a pessoa EMPREGADORA.
- Se sim, pode realizar o depósito, o saldo deve ser
atualizado de acordo com a operação e o novo saldo
deve ser mostrado em tela.
- Caso contrário, deve apresentar a seguinte mensagem
em tela “Conta Salário só pode receber depósito do
empregador”.

Para a conta poupança, considere o seguinte:
- O saldo deve começar sempre zerado, ou seja, em R$ 0,00.
- A pessoa não pode fazer um saque que deixe o saldo menor
do que R$0,00. Por exemplo: a pessoa tem um saldo de
R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
“Saldo insuficiente”.
- Para depósito, o sistema deve perguntar se quem está fazendo
o depósito é a pessoa EMPREGADORA.
- Se sim, pode realizar o depósito e o saldo deve ser
atualizado de acordo com a operação.
- Caso contrário, deve apresentar a seguinte mensagem
em tela “Conta Salário só pode receber depósito do

Exercícios - Aula 21

empregador”.

Para a conta corrente, considere o seguinte:
- O saldo deve começar de acordo com o valor que a pessoa
usuária informar.
- A pessoa pode fazer um saque que deixe o saldo menor do
que R$0,00. Por exemplo: a pessoa tem um saldo de R$500.00
e tenta sacar R$ 550,00, o sistema deve permitir, o saldo deve
ser atualizado de acordo com a operação e exibir em tela o
novo saldo.
- Para depósito, a pessoa não pode fazer um depósito cujo valor
seja maior que R$5.000,00, se a pessoa tentar fazer essa
operação, deve aparecer a mensagem: “Operação inválida,
procure a sua agência.”.
- Caso a pessoa tente fazer um depósito menor do que R$
5.000,00 o saldo deve ser atualizado de acordo com a
operação e o novo saldo deve ser mostrado em tela.

Crie dois objetos para cada tipo de conta, faça duas operações de
cada tipo e mostre em tela cada um dos resultados obtidos.
*/