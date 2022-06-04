package Source_Code;


public class DLL_13 {


    Pembeli_13 head;
    Pesanan_13 head2;
    int size = 0, size2 = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isEmpty2() {
        return head2 == null;
    }

    public int size() {
        return size;
    }

    public void tambahAntrian(String nm, String no) {
        if(isEmpty()) {
            head = new Pembeli_13(null, nm, no, null);
        } else {
            Pembeli_13 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Pembeli_13 newNd = new Pembeli_13(current, nm, no, null);
            current.next = newNd;
            size++;
        }
    }

    public void tampil() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Antrian Resto Royal Delish");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        if (!isEmpty()){
            System.out.println("|No.              Nama Customer            |No Hp            |");
            Pembeli_13 tmp = head;
            int i = 1;
            while (tmp!=null) {
                System.out.println("|"+i+"              |"+tmp.namaPembeli+"              |"+tmp.NoHp);
                tmp = tmp.next;
                i++;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void hapusAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Masih Kosong");
        } else if (size == 1) {
            if (head.next == null) {
                System.out.println(head.namaPembeli+" telah memesan kartu");
                head = null;
                size--;
                return;
            }
            Pembeli_13 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            System.out.println(current.next.namaPembeli+" telah memesan kartu");
            current.next = null;
            size--;
            return;
        } else {
            head = head.next;
            System.out.println(head.prev.namaPembeli+" telah memesan kartu");
            head.prev = null;
            size--;
        }
    }

    // class pesanan

    public void addPesanan(int kd, String nmp, int hg) {
        if(isEmpty2()) {
            head2 = new Pesanan_13(null, kd, nmp, hg, null);
            printPesan();
            size2++;
        } else {
            Pesanan_13 current = head2;
            while (current.next != null) {
                current = current.next;
            }
            Pesanan_13 newNd = new Pesanan_13(current, kd, nmp, hg, null);
            current.next = newNd;
            printPesan();
            size2++;
        }
    }

    public void printPesan() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        if (!isEmpty()){
            System.out.println("|No.              Nama Pesanan            |Harga            |");
            Pesanan_13 tmp = head2;
            while (tmp!=null) {
                System.out.println("|"+tmp.kodePesanan+"              |"+tmp.namaPesanan+"              |"+tmp.harga);
                tmp = tmp.next;
            }
            System.out.println("Semua Pesanan Berhasil Dicetak");
        } else {
            System.out.println("Daftar Pesanan Masih Kosong");
        }
    }

    public int total() {
        Pesanan_13 tmp = head2;
        int total = 0;

        while(tmp!=null){
            total += tmp.harga;
            tmp = tmp.next;
        }
        return total;
    }


    



}
