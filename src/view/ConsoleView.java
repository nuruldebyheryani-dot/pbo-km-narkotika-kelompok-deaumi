package view;
import java.util.Scanner;
public class ConsoleView {
    private final Scanner scanner;
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public int tampilkanMenu() {

            System.out.println();
            System.out.println("======================================================");
            System.out.println("      KNOWLEDGE MANAGEMENT SYSTEM");
            System.out.println(" PUTUSAN PENGADILAN NARKOTIKA");
            System.out.println("======================================================");
            System.out.println("1. Tambah Data Putusan");
            System.out.println("2. Tampilkan Semua Putusan");
            System.out.println("3. Cari Berdasarkan Nomor");
            System.out.println("4. Cari Berdasarkan Nama");
            System.out.println("5. Statistik");
            System.out.println("6. Hapus Putusan");
            System.out.println("0. Keluar");
            System.out.println("======================================================");

            System.out.print("Pilih Menu : ");

            while (!scanner.hasNextInt()) {
                System.out.print("Input harus angka : ");
                scanner.next();
            }

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            return pilihan;
        }

    public String[] inputDataPutusan() {

            String[] data = new String[12];

            System.out.println();
            System.out.println("============== INPUT DATA PUTUSAN ==============");

            System.out.print("Nomor Perkara           : ");
            data[0] = scanner.nextLine();

            System.out.print("Pengadilan              : ");
            data[1] = scanner.nextLine();

            System.out.print("Tanggal Putusan          : ");
            data[2] = scanner.nextLine();

            System.out.print("Nama Terdakwa            : ");
            data[3] = scanner.nextLine();

            System.out.print("Umur Terdakwa            : ");
            data[4] = scanner.nextLine();

            System.out.print("Jenis Narkotika          : ");
            data[5] = scanner.nextLine();

            System.out.print("Berat Barang Bukti       : ");
            data[6] = scanner.nextLine();

            System.out.print("Pasal Dilanggar          : ");
            data[7] = scanner.nextLine();

            System.out.print("Peran Terdakwa           : ");
            data[8] = scanner.nextLine();

            System.out.print("Vonis Hukuman (bulan)    : ");
            data[9] = scanner.nextLine();

            System.out.print("Vonis Denda              : ");
            data[10] = scanner.nextLine();

            System.out.print("Nama Hakim               : ");
            data[11] = scanner.nextLine();

            return data;

        }

    public void tampilkanPesan(String pesan){

            System.out.println();
            System.out.println("================================================");
            System.out.println(pesan);
            System.out.println("================================================");

        }

    public String inputNomorPerkara() {

            System.out.print("Masukkan Nomor Perkara : ");
            return scanner.nextLine();
    }

    public String inputNamaTerdakwa(){

        System.out.print("Masukkan Nama Terdakwa : ");
        return scanner.nextLine();

    }

    public String inputNomorHapus(){

        System.out.print("Masukkan Nomor Perkara yang kan dihapus : ");
        return scanner.nextLine();

    }

    public void tampilkanDaftar(){

        System.out.println();
        System.out.println("==============================================================================================================");
        System.out.printf("%-4s %-20s %-20s %-18s %-10s %-15s%n",
                "No",
                "Nomor",
                "Nama",
                "Narkotika",
                "Vonis",
                "Kategori");

        System.out.println("--------------------------------------------------------------------------------------------------------------");

    }

    public void tampilkanBaris(

            int no,
            String nomor,
            String nama,
            String narkotika,
            int vonis,
            String kategori

    ){

            System.out.printf("%-4d %-20s %-20s %-18s %-10d %-15s%n",

                    no,
                    nomor,
                    nama,
                    narkotika,
                    vonis,
                    kategori

            );
        }

        public void tampilkanFooterDaftar(int total){

            System.out.println("==============================================================================================================");
            System.out.println("Jumlah Data : " + total);

        }

    public void tampilkanDetail(
            String nomor,
            String pengadilan,
            String tanggal,
            String nama,
            int umur,
            String jenis,
            double berat,
            String pasal,
            String peran,
            int vonis,
            double denda,
            String Hakim,
            String kategori
    ){

            System.out.println();
            System.out.println("================================================");
            System.out.println("DETAIL PUTUSAN");
            System.out.println("================================================");

            System.out.println("Nomor Perkara      : " + nomor);
            System.out.println("Pengadilan         : " + pengadilan);
            System.out.println("Tanggal Putusan    : " + tanggal);
            System.out.println("Nama Terdakwa      : " + nama);
            System.out.println("Umur               : " + umur + " Tahun");
            System.out.println("Jenis Narkotika    : " + jenis);
            System.out.println("Berat Barang Bukti : " + berat + " gram");
            System.out.println("Pasal Dilanggar    : " + pasal);
            System.out.println("Peran Terdakwa     : " + peran);
            System.out.println("Vonis              : " + vonis + " Bulan");
            System.out.println("Denda              : Rp " + denda);
            System.out.println("Hakim Ketua        : " + Hakim);
            System.out.println("Kategori Hukuman   : " + kategori);

            System.out.println("================================================");

        }

    public void tampilkanStatistik(
            int total,
                    double rataVonis,
                    double rataData

    ){

            System.out.println();
            System.out.println("================================================");
            System.out.println("STATISTIK PUTUSAN");
            System.out.println("================================================");

            System.out.println("Total Putusan   : " + total);
            System.out.printf("Rata-rata Vonis : %.2f Bulan%n", rataVonis);
            System.out.printf("Rata-rata Denda : Rp %,.2f%n", rataData);

            System.out.println("================================================");

        }

    public boolean konfirmasiKeluar() {

            System.out.print("Yakin ingin Keluar? (Y/N) : ");
            String jawab = scanner.nextLine();
            return jawab.equalsIgnoreCase("Y");

        }
        }