public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHP(){
        return jenis_hp;
    }
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("ios", 2021);
        hp.getJenisHP();
        hp.getTahunPembuatan();
    }

    public String getJenis_hp() {
        return jenis_hp;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    
}
 
    
