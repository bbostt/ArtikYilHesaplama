import java.util.Scanner;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		/*
		 * Artik yil nas�l hesaplanir ?
		 * Genel bir kural olarak, art�k y�llar 4 rakam�n�n kat� olan y�llard�r:
		 * 100'�n kat� olan y�llardan sadece 400'e kalans�z olarak b�l�nebilenler art�k y�ld�r.
		 * �rne�in 1200, 1600, 2000 y�llar� art�k y�ld�r ancak 1700, 1800 ve 1900 art�k y�l de�ildir.
		 * Sadece 400'e tam olarak b�l�nebilenlerin art�k y�l kabul edilmesinin nedeni:
		 * Bir astronomik y�l�n 365,25 g�n de�il, yakla��k olarak 365,242 g�n olmas�ndan kaynaklanan hatay� gidermektir.
		 * 
		 */
		
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		year = input.nextInt();
		
		if(year % 4 == 0) {
			System.out.println(year+" artik bir yildir");
		}else {
			System.out.println(year+" artik bir yil de�ildir");
		}

	}

}
