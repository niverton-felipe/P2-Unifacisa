package abc.com.br.unifacisa.p2.strings.testeunitarios.classes;

public class Palavra {

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

    public static String stringReverse(String palavra){
        String palavraInvertida = "";
        for (int i = (palavra.length()) - 1; i >= 0; i--) {
            char aux = palavra.charAt(i);
            palavraInvertida += aux;
        }
        return palavraInvertida;
    }

    public static boolean ehPalidromo(String palavra){
        String palavraInvertida = Palavra.stringReverse(palavra);
        return palavra.toLowerCase().equals(palavraInvertida.toLowerCase());
    }

    public static int binarioParaDecimal(String binario){
        String textoFormatado = Palavra.removeEspacosSuperfluos(binario);
        textoFormatado = Palavra.stringReverse(textoFormatado);
        int numeroDecimal = 0;
        for (int i = 0 ; i < textoFormatado.length(); i++){
            int aux = Character.getNumericValue(textoFormatado.charAt(i));
            int aux2 = aux * (int) Math.pow(2,i);
            numeroDecimal += aux2;
        }
        return numeroDecimal;
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
}

