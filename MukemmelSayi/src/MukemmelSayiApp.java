import java.util.Scanner;

public class MukemmelSayiApp {
	static Scanner komut = new Scanner(System.in);
	static int sayi;
	static boolean ifade = false;

	public static void main(String[] args) {
		int islem = 0;
		while (islem != 3) {
			islem = menu();
			System.out.print("Say� Giriniz: ");
			sayi = komut.nextInt();
			switch (islem) {
			case 1:
				mukemmelSayi(sayi);
				if (!ifade)
					System.out.println(sayi + " Say�s� m�kemmel bir say� de�ildir.");
				break;
			case 2:
				for (int i = 1; i < sayi; i++) {
					mukemmelSayi(i);
				}

				break;
			case 3:
				System.out.println("G�le g�le.");
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
			System.out.println(sayi + " Say�s� m�kemmel bir say�d�r.");
			System.out.println();
			ifade = true;
		}

	}

	static int menu() {
		System.out.println("------Men�------");
		System.out.println("1.Bir say�n�n m�kemmel olup olmad���n� sor");
		System.out.println("2.Bir say�ya kadar bulunan t�m m�kemmel say�lar� listele");
		System.out.println("3.��k��\n");
		System.out.print("Se�im yap�n�z: ");
		int secim = komut.nextInt();
		return secim;

	}

}
