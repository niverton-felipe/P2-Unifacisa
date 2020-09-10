# Introdução à Orientação a Objetos

  Orientação a objetos é uma maneira de programar que ajuda na organização e resolve muitos problemas enfrentados pela programação 
procedural.

## Classe
 
  Uma classe pode ser definida como uma representação de uma determinada entidade (física ou abstrata) do mundo real. Seu objetivo é criar
  um modelo genérico dessa entidade contendo suas principais características (atributos) e funções (métodos).  Uma classe geralmente representa um substantivo, por exemplo: uma pessoa, um lugar, 
  algo que seja “abstrato”.
  
###  Características das classes
Toda classe possui um nome;
Possuem visibilidade, exemplo: public, private, protected;
Possuem membros como: Características e Ações;
Para criar uma classe basta declarar a visibilidade + digitar a palavra reservada class + NomeDaClasse + abrir e fechar chaves { }.
  
```
public class Professor {
    public String nome;
    public String matricula;
    public String cpf;
    public String rg;

    public void imprime(){
        System.out.println("===================");
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}

```
  O exemplo acima utiliza a representação da classe professor, utilizando atributos básicos para representar essa entidade, tais como
  nome, rg, matrícula e cpf. Além, de um método básico chamado imprime()  cuja função é fazer uma impressão básica no console com alguns
  dados do objeto que por ventura seja instanciado.

## Objetos

  Os Objetos são representações "concretas" das características inerentes à classe. A instanciação de um objeto de classe permite
  que este utilize os atributos e métodos definidos pela classe.
  
  ```
  public class ProfessorMain {
    public static void main(String[] args) {
        // Instanciar objeto da classe professor
        Professor professor = new Professor();
        // definir os dados dos atributos do objeto professor
        professor.nome = "Eduardo Falcão";
        professor.matricula = "124347";
        professor.cpf = "4576411331";
        professor.rg = "031564";
        
        professor.imprime()   
    }
}
  ```
  
  No algoritmo acima é possível nota que um objeto chamado "professor" da classe Professor é instanciado. Em seguida, os atributos nome, matricula, cpf
  e rg são definidos sempre seguido o padrão "nome do objeto.<atribuuto> = <valor>. E por fim, o método imprime é evocado, também obedecendo um pardão 
  (<nome do objeto>.<metodo()>).
  
  
## Construtores

  O Construtor é um método especial da classe, que possui o seu nome e define quais atributos da classe devem ser inicializados assim que 
  um novo objeto é instanciado na memória. Por padrão, caso não haja nenhuma definição explícita do construtor, o JAVA evocará o construtor
  default, porém, é uma boa prática definir o construtor, e se possível, criar mais de um método desse tipo (através da sobrecarga de parâmetros) para que
  seja possível inicializar um objeto com mais de uma opção.
    
    ```
    public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    public String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        // maneira especial de evocar um construtor já criado
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }
    ```
    
   Conforme mencionado anteriormente, é uma boa prática criar mais de um construtor para que aumentemos as possibilidades de instanciar
   um novo objeto. Um ponto interessante a ressaltar, é que a fim de evitar duplicação de código é possível criar sobrecarga de construtores,
      utilizando outros construotres com menos parâmetros. Para isso, basta utilizar a palavra reservada **new** e entre parânteses definir quais
      argumentos serão utilizados, para finalizar a criação basta declarar quais os outros parâmetros que serão utilizados.
      
## Alocação de um objeto na memória RAM

```
public class Professor {
    public String nome;
    public String matricula;
    public String cpf;
    public String rg;

    /*Uso do this elimina a necessidade de usar params,além de deixar
    * método com os atributos específicos do objeto que foi instanciado.*/
    public void imprime(){
        System.out.println("===================");
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
        
    public static void main(String[] args){
        Professor prof = new Professor();
        prof.cpf = "094.659.484-08";
        prof.matricula = "1243487";
        prof.nome = "Eduardo Falcão";
        prof.rg = "457485-9";    
  }
}
```
  Assim que instanciado, será criado um espaço na memória para alocar o endereço de memória que **prof** referencia. Além disso, outro espaço é criado para alocar todos os atributos que pertencem a classe **Professor** e foi instanciado pelo objeto **prof**. Além disso, é importante lembrar que o espaço criado para guardar o endereço que o objeto referencia é necessário devido ao tamanho do espaço reservado para armazenar os atributos do objeto não ser estástico.

![Alocação do objeto na memória](https://github.com/niverton-felipe/P2-Unifacisa/blob/master/alocacao-de-objeto-na-memoria.png)

