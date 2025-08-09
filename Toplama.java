import java.util.Scanner;

public class Toplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("1.sayıyı girin: ");
        int sayi1 = input.nextInt();  //nextline string ifadeler için nextInt int ifadeler için

        System.out.print("2.sayıyı girin: ");
        int sayi2=input.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("Toplam: "+toplam);
        input.close();
    }
}
