# Operadores

  Os operadores são utilizados - principalmente - para a construção da lógica, o que possibilita que sejam realizadas operações específicas sobre os dados. Ações como adição, subtração, atribuição, comparação, incremento e decremento são apenas alguns exemplos do que pode ser feito com os operadores.
  
## Operadores de atribuição (Java)
  
  Este operador é utilizado para definir ou sobrescrever o valor de uma variável. Para que essa operação seja realizado utilizamos o sinal de "=".
   
  *Exemplo:*
  ```
  int idade = 26;
 ```  
  *No exemplo acima, o valor de 26 foi atribuído à variável idade.*
  
## Operadores aritméticos
  
  Este operadores realizam as operações fundamentais da matemática entre duas variáveis e retornam um resultado.
  
  Tabela com os operadores aritméticos
  |Operador| Função         |
  | :---: | :---:            |
  |+      |operador de adição|
  |-      | operador subtração|
  |*      | operador de multiplicação|
  |  /    |operador de divisão|
  |%      |operador de módulo (ou resto da divisão)|

## Operadores de incremento e decremento

Os operadores de incremento e decremento também são bastante utilizados. Basicamente temos dois deles:++ e --, os quais podem ser declarados 
antes ou depois da variável e incrementam ou decrementam em 1 o valor da variável.

*Exemplo de uso:*
```
int numero = 5;
numero++;
numero--;
//numero continuará sendo 5.
```

Quando declaramos esse operador antes da variável, o incremento é realizado antes do valor da variável ser lido para o processamento ao 
qual a instrução pertence. Quando declarado depois, ocorre o contrário: lê-se o valor da variável para processamento e só então o valor 
da variável é incrementado. 

# Operadores de igualdade

  Estes operadores verificam se o valor ou resultado da expressão lógica à esquerda é igual ("==") ou diferente ("!=") ao da direita,
  retornando o boleano true para o caso verdadeiro e false caso contrário. 
  
*Exemplo:*
```
int numberUm = 5
int numberDois = 6

if (numberUm == numberDois) {
  System.out.println("Os números são iguais")
}else {
  System.out.println("Os números são diferentes")
}
```
## Operadores Relacionais

Assim como os operadores de igualdade, os relacionais avaliam dois operandos comparando se o valor da direita é maior, menor ou igual ao 
da esquerda, e retornando um valor booleano de acordo com a comparação que é estabelecida.

*Exemplo de uso:*
```
int valorA = 1;
int valorB = 2;

if (valorA > valorB) {
                System.out.println(“maior”);
}

if (valorA >= valorB) {
                System.out.println(“maior ou igual”);
}

if (valorA < valorB) {
                System.out.println(“menor”);
}

if (valorA <= valorB) {
                System.out.println(“menor ou igual”);
}
```
Este algoritmo realiza uma série de comparações entre os valores das variáveis valorA e valorB e imprime uma mensagem caso o teste lógico
retorne true.
 
**Tabela com os operadores relacionais em JAVA**

|Operador | Função |
| :---:   |:---:   |
|>        | Utilizado quando desejamos verificar se uma variável é maior que outra.|
|>=       | Utilizado quando desejamos verificar se uma variável é maior ou igual a outra|
|<        |Utilizado quando desejamos verificar se uma variável é menor que outra.|
|<=       |Utilizado quando desejamos verificar se uma variável é menor ou igual a outra.| 

## Operadores lógicos

Os operadores lógicos constituem o recurso que permite a criação de expressões lógicas mais complexas a partir da ligação de duas ou mais
expressões. Para que isso aconteça, deve-se aplicar os operadores && (and) e || (or). Segundo a tabela verdade desses operadores, o && 
retornará true somente se todas as expressões forem verdadeiras, enquanto o || precisa que apenas uma condição seja verdadeira para retornar
true.

*Exemplo:*

if((1 == (2 -1)) && (2 == (1 + 1))){
     System.out.println(“Ambas as expressões são verdadeiras”);
}

if((1 == (3 - 2)) || (3 == (4 - 2))){
     System.out.println(“Ao menos uma das expressões é verdadeira”);
}

## Operadores unários x Operadores Binários

  Uma diferença importante entre os operadores **unários** e **binários** está relacionada a quantidade de variáveis que são necessárias para que
  eles sejam executados. Enquanto o primeiro precisa de apenas uma variável para operar, o outro (como o próprio sugere) necessita de dois.
  
  ** Exemplo de operadores unários: decremento/incremento
  Exemplo de operadores binários: relacionais **
