package Peru.org;

public class BENEFICIARIO {
    private int id;
    private String nombre;
    private String titulo;


    public BENEFICIARIO(int id, String nombre, String titulo) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return nombre + " (" + titulo + ")";
    }

    // Instancias
    public static final BENEFICIARIO CONTRATISTA = new BENEFICIARIO(1, "Juan Pérez", "Contratista");
    public static final BENEFICIARIO EMPLEADO = new BENEFICIARIO(2, "Ana Gómez", "Empleado");
}
