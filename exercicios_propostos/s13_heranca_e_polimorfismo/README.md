# Exercícios Propostos

## Exercício 01:

Uma empresa possui funcionários próprios e terceirizados.  
Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.  
Funcionários terceirizados possuem ainda uma despesa adicional.  
O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas,  
sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.  
Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

Exemplo:

>Enter the number of employees: **3**
>
>Employee #1 data:  
>Outsourced (y/n)? **n**  
>Name: **Alex**  
>Hours: **50**  
>Value per hour: **20.00**
>
>Employee #2 data:  
>Outsourced (y/n)? **y**  
>Name: **Bob**  
>Hours: **100**  
>Value per hour: **15.00**  
>Additional charge: **200.00**
>
>Employee #3 data:  
>Outsourced (y/n)? **n**  
>Name: **Maria**  
>Hours: **60**  
>Value per hour: **20.00**
>
>PAYMENTS:  
>Alex - \$ 1000.00  
>Bob - \$ 1720.00  
>Maria - \$ 1200.00

---

## Exercício 02:

Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).  
Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega,  
e produtos usados possuem data de fabricação.

Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo.  
Para produtos importados, a taxa de alfândega deve ser acrescentada ao preço final do produto.

Exemplo:

>Enter the number of products: **3**
>
>Product #1 data:  
>Common, used or imported (c/u/i)? **i**  
>Name: **Tablet**  
>Price: **260.00**  
>Customs fee: **20.00**
>
>Product #2 data:  
>Common, used or imported (c/u/i)? **c**  
>Name: **Notebook**  
>Price: **1100.00**
>
>Product #3 data:  
>Common, used or imported (c/u/i)? **u**  
>Name: **Iphone**  
>Price: **400.00**  
>Manufacture date (DD/MM/YYYY): **15/03/2017**
>
>PRICE TAGS:  
>Tablet \$ 280.00 (Customs fee: \$ 20.00)  
>Notebook \$ 1100.00  
>Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)

---

## Exercício 03:

Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário),  
os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,  
bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde.  
Os dados de pessoa jurídica são: nome, renda anual e número de funcionários.

As regras para cálculo de imposto são as seguintes:

- Pessoa física:
    - Pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto.
    - Pessoas com renda de 20000.00 em diante pagam 25% de imposto.
    - Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
    - Exemplo: (50000 * 25%) - (2000 * 50%) = 11500.00

- Pessoa jurídica:
    - Pagam 16% de imposto.
    - Porém, se a empresa possuir mais de 10 funcionários, paga 14% de imposto.
    - Exemplo: 400000 * 14% = 56000.00

Exemplo:

>Enter the number of tax payers: **3**
>
>Tax payer #1 data:  
>Individual or company (i/c)? **i**  
>Name: **Alex**  
>Anual income: **50000.00**  
>Health expenditures: **2000.00**
>
>Tax payer #2 data:  
>Individual or company (i/c)? **c**  
>Name: **SoftTech**  
>Anual income: **400000.00**  
>Number of employees: **25**
>
>Tax payer #3 data:  
>Individual or company (i/c)? **i**  
>Name: **Bob**  
>Anual income: **120000.00**  
>Health expenditures: **1000.00**
>
>TAXES PAID:  
>Alex: \$ 11500.00  
>SoftTech: \$ 56000.00  
>Bob: \$ 29500.00
>
>TOTAL TAXES: $ 97000.00  