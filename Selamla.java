import java.util.Scanner;

public class Selamla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object created

        System.out.print("Adınızı giriniz:");
        String ad = input.nextLine(); // kullanıcıdan satır girişi al

        System.out.println("Merhaba " + ad + "! Java'ya hoş geldin.");
        input.close();
    }
}
