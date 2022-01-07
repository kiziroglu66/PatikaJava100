// Uc kenar uzunlugu girilen bir ucgenin alanını hesaplayan uygulama.

// Ucgenin kenar uzunlukları ucgen esitsizligi teoremine uygun sekilde girilmeli.

import java.util.Scanner;


public class UcgenAlan {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int birinciKenar , ikinciKenar , ucuncuKenar,alan;
		
		System.out.print("Birinci kenar uzunlugunu giriniz : ");
		birinciKenar = input.nextInt();
		
		System.out.print("Ikınci kenar uzunlugunu giriniz : ");
		ikinciKenar = input.nextInt();
		
		System.out.print("Ucuncu kenar uzunlugunu giriniz : ");
		ucuncuKenar = input.nextInt();
		
		int yariCevre = (birinciKenar + ikinciKenar + ucuncuKenar)/2;
		
		
		alan = yariCevre*(yariCevre - birinciKenar) * (yariCevre - ikinciKenar) * (yariCevre - ucuncuKenar);
		
		System.out.print("Ucgenin Alani : " +yariCevre);
		
	}

}
