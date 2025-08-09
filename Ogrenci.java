public class Ogrenci {
    private String isim;
    private int yas;
    

    public Ogrenci(String isim,int yas){
        this.isim=isim;
        this.yas=yas;
    }
   
    //gette geriye değer döndürüyordu hangi türde olduğunu yazdık ama sette döndürmüyor atıyor
    public String getIsim(){
        return isim;
    }

    public int getYas(){
        return yas;
    }

    public void setIsim(String yeniIsim){
        isim=yeniIsim;
    }

    public void setYas(int yeniYas){
        if(yeniYas>0){
            yas=yeniYas;
        }
        else{
            System.out.println("Yaş negatif olamaz!");
        }
    }

    void BilgileriniYaz(){
        System.out.println("Ad: "+isim);
        System.out.println("Yaş: "+yas);
    }

}
