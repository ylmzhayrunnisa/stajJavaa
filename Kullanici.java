// base class
public class Kullanici {
    private String ad;
    private String soyad;
    private String tcNo;

    public Kullanici(String ad, String soyad, String tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
    }

    public void girisYap() {
        System.out.println("Kullanıcı giriş yaptı.");
    }

    // Getter ve Setter metotları
    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }

    public String getSoyad() { return soyad; }
    public void setSoyad(String soyad) { this.soyad = soyad; }

    public String getTcNo() { return tcNo; }
    public void setTcNo(String tcNo) { this.tcNo = tcNo; }
}
