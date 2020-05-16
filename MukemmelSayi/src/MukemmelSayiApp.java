import java.util.Scanner;

public class MukemmelSayiApp {
	static Scanner komut = new Scanner(System.in);
	static int sayi;
	static boolean ifade = false;

	public static void main(String[] args) {
		int islem = 0;
		while (islem != 3) {
			islem = menu();
			System.out.print("Sayý Giriniz: ");
			sayi = komut.nextInt();
			switch (islem) {
			case 1:
				mukemmelSayi(sayi);
				if (!ifade)
					System.out.println(sayi + " Sayýsý mükemmel bir sayý deðildir.");
				break;
			case 2:
				for (int i = 1; i < sayi; i++) {
					mukemmelSayi(i);
				}

				break;
			case 3:
				System.out.println("Güle güle.");
				break;

			}
		}

	}

	public static void mukemmelSayi(int sayi) {
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}

		}
		if (toplam == sayi) {
			System.out.println(sayi + " Sayýsý mükemmel bir sayýdýr.");
			System.out.println();
			ifade = true;
		}

	}

	static int menu() {
		System.out.println("------Menü------");
		System.out.println("1.Bir sayýnýn mükemmel olup olmadýðýný sor");
		System.out.println("2.Bir sayýya kadar bulunan tüm mükemmel sayýlarý listele");
		System.out.println("3.Çýkýþ\n");
		System.out.print("Seçim yapýnýz: ");
		int secim = komut.nextInt();
		return secim;

	}

}
