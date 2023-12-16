package UAS.Project.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {
    private String idPeminjaman;
    private Customer customer;
    private Librarian librarian;
    private LocalDate tanggal;
    private ArrayList<DetilPeminjaman> detilPeminjamans;

    public String getIdPeminjaman() {
        return this.idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Librarian getLibrarian() {
        return this.librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public LocalDate getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public ArrayList<DetilPeminjaman> getDetilPeminjamans() {
        return this.detilPeminjamans;
    }

    public void setDetilPeminjamans(ArrayList<DetilPeminjaman> detilPeminjamans) {
        this.detilPeminjamans = detilPeminjamans;
    }

}
