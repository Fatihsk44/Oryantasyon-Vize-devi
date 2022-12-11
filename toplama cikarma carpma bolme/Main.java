import java.util.Scanner ;
public class Main {
    public static void main(String[] args){
        double a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" sırasıyla a ve b degerlerını gırınız");
        a = sc.nextDouble();
        b= sc.nextDouble();
        System.out.println("toplama: "+(a+b)+" ,cıkarma: "+(a-b));
        System.out.println("carpma: "+(a*b)+" ,bolme: "+(a/b));
    }
}
