import java.io.*;

public class DosyaIslemleri {
    public static void main(String[] args) {
        String dosyaYolu = "hasta_kayitlari.txt";

        // Dosyaya hasta verisi yazma
        try (FileWriter yazici = new FileWriter(dosyaYolu)) {
            yazici.write("12345678901, Ayşe Yılmaz\n");
            yazici.write("10987654321, Mehmet Kaya\n");
            System.out.println("Hasta verileri dosyaya yazıldı.");
        } catch (IOException e) {
            System.err.println("Dosya yazılırken hata oluştu: " + e.getMessage());
        }

        // Dosyadan veriyi satır satır okuma
        try (BufferedReader okuyucu = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            System.out.println("\nDosyadan okunan veriler:");
            while ((satir = okuyucu.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            System.err.println("Dosya okunurken hata oluştu: " + e.getMessage());
        }
    }
}
