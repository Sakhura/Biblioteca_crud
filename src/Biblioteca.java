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
        cargaLibrosEjemplo(); //pre carga de 5 libros
    }

    // cargar de libros

    private  void cargaLibrosEjemplo(){
        libros.add(new Libro(contadorId++, "Cien años de Soledad", "Gabriel Garcia Marquéz", 1967, "Novela"));
        libros.add(new Libro(contadorId++, "Don Quijote", "Miguel de Cervantes", 1605, "Novela"));
        libros.add(new Libro(contadorId++, "El Principito", "Antoine de Saint-E", 1943, "Infatil"));
        libros.add(new Libro(contadorId++, "1984", "George Orwell", 1949, "Ciencia Ficción"));
        libros.add(new Libro(contadorId++, "Carmilla", "Sheridan Le Fanu", 1872, "Ficción Gótica"));
    }

    //read-leer: listar todos los libros

    private void listarLibros(){
        if (libros.isEmpty()) {
            System.out.println("\n No tenemos libros registrados");
            return;
        }
        imprimirCabecera();
        for (Libro libro : libros){
            System.out.println(libro.toString());
        }
        imprimirPie();
        System.out.println("  Total de libros: " + libros.size());
    }

    //read- buscar por ID
    public void buscarPorID(){
        System.out.println("\n Ingrese ID a buscar");
        int id = leerEntero();
        Libro libro = encontrarLibroPorID(id);
        if (libro != null){
            imprimirCabecera();
            System.out.println(libro);
            imprimirPie();
        }else {
            System.out.println(" No existe libro con ID ingresado " + id);
        }
    }

    //read- buscar por titulo
    public void buscarPorTitulo(){
        System.out.println("\n Ingrese texto a buscar en el titulo: ");
        String busqueda = teclado.nextLine().toLowerCase();
        boolean encontrado = false;
        imprimirCabecera();
        for (Libro libro : libros){
            if (libro.getTitulo().toLowerCase().contains(busqueda)){
                System.out.println(libro);
                encontrado = true;
            }
        }
        imprimirPie();
        if (!encontrado){
            System.out.println(" No se encontro libro con \"" + busqueda + "\"");
        }
    }

// create - agregar libro

    public void agregarLibro(){
        System.out.println("\n ----Agregar Libro Nuevo----");

        System.out.println("    Titulo  : ");
        String titulo = teclado.nextLine();


        System.out.println("    Autor  : ");
        String autor = teclado.nextLine();


        System.out.println("    Año  : ");
        int anio = leerEntero();

        System.out.println("    Genero  : ");
        String genero = teclado.nextLine();

        Libro nuevo = new Libro(contadorId++, titulo, autor, anio, genero);
        libros.add(nuevo);
        System.out.println("\n Libro agregado con ID: " +nuevo.getId());
    }

// update- actualizar libro
    


    //metodo auxiliar

    private int leerEntero(){
        while (!teclado.hasNextInt()) {
            System.out.println(" Ingrese número válido");
            teclado.next();
        }
        int numero = teclado.nextInt();
        teclado.nextLine();
        return numero;
    }

    private  Libro encontrarLibroPorID(int id){
        for (Libro libro : libros){
            if (libro.getId()==id){
                return libro;
            }
        }
        return null; // no encontrado
    }

    private void imprimirCabecera(){
        System.out.println("\n  +------+---------------------------+----------------------+--------+--------------+-------------+");
        System.out.println("  | ID   | TITULO                    | AUTOR                | ANIO   | GENERO       | ESTADO      |");
        System.out.println("  +------+---------------------------+----------------------+--------+--------------+-------------+");
    }

    private void imprimirPie() {
        System.out.println("  +------+---------------------------+----------------------+--------+--------------+-------------+");
    }
}






















