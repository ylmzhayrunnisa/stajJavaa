public class ArrayHesap {
    private String kullaniciAdi;
    private String sifre;
    private double bakiye;

        public ArrayHesap(String kullaniciAdi,String sifre,double bakiye){
            this.kullaniciAdi=kullaniciAdi;
            this.sifre=sifre;
            this.bakiye=bakiye;
        }

        public String getKullaniciAdi(){
            return kullaniciAdi;
        }

        public boolean girisYap(String sifre){
            return this.sifre.equals(sifre);
        }

        public double getBakiye(){
            return bakiye;
        }

        public void paraYatir(double miktar){
            bakiye+=miktar;
        }

        public void paraCek(double miktar){
            if(miktar<=bakiye){
                bakiye-=miktar;
            }
            else{
                System.out.println("Yeterli bakiyeniz bulunmamaktadır");
            }
        }

        public void bilgileriYaz(){
            System.out.println("Kullanıcı adınız: "+ kullaniciAdi + " Şifreniz: "+ sifre + " Bakiyeniz: "+bakiye);
        }
    
}
