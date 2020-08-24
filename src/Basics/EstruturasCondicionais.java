package Basics;
import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicionais {
	public static void main (String[] args) {
		// Scanner é uma classe do Java, fica no pacote java.util
		Scanner entrada = new Scanner(System.in);
		
		// Setar a localidade 
		entrada.useLocale(Locale.US);
		
		System.out.print("Digite sua altura (x,x): ");
		double altura = entrada.nextDouble();
		System.out.print("Digite seu peso (x,x): ");
		double peso = entrada.nextDouble();		
		double imc = peso / (altura * altura);
		
		if (imc < 16) {
			System.out.println("Magreza grave");
		} else if (imc < 17) {
			System.out.println("Magreza moderada");
		}
		else if (imc < 18.5) {
			System.out.println("Magreza leve");
		} else if (imc < 25) {
			System.out.println("Normal");
		} else if (imc < 30) {
			System.out.println("Sobrepeso ");
		} else if (imc < 35) {
			System.out.println("Magreza");
		} else if (imc < 40) {
			System.out.println("Obesidade II");
		} else {
			System.out.println("Obesidade III");
		}
	}
}
