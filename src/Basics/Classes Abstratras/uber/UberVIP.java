package abc.com.br.unifacisa.p2.strings.uber;

public class UberVIP extends UberX {
    public UberVIP(double km) {
        super(km);
    }

    @Override
    public double getValor(){
        return super.getValor() * 0.9;
    }
}
