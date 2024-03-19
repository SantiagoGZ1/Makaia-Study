package Exercises.GetySet;

public class User {
    private String name;
    private int age;
    
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        User user = new User("Jose", 12); //Sin el contructor no puedo crear una instancia, osea objetos

        System.out.println("My name is " + user.getName() + " and i'm " + user.getAge() + " years old");

        System.out.println("Mode name");

        user.setName("Santiago");
        System.out.println("New name: " + user.getName());
    }

}
