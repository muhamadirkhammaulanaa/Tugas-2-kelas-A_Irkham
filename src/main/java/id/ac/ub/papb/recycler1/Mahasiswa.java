package id.ac.ub.papb.recycler1;

public class Mahasiswa {
    private String name;
    private String nim;

    // Konstruktor Mahasiswa yang menerima dua parameter (nama dan nim)
    public Mahasiswa(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter untuk nim
    public String getNim() {
        return nim;
    }
}
