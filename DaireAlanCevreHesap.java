// yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan program.

import java.util.Scanner;


public class DaireAlanCevreHesap {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yaricapini giriniz : ");
		int yariCap = input.nextInt();
		
		double cevre = 2*Math.PI*yariCap;
		double alan = Math.PI*yariCap*yariCap;
		
		System.out.print("Dairenin Cevresi : " +cevre);
		System.out.println();
		System.out.print("Dairenin Alani : " +alan);
		
		
		
		
	}

}
