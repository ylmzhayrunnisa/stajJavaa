public class Hesap {
    private double bakiye;
    private String isim;

    public Hesap(String isim,double bakiye){
        this.bakiye=bakiye;
        this.isim=isim;
    }
    
    public double getBakiye(){
        return bakiye;
    }
    public String getIsim(){
        return isim;
    }

    public void setCek(double cektutar){
        if(bakiye>=cektutar){
            bakiye-=cektutar;
        }
        else if(cektutar<0){
            System.out.println("Geçersiz tutar");
        }
        else{
            System.out.println("Hesapta yeterli miktar yoktur.");
        }
    }

    public void setYatır(double yattutar){
        bakiye+=yattutar;
    }

    void hesapBilgileriYaz(){
        System.out.println("Hesap Sahibi: "+ isim);
        System.out.println("Bakiye: "+ bakiye);
    }

}
