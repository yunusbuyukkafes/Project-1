import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("karakter girin");
        char karakter =scn.next().charAt(0);  
        int ascii= (int) karakter;
        System.out.println("ascii karşılığı"+ascii);
        int değer = ascii*3;
        byte overflow= (byte) değer;
        System.out.println("taşan"+ overflow);
        char yeni = (char) overflow;
        System.out.println("yeni harf"+yeni);
        scn.close();   
    }
}
