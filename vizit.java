public class vizit {
    public static void main(String[] args) {
        VizitGiris giris = new VizitGiris();
        Vizitler vizit=new Vizitler(2, "Kan testi", 0, "Ayşe Demir");

        giris.vizitEkle(1, "Ateş ölçümü", 1, "Ali Yılmaz");
        giris.vizitEkle(2, "Kan testi", 0, "Ayşe Demir");
        System.out.println("Hastanın adı"+ vizit.getHastaAdi());

        giris.vizitSil(1);
    }
}
