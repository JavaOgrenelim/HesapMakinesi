import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islem = "Hangi işlemi yapmak istiyorsunuz?\n1: Çarpma\n2: Bölme\n3: Toplama\n4: Çıkarma";
        System.out.print(islem + "\n >>> ");
        int islemReturned = scanner.nextInt();
        if (islemReturned == 1) {
            System.out.print("Çarpılacak 1. sayı: ");
            int carp1 = scanner.nextInt();
            System.out.print("Çarpılacak 2. sayı: ");
            int carp2 = scanner.nextInt();
            System.out.print("----------SONUÇ---------------\n"+ " " + carp1 + " ve "+carp2 + " " + "sayılarının çarpımı:"+ " "+ carp1 * carp2 +"\n------------------------------");
        }
        else if (islemReturned == 2) {
            System.out.print("Bölünecek 1. sayı: ");
            int bol1 = scanner.nextInt();
            System.out.print("Bölünecek 2. sayı: ");
            int bol2 = scanner.nextInt();
            System.out.print("----------SONUÇ---------------\n"+ " " + bol1 + " ve "+bol2 + " " + "sayılarının bölümü:"+ " "+ bol1 / bol2 +"\n------------------------------");
        }
        else if (islemReturned == 3) {
            System.out.print("Toplanacak 1. sayı: ");
            int topla1 = scanner.nextInt();
            System.out.print("Toplanacak 2. sayı: ");
            int topla2 = scanner.nextInt();
            int total = topla1 + topla2;
            System.out.print("----------SONUÇ---------------\n"+ " " + topla1 + " ve "+topla2 + " " + "sayılarının toplama:"+ " "+ total +"\n------------------------------");
        }
        else if (islemReturned == 4) {
            System.out.print("Çıkarılacak 1. sayı: ");
            int cikar1 = scanner.nextInt();
            System.out.print("Çıkarılacak 2. sayı: ");
            int cikar2 = scanner.nextInt();
            int totalRemoved = cikar1 - cikar2;
            System.out.print("----------SONUÇ---------------\n"+ " " + cikar1 + " ve "+cikar2 + " " + "sayılarının kalanı:"+ " "+ totalRemoved +"\n------------------------------");
        }
        else {
            System.out.print("Lütfen geçerli bir işlemin ID'sini giriniz!");
        }

    }
}
