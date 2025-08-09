import java.util.Scanner;

public class DortIslem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı: ");
        double a = input.nextDouble(); // tam sonuç vermesi için

        System.out.print("2.sayı: ");
        double b=input.nextDouble();

        System.out.println("Toplam: "+ (a+b));
        System.out.println("Çıkarma: "+(a-b));
        System.out.println("Çarpma: "+(a*b));
        if(b!=0){
        System.out.println("Bölme: "+(a/b));
        }
        else{
            System.out.println("Sıfıra bölme hatası");
        }
        input.close();

    }
}