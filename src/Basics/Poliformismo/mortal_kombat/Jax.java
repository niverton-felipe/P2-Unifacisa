package abc.com.br.unifacisa.p2.strings.poliformismo.mortal_kombat;

public class Jax extends Lutador {
    public Jax() {
        super("Jax");
    }

    public void socar(Lutador l2){
        if (l2 != null){
            super.socar(l2);
            l2.vida -= 7;
        }
    }
}
