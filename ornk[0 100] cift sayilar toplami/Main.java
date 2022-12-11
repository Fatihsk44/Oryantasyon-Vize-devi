public class Main {
    public static void main (String [] args){
        int tplm=0 , sayi=0 ;
        for( int i =0; i <=100; i++){
            if(i%2==0){
                tplm=tplm + i ;
                sayi++;
                System.out.println(i);
            }
        }
        System.out.println("toplam: "+tplm);
        System.out.println("ortalama: "+(tplm/sayi));
    }
}
