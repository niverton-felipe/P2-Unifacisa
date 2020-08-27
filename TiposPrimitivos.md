# Tipos de Dados Primitivos em Java

Os tipos de dados primitivos em Java são o boolean, byte, char, short, int, long, float e double.
Os tipos primitivos são tipos de dados especiais internos à linguagem, não sendo objetos criados a partir de uma classe.

## Tipos primitivos: números inteiros

| Tipo   | Tamanho (bits)|	Faixa	Valor   |  Padrão |
|  :---: |      :---:    |    :---:       |   :---: |
| byte	 |    8	         | -128 a 127	    |    0    |
| short	 |    16	       |-32.768 a 32.767|	   0    |
| int	   |    32	       |-231 a 231 – 1	|    0    |
| long	 |    64	       |-263 a 263 -1	  |    0L   |

## Tipos Primitivos: Números de Ponto Flutuante

Tipo	     Tamanho (bits)	Faixa	Valor                                                   Padrão
float	        32	        IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38 	  0.0f
double	      64	        IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308 	0.0

**Nota:** *de acordo com o que foi pesquisado, além do tamando de bits do double ser bem superior ao do float (o que permite que a extensão de número armazenada seja muito maior) esse tipo também possui maior precisão e deve ser preferivelmente empregado quando a precisão do valor for um fator importante.*

## Tipos Primitivos: Caracteres


Tipo	     Tamanho (bits)	Faixa	Valor Padrão
char            16        0 a 65635    \0

O tipo char permite armazenar um caractere Unicode, utilizando para isso 16 bits.

O Unicode é um padrão da indústria para representar dados relacionados a texto, incluindo letras, símbolos e caracteres especiais. 
Valor padrão para o tipo char: ‘\u0000’.

## Tipos Primitivos: boolean
O tipo boolean permite armazenar um valor lógico nos estados True ou False (verdadeiro ou falso), ocupando apenas 1 bit de espaço.

Tipo	     Tamanho (bits)	Faixa	Valor Padrão
boolean          1        false/true   false
