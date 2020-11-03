package abc.com.br.unifacisa.p2.strings.poliformismo.mortal_kombat;

public class Lutador {
    protected String nome;
    protected  int vida;

    public Lutador(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public void socar(Lutador l2){
        if (l2 != null){
            l2.vida -= 7;
        }
    }

    public void chutar(Lutador l2){
        if (l2 != null){
            l2.vida -= 5;
        }
    }

    public void atirar(Lutador l2){
        if (l2 != null){
            l2.vida -= 10;
        }
    }

    public void lancarMagia(Lutador l2){
        if (l2 != null){
            l2.vida -= 12;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }
}
