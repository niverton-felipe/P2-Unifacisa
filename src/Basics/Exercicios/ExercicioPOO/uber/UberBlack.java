package abc.com.br.unifacisa.p2.strings.uber;

public class UberBlack extends UberX {
    public UberBlack(double km) {
        super(km);
    }

    public double getValor(){
        return super.getValor() * 1.1;
    }
}
