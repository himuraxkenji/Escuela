package escuela;

public class Persona {
    private Fecha fechaNac;
    private long dni;
    private String nombres;
    private String apellido;

    public Persona(String nombres, String apellido) {
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public Persona(String nombres, String riperto, long dni, Fecha fechaNac) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
    }

}
