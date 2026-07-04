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

    private void isiDataSampelOtomoatis() {

        Putusan p1 = new Putusan();
        p1.setNomorPerkara("1/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Ricky Noviyanto Bin Sugeng Hariyono");
        p1.setUmurTerdakwa(35);
        p1.setBeratBarangBukti(1.03);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p1);

        Putusan p2 = new Putusan();
        p1.setNomorPerkara("3/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("I Putu Gede Dhani Gita Candra");
        p1.setUmurTerdakwa(25);
        p1.setBeratBarangBukti(2.38);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p2);

        Putusan p3 = new Putusan();
        p1.setNomorPerkara("7/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Muhammad Ricky Bagus Saputro");
        p1.setUmurTerdakwa(26);
        p1.setBeratBarangBukti(0.058);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p3);

        Putusan p4 = new Putusan();
        p1.setNomorPerkara("9/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Ghito Rolies Jems Tanawani Alias Boncu");
        p1.setUmurTerdakwa(33);
        p1.setBeratBarangBukti(35.3);
        p1.setJenisNarkotika("Ganja");
        p1.setPasalDilanggar("Pasal 111 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p4);

        Putusan p5 = new Putusan();
        p1.setNomorPerkara("10/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("M. Ilham Wahyudi Bin Ilyas");
        p1.setUmurTerdakwa(29);
        p1.setBeratBarangBukti(1.524);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p5);

        Putusan p6 = new Putusan();
        p1.setNomorPerkara("11/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Gatut Setyo Utomo Bin Suratno");
        p1.setUmurTerdakwa(23);
        p1.setBeratBarangBukti(5.054);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p6);

        Putusan p7 = new Putusan();
        p1.setNomorPerkara("13/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Mochamad Yahya Bin Hadi");
        p1.setUmurTerdakwa(33);
        p1.setBeratBarangBukti(0.108);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p7);

        Putusan p8 = new Putusan();
        p1.setNomorPerkara("15/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Bryan Dodik Prasetyo Alias Tole Bin Mulyadi");
        p1.setUmurTerdakwa(23);
        p1.setBeratBarangBukti(0.128);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p8);

        Putusan p9 = new Putusan();
        p1.setNomorPerkara("20/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Imam Afandi Bin Arkan (Alm)");
        p1.setUmurTerdakwa(32);
        p1.setBeratBarangBukti(2.153);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p9);

        Putusan p10 = new Putusan();
        p1.setNomorPerkara("21/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Wahyu Ade Pratama");
        p1.setUmurTerdakwa(20);
        p1.setBeratBarangBukti(0.103);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p10);

        Putusan p11 = new Putusan();
        p1.setNomorPerkara("23/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Arif Fadilah Alias Hulk Bin Tiam");
        p1.setUmurTerdakwa(30);
        p1.setBeratBarangBukti(4.475);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p11);

        Putusan p12 = new Putusan();
        p1.setNomorPerkara("25/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Moch Manjur Bin Rupi");
        p1.setUmurTerdakwa(28);
        p1.setBeratBarangBukti(18.250);
        p1.setJenisNarkotika("Pil Ekstasi & Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p12);

        Putusan p13 = new Putusan();
        p1.setNomorPerkara("27/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Moch Fahri Bin Jinab");
        p1.setUmurTerdakwa(52);
        p1.setBeratBarangBukti(2.10);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p13);

        Putusan p14 = new Putusan();
        p1.setNomorPerkara("28/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Kuswantoro, Choirul Uman, Saipul Bahri");
        p1.setUmurTerdakwa(26);
        p1.setBeratBarangBukti(103.62);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p14);

        Putusan p15 = new Putusan();
        p1.setNomorPerkara("29/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Akhmad Riyanto");
        p1.setUmurTerdakwa(43);
        p1.setBeratBarangBukti(302.5);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p15);

        Putusan p16 = new Putusan();
        p1.setNomorPerkara("30/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Abdul Bakir");
        p1.setUmurTerdakwa(49);
        p1.setBeratBarangBukti(20.88);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p16);

        Putusan p17 = new Putusan();
        p1.setNomorPerkara("31/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Muchamad Umar Faroq");
        p1.setUmurTerdakwa(34);
        p1.setBeratBarangBukti(302.5);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p17);

        Putusan p18 = new Putusan();
        p1.setNomorPerkara("32/pid.Sus/2024/PN Sby");
        p1.setNamaTerdakwa("Arfin Irfian");
        p1.setUmurTerdakwa(27);
        p1.setBeratBarangBukti(1.70);
        p1.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p1.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p18);

    }

    public Putusan cariByNomor(String NomorPerkara) {
        for (Putusan p : daftarPutusan) {
            if (p.getNomorPerkara().equalsIgnoreCase(NomorPerkara)) {
                return p;
            }
        }
        return null;
    }

    public boolean hapus(String NomorPerkara) {
        Putusan p = cariByNomor(NomorPerkara);
        if (p != null) {
            daftarPutusan.remove(p);
            return true;
        }
        return false;
    }

    public ArrayList<Putusan> cariByNamaTerdakwa(String daftarPutusan) {
        ArrayList<Putusan> hasil = new ArrayList<>();

        for (Putusan p : daftarPutusan) {
            if (p.getNamaTerdakwa().toLowerCase().contains(daftarPutusan.toLowerCase())) {
                hasil.add(p);
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