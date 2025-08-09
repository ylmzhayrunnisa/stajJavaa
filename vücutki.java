import java.util.Scanner;

public class vücutki {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Kilonuzu giriniz: ");
        float kilo= input.nextFloat();

        System.out.println("Boyunuzu giriniz: ");
        float boy=input.nextFloat();

        float vki=(kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiniz: ");

        if(vki<18.5){
            System.out.println("Zayıf");
        }
        else if(vki<25){
            System.out.println("Normal");
        }
        else{
            System.out.println("Obez");
        }

        input.close();
    }
}
