import java.util.*;

public class HastaneSistemi {

    public static void main(String[] args) {
        // TC Kimlik No ile Hasta Bilgisi Erişimi - HashMap
        HashMap<String, String> hastaBilgileri = new HashMap<>();
        hastaBilgileri.put("12345678901", "Ayşe Yılmaz");
        hastaBilgileri.put("10987654321", "Mehmet Kaya");

        // Aynı hastanın tekrar kayıt olmasını engelleme - HashSet
        HashSet<String> kayitliHastalar = new HashSet<>();
        kayitliHastalar.add("12345678901");

        String yeniHasta = "12345678901";
        if (kayitliHastalar.contains(yeniHasta)) {
            System.out.println("Bu hasta zaten kayıtlı.");
        } else {
            kayitliHastalar.add(yeniHasta);
            System.out.println("Yeni hasta kaydı yapıldı.");
        }

        // Randevu kuyruğu yönetimi - Queue
        Queue<String> randevuSirasi = new LinkedList<>();
        randevuSirasi.add("12345678901");
        randevuSirasi.add("10987654321");

        System.out.println("\nRandevu sırası:");
        while (!randevuSirasi.isEmpty()) {
            String tc = randevuSirasi.poll();
            System.out.println("Çağırılan hasta: " + hastaBilgileri.get(tc));
        }
    }
}
