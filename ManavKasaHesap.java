// ullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.

import java.util.Scanner;

public class ManavKasaHesap {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double armutKiloFiyat = 2.14;
		double elmaKiloFiyat = 3.67;
		double domatesKiloFiyat = 1.11;
		double muzKiloFiyat = 0.95;
		double patlicanKiloFiyat = 5.00;
		
		System.out.print("Armut kac kilo ? : ");
		int armutKilo = input.nextInt();
		
		System.out.print("Elma kac kilo ? : ");
		int elmaKilo = input.nextInt();
		
		System.out.print("Domates kac kilo ? ");
		int domatesKilo = input.nextInt();
		
		System.out.print("Muz kac kilo ? ");
		int muzKilo = input.nextInt();
		
		System.out.print("Patlican kac kilo ? ");
		int patlicanKilo = input.nextInt();
		
		double toplamTutar = armutKiloFiyat*armutKilo +
				elmaKiloFiyat*elmaKilo + domatesKiloFiyat*domatesKilo
				+ muzKiloFiyat*muzKilo + patlicanKiloFiyat*patlicanKilo;
		
		System.out.print("Toplam TUtar : " +toplamTutar);
		
		
		
	}

}
