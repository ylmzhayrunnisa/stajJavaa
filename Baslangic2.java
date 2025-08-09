import java.util.Scanner;

public class Baslangic2 {
    public static void main(String[] args) {
        class2 hayvan = new class2();
        String hayvanSesi = hayvan.ses(); // sadece 1 kere sorar

        class3 b=new class3();
        b.sesYazdir3Kere(hayvanSesi);
    }
}