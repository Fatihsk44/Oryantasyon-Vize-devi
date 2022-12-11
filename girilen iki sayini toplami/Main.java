import java.util.Scanner ;
public class Main {
    public static void main(String[] args){
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("a ve b degerlerını gırınız");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(" gırılen sayıların toplamı: "+(a+b));
    }
}
