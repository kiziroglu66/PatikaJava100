
import java.util.Scanner;

public class KdvHesap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int girilenTutar;

		System.out.println("Tutar Giriniz :");
		girilenTutar = input.nextInt();

		if (girilenTutar > 0 && girilenTutar <= 1000) {
			
			float kdvOrani = 0.18f;
			float kdvliTutar = girilenTutar + girilenTutar * kdvOrani;

			System.out.println("Kdv'siz Fiyat :" + girilenTutar);
			System.out.println("Kdv Tutari :" + (girilenTutar * kdvOrani));
			System.out.println("Kdv'li Tutar :" + kdvliTutar);
		}
		else
		{
			float kdvOrani = 0.08f;
			float kdvliTutar = girilenTutar + girilenTutar * kdvOrani;

			System.out.println("Kdv'siz Fiyat :" + girilenTutar);
			System.out.println("Kdv Tutari :" + (girilenTutar * kdvOrani));
			System.out.println("Kdv'li Tutar :" + kdvliTutar);
			
		}



	}

}
