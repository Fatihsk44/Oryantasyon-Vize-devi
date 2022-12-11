import java.util.Scanner ;
public class Main {
    public static void main(String[] args){
       double tl ;
       System.out.println("para mıktarını gırınız(tl)");
       Scanner sc = new Scanner(System.in);
       tl = sc.nextDouble();
        System.out.println(tl+" tl "+(tl/18)+" dolar , "+(tl/19)+" eurodur");
    }
}
