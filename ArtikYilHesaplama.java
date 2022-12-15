import java.util.Scanner;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		/*
		 * Artik yil nasıl hesaplanir ?
		 * Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
		 * 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır.
		 * Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
		 * Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni:
		 * Bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
		 * 
		 */
		
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		year = input.nextInt();
		
		if(year % 4 == 0) {
			System.out.println(year+" artik bir yildir");
		}else {
			System.out.println(year+" artik bir yil değildir");
		}

	}

}
