package abc.com.br.unifacisa.p2.strings.uber;

import java.util.ArrayList;
import java.util.List;

public class SistemaUber {
    private List<Corrida> corridas;

    public SistemaUber(){
        this.corridas = new ArrayList<>();
    }

    public void adicionarCorrida(Corrida corrida){
        this.corridas.add(corrida);
    }

    public double getValorCorridas(){
        double valorTotal = 0;
        for (Corrida corrida : corridas){
            valorTotal += corrida.getValor();
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        SistemaUber uber = new SistemaUber();
        uber.adicionarCorrida(new UberX(5));
        uber.adicionarCorrida(new UberBlack(8));
        uber.adicionarCorrida(new UberVIP(3.4));
        System.out.println("O valor total das corridas foi de: R$ " + uber.getValorCorridas());
    }
}
