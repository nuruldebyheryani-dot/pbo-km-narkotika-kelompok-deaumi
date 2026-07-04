package model;

public class Putusan extends Perkara {

    private String namaTerdakwa;
    private int umurTerdakwa;
    private String jenisNarkotika;
    private double beratBarangBukti;
    private String pasalDilanggar;
    private String peranTerdakwa;
    private int vonisHukuman;
    private double vonisDenda;
    private String namaHakim;

    private static int jumlahDibuat = 0;

    public Putusan() {
        super();
        jumlahDibuat++;
    }

    public Putusan(String nomorPerkara, String pengadilan, String tanggalPutusan, String namaTerdakwa, int umurTerdakwa, String jenisNarkotika, double beratBarangBukti, String pasalDilanggar, String peranTerdakwa, int vonisHukuman, double vonisDenda, String namaHakim) {
        super(nomorPerkara, pengadilan, tanggalPutusan);
        this.namaTerdakwa = namaTerdakwa;
        this.umurTerdakwa = umurTerdakwa;
        this.jenisNarkotika = jenisNarkotika;
        this.beratBarangBukti = beratBarangBukti;
        this.pasalDilanggar = pasalDilanggar;
        this.peranTerdakwa = peranTerdakwa;
        this.vonisHukuman = vonisHukuman;
        this.vonisDenda = vonisDenda;
        this.namaHakim = namaHakim;
        jumlahDibuat++;
    }

    public boolean apakahDiBawahUmur() {
        return this.umurTerdakwa<18;
    }

    public static int getJumlahDibuat() {
        return jumlahDibuat;
    }

    @Override
    public void tampilkanRingkasan() {
        System.out.println(nomorPerkara + " | Terdakwa: " + namaTerdakwa + " | vonis: " + vonisHukuman + " bulan");
    }

    @Override
    public String getKategoriHukuman() {
        if (vonisHukuman < 48) {
            return "Ringan";
        } else if (vonisHukuman <= 120) {
            return"Sedang";
        } else {
        return "Berat / Maksimal";
    }
}

public void tampilkan() {
    tampilkanRingkasan();
    }

    public void tampilkan(boolean detail) {
        if (detail) {
            System.out.println("\n================= DETAIL PUTUSAN ============");
            System.out.println("Nomor Perkara : " + nomorPerkara);
            System.out.println("Lembaga Peradilan : " + pengadilan);
            System.out.println("tanggal Putusan : " + tanggalPutusan);
            System.out.println("Nama terdakwa : " + namaTerdakwa + " (" + umurTerdakwa + "tahun)" + (apakahDiBawahUmur() ? " [Anak di bawah umur] " : ""));
            System.out.println("Kategori Kasus : " + getKategoriHukuman());
            System.out.println(" Narkotika & Sifat : " + jenisNarkotika + " (" + beratBarangBukti + " gram) -> " + peranTerdakwa);
            System.out.println("Pasal Pelanggaran : " + pasalDilanggar);
            System.out.println("Vonis & Denda : " + vonisHukuman + " Bulan Penjara & Subsider Rp " + vonisDenda);
            System.out.println("Hakim Ketua: " + namaHakim);
            System.out.println("==================================================");
        } else {
            tampilkan();
        }
    }


    @Override
    public String toString() {
        return "Putusan{" + "nomorPerkara='" + nomorPerkara + '\'' + ", namaTerdakwa='" + namaTerdakwa + '\'' + '}';
    }

    public String getNamaTerdakwa() {
        return namaTerdakwa;
    }

    public void setNamaTerdakwa(String namaTerdakwa) {
        this.namaTerdakwa = namaTerdakwa;
    }

    public int getUmurTerdakwa() {
        return umurTerdakwa;
    }

    public void setUmurTerdakwa(int umurTerdakwa) {
        this.umurTerdakwa = umurTerdakwa;
    }

    public String getJenisNarkotika() {
        return jenisNarkotika;
    }

    public void setJenisNarkotika(String jenisNarkotika) {
        this.jenisNarkotika = jenisNarkotika;
    }

    public double getBeratBarangBukti() {
        return beratBarangBukti;
    }

    public void setBeratBarangBukti(double beratBarangBukti) {
        this.beratBarangBukti = beratBarangBukti;
    }

    public String getPasalDilanggar() {
        return pasalDilanggar;
    }

    public void setPasalDilanggar(String pasalDilanggar) {
        this.pasalDilanggar = pasalDilanggar;
    }

    public String getPeranTerdakwa() {
        return peranTerdakwa;
    }

    public void setPeranTerdakwa(String peranTerdakwa) {
        this.peranTerdakwa = peranTerdakwa;
    }

    public int getVonisHukuman() {
        return vonisHukuman;
    }

    public void setVonisHukuman(int vonisHukuman) {
        this.vonisHukuman = vonisHukuman;
    }

    public double getVonisDenda() {
        return vonisDenda;
    }

    public void setVonisDenda(double vonisDenda) {
        this.vonisDenda = vonisDenda;
    }

    public String getNamaHakim() {
        return namaHakim;
    }

    public void setNamaHakim(String namaHakim) {
        this.namaHakim = namaHakim;
    }

    public static void setJumlahDibuat(int jumlahDibuat) {
        Putusan.jumlahDibuat = jumlahDibuat;
    }

    public void setNomorPerkara(String NomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }
}












