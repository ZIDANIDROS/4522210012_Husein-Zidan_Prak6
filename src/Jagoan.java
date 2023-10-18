public class Jagoan {
    private String nama;
    private Jubah jubah;
    private Senjata senjata;

    public Jagoan(String nama) {
        this.nama = nama;
    }

    public void pakaijubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void bersenjatakan(Senjata senjata) {
        this.senjata = senjata;
    }

    public void serang(Jagoan target) {
        System.out.println(this.nama + " menyerang "+ target.nama + " dengan " + this.senjata.getNama());
    }
}