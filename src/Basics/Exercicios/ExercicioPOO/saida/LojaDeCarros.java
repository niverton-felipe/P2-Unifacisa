package abc.com.br.unifacisa.p2.strings.Exercicio.saida;

import abc.com.br.unifacisa.p2.strings.Exercicio.classes.Carro;

public class LojaDeCarros {
    public static void main(String[] args) {
        /*
        Crie uma classe chamada Loja de Carros. Instancie os seguintes carros:

        Fiat Pálio básico, de preço básico R$ 35000
        Fiat Pálio básico com cor prateada, de preço básico R$ 35000
        Honda Civic completo, de preço básico R$110000
        Toyota Corolla com vidro, direção e ar, de preço básico R$110000
        Volkswagen Gol completo, de preço básico R$ 55000 (use o construtor vazio)
        Por fim, use a função toString para mostrar atributos e preços dos diferentes carros instanciados.
        */
        Carro carro1 = new Carro("Fiat Pálio", "Pálio", 35000);
        Carro carro2 = new Carro("Fiat Pálio", "Pálio", "prata", 2, false,false,false,false,35000);
        Carro carro3 = new Carro("Honda Civic completo", "Honda Civic", "branco", 4, true,true,true,true,110000);
        Carro carro4 = new Carro("Toyota Corolla", "Toyota", "branco", 4, true,true,false,true,110000);
        Carro carro5 = new Carro();
        carro5.setNome("Volkswagen Gol");
        carro5.setMarca("Gol");
        carro5.setPortas(4);
        carro5.setCor("branco");
        carro5.setArCondicionado(true);
        carro5.setCambioAutomatico(true);
        carro5.setDirecaoEletrica(true);
        carro5.setVidroEletrico(true);
        carro5.setPrecoBase(55000);

        Carro[] carros = new Carro[] {carro1,carro2, carro3, carro4, carro5};
        for(Carro carro : carros){
            System.out.println(carro);
        }

    }
}
