package Praktikum.Jobsheet16.Tugas;

public class MataKuliah {
    String kode;
    String matkul;
    String sks;
    
    public MataKuliah(){
        
    }
    public MataKuliah(String kode, String matkul, String sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
    public String getKode() {
        return kode;
    }

    public String getMataKul() {
        return matkul;
    }

    public String getSks() {
        return sks;
    }
}