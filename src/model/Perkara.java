package model;

public abstract class Perkara implements DokumenHukum {

    protected String nomorPerkara;
    protected String pengadilan;
    protected String tanggalPutusan;
    protected String NomorPerkara;

    public Perkara() {}

    public Perkara(String nomorPerkara, String pengadilan, String tanggalPutusan) {
        this.nomorPerkara = nomorPerkara;
        this.pengadilan = pengadilan;
        this.tanggalPutusan = tanggalPutusan;
    }

    public String getNomorPerkara() {
        return nomorPerkara;
    }

    public  String getPengadilan() {
        return pengadilan;
    }

    public String getTanggalPutusan() {
        return tanggalPutusan;
    }

    public void setNomorPerkara(String nomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }

    public void setPengadilan(String pengadilan) {
        this.pengadilan = pengadilan;
    }

    public void setTanggalPutusan(String tanggalPutusan) {
        this.tanggalPutusan = tanggalPutusan;
    }

    @Override
    public abstract void tampilkanRingkasan();
}
