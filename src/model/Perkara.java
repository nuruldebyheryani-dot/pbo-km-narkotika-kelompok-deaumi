package model;

public abstract class Perkara implements DokumenHukum {

    protected String nomorPerkara;
    protected String pengadilan;
    protected String tanggalPutusan;

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

    @Override
    public abstract void tampilkanRingkasan();
}
