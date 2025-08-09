// Alt sınıf - Doktor
public class Doktor extends Kullanici {
    private String uzmanlik;

    public Doktor(String ad, String soyad, String tcNo, String uzmanlik) {
        super(ad, soyad, tcNo);
        this.uzmanlik = uzmanlik;
    }

    @Override
    public void girisYap() {
        System.out.println("Doktor paneline giriş yapıldı.");
    }

    public String getUzmanlik() { return uzmanlik; }
    public void setUzmanlik(String uzmanlik) { this.uzmanlik = uzmanlik; }
}
