import java.util.Scanner;
public class BankaHesap {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

       Hesap hesap1= new Hesap("Hayrunnisa", 500);
       Hesap hesap2= new Hesap("Abdüs", 700);
       Hesap aktifHesap=null;

       System.out.println("Banka Simülasyonuna Hoşgeldiniz!!!");

       while(true){

        System.out.println("\n 1.Hesap Seç \n 2.Para Yatır \n 3.Para Çek \n 4.Bakiye Görüntüle \n 5.Çıkış Yap");
        System.out.println("Seçiminiz: ");
        int secim=input.nextInt();
      

       switch (secim) {
            case 1:
                 System.out.println("1.Hayrunnisa'nın hesabı");
                 System.out.println("2.Başkasının hesabı");
                 System.out.print("Seç: ");
                 int hesapSecimi=input.nextInt();

                 if(hesapSecimi==1){
                    aktifHesap=hesap1;
                 }
                 else if(hesapSecimi==2){
                    aktifHesap=hesap2;
                 }
                 else{
                    System.out.println("Geçersiz hesap seçimi!!");
                 }
                 break;
            case 2:
                 if(aktifHesap!=null){
                    System.out.println("Yatırılacak Tutar: ");
                    double yattutar=input.nextDouble();
                    aktifHesap.setYatır(yattutar);
                 }
                 else{
                    System.out.println("Önce bir hesap seçiniz!");
                 }
                 break;
            case 3:
                 if(aktifHesap!=null){
                    System.out.println("Çekilecek Tutar: ");
                    double cektutar=input.nextDouble();
                    aktifHesap.setCek(cektutar);
                 }
                 else{
                    System.out.println("Önce bir hesap seçiniz!");
                 }
                 break;
            case 4:
                 if(aktifHesap!=null){
                    System.out.println("Bakiyeniz: ");
                    aktifHesap.hesapBilgileriYaz();
                 }
                 else{
                    System.out.println("Önce bir hesap seçiniz!");
                 }
                 break;

            case 5:
                 System.out.println("Çıkılıyor...");
                 input.close();
                 return;
            
            default:
                 System.out.println("Geçersiz seçim");
                           
       }
 }
    }
}
