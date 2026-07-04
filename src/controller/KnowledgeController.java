package controller;

import model.*;
import view.ConsoleView;

import java.util.ArrayList;

public class KnowledgeController {

    private KnowledgeRepository repository;
    private ConsoleView view;

    public KnowledgeController() {
        repository = new KnowledgeRepository();
        view = new ConsoleView();
    }

    public void jalankan() {

        boolean jalan = true;

        while (jalan) {

            int pilihan = view.tampilkanMenu();

            switch (pilihan) {

                case 1:
                    tambahPutusan();
                    break;

                case 2:
                    tampilkanSemua();
                    break;

                case 3:
                    cariNomor();
                    break;

                case 4:
                    cariNama();
                    break;

                case 5:
                    tampilakanStatistik();
                    break;

                case 6:
                    hapusPutusan();
                    break;

                case 0:
                    jalan = !view.konfirmasiKeluar();

            }
        }
    }

    private void tambahPutusan() {

        try {

            String[] data = view.inputDataPutusan();

            Putusan putusan = new Putusan(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    Integer.parseInt(data[4]),
                    data[5],
                    Double.parseDouble(data[6]),
                    data[7],
                    data[8],
                    Integer.parseInt(data[9]),
                    Double.parseDouble(data[10]),
                    data[11]
            );

            repository.simpan(putusan);

            view.tampilkanPesan("Data berhasil disimpan!");

        } catch (Exception e) {
            view.tampilkanPesan("Input tidak valid");
        }
    }

    private void tampilkanSemua() {

        ArrayList<Putusan> daftar = repository.getDaftarSemua();

        if (daftar.isEmpty()) {

            view.tampilkanPesan("Belum ada data.");
            return;
        }

        view.tampilkanDaftar();

        int no = 1;

        for (Putusan p : daftar) {

            view.tampilkanBaris(
                    no++,
                    p.getNomorPerkara(),
                    p.getNamaTerdakwa(),
                    p.getJenisNarkotika(),
                    p.getVonisHukuman(),
                    p.getKategoriHukuman()
            );
        }

        view.tampilkanFooterDaftar(daftar.size());
    }

    private void cariNomor() {
        String nomor = view.inputNomorPerkara();

        Putusan p = repository.cariByNomor(nomor);

        if (p == null) {
            view.tampilkanPesan("Data tidak ditemukan.");
            return;
        }

        tampilkanDetail(p);
    }

    private void cariNama() {

        String nama = view.inputNamaTerdakwa();

        ArrayList<Putusan> hasil =
                repository.cariByNamaTerdakwa(nama);
        if (hasil.isEmpty()) {

            view.tampilkanPesan("Data tidak ditemukan.");
            return;
        }
        for (Putusan p : hasil) {
            tampilkanDetail(p);
        }

    }

    private void hapusPutusan() {

        String nomor = view.inputNomorHapus();

        if (repository.hapus(nomor)) {
            view.tampilkanPesan("Data berhasil dihapus.");
        } else {
            view.tampilkanPesan("Data tidak ditemukan.");
        }
    }

    private void tampilakanStatistik() {

        ArrayList<Putusan> daftar =
                repository.getDaftarSemua();

        if (daftar.isEmpty()) {
            view.tampilkanPesan("Belum ada data.");
            return;

        }

        double totalVonis = 0;
        double totalDenda = 0;

        for (Putusan p : daftar) {

            totalVonis += p.getVonisHukuman();
            totalDenda += p.getVonisDenda();
        }

        double rataVonis =
                totalVonis / daftar.size();
        double rataDenda =
                totalDenda / daftar.size();
        view.tampilkanStatistik(
                daftar.size(),
                rataVonis,
                rataDenda
        );
    }

    private void tampilkanDetail(Putusan p) {

        view.tampilkanDetail(
                p.getNomorPerkara(),
                p.getPengadilan(),
                p.getTanggalPutusan(),
                p.getNamaTerdakwa(),
                p.getUmurTerdakwa(),
                p.getJenisNarkotika(),
                p.getBeratBarangBukti(),
                p.getPasalDilanggar(),
                p.getPeranTerdakwa(),
                p.getVonisHukuman(),
                p.getVonisDenda(),
                p.getNamaHakim(),
                p.getKategoriHukuman()
        );
    }
}
