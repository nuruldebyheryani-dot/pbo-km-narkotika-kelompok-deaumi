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
        p2.setNomorPerkara("3/pid.Sus/2024/PN Sby");
        p2.setNamaTerdakwa("I Putu Gede Dhani Gita Candra");
        p2.setUmurTerdakwa(25);
        p2.setBeratBarangBukti(2.38);
        p2.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p2.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p2);

        Putusan p7 = new Putusan();
        p7.setNomorPerkara("7/pid.Sus/2024/PN Sby");
        p7.setNamaTerdakwa("Muhammad Ricky Bagus Saputro");
        p7.setUmurTerdakwa(26);
        p7.setBeratBarangBukti(0.058);
        p7.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p7.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p7);

        Putusan p9 = new Putusan();
        p9.setNomorPerkara("9/pid.Sus/2024/PN Sby");
        p9.setNamaTerdakwa("Ghito Rolies Jems Tanawani Alias Boncu");
        p9.setUmurTerdakwa(33);
        p9.setBeratBarangBukti(35.3);
        p9.setJenisNarkotika("Ganja");
        p9.setPasalDilanggar("Pasal 111 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p9);

        Putusan p10 = new Putusan();
        p10.setNomorPerkara("10/pid.Sus/2024/PN Sby");
        p10.setNamaTerdakwa("M. Ilham Wahyudi Bin Ilyas");
        p10.setUmurTerdakwa(29);
        p10.setBeratBarangBukti(1.524);
        p10.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p10.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p10);

        Putusan p11 = new Putusan();
        p11.setNomorPerkara("11/pid.Sus/2024/PN Sby");
        p11.setNamaTerdakwa("Gatut Setyo Utomo Bin Suratno");
        p11.setUmurTerdakwa(23);
        p11.setBeratBarangBukti(5.054);
        p11.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p11.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p11);

        Putusan p13 = new Putusan();
        p13.setNomorPerkara("13/pid.Sus/2024/PN Sby");
        p13.setNamaTerdakwa("Mochamad Yahya Bin Hadi");
        p13.setUmurTerdakwa(33);
        p13.setBeratBarangBukti(0.108);
        p13.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p13.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p13);

        Putusan p15 = new Putusan();
        p15.setNomorPerkara("15/pid.Sus/2024/PN Sby");
        p15.setNamaTerdakwa("Bryan Dodik Prasetyo Alias Tole Bin Mulyadi");
        p15.setUmurTerdakwa(23);
        p15.setBeratBarangBukti(0.128);
        p15.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p15.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p15);

        Putusan p20 = new Putusan();
        p20.setNomorPerkara("20/pid.Sus/2024/PN Sby");
        p20.setNamaTerdakwa("Imam Afandi Bin Arkan (Alm)");
        p20.setUmurTerdakwa(32);
        p20.setBeratBarangBukti(2.153);
        p20.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p20.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p20);

        Putusan p21 = new Putusan();
        p21.setNomorPerkara("21/pid.Sus/2024/PN Sby");
        p21.setNamaTerdakwa("Wahyu Ade Pratama");
        p21.setUmurTerdakwa(20);
        p21.setBeratBarangBukti(0.103);
        p21.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p21.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p21);

        Putusan p23 = new Putusan();
        p23.setNomorPerkara("23/pid.Sus/2024/PN Sby");
        p23.setNamaTerdakwa("Arif Fadilah Alias Hulk Bin Tiam");
        p23.setUmurTerdakwa(30);
        p23.setBeratBarangBukti(4.475);
        p23.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p23.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p23);

        Putusan p25 = new Putusan();
        p25.setNomorPerkara("25/pid.Sus/2024/PN Sby");
        p25.setNamaTerdakwa("Moch Manjur Bin Rupi");
        p25.setUmurTerdakwa(28);
        p25.setBeratBarangBukti(18.250);
        p25.setJenisNarkotika("Pil Ekstasi & Sabu (Metamfamina) Golongan I");
        p25.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p25);

        Putusan p27 = new Putusan();
        p27.setNomorPerkara("27/pid.Sus/2024/PN Sby");
        p27.setNamaTerdakwa("Moch Fahri Bin Jinab");
        p27.setUmurTerdakwa(52);
        p27.setBeratBarangBukti(2.10);
        p27.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p27.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p27);

        Putusan p28 = new Putusan();
        p28.setNomorPerkara("28/pid.Sus/2024/PN Sby");
        p28.setNamaTerdakwa("Kuswantoro, Choirul Uman, Saipul Bahri");
        p28.setUmurTerdakwa(26);
        p28.setBeratBarangBukti(103.62);
        p28.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p28.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p28);

        Putusan p29 = new Putusan();
        p29.setNomorPerkara("29/pid.Sus/2024/PN Sby");
        p29.setNamaTerdakwa("Akhmad Riyanto");
        p29.setUmurTerdakwa(43);
        p29.setBeratBarangBukti(302.5);
        p29.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p29.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p29);

        Putusan p30 = new Putusan();
        p30.setNomorPerkara("30/pid.Sus/2024/PN Sby");
        p30.setNamaTerdakwa("Abdul Bakir");
        p30.setUmurTerdakwa(49);
        p30.setBeratBarangBukti(20.88);
        p30.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p30.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p30);

        Putusan p31 = new Putusan();
        p31.setNomorPerkara("31/pid.Sus/2024/PN Sby");
        p31.setNamaTerdakwa("Muchamad Umar Faroq");
        p31.setUmurTerdakwa(34);
        p31.setBeratBarangBukti(302.5);
        p31.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p31.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p31);

        Putusan p32 = new Putusan();
        p32.setNomorPerkara("32/pid.Sus/2024/PN Sby");
        p32.setNamaTerdakwa("Arfin Irfian");
        p32.setUmurTerdakwa(27);
        p32.setBeratBarangBukti(1.70);
        p32.setJenisNarkotika("Sabu (Metamfamina) Golongan I");
        p32.setPasalDilanggar("Pasal 114 ayat (1) UU RI No. 35 Tahun 2009");
        simpan(p32);

        Putusan p34 = new Putusan();
        p34.setNomorPerkara("34/Pid.Sus/2024/PN.Sby");
        p34.setNamaTerdakwa("Abdul Gefur Bin Asmar");
        p34.setUmurTerdakwa(37);
        p34.setBeratBarangBukti(0.836);
        p34.setJenisNarkotika("Sabu-sabu");
        p34.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan (p34);

        Putusan p36 = new Putusan();
        p36.setNomorPerkara("36/Pid.Sus/2024/PN.Sby");
        p36.setNamaTerdakwa("Alias Tover Tukan Alias Itong Bin Nico Laos Tukan");
        p36.setUmurTerdakwa(33);
        p36.setBeratBarangBukti(1.63);
        p36.setJenisNarkotika("Sabu-sabu");
        p36.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p36);

        Putusan p39 = new Putusan();
        p39.setNomorPerkara("39/Pid.Sus/2024/PN.Sby");
        p39.setNamaTerdakwa("Moch. Riadi Bin Moch. Ridwan (Alm)");
        p39.setUmurTerdakwa(35);
        p39.setBeratBarangBukti(0.0); // Keterangan menyebutkan rincian berat di barang bukti utama
        p39.setJenisNarkotika("Sabu-sabu");
        p39.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p39);

        Putusan p45 = new Putusan();
        p45.setNomorPerkara("45/Pid.Sus/2024/PN.Sby");
        p45.setNamaTerdakwa("Yoga Hardono Bin Sudarno dan Hendrawan Bin Sanurin");
        p45.setUmurTerdakwa(46); // Menggunakan umur terdakwa utama
        p45.setBeratBarangBukti(1055.0);
        p45.setJenisNarkotika("Sabu-sabu");
        p45.setPasalDilanggar("Pasal 114 ayat (2) jo Pasal 132 ayat (1) UU No. 35 Tahun 2009");
        simpan(p45);

        Putusan p47 = new Putusan();
        p47.setNomorPerkara("47/Pid.Sus/2025/PN.Pmk");
        p47.setNamaTerdakwa("Abdul Haris Bin Miftahul Arifin");
        p47.setUmurTerdakwa(28);
        p47.setBeratBarangBukti(1.964); // Menggunakan berat netto
        p47.setJenisNarkotika("Sabu-sabu");
        p47.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan(p47);

        Putusan p49 = new Putusan();
        p49.setNomorPerkara("49/Pid.Sus/2024/PN.Sby");
        p49.setNamaTerdakwa("Abdur Rohman Bin Tahli");
        p49.setUmurTerdakwa(40);
        p49.setBeratBarangBukti(0.0); // Berat tidak spesifik dalam input
        p49.setJenisNarkotika("Sabu-sabu (methamphetamine)");
        p49.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p49);

        Putusan p50 = new Putusan();
        p50.setNomorPerkara("50/Pid.Sus/2024/PN.Sby");
        p50.setNamaTerdakwa("Guntur Pamungkas Alias Tupai Bin Wahyudi");
        p50.setUmurTerdakwa(27);
        p50.setBeratBarangBukti(2.089); // Menggunakan berat netto
        p50.setJenisNarkotika("Sabu-sabu");
        p50.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p50);

        Putusan p54 = new Putusan();
        p54.setNomorPerkara("54/Pid.Sus/2024/PN.Sby");
        p54.setNamaTerdakwa("Warda Andreansyah Bin Suwarso (Alm)");
        p54.setUmurTerdakwa(24);
        p54.setBeratBarangBukti(0.007); // Total dari 0.003 + 0.004
        p54.setJenisNarkotika("Sabu-sabu");
        p54.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan(p54);

        Putusan p55 = new Putusan();
        p55.setNomorPerkara("55/Pid.Sus/2024/PN.Sby");
        p55.setNamaTerdakwa("Ilham Reza Izzuddin Alias Reza Bin Eko Suhartono");
        p55.setUmurTerdakwa(25);
        p55.setBeratBarangBukti(12.72); // Total dari 7.54 + 5.18
        p55.setJenisNarkotika("Ganja");
        p55.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p55);

        Putusan p58 = new Putusan();
        p58.setNomorPerkara("58/Pid.Sus/2024/PN.Sby");
        p58.setNamaTerdakwa("Kasmanto Bin Slamet");
        p58.setUmurTerdakwa(38);
        p58.setBeratBarangBukti(0.043); // Menggunakan berat netto
        p58.setJenisNarkotika("Sabu-sabu");
        p58.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan(p58);

        Putusan p61 = new Putusan();
        p61.setNomorPerkara("61/Pid.Sus/2024/PN.Sby");
        p61.setNamaTerdakwa("Fausen Alias Kacong Bin Sonhaji");
        p61.setUmurTerdakwa(23);
        p61.setBeratBarangBukti(0.285); // Total 0.098 + 0.100 + 0.087
        p61.setJenisNarkotika("Sabu-sabu");
        p61.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan(p61);

        Putusan p62 = new Putusan();
        p62.setNomorPerkara("62/Pid.Sus/2024/PN.Sby");
        p62.setNamaTerdakwa("Muhammad Rohman Bin Lukdin");
        p62.setUmurTerdakwa(45);
        p62.setBeratBarangBukti(0.069);
        p62.setJenisNarkotika("Sabu-sabu");
        p62.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan(p62);

        Putusan p64 = new Putusan();
        p64.setNomorPerkara("64/Pid.Sus/2024/PN.Sby");
        p64.setNamaTerdakwa("M. Abdul Sakur dan Musaffa Bin Umar");
        p64.setUmurTerdakwa(26); // Menggunakan umur terdakwa utama
        p64.setBeratBarangBukti(1.57);
        p64.setJenisNarkotika("Ekstasi");
        p64.setPasalDilanggar("Pasal 114 ayat (1) jo Pasal 132 ayat (1) UU No. 35 Tahun 2009");
        simpan(p64);

        Putusan p66 = new Putusan();
        p66.setNomorPerkara("66/Pid.Sus/2024/PN.Sby");
        p66.setNamaTerdakwa("Herianto Alias Heri Bin Sukri (Alm)");
        p66.setUmurTerdakwa(40);
        p66.setBeratBarangBukti(3.14);
        p66.setJenisNarkotika("Sabu-sabu");
        p66.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p66);

        Putusan p67 = new Putusan();
        p67.setNomorPerkara("67/Pid.Sus/2024/PN.Sby");
        p67.setNamaTerdakwa("Lanang Firdaus Ingpranata Buana Bin Raden Monmowangsa");
        p67.setUmurTerdakwa(20);
        p67.setBeratBarangBukti(47.0); // Total dari 39.4 + 7.6
        p67.setJenisNarkotika("Sinte (Tembakau Gorila / Ganja Sintetis)");
        p67.setPasalDilanggar("Pasal 114 ayat (2) UU No. 35 Tahun 2009");
        simpan(p67);

        Putusan p79 = new Putusan();
        p79.setNomorPerkara("79/Pid.Sus/2024/PN.Sby");
        p79.setNamaTerdakwa("Moch. Nopel Bin Binakram (Alm)");
        p79.setUmurTerdakwa(45); // Estimasi berdasarkan tahun lahir 1981 (2026 - 1981)
        p79.setBeratBarangBukti(0.513);
        p79.setJenisNarkotika("Sabu-sabu (Shabu)");
        p79.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p79);

        Putusan p80 = new Putusan();
        p80.setNomorPerkara("80/Pid.Sus/2024/PN.Sby");
        p80.setNamaTerdakwa("Moch. Dahlan Bin Rasit (Alm)");
        p80.setUmurTerdakwa(48); // Estimasi: 2026 - 1978 = 48
        p80.setBeratBarangBukti(10.0);
        p80.setJenisNarkotika("Sabu-sabu");
        p80.setPasalDilanggar("Pasal 114 ayat (2) UU No. 35 Tahun 2009");
        simpan(p80);

        Putusan p84 = new Putusan();
        p84.setNomorPerkara("84/Pid.Sus/2024/PN.Sby");
        p84.setNamaTerdakwa("Husnul Yaqin Als Asmad Bin Zahrah");
        p84.setUmurTerdakwa(41);
        p84.setBeratBarangBukti(0.639); // Menggunakan berat netto
        p84.setJenisNarkotika("Sabu-sabu");
        p84.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p84);

        Putusan p86 = new Putusan();
        p86.setNomorPerkara("86/Pid.Sus/2024/PN.Sby");
        p86.setNamaTerdakwa("Moch. Oesman Bin Mat Sui");
        p86.setUmurTerdakwa(48);
        p86.setBeratBarangBukti(0.868); // Menggunakan berat netto
        p86.setJenisNarkotika("Sabu-sabu");
        p86.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p86);

        Putusan p87 = new Putusan();
        p87.setNomorPerkara("87/Pid.Sus/2024/PN.Sby");
        p87.setNamaTerdakwa("Yuli Subagyo Bin Irsad (Alm)");
        p87.setUmurTerdakwa(46);
        p87.setBeratBarangBukti(1.681); // Menggunakan berat netto
        p87.setJenisNarkotika("Sabu-sabu");
        p87.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p87);

        Putusan p88 = new Putusan();
        p88.setNomorPerkara("88/Pid.Sus/2024/PN.Sby");
        p88.setNamaTerdakwa("Ahmad Faishol Als Faishol Bin Shobari");
        p88.setUmurTerdakwa(29);
        p88.setBeratBarangBukti(145.56); // Total 145.14 (Ganja) + 0.42 (Sabu)
        p88.setJenisNarkotika("Ganja dan Sabu-sabu");
        p88.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p88);

        Putusan p91 = new Putusan();
        p91.setNomorPerkara("91/Pid.Sus/2024/PN.Sby");
        p91.setNamaTerdakwa("Ketot Samiawan Alias Wawa Bin Ponimin (Alm)");
        p91.setUmurTerdakwa(34);
        p91.setBeratBarangBukti(4.5); // Estimasi: 18 poket x rata-rata 0.25 gram
        p91.setJenisNarkotika("Sabu-sabu");
        p91.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p91);

        Putusan p94 = new Putusan();
        p94.setNomorPerkara("94/Pid.Sus/2024/PN.Sby");
        p94.setNamaTerdakwa("Fikri Ramadanu Bin Mardjuki");
        p94.setUmurTerdakwa(21);
        p94.setBeratBarangBukti(0.200);
        p94.setJenisNarkotika("Sabu-sabu");
        p94.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p94);

        Putusan p95 = new Putusan();
        p95.setNomorPerkara("95/Pid.Sus/2024/PN.Sby");
        p95.setNamaTerdakwa("Rasmat Als. Lahmat Bin Mat Radji");
        p95.setUmurTerdakwa(58);
        p95.setBeratBarangBukti(1.98);
        p95.setJenisNarkotika("Sabu-sabu");
        p95.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p95);

        Putusan p96 = new Putusan();
        p96.setNomorPerkara("96/Pid.Sus/2024/PN.Sby");
        p96.setNamaTerdakwa("Achmad Junaidi dan Fajar Apriyanto");
        p96.setUmurTerdakwa(36); // Menggunakan umur terdakwa pertama sebagai referensi
        p96.setBeratBarangBukti(2.536);
        p96.setJenisNarkotika("Sabu-sabu");
        p96.setPasalDilanggar("Pasal 114 ayat (1) jo Pasal 132 ayat (1) UU No. 35 Tahun 2009");
        simpan(p96);

        Putusan p97 = new Putusan();
        p97.setNomorPerkara("97/Pid.Sus/2024/PN.Sby");
        p97.setNamaTerdakwa("Dimas Agus Setiawan Bin Dadik Masturiawan");
        p97.setUmurTerdakwa(21);
        p97.setBeratBarangBukti(0.259);
        p97.setJenisNarkotika("Sabu-sabu");
        p97.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p97);

        Putusan p98 = new Putusan();
        p98.setNomorPerkara("98/Pid.Sus/2024/PN Sby");
        p98.setNamaTerdakwa("Moch. Saiful Bin Moch. Hustadi");
        p98.setUmurTerdakwa(37);
        p98.setBeratBarangBukti(1.77);
        p98.setJenisNarkotika("Sabu-sabu (Metamfetamina) - Golongan I");
        p98.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p98);

        Putusan p103 = new Putusan();
        p103.setNomorPerkara("103/Pid.Sus/2024/PN.Sby");
        p103.setNamaTerdakwa("Hadi Yatno dan Achmad Fauzi");
        p103.setUmurTerdakwa(32); // Menggunakan umur terdakwa utama
        p103.setBeratBarangBukti(1.27);
        p103.setJenisNarkotika("Sabu-sabu (Metamfetamina) - Golongan I");
        p103.setPasalDilanggar("Pasal 114 ayat (1) jo Pasal 132 ayat (1) UU No. 35 Tahun 2009");
        simpan(p103);

        Putusan p109 = new Putusan();
        p109.setNomorPerkara("109/Pid.Sus/2024/PN Sby");
        p109.setNamaTerdakwa("Achmad Surya Dwiyansyah Bin Mulyono");
        p109.setUmurTerdakwa(29);
        p109.setBeratBarangBukti(0.69);
        p109.setJenisNarkotika("Sabu-sabu (Metamfetamina)");
        p109.setPasalDilanggar("Pasal 112 ayat (1) UU No. 35 Tahun 2009");
        simpan(p109);

        Putusan p112 = new Putusan();
        p112.setNomorPerkara("112/Pid.Sus/2024/PN Sby");
        p112.setNamaTerdakwa("Yasin Arif dan Irvin Irnandy");
        p112.setUmurTerdakwa(33); // Usia terdakwa I
        p112.setBeratBarangBukti(1.663);
        p112.setJenisNarkotika("Sabu-sabu (Metamfetamina)");
        p112.setPasalDilanggar("Pasal 114 ayat (1) jo Pasal 132 ayat (1) UU No. 35 Tahun 2009");
        simpan(p112);

        Putusan p114 = new Putusan();
        p114.setNomorPerkara("114/Pid.Sus/2024/PN Sby");
        p114.setNamaTerdakwa("Mochamad Bushiri Bin Agoes Soepriadi");
        p114.setUmurTerdakwa(23);
        p114.setBeratBarangBukti(4.99);
        p114.setJenisNarkotika("Ganja (Cannabis)");
        p114.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p114);

        Putusan p119 = new Putusan();
        p119.setNomorPerkara("119/Pid.Sus/2024/PN Sby");
        p119.setNamaTerdakwa("Agham Taufan Ariesti Bin Moch. Zainal Arifin");
        p119.setUmurTerdakwa(30);
        p119.setBeratBarangBukti(0.22);
        p119.setJenisNarkotika("Sabu-sabu (Metamfetamina)");
        p119.setPasalDilanggar("Pasal 114 ayat (1) UU No. 35 Tahun 2009");
        simpan(p119);



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

    public ArrayList<Putusan> cariByNamaTerdakwa(String namaDicari) {
        ArrayList<Putusan> hasil = new ArrayList<>();
        for (Putusan p : daftarPutusan) {
            if (p.getNamaTerdakwa().toLowerCase().contains(namaDicari.toLowerCase())) {
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
        for (Putusan p : daftarPutusan) {
            totalDenda += p.getVonisDenda();
        }
        return totalDenda;
    }
}