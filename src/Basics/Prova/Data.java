package abc.com.br.unifacisa.p2.strings.prova;

public class Data {
    private short dia, mes, ano;

    public Data(short dia, short mes, short ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public short getDia(){
        return this.dia;
    }

    public short getMes() {
        return mes;
    }

    public short getAno() {
        return ano;
    }
}
