import java.util.Scanner;
public class Main {
    public static void main(String [] args ){
        int sayi1 , sayi2 , ebob=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("sırasıyla sayi1 ve sayi2 degerlerını gırınız");
        sayi1 = sc.nextInt();
        sayi2= sc.nextInt();
        for( int i =1 ; i<=sayi1 || i<=sayi2; i++){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println("gırılen sayıların en buyuk ortak bolenı: "+ebob);
    }
}
