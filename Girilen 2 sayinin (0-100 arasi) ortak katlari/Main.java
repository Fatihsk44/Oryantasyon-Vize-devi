import java.util.Scanner ;
public class Main {
    public static void main (String[] args){
        int a , b ;
        Scanner sc =  new Scanner(System.in);
        System.out.println("sırasıyla a ve b degerlerını gırınız: ");
        a = sc.nextInt();
        b= sc.nextInt();
        System.out.println("Gırılen sayıların ortak katları;");
        for( int i =1 ; i<=100 ; i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
            }
        }
    }
}
