package Source_Code;

public class Pembeli_13 {
    String namaPembeli, NoHp;
    Pembeli_13 prev;
    Pembeli_13 next;

    public Pembeli_13() {
        
    }
    public Pembeli_13(Pembeli_13 prev, String b, String c, Pembeli_13 next) {
        this.prev = prev;
        this.namaPembeli = b;
        this.NoHp = c;
        this.next = next;
    }
}