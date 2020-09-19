package abc.com.br.unifacisa.p2.strings.Exercicio.classes;

public class Imovel {

    private String tipo, imobiliaria;
    private int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
    private boolean elevador, piscina, quadra;

    public Imovel(String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados, boolean piscina, boolean quadra, boolean elevador) {
        this.tipo = "casa";
        this.imobiliaria = imobiliaria;
        this.quartos = quartos;
        this.suites = suites;
        this.banheiros = banheiros;
        this.metrosQuadrados = metrosQuadrados;
        this.piscina = piscina;
        this.quadra = quadra;
        this.elevador = elevador;
    }

    public Imovel(String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
        this.tipo = "apartamento";
        this.imobiliaria = imobiliaria;
        this.pavimentos = pavimentos;
        this.pavimento = pavimento;
        this.quartos = quartos;
        this.suites = suites;
        this.banheiros = banheiros;
        this.metrosQuadrados = metrosQuadrados;
        this.elevador = elevador;
        this.piscina = piscina;
        this.quadra = quadra;
    }

    public double calculaPreco() {
        double precoFinal = 0;
        precoFinal += (metrosQuadrados * 5000);
        if (pavimento > 5) {
            int diferenca = pavimento - 5;
            precoFinal += (diferenca * 2000);
        }
        if (elevador) precoFinal += 2500;
        if (piscina) precoFinal += 2500;
        if (quadra) precoFinal += 2500;
        return precoFinal;
    }

    public String toString(){
        double precoFinal = calculaPreco();
        String saida = "Tipo de imóvel: " + tipo + "\n";
        saida += "Imobiliaria: " + imobiliaria + "\n";
        if (tipo.equals("apartamento")){
            saida += "Pavimentos: " + pavimentos + "\n";
            saida += "Pavimento: " + pavimento + "\n";
        }
        saida += "Quartos: " + quartos + "\n";
        saida += "Suites: " + suites + "\n";
        saida += "Banheiros: " + banheiros + "\n";
        saida += "Metros quadrados: " + metrosQuadrados + "\n";

        if (elevador){
           saida += "Elevador: sim" + "\n";
        }else{
          saida += "Elevador: não" + "\n";
        }

        if(piscina){
            saida += "Piscina: sim" + "\n";
        }else{
            saida += "Piscina: não" + "\n";
        }
        if(quadra){
            saida += "Quadra: sim" + "\n";
        }else{
            saida += "Quadra: não" + "\n";
        }
        saida += "Preço: R$ " + precoFinal + "\n";
        return saida;
    }

    // getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImobiliaria() {
        return imobiliaria;
    }

    public void setImobiliaria(String imobiliaria) {
        this.imobiliaria = imobiliaria;
    }

    public int getPavimentos() {
        return pavimentos;
    }

    public void setPavimentos(int pavimentos) {
        this.pavimentos = pavimentos;
    }

    public int getPavimento() {
        return pavimento;
    }

    public void setPavimento(int pavimento) {
        this.pavimento = pavimento;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public boolean isElevador() {
        return elevador;
    }

    public void setElevador(boolean elevador) {
        this.elevador = elevador;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isQuadra() {
        return quadra;
    }

    public void setQuadra(boolean quadra) {
        this.quadra = quadra;
    }
}
