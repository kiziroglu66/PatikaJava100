// Kullanıcıdan alınan boy ve kilo olculerine gore vucut kitle indeksini
//  hesaplayan uygulama.

import java.util.Scanner;

public class VucutKitleIndexHesap {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Boyunuzu metre cinsinden giriniz : ");
		double boy = input.nextDouble();
		
		System.out.print("Kilonuzu kg olarak giriniz : ");
		double kilo = input.nextDouble();
		
		
		double vucutKitleIndeksi = kilo/(boy*boy);
		
		System.out.print("Vucut kitle indeksiniz : " +vucutKitleIndeksi);
		
		
	}

}
