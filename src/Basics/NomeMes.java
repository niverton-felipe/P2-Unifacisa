package Basics;

public class NomeMes {
	
	//Formato data padrão: 05/12/2020
	//Formatodata textual: cinco de dezembro de 2020
	
	public static void main(String[] args) {
		short dia = 5, mes = 5, ano = 2020;
		String MesTexto = converteMesNumPraTexto (mes);
		System.out.println("Data: " + dia + " de " + MesTexto + " de " + ano);
	}
	
	public static String converteMesNumPraTexto(short mes) {
		switch(mes) {
		case 1: return "Janeiro";
		case 2: return "Fevereiro";
		case 3: return "Março";
		case 4: return "Abril";
		case 5: return "Maio";
		case 6: return "Junho";
		case 7: return "Julho";
		case 8: return "Agosto";
		case 9: return "Setembro";
		case 10: return "Outubro";
		case 11: return "Novembro";
		case 12: return "Dezembro";
		default: return "Mês Inexistente";
		
		}
			
	}

}
