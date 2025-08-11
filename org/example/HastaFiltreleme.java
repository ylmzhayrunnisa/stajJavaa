package org.example;

import java.util.ArrayList;
import java.util.List;

class Hastalar {
    String ad;
    int yas;
    String cinsiyet; // "Erkek" veya "Kadın"

    public Hastalar(String ad, int yas, String cinsiyet) {
        this.ad = ad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
    }
}

public class HastaFiltreleme {

    public static void main(String[] args) {
        // Örnek hasta listesi (SQL'den gelmiş gibi varsayıyoruz)
        List<Hastalar> hastalar = new ArrayList<>();
        hastalar.add(new Hastalar("Ali", 25, "Erkek"));
        hastalar.add(new Hastalar("Ayşe", 34, "Kadın"));
        hastalar.add(new Hastalar("Mehmet", 42, "Erkek"));
        hastalar.add(new Hastalar("Fatma", 29, "Kadın"));
        hastalar.add(new Hastalar("Ahmet", 65, "Erkek"));

        // Yaşa ve cinsiyete göre filtreleme
        System.out.println("---- Yetişkin Kadın Hastalar ----");
        for (Hastalar h : hastalar) {
            if (h.yas > 18 && h.cinsiyet.equalsIgnoreCase("Kadın")) {
                System.out.println(h.ad + " (" + h.yas + ")");
            }
        }

        // Switch-case ile cinsiyete göre raporlama
        System.out.println("\n---- Cinsiyete Göre Rapor ----");
        for (Hastalar h : hastalar) {
            switch (h.cinsiyet.toLowerCase()) {
                case "erkek":
                    System.out.println(h.ad + " erkek hastalar listesine eklendi.");
                    break;
                case "kadın":
                    System.out.println(h.ad + " kadın hastalar listesine eklendi.");
                    break;
                default:
                    System.out.println(h.ad + " için cinsiyet bilgisi eksik.");
            }
        }

        // Yaş aralıklarına göre gruplama (istatistik)
        int genc = 0, orta = 0, yasli = 0;
        for (Hastalar h : hastalar) {
            if (h.yas <= 30) {
                genc++;
            } else if (h.yas <= 50) {
                orta++;
            } else {
                yasli++;
            }
        }

        System.out.println("\n---- Yaş Grupları İstatistiği ----");
        System.out.println("Genç hasta sayısı (0-30): " + genc);
        System.out.println("Orta yaş hasta sayısı (31-50): " + orta);
        System.out.println("Yaşlı hasta sayısı (51+): " + yasli);
    }
}
