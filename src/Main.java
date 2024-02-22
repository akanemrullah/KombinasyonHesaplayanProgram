import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenler tanimlandi.
        int r = 1, n = 1, total = 1, totalN = 1, totalR = 1;

        // Scanner sinifi ile eleman tanimlanip projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan degerler alinip degiskenlere atandi.
        System.out.print("Kombinasyon hesabi icin n sayisini gir: ");
        n = input.nextInt();

        System.out.print("Kombinasyon hesabi icin r sayisini gir: ");
        r = input.nextInt();

        if (n >= r) { // N sayisinin R sayisindan buyuk olma durumu kontrol edildi. Ardindan 3 ayri for dongusu ile gerekli hesaplamalar yapilip sonuc kullaniciya iletildi.
            for (int i = 1; i <= n; i++) {
                totalN *= i;
            }
            for (int i = 1; i <= r; i++) {
                totalR *= i;
            }
            for (int i = 1; i <= (n - r); i++) {
                total *= i;
            }
            System.out.println("Sonuc: " + totalN / (totalR * total));
        }else{
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
        }
    }
}