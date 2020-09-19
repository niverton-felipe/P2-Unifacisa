package abc.com.br.unifacisa.p2.strings.Exercicio.classes;

public class Carro {
    private String nome, marca, cor;
    private int portas;
    private boolean vidroEletrico,arCondicionado, cambioAutomatico, direcaoEletrica;
    private double precoBase;
    private double precoFinal;

    public Carro(){

    }

    public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
                 boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.portas = portas;
        this.vidroEletrico = vidroEletrico;
        this.arCondicionado = arCondicionado;
        this.cambioAutomatico = cambioAutomatico;
        this.direcaoEletrica = direcaoEletrica;
        this.precoBase = precoBase;
    }

    public Carro(String nome, String marca, double precoBase){
        this.nome = nome;
        this.marca = marca;
        this.precoBase = precoBase;
        this.portas = 2;
        this.cor = "branco";
        this.vidroEletrico = false;
        this.arCondicionado = false;
        this.cambioAutomatico = false;
        this.direcaoEletrica = false;
    }
    /*
    Crie uma função toString, que nos dê todos os detalhes do carro, inclusive o preço total,
    através da função calculaPreco.
    */
    @Override
    public String toString(){
        double precoFinal = calculaPreco();
        String saida = "Nome: " +nome + "\n";
        saida += "Marca: " + marca + "\n";
        saida += "Cor: " + cor + "\n";
        saida += "Portas: " + portas + "\n";
        if (vidroEletrico){
            saida += "Vidro Eletrico: sim " + "\n";
        } else{
            saida += "Vidro Eletrico: não " + "\n";
        }
        if (arCondicionado){
            saida += "Ar-condicionado: sim " + "\n";
        } else {
            saida += "Ar-condicionado: não " + "\n";
        }
        if (cambioAutomatico){
            saida += "Câmbio automâtico: sim" + "\n";
        } else{
            saida += "Câmbio automâtico: não" + "\n";
        }
        if (direcaoEletrica){
            saida += "Direção elétrica: sim" + "\n";
        } else{
            saida += "Direção elétrica: não" + "\n";
        }
        saida += "Preço final: R$ " +precoFinal + "\n";

        return saida;
    }

    public double calculaPreco(){
        precoFinal = precoBase;
        switch (cor) {
            case "branco":
            break;
            case "azul":
            break;
            case "vermelho":
            break;
            case "preto":
                break;
            default: precoFinal += 1000;
        }
        if (arCondicionado) precoFinal += 1250;
        if (cambioAutomatico) precoFinal += 1250;
        if (vidroEletrico) precoFinal += 1250;
        if (direcaoEletrica) precoFinal += 1250;
        return precoFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(boolean vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean isDirecaoEletrica() {
        return direcaoEletrica;
    }

    public void setDirecaoEletrica(boolean direcaoEletrica) {
        this.direcaoEletrica = direcaoEletrica;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoFinal(){
        calculaPreco();
        return this.precoFinal;
    }
}
