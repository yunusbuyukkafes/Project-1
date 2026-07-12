import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int sayi = scn.nextInt();
        if ((sayi %5 == 0 && sayi % 3==0)||(sayi<200 && sayi>100 && sayi % 2==0)){
            System.out.print("şartlar sağlandı");
        }
        else{
            System.out.print("şartlar sağlanmadı");
        }
        scn.close();    
    }   
}