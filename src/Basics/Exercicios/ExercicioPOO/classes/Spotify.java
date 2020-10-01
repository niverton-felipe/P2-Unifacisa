package abc.com.br.unifacisa.p2.strings.Exercicio.classes;

public class Spotify {
    private Musica[] musicas;
    private int qtdMusicas;

    public Spotify(){
        this.musicas = new Musica[10];
    }

    public Spotify(int tamanhoArray){
        this.musicas = new Musica[tamanhoArray];
        this.qtdMusicas = 0;
    }

    public int getQtdMusicas(){
        return qtdMusicas;
    }

    public void adicionarMusica(Musica musica){
        if (qtdMusicas == musicas.length){
            estenderArray();
        }
        musicas[qtdMusicas] = musica;
        qtdMusicas++;
    }

    public void estenderArray(){
        Musica[] aux = new Musica[qtdMusicas * 2];
        for (int i = 0; i < musicas.length; i++){
            aux[i] = musicas[i];
        }
        this.musicas = aux;
    }

    public void removerMusicaPorNome(String nomeMusica){
        boolean deslocarAEsquerda = false;
        for (int i = 0; i < this.qtdMusicas; i++){
            if (musicas[i].getNome().equals(nomeMusica)){
                deslocarAEsquerda = true;
            }
            if (deslocarAEsquerda){
                this.musicas[i] = this.musicas[i+1];
            }
        }
    }

    public void listarMusicasArtista(String artista){
        int qtdMusicasArtista = 0;
        System.out.println("LISTANDO MÚSICA DO ARTISTA: " + artista.toLowerCase() + "\n");
        for (Musica musica : musicas){
            if (musica != null && musica.getArtista().toLowerCase().equals(artista.toLowerCase())){
                System.out.println(musica);
                qtdMusicasArtista++;
            }
        }
        if(qtdMusicasArtista == 0){
            System.out.println("Artista não possui nenhuma música na sua playlist");
        }
    }

    public void listarMusicasAno(int ano){
        int qtdMusicasAno = 0;
        System.out.println("\nLISTANDO MUSICAS DO ANO: " +ano);
        for(Musica musica : musicas){
            if(musica != null && musica.getAno() == ano){
                System.out.println(musica);
                qtdMusicasAno ++;
            }
        }
        if (qtdMusicasAno == 0){
            System.out.println("Não houve nenhuma música lançada no ano "+ano);
        }
    }

    public void listarMusicasGenero(Genero genero){
        int qtdMusicasGenero = 0;
        System.out.println("\nLISTANDO MUSICAS DO GÊNERO: " +genero);
        for(Musica musica : musicas){
            if(musica != null && musica.getGenero().equals(genero)){
                System.out.println(musica);
                qtdMusicasGenero ++;
            }
        }
        if (qtdMusicasGenero == 0){
            System.out.println("Não nenhuma música com "+genero +" na sua playlist");
        }
    }

    public Musica musicaMenorDuracao(){
        double menorDuracao = Double.MAX_VALUE;
        Musica musicaComMenorDuracao = null;
        System.out.println("\nMúsica com menor duração");
        for (Musica musica : musicas){
            if (musica != null && musica.getDuracao() < menorDuracao){
                menorDuracao = musica.getDuracao();
                musicaComMenorDuracao = musica;
            }
        }
        return musicaComMenorDuracao;
    }

    public Musica musicaMaiorDuracao(){
        double maiorDuracao = Double.MIN_VALUE;
        Musica musicaComMaiorDuracao = null;
        System.out.println("\nMúsica com maior duração");
        for (Musica musica : musicas){
            if (musica != null && musica.getDuracao() > maiorDuracao){
                maiorDuracao = musica.getDuracao();
                musicaComMaiorDuracao = musica;
            }
        }
        return musicaComMaiorDuracao;
    }

    public Musica reproduzirMusica(String nomeMusica){
        Musica musicaSelecionada = null;
        for (Musica musica : musicas){
            if (musica != null && musica.getNome().toLowerCase().equals(nomeMusica.toLowerCase())){
                musicaSelecionada = musica;
                musica.tocarMusica();
                return musica;
            }
        }
        return musicaSelecionada;
    }

    public int numeroReproducoes(String nomeMusica){
        int numeroReproducoes = 0;
        for (Musica musica : musicas){
            if (musica != null && musica.getNome().toLowerCase().equals(nomeMusica)){
                numeroReproducoes = musica.getNumReproduzidas();
            }
        }
        return numeroReproducoes;
    }


    public static void main(String[] args) {
        Spotify spt = new Spotify(4);
        spt.adicionarMusica(new Musica("Musica1", "Artista1", "abc", Genero.FORRO, 1999, 3.5));
        spt.adicionarMusica(new Musica("Musica2", "Artista2", "def", Genero.SAMBA, 2005, 4.0));
        spt.adicionarMusica(new Musica("Musica3", "Artista3", "ghi", Genero.CLASSICO, 2010, 4.2));
        spt.adicionarMusica(new Musica("Musica4", "Artista4", "jkl", Genero.JAZZ, 2015, 3.0));
        spt.adicionarMusica(new Musica("Musica5", "Artista5", "mno", Genero.FUNK, 2019, 3.7));

        for(Musica m : spt.musicas) {
            if (m != null){
                System.out.println(m);
            }
        }

        System.out.println(spt.getQtdMusicas());
        spt.listarMusicasArtista("Artista 1");
        spt.listarMusicasAno(2021);
        spt.listarMusicasGenero(Genero.JAZZ);
        System.out.println(spt.musicaMenorDuracao());
        System.out.println(spt.musicaMaiorDuracao());
        System.out.println(spt.reproduzirMusica("Musica1"));
        System.out.println(spt.reproduzirMusica("Musica5"));
        System.out.println("Numero reproduções da música selecionada: "+spt.numeroReproducoes("musica1") +"\n");

        for(Musica m : spt.musicas) {
            if (m != null){
                System.out.println(m);
            }
        }


    }
}
