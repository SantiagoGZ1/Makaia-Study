package arraylists;

public class Persona {
    private int indice;
    private String name;
    private int edad;
    
    public Persona() {
    }

    public Persona(int indice, String name, int edad) {
        this.indice = indice;
        this.name = name;
        this.edad = edad;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
