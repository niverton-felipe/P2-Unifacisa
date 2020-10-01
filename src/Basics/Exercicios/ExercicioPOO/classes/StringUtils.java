package abc.com.br.unifacisa.p2.strings.Exercicio;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class StringUtils {
    public static String formataAtributo(String texto){
        String textoMinusculo = texto.toLowerCase();
        String[] palavras = textoMinusculo.split(" ");
        String textoFormatado = palavras[0];
        for(int i = 1; i < palavras.length; i++){
            // atribui à variável ini a primeira palavra da String em maiúscula
            char ini = palavras[i].toUpperCase().charAt(0);
            //valueOf converte o valor passado no argumento para tipo String
            String aux = String.valueOf(ini);
            // atribui à variável aux o valor da string a partir da posição 1
            aux += palavras[i].substring(1);
            //concatena à variavel textoFormatado o valor da variável aux
            textoFormatado += aux;
        }
        return textoFormatado;
    }

    public static String formataMetodo(String texto){
        String textoFormatado = StringUtils.formataAtributo(texto);
        char ini = textoFormatado.toUpperCase().charAt(0);
        String aux = ini + textoFormatado.substring(1);
        textoFormatado = "get" + aux;
        return textoFormatado;
    }

    public static String formataClasse(String texto){
        String textoFormatado = StringUtils.formataAtributo(texto);
        char ini = textoFormatado.toUpperCase().charAt(0);
        textoFormatado = ini + textoFormatado.substring(1);
        return textoFormatado;
    }

    public static String ordenaStrings(String palavra1, String palavra2){
        String saida = "";
        String menorString = StringUtils.menorString(palavra1, palavra2);
        for (int i = 0; i < menorString.length(); i++){
            if (palavra1.toLowerCase().equals(palavra2.toLowerCase())){
                saida += palavra1 +" " + palavra2;
                return saida;
            }
            if (palavra1.toLowerCase().charAt(i) > palavra2.toLowerCase().charAt(i)){
                saida += palavra2 +" " + palavra1;
                return saida;
            }
            if (palavra2.toLowerCase().charAt(i) > palavra1.toLowerCase().charAt(i)){
                saida += palavra1 +" " + palavra2;
                return saida;
            }
        }
        saida += palavra1 +" "+ palavra2;
        return saida;
    }

    public static String menorString(String palavra1, String palavra2){
        String menorString = "";
        if (palavra1.length() <= palavra2.length()){
            menorString = palavra1;
        }
        else{
            menorString = palavra2;
        }
        return menorString;
    }

    public static String stringReverse(String palavra){
        String palavraInvertida = "";
        for (int i = (palavra.length()) - 1; i >= 0; i--) {
            char aux = palavra.charAt(i);
            palavraInvertida += aux;
        }
        return palavraInvertida;
    }

    public static boolean ehPalidromo(String palavra){
        String palavraInvertida = StringUtils.stringReverse(palavra);
        return palavra.equals(palavraInvertida)? true : false;
    }

    public static String transformaEmCaixaAlta(String texto){
        String textoFormatado = "";
        for (int i = 0; i < texto.length(); i++){
            char aux = texto.toUpperCase().charAt(i);
            textoFormatado += aux;
        }
        return textoFormatado;
    }

    public static int contaVogais(String frase){
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int qntVogais = 0;
        for (int i = 0; i < frase.length(); i++){
            Character letter = frase.toLowerCase().charAt(i);
            for (char vogal : vogais){
                if (letter.equals(vogal)){
                    qntVogais ++;
                }
            }
        }
        return qntVogais;
    }

    public static String removeEspacosSuperfluos(String frase){
        String textoFormatado = "";
        for (int i = 0; i < frase.length(); i++){
            int tamanho = frase.length();

            if(i == tamanho - 1) {
                if (frase.charAt(tamanho - 1) != ' ') {
                    textoFormatado += frase.charAt(tamanho - 1);
                }
            } else{
                if(frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ' && i > 0){
                    textoFormatado += frase.charAt(i);
                }
                else if (frase.charAt(i) != ' '){
                    textoFormatado += frase.charAt(i);
                }
            }
        }
        if(textoFormatado.charAt(0) == ' '){
            textoFormatado = textoFormatado.substring(1);
        }
        return textoFormatado;
    }

    public static int getQntdadePalavras(String frase){
        String textoFormatado = StringUtils.removeEspacosSuperfluos(frase);
        int qntPalavras = 1;
        for (int i = 1; i < textoFormatado.length(); i++){
            if (textoFormatado.charAt(i) == ' '){
                qntPalavras ++;
            }
        }
        return qntPalavras;
    }

    public static int binarioParaDecimal(String binario){
        String textoFormatado = StringUtils.removeEspacosSuperfluos(binario);
        int numeroDecimal = 0;
        for (int i = 0; i < textoFormatado.length(); i++){
            int aux = Character.getNumericValue(textoFormatado.charAt(i));
            int aux2 = aux * (int) Math.pow(2,i);
            numeroDecimal += aux2;
        }
        return  numeroDecimal;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.formataClasse("niverton felipe pereira sousa"));
        System.out.println(StringUtils.ordenaStrings("Emilly", "Emilly"));
        System.out.println(StringUtils.ehPalidromo("arara"));
        System.out.println(StringUtils.stringReverse("arara"));
        System.out.println(StringUtils.transformaEmCaixaAlta("Niverton Felipe Pereira sousa"));
        System.out.println(StringUtils.contaVogais("Emilly Gomes"));
        System.out.println(StringUtils.removeEspacosSuperfluos("        Niverton felipe Pereira    1       "));
        System.out.println(StringUtils.getQntdadePalavras("Santo      Expedito        "));
        System.out.println(StringUtils.binarioParaDecimal("0110101"));
    }
}
