# Estruturas de repetição

  As estruturas de repetição, que também são conhecidas como *iteração, laços ou loops*, são utilizadas para executar repetidamente uma instrução 
  ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.
  
  As estruturas while e for processam uma instrução ou grupo de instrução, zero ou mais vezes, se a condição de continuação do loop for 
  verdadeira ou enquanto ela for verdadeira, mas se esta condição for falsa a ação não será executada. O do…while, processa uma instrução 
  ou grupo de instruções uma ou mais vezes.

  Cada sistema ou programa de computador faz uso de quantas combinações de estruturas de repetição e/ou estruturas de decisão forem 
necessárias. E toda estrutura de repetição compõem-se de quatro elementos, a saber, **inicialização, condição, corpo e interação**.

  A inicialização em estruturas de repetição é o primeiro passo em sua formatação. A expressão condicional em si é, assim como nas 
estruturas de decisão uma expressão booleana que é avaliada a cada iteração, para determinar se haverá ou não uma nova iteração. O corpo 
pode ser composto por uma única instrução ou um conjunto de instruções. A iteração é instrução booleana que deverá ser executada depois 
do corpo e antes de uma nova repetição.

## While

  A estrutura de repetição While (em português significa enquanto) é utilizada para que o algoritmo executa uma instrução ou determinado conjunto
  de instruções enquanto a condição imposta pelo teste lógico retorne **true**.

 ```
 public Class EstruturaRepeticaoWhile{
 
   public static void main(String[] args) {
    // Imprimir números pares entre 0 e 100 (inclusive eles)
    int number = 0;
    while(number <= 100) {
      System.out.println(number);
      number += 2;
     }
   }
 }
 ```
 A palavra reservada **while** indica que utilizaremos uma estrutura de repetição.
 Os valores escritos entre parênteses logo após o while indicam o teste lógica que será realizada. Nesse caso, *enquanto o valor for menor
 ou igual a 100* o programa executará uma determinada instrução.
 Os valores que estão dentro das chaves constituem o bloco de instrução. Nesse caso, enquanto o teste lógica retornar true será impresso
 o valor da variável number.
 Por fim, é utilizado o operador de incremento **+=** para acrescentar + 2 ao valor de number e assim evitar que o código caia 
 em *loop infinito*.

## Do..While

  A estrutura de repetição *do...while* é uma variação do *while*. A principal diferença entre elas deve-se ao fato da primeira executar um determinado bloco de isntruções ao menos uma vez, enquanto o segundo processar o conjunto de instrução zero ou n vezes, a depender do retorno do teste lógico.
  
  ```
  public class EstruturaDeRepeticaoDoWhile{
   public static void main(String[] args) {
    int number = 0;
    do {
      System.out.println(number);
      number += 2;
    } while(number <= 100)
   }
  }
  ```
    É importante observar que o bloco de instrução é escrito primeira que o teste lógico,e por este motivo, ele é executado obrigatoriamente ao menos uma vez.
    Foi utilizada a mesma lógica do exemplo da estrutura de repetição while para facilitar o entendimento sobre a diferença de sintaxe e lógica das duas estruturas de repetição.
    
    
