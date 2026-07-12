import java.util.Scanner;
public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double bakiye = 5000.0; // Başlangıç bakiyemiz
        
        System.out.println("--- MODERN ATM PANELİ ---");
        System.out.println("P - Para Cek");
        System.out.println("Y - Para Yatir");
        System.out.println("B - Bakiye Sorgula");
        System.out.println("C - Cikis");
        System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
        
        char islem = scanner.next().toUpperCase().charAt(0);
        
        bakiye = switch (islem) {
            case 'P' -> {
                System.out.print("Cekmek istediginiz tutar: ");
                double tutar = scanner.nextDouble();
                if (tutar > bakiye) {
                    System.out.println("Yetersiz bakiye! Islem iptal edildi.");
                    yield bakiye; 
                } else {
                    System.out.println(tutar + " TL cekildi.");
                    yield bakiye - tutar; 
                }
            }
            case 'Y' -> {
                System.out.print("Yatirmak istediginiz tutar: ");
                double tutar = scanner.nextDouble();
                System.out.println(tutar + " TL hesabiniza yatirildi.");
                yield bakiye + tutar; 
            }
            case 'B' -> {
                System.out.println("Mevcut bakiyeniz sorgulanıyor...");
                yield bakiye; 
            }
            case 'C' -> {
                System.out.println("Güle güle, iyi günler dileriz!");
                yield bakiye;
            }
            default -> {
                System.out.println("Geçersiz işlem seçildi!");
                yield bakiye;
            }
        };
        

        System.out.println("-------------------------------------");
        System.out.println("Islem Sonucu Guncel Bakiyeniz: " + bakiye + " TL");
        System.out.println("-------------------------------------");
        System.out.println("Programdan cikmak icin herhangi bir tusa basiniz...");
        scanner.close();
    }
}