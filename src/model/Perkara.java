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

    @Override
    public abstract void tampilkanRingkasan();
}
