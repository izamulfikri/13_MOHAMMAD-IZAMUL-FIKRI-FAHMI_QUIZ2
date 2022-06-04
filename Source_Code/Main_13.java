package Source_Code;
import java.util.Scanner;

public class Main_13 {

    public static void menu() {
        System.out.println("Menu ");

        System.out.println(" 1. Tambah Antrian");
        System.out.println(" 2. Cetak");
        System.out.println(" 3. Hapus Antrian");
        System.out.println(" 4. Laporan Pengurutan By Nama");
        System.out.println(" 5. Hitung Total Pendapatan");
        System.out.println(" 6. Keluar");

    }
    public static void main(String[] args) throws Exception {
        System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI-1G dan TI-1F ========");
        System.out.println("dibuat oleh : Mohammad Izamul Fikri Fahmi");
        System.out.println("NIM         : 2141720171");
        System.out.println("Absen       : 13");
        System.out.println("======================================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

    Scanner sc = new Scanner(System.in);
    Scanner ok = new Scanner(System.in);
    Scanner x = new Scanner(System.in);
    DLL_13 f = new DLL_13();
    int opsi = 0;
    String no, nama, pesan;
    int nomor, harga;

    do {
        menu();
        System.out.print("Pilih(1-5): ");
        opsi = sc.nextInt();
        System.out.println();

        switch(opsi) {
            case 1:
            System.out.println("-- Masukkan Data Pembeli --");
            System.out.print("Nomor Antrian     : ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.print("Nama Customer  : ");
            nama = sc.nextLine();
            System.out.print("Nomor HP : ");
            no = sc.nextLine();
            f.tambahAntrian(nama, no);
            break;

            case 2:
            System.out.println("-- Daftar Antrian --");
            f.tampil();
            break;

            case 3:
            f.hapusAntrian();
            System.out.print("nomor pesanan : ");
            nomor = ok.nextInt();
            System.out.print("nama pesanan : ");
            pesan = x.nextLine();
            System.out.print("Harga : ");
            harga = ok.nextInt();
            f.addPesanan(nomor, pesan, harga);

            break;

            case 4:
            f.printPesan();
            break;

            case 5:
            int t = f.total();
            System.out.println("Total : " + t);
            break;

            case 6:
            System.out.println("Keluar");
            break;

            default:
            System.out.println("Masukkan Opsi Dengan Benar :)");
        }
    }  while(opsi!=6);
    }
}

