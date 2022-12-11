import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int sayi = (int)(Math.random()*101);
        System.out.println("Bır sayı tahmın edınız");
        Scanner sc = new Scanner(System.in);
        for( int i=1; i<=15; i++){
            int tahmininiz = sc.nextInt();
            if(sayi<tahmininiz){
                System.out.println("tahmınınız sayidan buyuktur");
            }
            else if(sayi>tahmininiz){
                System.out.println("tahmınınız sayıdan kucuktur");
            }
            else if(tahmininiz==sayi){
                System.out.println("Bigisayarın sectıgı sayi "+tahmininiz+" ve "+i+" . tahmınınızde dogru bıldınız");
            }
        }
    }
}
