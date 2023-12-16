package UAS.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import UAS.Project.Control.Controller;
import UAS.Project.Model.Buku;
import UAS.Project.Model.Customer;
import UAS.Project.Model.Librarian;

public class App {
    public static void main(String[] args) throws Exception {
        Controller LibControl = new Controller();
        LibControl.setUp();
        boolean cont = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (cont) {
            
        }

    }
}
