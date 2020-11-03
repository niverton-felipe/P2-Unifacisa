package abc.com.br.unifacisa.p2.strings.prova;

public class MercadoLivre {
    private Produto[] produtos;
    private int quantidadeProdutos;

    public MercadoLivre(){
        this.produtos = new Produto[10];
    }

    // FUNÇÃO I
    public void adicionarProduto(Produto p){
        if (quantidadeProdutos == produtos.length){
            estenderArray();
        }
        produtos[quantidadeProdutos] = p;
        quantidadeProdutos++;
    }

    public void adicionarProduto(double preco, String nome, String vendedor, Data dataAnuncio, double kmEntrega){
        Produto p = new Produto(preco,nome,vendedor,dataAnuncio,kmEntrega);
        this.adicionarProduto(p);
    }


    private void estenderArray(){
        Produto[] aux = new Produto[quantidadeProdutos * 2];
        for (int i = 0; i < produtos.length; i++){
            aux[i] = produtos[i];
        }
        this.produtos = aux;
    }
    // FUNÇÃO II
    public int getQuantidadeProdutos(){
        return quantidadeProdutos;
    }

    //FUNÇÃO III
    public Produto[] getProdutosVendedor(String vendedor){
        int cont = 0;
        for (Produto produto : produtos){
            if (produto != null && produto.getVendedor().toLowerCase().equals(vendedor.toLowerCase())){}
             cont++;
        }

        if (cont > 0){
            Produto[] produtosDoVendedor = new Produto[cont];
            int i = 0;
            for (Produto produto : produtos){
                if (produto != null && produto.getVendedor().toLowerCase().equals(vendedor.toLowerCase())){
                    produtosDoVendedor[i] = produto;
                    i++;
                }
            } return produtosDoVendedor;
        }
        return null;
    }

    //FUNÇÃO IV
    public double getCustoProdutos(){
        double valorTotalProdutos = 0;
        for (Produto produto : produtos){
            if (produto != null){
                valorTotalProdutos += produto.getPreco();
            }
        }
        return valorTotalProdutos;
    }
    // FUNÇÃO V
    public Produto removeProdutoMaisAntigo(String vendedor){
        int cont = 0;
        for (Produto produto : produtos){
            if (produto != null && produto.getVendedor().toLowerCase().equals(vendedor.toLowerCase())){}
            cont++;
        }

        if (cont > 0){
            Produto produtoMaisAntigo = produtoMaisAntigoVendedor(vendedor);
            boolean deslocarAEsquerda = false;
            for (int i = 0; i < quantidadeProdutos; i++){
                if( produtos[i] != null && produtos[i] == produtoMaisAntigo){
                    deslocarAEsquerda = true;
                }
                if(deslocarAEsquerda){
                    produtos[i] = produtos[i+1];
                }
            } return produtoMaisAntigo;
        } return null;

    }

    private Produto produtoMaisAntigoVendedor(String vendedor){
        Produto produtoMaisAntigo = null;
        for (Produto produto : produtos){
            if (produto != null && produto.getVendedor().toLowerCase().equals(vendedor.toLowerCase())){
               Data dataMaisAntiga = new Data(Short.MAX_VALUE, Short.MAX_VALUE, Short.MAX_VALUE);

               if (produto.getDataVenda().getAno() < dataMaisAntiga.getAno()){
                   dataMaisAntiga = produto.getDataVenda();
                   produtoMaisAntigo = produto;
               }
               else if (produto.getDataVenda().getMes() < dataMaisAntiga.getMes()){
                   dataMaisAntiga = produto.getDataVenda();
                   produtoMaisAntigo = produto;
               }
               else if (produto.getDataVenda().getDia() < dataMaisAntiga.getDia()){
                   dataMaisAntiga = produto.getDataVenda();
                   produtoMaisAntigo = produto;
               }
            }

        }
        return produtoMaisAntigo;
    }

    public static void main(String[] args) {
        MercadoLivre mcl = new MercadoLivre();
        Produto.precoKm = 0.3;
        mcl.adicionarProduto(new Produto(100, "produto1", "vendedor1", new Data((short) 15, (short) 5, (short) 2020),40));
        mcl.adicionarProduto(new Produto(170, "produto2", "vendedor2", new Data((short) 25, (short) 5, (short) 2016),80 )); ;
        mcl.adicionarProduto(new Produto(190, "produto3", "vendedor3", new Data((short) 16, (short) 5, (short) 2015),50 ));
        mcl.adicionarProduto(new Produto(150, "produto4", "vendedor4", new Data((short) 20, (short) 5, (short) 2018),60 ));
        mcl.adicionarProduto(new Produto(200, "produto5", "vendedor5", new Data((short) 17, (short) 5, (short) 2010),120));
        Produto produto6 = new Produto(300, "produto6", "vendedor1", new Data((short) 15, (short) 5, (short) 2017),150);
        mcl.adicionarProduto(produto6);

        for (Produto produto : mcl.produtos){
            if (produto != null){
                System.out.println(produto);
            }
        }

        System.out.println("Quantidade de produtos vendidor: " + mcl.getQuantidadeProdutos());
        System.out.println("\nProdutos vendidos pelo vendedor escolhido: " + mcl.getProdutosVendedor("vendedor7"));
        System.out.println("\nCusto total: R$ " + mcl.getCustoProdutos());
        System.out.println("\nProduto mais antigo removido: \n" + mcl.removeProdutoMaisAntigo("vendedor1"));
    }
}
