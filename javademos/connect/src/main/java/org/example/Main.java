package javademos.connect.src.main.java.org.example;

import java.sql.*;
import java.time.LocalDate;
import java.time.Period;


public class Main {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@10.6.100.130:1521/yy";
        String user = "akgun";
        String password = "y478";

        try {

            // Bağlantı oluştur
            Connection connection = DriverManager.getConnection(url, user, password);

            // Sorgu çalıştır
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT k.kisi_id as kisi,k.dogumtarih as dogumtarih,v.vizit_tarihi as vtarih, k.ad as ad FROM akgun.kisiler k,akguns.hastalar h,akguns.vizit v where h.kisi_id=k.kisi_id and h.hasta_id=v.hasta_id and k.kisi_id=707870");


            // Sonuçları konsola yazdır
            while (resultSet.next()) {
                // Örnek: id ve isim sütunlarını al
                int id = resultSet.getInt("kisi");
                java.sql.Date sqlDogum = resultSet.getDate("dogumtarih");
                java.sql.Date sqlVizit = resultSet.getDate("vtarih");
                String isim = resultSet.getString("ad");

                System.out.println("ID: " + id + ", İsim: " + isim);
                if (sqlDogum != null && sqlVizit != null) {
                    LocalDate dogumTarihi = sqlDogum.toLocalDate();
                    LocalDate vizitTarihi = sqlVizit.toLocalDate();
                    LocalDate bugun = LocalDate.now();

                    int yasVizitte = Period.between(dogumTarihi, vizitTarihi).getYears();
                    int yasDogum= Period.between(dogumTarihi, bugun).getYears();

                    System.out.println("Doğum Tarihi: " + dogumTarihi);
                    System.out.println("Vizit Tarihi: " + vizitTarihi);
                    System.out.println("Vizit Anındaki Yaş: " + yasVizitte);
                    System.out.println("Yaş: " + yasDogum);

                } else {
                    System.out.println("Doğum tarihi veya vizit tarihi eksik.");
                }
            }
            // Kaynakları kapat
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}