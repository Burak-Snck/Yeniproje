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
                scan.nextLine();
                gecerliGiris = true;
            } catch (Exception e) {
                System.out.println("Geçerli bir tamsayı girmediniz. Tekrar deneyin.");
                scan.nextLine();
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



}
