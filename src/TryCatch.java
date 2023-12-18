import java.util.Scanner;

public class TryCatch {


    private static Scanner scan = new Scanner(System.in);

    public static int intGiris() {
        int giris = 0;
        boolean gecerliGiris = false;

        do {
            try {
                System.out.print("Lütfen bir tamsayı giriniz: ");
                giris = scan.nextInt();
                scan.nextLine();  // Buffer'ı temizleme
                gecerliGiris = true;
            } catch (Exception e) {
                System.out.println("Geçerli bir tamsayı girmediniz. Tekrar deneyin.");
                scan.nextLine();  // Hatalı girişi temizleme
            }
        } while (!gecerliGiris);

        return giris;
    }

    public static String stringGiris() {
        String giris = "";
        boolean gecerliGiris = false;

        do {
            try {
                System.out.print("Lütfen bir metin giriniz: ");
                giris = scan.nextLine();
                gecerliGiris = true;
            } catch (Exception e) {
                System.out.println("Geçerli bir metin girmediniz. Tekrar deneyin.");
            }
        } while (!gecerliGiris);

        return giris;
    }

    public static void main(String[] args) {
        // Örnek Kullanım
        int kullaniciSayi = intGiris();
        System.out.println("Girilen sayı: " + kullaniciSayi);

        String kullaniciMetin = stringGiris();
        System.out.println("Girilen metin: " + kullaniciMetin);
    }

}
