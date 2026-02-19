# 📚 Biblioteca CRUD - Sistema de Gestión de Libros

Sistema de gestión de biblioteca desarrollado en **Java**, que permite realizar operaciones CRUD completas sobre una colección de libros, además de gestionar préstamos y devoluciones. Todo funciona en memoria (sin base de datos), ideal para practicar programación orientada a objetos.

---

## 🗂️ Estructura del Proyecto

```
CRUD_ejemplo_Biblioteca/
│
├── src/
│   ├── Libro.java           # Clase modelo (entidad Libro)
│   ├── Biblioteca.java      # Lógica de negocio y operaciones CRUD
│   └── MenuPrincipal.java   # Punto de entrada y menú interactivo
│
├── CRUD_ejemplo_Biblioteca.iml
└── README.md
```

---

## 🧩 Clases Principales

### `Libro.java`
Representa un libro con los siguientes atributos:

| Atributo   | Tipo      | Descripción                          |
|------------|-----------|--------------------------------------|
| `id`       | `int`     | Identificador único (auto-generado)  |
| `titulo`   | `String`  | Título del libro                     |
| `autor`    | `String`  | Nombre del autor                     |
| `anio`     | `int`     | Año de publicación                   |
| `genero`   | `String`  | Género literario                     |
| `prestado` | `boolean` | Estado del libro (`false` por defecto) |

---

### `Biblioteca.java`
Contiene toda la lógica del sistema. Utiliza un `ArrayList<Libro>` para almacenar los libros en memoria y ofrece los siguientes métodos:

| Método              | Tipo CRUD | Descripción                                  |
|---------------------|-----------|----------------------------------------------|
| `listarLibros()`    | Read      | Muestra todos los libros registrados         |
| `buscarPorID()`     | Read      | Busca un libro por su ID                     |
| `buscarPorTitulo()` | Read      | Busca libros que contengan el texto ingresado |
| `agregarLibro()`    | Create    | Agrega un nuevo libro a la colección         |
| `actualizarLibro()` | Update    | Modifica uno o todos los campos de un libro  |
| `eliminarLibro()`   | Delete    | Elimina un libro con confirmación previa     |
| `prestarLibro()`    | Extra     | Marca un libro como prestado                 |
| `devolverLibro()`   | Extra     | Marca un libro como disponible               |

> Al iniciar el programa se cargan automáticamente **5 libros de ejemplo** para poder probar el sistema de inmediato.

---

### `MenuPrincipal.java`
Punto de entrada del programa (`main`). Muestra un menú interactivo en consola con un ciclo `do-while` que se repite hasta que el usuario elige salir.

---

## ▶️ ¿Cómo ejecutar el proyecto?

### Requisitos
- Java **JDK 21** o superior
- IDE recomendado: **IntelliJ IDEA**

### Pasos
1. Clona o descarga el repositorio.
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta la clase `MenuPrincipal.java`.
4. Interactúa con el menú desde la consola.

---

## 📋 Menú Principal

```
 ============== MENU PRINCIPAL =================
    1. Listar todos los libros
    2. Buscar libro por ID
    3. Buscar libro por título
    4. Agregar nuevo libro
    5. Actualizar libro
    6. Eliminar libro
    7. Prestar libro
    8. Devolver libro
    0. Salir
```

---

## 📖 Libros de Ejemplo Precargados

| ID | Título                  | Autor                    | Año  | Género          |
|----|-------------------------|--------------------------|------|-----------------|
| 1  | Cien años de Soledad    | Gabriel García Márquez   | 1967 | Novela          |
| 2  | Don Quijote             | Miguel de Cervantes      | 1605 | Novela          |
| 3  | El Principito           | Antoine de Saint-Exupéry | 1943 | Infantil        |
| 4  | 1984                    | George Orwell            | 1949 | Ciencia Ficción |
| 5  | Carmilla                | Sheridan Le Fanu         | 1872 | Ficción Gótica  |

---

## 💡 Conceptos de Programación Aplicados

- **Programación Orientada a Objetos (POO):** encapsulamiento, constructores, getters y setters.
- **Colecciones:** uso de `ArrayList` para gestionar listas dinámicas.
- **Entrada de datos:** manejo de `Scanner` con validación de tipos.
- **Control de flujo:** estructuras `switch`, `for-each`, `while` y `do-while`.
- **Formato de salida:** uso de `String.format()` para tablas en consola.

---

## 🚀 Posibles Mejoras Futuras

- Persistencia de datos con archivos `.txt` o base de datos (MySQL / SQLite).
- Registro de usuario que realiza el préstamo.
- Fecha de préstamo y fecha de devolución esperada.
- Búsqueda por autor o género.
- Interfaz gráfica con JavaFX o Swing.

---

## 👩‍💻 Tecnologías Utilizadas

![Java](https://img.shields.io/badge/Java-21-orange?logo=java)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue?logo=intellijidea)