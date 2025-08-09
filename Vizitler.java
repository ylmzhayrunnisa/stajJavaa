public class Vizitler {
        int vizitId;
        String vizitAciklama;
        int vizitDurumu;
        String hastaAdi;

        public Vizitler(int vizitId,String vizitAciklama, int vizitDurumu, String hastaAdi) {
            this.vizitId = vizitId;
            this.vizitAciklama = vizitAciklama;
            this.vizitDurumu = vizitDurumu;
            this.hastaAdi = hastaAdi;
        }

        public int getVizitId() {return vizitId;}
        public int getVizitDurumu() {if(vizitDurumu!=0){return vizitDurumu;}return 0;}
        public String getHastaAdi() {return hastaAdi;}
        public String getVizitAciklama() {return vizitAciklama;}

        public void setVizitId(int vizitId) {this.vizitId = vizitId;}
        public void setVizitAciklama(String vizitAciklama) {this.vizitAciklama = vizitAciklama;}
        public void setVizitDurumu(int vizitDurumu) {this.vizitDurumu = vizitDurumu;}
        public void setHastaAdi(String hastaAdi) {this.hastaAdi = hastaAdi;}

}
