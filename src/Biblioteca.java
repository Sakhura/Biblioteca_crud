import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    // arrays donde  se guardan los libros en memoria
    private ArrayList<Libro> libros;
    private int contadorId; // generar id´s automaticos
    private Scanner teclado;

    //constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        contadorId = 1;
        teclado = new Scanner(System.in);
        cargaLibrosEjemplo();
    }

    // cargar de libros
}
