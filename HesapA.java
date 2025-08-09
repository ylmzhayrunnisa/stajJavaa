import java.util.ArrayList;
import java.util.Scanner;

public class HesapA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<ArrayHesap> hesaplar=new ArrayList<>();

        
        while(true){
            System.out.println("\n  BANKA MENÜ  ");
            System.out.println("1. Hesap Oluştur");
            System.out.println("2. Giriş Yap");
            System.out.println("3. Çıkış Yap");

            System.out.print("Seçiminiz: ");
            int secim=scanner.nextInt();
            scanner.nextLine();
            
            //bu kısım sadece oluşturma kontrol burada değil 
            if(secim==1){
                System.out.print("Kullanıcı Adı: ");
                String kullaniciAdi=scanner.nextLine();

                System.out.print("Şifre: ");
                String sifre=scanner.nextLine();

                System.out.print("Bakiye: ");
                double bakiye=scanner.nextDouble();
                scanner.nextLine();

                ArrayHesap yeniHesap= new ArrayHesap(kullaniciAdi, sifre, bakiye);
                hesaplar.add(yeniHesap);
                System.out.println("Hesap başarıyla oluşturuldu...");
            }

            else if(secim==2){
                System.out.print("Kullanıcı adı: ");
                String kullaniciAdi=scanner.nextLine();

                System.out.print("Şifre: ");
                String sifre=scanner.nextLine();

                ArrayHesap girilenHesap=null;
                for(ArrayHesap h : hesaplar){
                    if(h.getKullaniciAdi().equals(kullaniciAdi)&& h.girisYap(sifre)){
                        girilenHesap=h;
                        break;
                    }
                }

                if(girilenHesap!=null){
                    System.out.println("Giriş başarılı!");
                    kullaniciMenusu(scanner, girilenHesap);
                }
                else{
                    System.out.println("Giriş başarısız");
                }
            }
            else if(secim==3){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else{
                System.out.println("Geçersiz seçim");
            }

        }
        scanner.close();
    }

    public static void kullaniciMenusu(Scanner scanner,ArrayHesap hesap){
        while(true){
            System.out.println("\n Kullanıcı Menü");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            if(secim==1){
                hesap.bilgileriYaz();

            }
            else if(secim==2){
                System.out.print("Yatırılacak miktar: ");
                double miktar=scanner.nextDouble();
                hesap.paraYatir(miktar);
                System.out.println("Para yatırıldı!");
            }
            else if(secim==3){
                System.out.print("Çekilecek miktar: ");
                double miktar=scanner.nextDouble();
                hesap.paraCek(miktar);
                System.out.println("Para çekildi!");
            }
            else if(secim==4){
                System.out.println("Çıkış yapılıyor...");
                break;   //burada system.exit(0) kullandığımda komple çıktı ama önce kullanıcıdan çıkıp banka menüsüne geçmesini istiyorum break bunu sağladı
            }
            else{
                System.out.println("Geçersiz seçim!!");
            }

        }

    }
    
}
