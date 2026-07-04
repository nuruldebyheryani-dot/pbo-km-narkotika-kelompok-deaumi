package model;

import java.util.ArrayList;

public class KnowledgeRepository {
    private final ArrayList<Putusan> daftarPutusan;

    public KnowledgeRepository() {
        this.daftarPutusan = new ArrayList<>();

        isiDataSampelOtomoatis();
    }

    public void simpan(Putusan p) {
        daftarPutusan.add(p);
    }

    public Putusan cariByNomor(String nomor) {
        for (Putusan p : daftarPutusan) {
            if (p.getNomorPerkara().equalsIgnoreCase(nomor)) {
                return p;
            }
        }
        return null;
    }

    public boolean hapus(String nomor) {
        Putusan p = cariByNomor(nomor);
        if (p != null) {
            daftarPutusan.remove(p);
            return true;
        }
        return false;
    }

    public ArrayList<Putusan> cariByNamaTerdakwa(String nama) {
        ArrayList<Putusan> hasil = new ArrayList<>();
        for (Putusan p : daftarPutusan) {
            if (p.getNamaTerdakwa().toLowerCase().contains(nama.toLowerCase())) {
                hasil.add(p);
            }
        }
        return hasil;
    }

    public ArrayList<Putusan> getDaftarSemua() {
        return daftarPutusan;
    }

    public double hitungTotalDendaSemuaPutusan() {
        double totalDenda = 0;
        for(Putusan p : daftarPutusan) {
            totalDenda += p.getVonisDenda();
        }
        return totalDenda;
    }

    private void isiDataSampelOtomoatis() {
        String[] jenisNarkotika = {"Sabu-sabu", "Ganja", "Ekstasi", "Heroin"};
        String[] peran = {"Kurir", "Bandar", "Pengguna","Penyimpan"};
        String[] hakim = {"Hakim Budi S.H", "Hakim Siti S.H", "Hakim Ahmad S.H", "Hakim Sri S.H"};
        String[] pasal = {"Pasal 111 UU RI No 35/2009", "Pasal 112 UU RI No 35/2009", "Pasal 114 UU RI No 35/2009"};

        for (int i = 1; i <= 52; i++) {
            String noPerkara = i + 100 + "/pid.Sus/2025/PN Sby";
            String namaTerdakwa = "Terdakwa Kasus" + i;
            int umur = 20 + (i % 30);
            String narkotika = jenisNarkotika[i % jenisNarkotika.length];
            double berat = 0.5 + (i * 0.3);
            String pasalPelanggaran = pasal[i % pasal.length];
            String peranterdakwa = peran[i % peran.length];
            int vonisBulan = 12 + (i * 2);
            double denda = 800000000.0 + (i * 10000000);
            String namaHakimKetua = hakim[i % hakim.length];

            this.daftarPutusan.add(new Putusan(
                    noPerkara, "Pengadilan Negeri Surabaya", "2025-05-12", namaTerdakwa, umur, narkotika, berat, pasalPelanggaran, peranterdakwa, vonisBulan, denda,namaHakimKetua
            ));
        }
    }
}
