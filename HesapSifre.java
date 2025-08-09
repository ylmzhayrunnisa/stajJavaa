import java.util.Scanner;

public class HesapSifre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Sifrelihesap hesap1=new Sifrelihesap("hayru", "1234", 500);

        System.out.println("Kullanıcı adınızı giriniz: ");
        String girilenkullaniciAdi=input.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        String girilenSifre=input.nextLine();

        if(girilenkullaniciAdi.equals(hesap1.getKullaniciAdi())&&hesap1.sifreKontrol(girilenSifre)){
            System.out.println("Giriş başarılı");

            while(true){
                System.out.println("\n 1.Para Yatır \n 2.Para Çek \n 3.Bakiye Görüntüle \n 4.Çıkış");
                System.out.println("Seçim yapınız: ");
                int secim=input.nextInt();

                switch(secim){
                    case 1: 
                       System.out.println("Yatırılacak Tutar: ");
                       double yatTutar=input.nextDouble();
                       hesap1.paraYatir(yatTutar);
                       break;
                    case 2:
                       System.out.println("Çekilecek Tutar: ");
                       double cekTutar=input.nextDouble();
                       hesap1.paraCek(cekTutar);
                       break;
                    case 3:
                       System.out.println("Bakiyeniz: ");
                       hesap1.hesapBilgileriniYaz();
                       break;
                    case 4:
                       System.out.println("Çıkış yapılıyor...");
                       System.exit(0);
                    default:
                       System.out.println("Geçersiz işlem yapmaya çalıştınız!!");
                }
            }
        } else{
            System.out.println("Kullanıcı adı veya şifreniz yanlıştır");
        }
       
        input.close();
    }

}

