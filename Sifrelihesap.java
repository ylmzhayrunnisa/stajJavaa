public class Sifrelihesap {
    private String kullaniciAdi;
    private String sifre;
    private double bakiye;

    public Sifrelihesap(String kullaniciAdi,String sifre,double bakiye){
        this.kullaniciAdi=kullaniciAdi;
        this.sifre=sifre;
        this.bakiye=bakiye;
    }

    public String getKullaniciAdi(){
        return kullaniciAdi;
    }

    public boolean sifreKontrol(String girilenSifre){
        return this.sifre.equals(girilenSifre);

    }

    public double getBakiye(){
        return bakiye;
    }

    public void paraCek(double cekTutar){
        if(bakiye<0){
            System.out.println("Geçerli bir miktar giriniz!");
        }
        else if(bakiye<cekTutar){
            System.out.println("Hesabınızda yeterli miktar yoktur!");
        }
        else{
            bakiye-=cekTutar;
        }
    }

    public void paraYatir(double yatTutar){
       if(yatTutar>0){
        bakiye+=yatTutar;
       }
       else{
        System.out.println("Geçersiz miktar girdiniz!");
       }
    }

    public void hesapBilgileriniYaz(){
        System.out.println("Bakiye: "+bakiye);
    }

    
}
