package model;

import java.util.ArrayList;

public class StatistikPutusan {
    private final int totalPutusan;
    private double rataRataVonis;
    private double rataRataDenda;

    public StatistikPutusan(ArrayList<Putusan> daftar) {
        this.totalPutusan = daftar.size();
        hitungOtomatis(daftar);
    }

    private void hitungOtomatis(ArrayList<Putusan> daftar) {
        if (daftar.isEmpty()) {
            this.rataRataVonis = 0;
            this.rataRataDenda = 0;
            return;
        }

        double totalVonis = 0;
        double totalDenda = 0;

        for (Putusan p : daftar) {
            totalVonis += p.getVonisHukuman();
            totalDenda += p.getVonisDenda();
        }

        this.rataRataVonis = totalVonis / totalPutusan;
        this.rataRataDenda = totalDenda / totalPutusan;
    }

    public int hitungKasusBerat(ArrayList<Putusan> daftar) {
        int count = 0;
        for (Putusan p : daftar) {
            if ("Berat / Maksimal".equals(p.getKategoriHukuman())) {
                count++;
            }
        }
        return count;
    }

    public void tampilkanLaporan(){
        System.out.println("\n==================================================");
        System.out.println("    LAPORAN STATISTIK KNOWLEDGE MANAGEMENT   ");
        System.out.println("==============================================");
        System.out.println("Total Putusan Terdata : " + totalPutusan + "Perkara");
        System.out.printf("Rata-rata Vonis : %.1f bulan\n", rataRataVonis);
        System.out.printf("Rata-rata Denda : Rp %,.2f\n", rataRataDenda);
        System.out.println("==============================================");
    }
}
