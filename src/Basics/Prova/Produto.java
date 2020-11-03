package abc.com.br.unifacisa.p2.strings.prova;

public class Produto {
    /*
    Produto deve conter os seguintes atributos (lembrar do encapsulamento, criar métodos getters): (0.5)
double preco;
String nome, vendedor;
Data dataVenda;
double kmEntrega;
static double precoKm;

    */
    private double preco;
    private String nome, vendedor;
    private Data dataVenda;
    private double kmEntrega;
    public static double precoKm;

    public Produto(double preco, String nome, String vendedor, Data dataVenda, double kmEntrega) {
        this.preco = preco;
        this.nome = nome;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.kmEntrega = kmEntrega;
    }

    @Override
    public String toString(){
        double precoFinal = getCustoTotal();
        double valorFrete = calculaFrete();
        String saida = "Nome do produto: " + nome + "\n";
        saida += "Preço: R$ " + preco + "\n";
        saida += "Data da venda: " + dataVenda.getDia() + "/" + dataVenda.getMes() +"/" + dataVenda.getAno() + "\n";
        saida += "Vendedor: " + vendedor + "\n";
        saida += "Frete: R$ " + valorFrete + "\n";
        saida += "Preço final: R$ " + precoFinal + "\n";
        return saida;
    }

    public double getCustoTotal(){
        double valorFrete = calculaFrete();
        double precoFinal = this.preco + valorFrete;
        return precoFinal;
    }

    public double calculaFrete(){
        double valorFrete = this.kmEntrega * precoKm;
        return valorFrete;
    }
    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getVendedor() {
        return vendedor;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public double getKmEntrega() {
        return kmEntrega;
    }

    public static double getPrecoKm() {
        return precoKm;
    }
}
