import java.util.Scanner;

public class hesapmakine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hesap Makinesine hoşgeldiniz");
        
        System.out.println("1.sayıyı girin: ");
        double x=input.nextDouble();

        System.out.println("2.sayıyı girin: ");
        double y=input.nextDouble();
        
        System.out.println("İşlemi girin: (+,-,*,/)");
        char a=input.next().charAt(0);      //char yapısı diğerlerinden farklı

        switch(a){
            case '+':
              System.out.println("Toplam: "+ (x+y));
              break;
            case '-':
              System.out.println("Fark: "+ (x-y));
              break;
            case '*':
              System.out.println("Çarpım: "+ (x*y));
              break;
            case '/':
              if(y!=0){
                System.out.println("Bölme: "+(x/y));
              }
              else{
                System.out.println("Sıfıra bölme hatası");
              }
              break;
            default:
                System.out.println("Geçersiz İşlem");
            
        }

        input.close();
    
    }
}
