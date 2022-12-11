import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int uzunluk1 , uzunluk2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("prızmadakı kare kenarı degerını gırınız");
        uzunluk1= sc.nextInt();
        System.out.println("prımdakı dıger kenar degerını gırınız");
        uzunluk2 = sc.nextInt();
        int hacim = uzunluk1*uzunluk1*uzunluk2;
        System.out.println(hacim);
    }
}

