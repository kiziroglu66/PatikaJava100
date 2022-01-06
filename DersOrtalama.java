// Ders notlarının ortalamasını hesaplayan uygulama.

import java.util.Scanner;

public class DersOrtalama {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int matematik,fizik,kimya,muzik,tarih, turkce;
		
		int notlarinToplami = 0;
		
		System.out.println("Matematik ders notunu giriniz :");
		matematik = input.nextInt();
		
		System.out.println("Fizik ders notunu giriniz :");
		fizik = input.nextInt();
		
		System.out.println("Kimya ders notunu giriniz :");
		kimya = input.nextInt();
		
		
		System.out.println("Müzik ders notunu giriniz :");
		muzik = input.nextInt();
		
		System.out.println("Tarih ders notunu giriniz :");
		tarih = input.nextInt();
		
		
		System.out.println("Turkce ders notunu giriniz :");
		turkce = input.nextInt();
		
		notlarinToplami = notlarinToplami + matematik + fizik + kimya + muzik + tarih + turkce;
		
		double notlarinOrtalamasi = notlarinToplami/6;
		
		System.out.println("Notların toplamı : " +notlarinToplami);
		System.out.println("Notlarin ortalaması : " +notlarinOrtalamasi);
		
		if (notlarinOrtalamasi >= 60) {
			
			System.out.println("Sınıfı Gectiniz");
			
		}
		else
		{
			System.out.println("Sınıfta Kaldınız");
		}
		
		
		
	}

}
