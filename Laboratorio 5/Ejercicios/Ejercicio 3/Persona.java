package testasociacion;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private char tipo;
    
    public Persona(int id, String nombre, String apellido, char tipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nID: " + id;
        s += "\nNombre: " + nombre;
        s += "\nApellido: " + apellido;
        return s;
    }
    
}