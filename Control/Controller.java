package UAS.Project.Control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import UAS.Project.Model.Buku;
import UAS.Project.Model.DetilPeminjaman;
import UAS.Project.Model.Customer;
import UAS.Project.Model.Librarian;
import UAS.Project.Model.Peminjaman;

public class Controller {
    HashMap<String, Buku> bukus = new HashMap();
    ArrayList<Peminjaman> peminjamans = new ArrayList<>();
    HashMap<String, Customer> customers = new HashMap();
    HashMap<String, Librarian> librarians = new HashMap();

    public void setup() {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Buku buku3 = new Buku();
        buku1.setISBN("0419965661").setTitle("To Catch a Dream").setAuthor("Ellis Jordan").setAvailability(true);
        buku2.setISBN("0688384692").setTitle("2619: Retribution").setAuthor("Len Moore").setAvailability(false);
        buku3.setISBN("0401730794").setTitle("The Burried City").setAuthor("Owen Colon").setAvailability(true);
    }
}