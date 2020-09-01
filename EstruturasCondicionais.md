# Estruturas Condicionais
 
 As estruturas condicionais permitem controlar o fluxo da execução do algoritmo, permitindo que este siga caminhos alternativos sob atendimento de determinadas condições.
   Sem estas estruturas a execução do código seria linear, o que acabaria limitando a execução ou aumentando generosamente a complexidade (tempo e espaço) do algotirmo escrito.
   
  ## Estrutura if
  
  A estrutura de decisão if é utilizada para impor uma ou mais condições que deverão ser satisfeitas para a execução de uma instrução ou bloco de instruções. A sua forma geral é a seguinte:

```
If (<condição>) {
  <instrução ou bloco>
}
````
A condição sempre irá figurar entre parênteses, após a palavra reservada if, e deve ser uma expressão booleana que resulte em um valor true ou false. A instrução ou o bloco de instruções somente será executado caso o resultado dessa expressão seja true. Caso o resultado seja false, o fluxo de execução será desviado e a instrução ou o bloco de instruções não será executado.

Havendo uma única instrução condicionada pela estrutura if, ela figura logo após a condição e termina com um ponto e vírgula. A sintaxe é a seguinte:

```
If(<Condição>) <Instrução>;
```   

## Estrutura if-else
A estrutura de decisão if-else é uma variação da estrutura if. Ela é utilizada para impor uma ou mais condições que deverão ser satisfeitas para a execução de uma instrução ou bloco de instruções e possibilita a definição de uma instrução ou bloco de instruções a serem executados caso as condições não sejam satisfeitas. A sua forma geral é a seguinte:

```
If(<Condição>){
  <instrução ou bloco>
} else {
  <instrução ou bloco> 
  }
```
A condição sempre irá figurar entre parênteses, após a palavra reservada if, e deve ser uma expressão booleana que resulte em um valor true ou false. A primeira instrução ou o bloco de instruções somente será executado caso o resultado dessa expressão seja true. Caso o resultado seja false, o fluxo de execução será desviado e a instrução ou o bloco posterior ao else será executado.

## Estrutura else if
  A estrutura de decisão else-if permite a utilização de mais testes lógicos na estrutura condicional. 
  
  ```
If(<Condição>){
  <instrução ou bloco>
} else if (<Condição>) {
  <instrução ou bloco>
  }
else {
  <instrução ou bloco> 
  }
```
  Seguindo o padrão dos outros casos, a condição sempre figurará entre parênteses, a instrução else-if estará entre o If e o else, e testes lógicos serão executadas de maneira ordenada até que o seu resultado seja verdadeira ou a instrução else seja executada.
  
## Operador Ternário

Esse código trata-se de um operador matemático, com um condicional. Em alguns casos, ambos podem ter comportamento um pouco diferente. Lembrando também que o ternário sempre deve retornar valor, e o valor será sempre do mesmo tipo, para ambos os lados da expressão.
```
public class EstruturasCondicionais{
  
  public static void main(String[] args) {
  
  int value1 = 2;
  int value2 = 3;
  System.out.println((value1 > value2 ? "valor1 é maior" : "valor2 é maior"))
  
  } 
}
```
  Nesse tipo de estrutura o teste lógico é realizado primeiro seguido por "?" <resultado se verdadeiro> ":" <resultado se falso>. No exemplo, o valor1 está sendo comparado com o valor2, se o valor1 sejá maior, será impreso a frase "valor1 é maior", caso o retorno seja falso (e de fato é) será impress a frase "Valor2 é maior".
  A grande vantagem desse tipo de abordagem está relacionada com a economia de linha de código, embora ela não seja tão legível e indicada apenas para uso de apenas um teste lógico.
  
  # Switch-Case
  
  A estrutura de decisão switch-case, ou simplesmente switch, é uma forma simples para se definir diversos desvios no código a partir de uma única variável ou expressão. Havendo uma variável com diversos valores possíveis e sendo necessário um tratamento específico para cada um deles, o uso da estrutura if-else se torna confuso e dificulta a leitura do código. Nesse caso, a clareza e a facilidade estão do lado da estrutura switch.
  
  ```
public class EstruturasCondicionais{
  
  public static void main(String[] args) {
  
  int mes = 2;
  
  switch (mes) {
    case 1:
      System.out.println("janeiro")
      
    case 2:
      System.out.println("fevereiro")
    
    case 3:
      System.out.println("março")
    
    case 4:
      System.out.println("abril")
    
    case 5:
      System.out.println("maio")
    
    case 6:
      System.out.println("junho")
    
    case 7:
      System.out.println("julho")
    
    case 8:
      System.out.println("agosto")
    
    case 9:
      System.out.println("setembro")
    
    case 10:
      System.out.println("outubro")
    
    case 11:
      System.out.println("novembro")
    
    case 12:
      System.out.println("dezembro")
    default:
      System.out.println("número informado não corresponde ao nome de um mês. Por gentileza, atribua um valor no intervalo entre 1 e 12".)
    }
  } 
}
```

Se for utilizada uma expressão, ela deve retornar um tipo de dados compatível com todos os valores especificados através das declarações case. Por dedução, todas as declarações devem conter valores de um mesmo tipo. Caso esteja utilizada uma variável, seu tipo também deve ser compatível com os valores das declarações.

Cada um dos valores especificados com as declarações case deve ser um valor literal exclusivo. Se houver algum valor duplicado, será gerado um erro no momento em que você tentar compilar seu código.

A palavra default indica que caso nenhum dos cases seja utilizado, a instrução que se encontra no default será executada.

Observação: a estrutura switch-case não é compatível com alguns tipos e não é recomendado o uso do break por ele romper com o fluxo de execução do código.

  
