public class Araba {
    String marka;
    int hiz;

    Araba(String marka,int hiz){
        this.marka=marka;
        this.hiz=hiz;
    }

    void BilgileriYaz(){
         System.out.println("Marka: "+marka);
         System.out.println("Hız: "+hiz);
    }
}
