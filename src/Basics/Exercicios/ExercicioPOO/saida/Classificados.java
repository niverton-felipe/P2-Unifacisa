package abc.com.br.unifacisa.p2.strings.Exercicio.saida;

import abc.com.br.unifacisa.p2.strings.Exercicio.classes.Imovel;

public class Classificados {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Imobiliária Falcão",3,1,2,120,true,false,false);
        Imovel imovel2 = new Imovel("Imobiliaria Falção",15,8,3,2,3,82,true,false,false);
        Imovel imovel3 = new Imovel("Imobiliaria Altaman",4,2,3,240,true,true,true);
        Imovel imovel4 = new Imovel("Imobiliaria Leblon",6,3,5,540,true,true,true);
        Imovel imovel5 = new Imovel("Imobiliaria Alto Branco",3,2,2,1,2,60,false,false,false);

        Imovel[] imoveis = {imovel1,imovel2,imovel3,imovel4,imovel5};
        for(Imovel imovel : imoveis){
            System.out.println(imovel);
        }
    }

}
