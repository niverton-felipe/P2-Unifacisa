package abc.com.br.unifacisa.p2.strings.uber;

public class UberX extends Corrida {

    public UberX(double km) {
        super(km, 4,  1.2);
    }

    @Override
    public double getValor() {
        return super.precoBase + (km * super.precoKm);
    }
}
