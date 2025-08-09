import java.util.ArrayList;

public class VizitGiris {
    private ArrayList<Vizitler> vizitListesi;

    public VizitGiris() {
        vizitListesi = new ArrayList<>();
    }

    public void vizitEkle(int id, String aciklama, int durum, String hastaAdi) {
        Vizitler yeniVizit = new Vizitler(id, aciklama, durum, hastaAdi);
        vizitListesi.add(yeniVizit);
        System.out.println("Vizit eklendi: " + hastaAdi);
    }

    public void vizitSil(int id) {
        System.out.println("Vizit silindi. ID: " + id);
        }
    }

