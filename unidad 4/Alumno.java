public class Alumno {
    // Atributos de la clase
    String nombre;
    int edad;
    String matricula;
    String grado;
    double promedio;
    boolean inscrito;

    // Constructor
    public Alumno(String nombreAlumno, int edadAlumno, String matriculaAlumno, 
                  String gradoAlumno, double promedioAlumno, boolean inscritoAlumno) {
        nombre = nombreAlumno;
        edad = edadAlumno;
        matricula = matriculaAlumno;
        grado = gradoAlumno;
        promedio = promedioAlumno;
        inscrito = inscritoAlumno;
    }

    // Método para mostrar información
    void mostrarInformacion() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Grado: " + grado);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (inscrito ? "Inscrito" : "No Inscrito"));
    }

    // Método principal
    public static void main(String[] args) {
        // Crear varios alumnos imaginarios
        Alumno alu1 = new Alumno("Juan Perez", 18, "A001", "1°A", 8.5, true);
        Alumno alu2 = new Alumno("María Lopez", 19, "B002", "2°B", 9.2, true);
        Alumno alu3 = new Alumno("Carlos Garcia", 17, "C003", "3°A", 7.8, false);
        Alumno alu4 = new Alumno("Ana Torres", 20, "D004", "4°C", 8.9, true);
        Alumno alu5 = new Alumno("Luis Martinez", 21, "E005", "5°B", 6.5, false);

        // Mostrar información de todos los alumnos
        alu1.mostrarInformacion();
        alu2.mostrarInformacion();
        alu3.mostrarInformacion();
        alu4.mostrarInformacion();
        alu5.mostrarInformacion();
    }
}
