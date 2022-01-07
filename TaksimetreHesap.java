/**
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program.
 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.
 */

import java.util.Scanner;

public class TaksimetreHesap {
	
	public static void main(String[] args) {
		
		double odenecekTutar;
		double taksimetreAcilis = 10.0;
		double minimumOdenecekTutar = 20.0;
		
		double kilometreBasinaUcret = 2.20;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gidilen mesafeyi kilometre olarak giriniz : ");
		int gidilenMesafe = input.nextInt();
		
		
		odenecekTutar = taksimetreAcilis + kilometreBasinaUcret*gidilenMesafe;
		
		if (odenecekTutar <= minimumOdenecekTutar) 
		{
			odenecekTutar = minimumOdenecekTutar;
			System.out.print("Odenecek tutar : " +odenecekTutar);
		}
		else
		{
			System.out.print("Odenecek Tutar : " +odenecekTutar);
		}
		
	}

}
