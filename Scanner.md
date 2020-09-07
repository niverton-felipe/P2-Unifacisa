## Scanner

  A classe Scanner é utilizada (inicialmente) para facilitar a entrada de dados por meio do modo console. Quando invocada o compilador da IDE
  pedirá para que utilizemos a importação abaixo:
  
 ```
  import java.util.Scanner;
 ```
 Como descrito na introdução, essa classe ajuda na leitura dos dados informados. Para fazer essa ação na prática, é necessário criar 
 um objeto do tipo Scanner que passa como argumento o objeto System.in dentro construtor, do seguinte modo:
 
   Além da importanção mostrada acima, é necessário criar uma variável de referência (objeto nesse caso) do tipo Scanner e instanciá-la com 
   o objeto System.in sendo passado como argumento dentro do construtor.
   
   ***Observação:*** *O objeto System.in é o que faz a leitura do que se escreve no teclado.*
   
   ```
 import java.util.Scanner;

 public class IntroducaoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = input.next();
        System.out.println("O nome do aluno é: " + nomeAluno);
    }
}
   ```
   
   No exemplo mostrado acima, foi criada uma variável de referência do tipo Scanner chamado de input para receber entradas do usuário. 
    A variável *nomeAluno* foi criada para receber de fato essa entrada, é importante observar que por se tratar do tipo String foi utilizado o método next,na linguagem Java, é preciso mudar o método de recebimento de entrada de acordo com o tipo de dado que o algoritmo espera receber. Por fim, o programa imprimirá o nome do alun que for determinado pelo usuário.
     
## Tipos de entrada
    
  Como já mencionado durante o resumo, o nome do método utilizado para receber o valor, variará de acordo o tipo de dado que o programa espera receber. Tal nome segue o seguinte padrão next<TipoDado>().
   No exemplo abaixo, são mostrados o nome dos métodos utilizados pelos tipos primitivos em Java mais o tipo reference String.
    
```
import java.util.Scanner;

public class TiposDeMetodosScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numberFloat = input.nextFloat();
        int numberInt = input.nextInt();
        byte byte1 = input.nextByte();
        long long1 = input.nextLong();
        boolean b1 = input.nextBoolean();
        double numberDouble = input.nextDouble();
        String nome = input.nextLine();
    }
}
```
## Considerações Finais

  O objetivo do texto foi apresentar de maneira introdutória os conceitos do Scanner. Nesse sentido, não foram utilizadas exemplos um pouco mais complexos combinando elementos de **ORIENTAÇÃO A OBJETOS**, tão pouco foram abordados assuntos como os *demais métodos da classe Scanner*, utilização do *bloco try/catch* como boa prática ou o fato da classe Scanner gerar *tokens*. Por se tratar do começo da disciplina, esses assuntos aindaserão maturados e posteriormente mencionados em outros assuntos.
  
       
     
