# Exercícios sobre Variáveis e Métodos de Instância e de Classe

## Questão 1

Reaproveite a classe Carro [deste exercício](ClassesEObjetos.md).
Além das variáveis de instância, crie a seguinte variável de classe: *boolean promocao*.
Se promocao for verdadeiro, adicione um desconto de 10% ao preço do carro.
Para isto, modifique a função *calculaPreco*.

Crie uma classe chamada Loja de Carros. 
Dentro da função *main*, antes de instanciar qualquer Carro, atribua *false* à variável de classe  *promocao*

Em seguida, instancie os seguintes carros:
 - Fiat Pálio básico, de preço básico R$ 35000
 - Fiat Pálio básico com cor prateada, de preço básico R$ 35000
 - Honda Civic completo, de preço básico R$110000
 - Toyota Corolla com vidro, direção e ar, de preço básico R$110000
 - Volkswagen Gol completo, de preço básico R$ 55000 

Depois de instanciar os carros, imprima os valores de todos eles (neste momento, o valores não terão desconto).

Por fim, mude o valor da variável de classe *promocao* para *true*, e imprima novamente os valores de cada carro criado (nesta ocasião,
o valores devem aparecer com desconto).

### Resposta
  Ao colocar o atributo promoção como variável de classe e condicionar o método *calculaPreco()* para acrescentar 10% de desconto caso esse atributo seja true, percebeu-se que
  dentro do método main foi preciso apenas alterar o valor do atributo promooção para true (diretamente da classe) para que o valor de todos os carros recebessem desconto de 10%.
  

## Questão 2

O que aconteceria se a variável booleana *promocao* fosse uma variável de instância?

Faça essa modificação no código da classe Carro.

Em seguida, instancie os mesmos carros:
 - Fiat Pálio básico, de preço básico R$ 35000
 - Fiat Pálio básico com cor prateada, de preço básico R$ 35000
 - Honda Civic completo, de preço básico R$110000
 - Toyota Corolla com vidro, direção e ar, de preço básico R$110000
 - Volkswagen Gol completo, de preço básico R$ 55000
 
Depois, imprima os valores dos carros sem promoção.

Por fim, imprima os valores dos carros com promoção.


### Resposta

  Ao colocar **promoção** como atributo de instância, identificou-se que para que determinada objeto recebesse um desconto de 10% era preciso alterar por meio do próprio objeto o atributo promoção para true.
  

## Questão 3

O que mudou na prática, quando *promocao* deixou de ser uma variável de classe e se tornou uma variável de objeto?
Semanticamente, para este exemplo, qual o efeito prático de *promocao* ser uma variável de classe ou de objeto? 
(explique como se você fosse o dono da concessionária explicando para seus clientes como funciona a promoção)

### Resposta 

  De modo prático, foi muito mais fácil aplicar um desconto para todos os carros quando usou-se o atributo de classe. Visto que era necessário fazer a alteração do atributo promoção por meio da própria classe.
  Semanticamente falando, usar a variável de classe seria indicado para as situações onde a loja aplicaria a promoção para qualquer carroq ue fosse vendido. Usar o atributo de instância, por sua vez, seria mais indicado para as situações onde o desconto dependesse de uma regra de negócio específico, como por exemplo, pagar à vista.
  
