import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("bır sayı gırınız");
        int sayi = sc.nextInt();
        int faktorıyel=1;
        for(int i=1 ; i<=sayi; i++){
            faktorıyel=faktorıyel*i ;
        }
        System.out.println("gırılen sayının faktorıyelı: "+faktorıyel);
    }
}
