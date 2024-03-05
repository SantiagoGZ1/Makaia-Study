package ClasesObjetos;

public class Persona {
    //Atributos
    private String name;
    private String firstSurname;
    private String secondSurname;
    private int dni;
    private int age;

    //contructir vacio
    public Persona(){

    }

    //constructo de copia 
    public Persona(Persona p){
        this.name = p.name;
        this.firstSurname = p.firstSurname;
        this.secondSurname = p.secondSurname;
        this.dni = p.dni;
        this.age = p.age;
    }

    //Constructor parametros
    public Persona (String name, String firstSurname, String secondSurname, int dni, int age){
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.dni = dni;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona - "+  "name: " + name + ", firstSurname: " + firstSurname + ", secondSurname: " + secondSurname
                + ", dni: " + dni + ", age: " + age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dni;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (dni != other.dni)
            return false;
        return true;
    }
}

