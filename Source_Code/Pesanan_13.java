package Source_Code;

public class Pesanan_13 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    Pesanan_13 prev;
    Pesanan_13 next;

    public Pesanan_13(Pesanan_13 prev, int a, String b, int d, Pesanan_13 next) {
        this.prev = prev;
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = d;
        this.next = next;
    }
}
