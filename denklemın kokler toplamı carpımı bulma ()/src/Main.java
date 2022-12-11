import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        System.out.println(" ax²+bx+c");
        double a , b , c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("sırasıyla a , b ve c degerlerını gırınız.");
        a = sc.nextDouble();
        b= sc.nextDouble();
        c = sc.nextDouble();
        if(b*b -4*a*c <0){
            System.out.println("Denklemın koklerı yoktur.");
        }
        else {
            System.out.println("kokler toplamı: "+(-b/a)+" , kokler carpımı: "+(c/a));
        }
    }
}