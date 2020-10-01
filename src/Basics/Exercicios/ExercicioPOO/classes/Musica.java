package abc.com.br.unifacisa.p2.strings.Exercicio.classes;

public class Musica {
    private String nome, artista, letra;
    private Genero genero;
    private int ano, numReproduzidas;
    private double duracao;

    public Musica(String nome, String artista, String letra, Genero genero, int ano, double duracao) {
        this.nome = nome;
        this.artista = artista;
        this.letra = letra;
        this.genero = genero;
        this.ano = ano;
        this.numReproduzidas = 0;
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        String saida = "Nome: " +nome + "\n";
        saida += "Artista: " + artista +"\n";
        saida += "Letra: " + letra +"\n";
        saida += "Genero: " + genero +"\n";
        saida += "Duração: " + duracao +"\n";
        saida += "Ano: " + ano +"\n";
        saida += "Número de reproduções: " + numReproduzidas +"\n";
        return saida;
    }

    public void tocarMusica(){
        this.numReproduzidas++;
    }

    public String getNome(){
        return this.nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getLetra() {
        return letra;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public int getNumReproduzidas() {
        return numReproduzidas;
    }

    public double getDuracao() {
        return duracao;
    }
}
