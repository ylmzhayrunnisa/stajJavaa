import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] sayilar = new int[10];

        System.out.println("Lütfen 10 tane sayı giriniz:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayı: ");
            sayilar[i] = k.nextInt();
        }

        for(int i=0;i<sayilar.length-1;i++){
            for(int j=0;j<sayilar.length-1-i;j++){
                if(sayilar[j]>sayilar[j+1]){
                    int temp=sayilar[j];
                    sayilar[j]=sayilar[j+1];
                    sayilar[j+1]=temp;
                }

            }
        }


        System.out.println("\n Sıralanmış sayılar:");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }

        k.close();

       //klavyeden rastgele 10 sayı istesin bu sayıları sıralayıp ekrana bastırsın
    }
}
