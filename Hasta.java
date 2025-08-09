// Alt sınıf - Hasta
public class Hasta extends Kullanici {
    private String sigortaNo;

    public Hasta(String ad, String soyad, String tcNo, String sigortaNo) {
        super(ad, soyad, tcNo);
        this.sigortaNo = sigortaNo;
    }

    @Override
    public void girisYap() {
        System.out.println("Hasta paneline giriş yapıldı.");
    }

    public String getSigortaNo() { return sigortaNo; }
    public void setSigortaNo(String sigortaNo) { this.sigortaNo = sigortaNo; }
}
