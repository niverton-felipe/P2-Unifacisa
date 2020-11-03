package abc.com.br.unifacisa.p2.strings.poliformismo.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        List<Animal> jaula = new ArrayList<>();

        jaula.add(new Preguica("p1", 5));
        jaula.add(new Cavalo("cv1", 10));
        jaula.add(new Cachorro("c1", 8));
        jaula.add(new Cavalo("cv2", 3));
        jaula.add(new Preguica("p2",9));

        for (Animal animal:jaula){
            animal.emitirSom();
            if (animal instanceof Cavalo){
                Cavalo cavalo = (Cavalo) animal;
                cavalo.correr();
            } else if (animal instanceof Cachorro){
                Cachorro cachorro = (Cachorro) animal;
                cachorro.correr();
            } else if (animal instanceof  Preguica){
                Preguica bichoPreguica = (Preguica) animal;
                bichoPreguica.escalarArvore();
            }
        }
    }
}
