// Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.

import java.util.Scanner;
 

public class DaireDilimAlanHesap {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yaricapini giriniz : ");
		int yariCap = input.nextInt();
		
		System.out.print("Daire diliminin merkez aci olcusunu giriniz : ");
		int merkezAci = input.nextInt();
		
		double daireDilimiAlan = (Math.PI*yariCap*yariCap*merkezAci)/360;
		
		System.out.print("Daire Dİlimi Alanı : " +daireDilimiAlan);
		
		
	}

}
