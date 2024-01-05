# Exercícios Propostos:

## Exercício 01:

Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|2200         |Senha Invalida|
|1020         |Senha Invalida|
|2022         |Senha Invalida|
|2002         |Acesso Permitido|

## Exercício 02:

Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|2 2          |primeiro   |
|3 -2         |quarto     |
|-8 -1        |terceiro   |
|-7 1         |segundo    |
|0 2          |           |

## Exercício 03:

Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|8            |MUITO OBRIGADO|
|1            |Alcool: 1  |
|7            |Gasolina: 2|
|2            |Diesel: 0  |
|2            |           |
|4            |           |


## Exercício 04:

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|8            |1          |
|             |3          |
|             |5          |
|             |7          |

## Exercício 05:

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre
quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|4            |2 in       |
|14           |2 out      |
|123          |           |
|-25          |           |

## Exercício 06:

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|3            |5.7        |
|6.5 4.3 6.2  |6.3        |
|5.1 4.2 8.1  |9.3        |
|8.0 9.0 10.0 |           |

## Exercício 07:

Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|3            |-1.5       |
|3 -2         |divisao impossivel|
|-8 0         |0.0        |
|0 8          |           |

## Exercício 08:

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|4            |24         |

| **Entrada** | **Saída** |
| ----------- | --------- |
|1            |1          |

| **Entrada** | **Saída** |
| ----------- | --------- |
|5            |120        |

## Exercício 09:

Ler um número inteiro N e calcular todos os seus divisores.

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|6            |1          |
|             |2          |
|             |3          |
|             |6          |

## Exercício 10:

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.

Exemplos:

| **Entrada** | **Saída** |
| ----------- | --------- |
|5            |1 1 1      |
|             |2 4 8      |
|             |3 9 27     |
|             |4 16 64    |
|             |5 25 125   |