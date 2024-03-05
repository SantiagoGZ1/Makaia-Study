# Java Inrtoduction

## Variables

Se debe predefinir el tipo de variable que se va a usar, Ej...

```java
  int numbers = 1;
  String info = "Manual de comida"
  char letter = "L"
  static final int ruedasCarros = 4; //Constante
```

```java
  int [] arrayEnterosTamaño = new int [2];
  arrayEnterosTamaño[0]= 20;
  arrayEnterosTamaño[1] = 30;
  String[] arrayNames = {"Santi", "Jose", "maria"};
  arrayNames [0] = "Lina";
  System.out.print(arrayNames);
  static final int ruedasCarros = 4;
```

Operador ternario "?"

```java
	int x = 50;
	int ecuation = (x < 100)?50:20;
	System.out.print(ecuation);
  /*
  si es true devuelve 50 (numero izquierda)
  si es false devuelve 20 (numero derecha)
  */
```

## Pedir datos

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un dato
        System.out.print("Por favor, ingresa un dato: ");
        
        // Leer el dato ingresado por el usuario
        String dato = scanner.nextLine();
        //el nextLine CAMBIA DEPENDIENDO DEL TIPO DE DATO
        
        // Imprimir el dato ingresado por el usuario
        System.out.println("El dato ingresado es: " + dato);
        
        // Cerrar el Scanner al finalizar
        scanner.close();
    }
}

```

## Manejo de flujo

### if - else

 ```java
 if (edad>=18){
  System.out.println("Eres mayor de edad");
}else{
  System.out.println("Eres menor de edad");
}
```

### Switch - Case

```java
package Courses_Accenture;
public class learning{
    public static void main (String[] args){
        int day = 1;
        String dayString;
        switch (day) {
            case 1: dayString = "Lunes";
                break;
            case 2: dayString = "Martes";
                break;
            case 3: dayString = "Miércoles";
                break;
            case 4: dayString = "Jueves";
                break;
            case 5: dayString = "Viernes";
                break;
            case 6: dayString = "Sábado";
                break;
            case 7: dayString = "Domingo";
                break;
            default: dayString = "Día inválido";
                break;
        }
        System.out.println(dayString);
    }
}
```

## Bucles

### for

```java
package Courses_Accenture;
public class learning{
    public static void main (String[] args){
        for (int i=1; i<11; i++){
            System.out.println("Numero:" + i);
        }
    }
}
```

### while

```java
package Courses_Accenture;

public class learn {
    public static void main(String[] arg) {
        int cont = 0;
        while (cont <=10){
            System.out.println("el numero es: " + cont);
            //cont = cont + 1;
            //cont +=1;
            //cont++;
        }
    }
}
```

### do while

```java
package Courses_Accenture;

public class learn {
    public static void main(String[] arg) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while( i <= 10);
    }
}

//------
public static void main(String[] arg) {
        Scanner entrada = new Scanner((System.in));
        int i = 1, contador;
        System.out.print("Digita la cantidad de números");
        contador = entrada.nextInt();
        do{
            System.out.println(i);
            i++;
        }while( i <= contador);
    }

```

<details>
<summary>Exercises</summary>

1. Identificar si un número dado por el usuario es multiplo de 5.

    ```java
    package Courses_Accenture;
    import java.util.Scanner;

    public class learn {
        public static void main(String[] arg) {
            int number;
            Scanner userNumber = new Scanner(System.in);
            System.out.println("Introduce un número:");
            number = userNumber.nextInt();
            if (number % 5 == 0) {
                System.out.println("El numero " + number + " Es multiplo de 5");
            }
        }
    }
    ```

2. Ejercicio de número correcto e incorrecto.

    ```java
    package Courses_Accenture;

    import java.util.Scanner;

    public class learn {
        public static void main(String[] arg) {
            int dato;
            boolean Incorrecto = true;
            do{
                Scanner prueba = new Scanner(System.in);
                System.out.println("Digita número");
                dato = prueba.nextInt();
                if(dato < 0){
                    System.out.println("Incorrect Number");
                }else{
                    System.out.print("Correct Number");
                    Incorrecto = false;
                }
            }while(Incorrecto);
        }
    }
    ```

3. Por medio de un `for` identificar los números pares del 1 al 20.

    ```java
    package Courses_Accenture;

    public class learn {
        public static void main(String[] arg) {
            System.out.print("Pares del 1 al 20");
            for ( int i = 1; i <= 20; i++ ){
                int resto = i % 2;
                if (resto == 0){
                    System.out.println(i);
                }
            }
        }
    }
    ```
</details>


# Java 1 (POO)

**Class (poo)**: Una Clase Java es una plantilla que define la forma que tendrán los objetos creados en la misma. Esto incluye el tipo de características (atributos) y los comportamientos (métodos) comunes que tendrán los objetos que se crearán a partir de ella.

Atributos: Almacenan las características de un objeto (Fisico).
Metodo: Representan el comportamiento de un objeto (lo que hace un objeto).

## Other

1. el `public static void main(String[] arg)` se sustituye por la creación de la clase `public class Coche`

2. Modificador de acceso de atributos:
    - **public**: Cuando se declara un atributo público se está permitiendo que desde cualquier otra clase pueda referenciarse directamente.
    - **private:** Si se declara un atributo privado no se podrá acceder directamente a él desde otra clase distinta. Por tanto, será necesario recurrir a algún método que nos proporcione o nos modifique su valor.
    - **protected:** Los atributos declarados así son accesibles directamente sólo desde la propia clase, de las subclases de esta (herencia) y las clases que se encuentran dentro del mismo paquete (se explicará posteriormente).

3. Modificadores de NO Acceeso (Metodos)

>💡Podemos crear métodos dentro de cualquier clase, sin necesidad de ser una clase “plantilla” para crear instancias, de tal forma que podemos tener una clase donde sólo tengamos la implementación de unos métodos que podamos usar desde otras clases.

**Plantilla POO**

```java
package Courses_Accenture;

public class learn {
    public class Coche {
        //declaración atributos
        private String color;
        private double longitud;
        private int plazas;

        //Declaración de métodos
        //Modificador es opcional
        //Tipo de retorno (usaremos void en caso de no retornar nada)
        public void arrancar() {
        };

        public void acelerar() {
        };

        public void frenar() {
        };

    }
}
```

## Constructor

Cuando hacemos un constructor es la plantilla, para realizar varios objetos de un mismo tipo. Por ejemplo el constructor de carros se puede hacer para crear diferentes modelos de carros pero repitiendo algunos o todos los metodos o atributos.

```java
//Contructor Vacío
// sirve para inicializar los atributos de la clase con valores predeterminados por el sistema (por ejemplo, longitud inicial del coche se inicializaría a cero ya que es de tipo numérico).

public Coche(){
}
//Contructor de copia
//Sirve para clonar objetos, de tal forma que debemos asignar a cada uno de nuestros atributos el valor de los atributos del objeto a copiar.

public Coche (Coche nombreObjeto){
this.color = nombreObjeto.color;
}
```

**Constructor común**: Es aquel que no recibe parámetros y se utiliza para asignar valores iniciales a los atributos de la clase. En nuestro ejemplo, le asignamos un valor inicial de 2 metros al atributo longitud:

```java
public class Coche{
double longitud;
 
public Coche (){
longitud = 2;
 
}
}
```

**Constructor de parametros**: Recibe como parámetros los distintos valores para cada uno de los atributos del objeto a crear. En el ejemplo, asignamos una longitud concreta al atributo del objeto:

```java
public class Coche{
    double longitud;
    
    public Coche(){
        longitud = 2;
    
    }
    
    public Coche (double long){
        this.longitud = long;
    
    }
}
```

## This
Como hemos visto en los ejemplos de los constructores, la palabra reservada this se usa para hacer referencia a las propiedades (atributos) del objeto, pero también podemos usarlo para acceder a otros métodos o constructores del objeto actual:

- `this.atributo`: accede a un atributo de la misma clase.
- `this.metodo()`: accede a un método de la misma clase.
- `this()`: llamamos a otro constructor de la misma clase.

En realidad, no es obligatorio siempre el uso de this, sólo será necesario utilizarlo en el momento en que estamos asignando a un atributo un parámetro en el que coincida con el nombre, porque así el compilador puede distinguir si estamos haciendo referencia al atributo (color) o al parámetro (color), porque si el atributo y el parámetro tienen distinto identificador no te haría falta, como puede verse en el ejemplo.

```java
public class Coche {
    //declaración de atributos
    private String color;
    private double longitud;
    private int plazas;
    
    //Constructor de parámetros
    public Coche(String color, double long, int plazas){
    this.color = color;
    longitud = long; //Aquí no es necesario usar this
    this.plazas = plazas;
    }
}
```
## Set y Get
Cuando hemos declarado nuestros atributos como private, como en el ejemplo de la clase Coche, necesitamos los métodos públicos conocidos como getters y setters que nos permiten manipular o modificar los valores de nuestros atributos o recuperar los valores de dichos atributos.

En caso de que los atributos fueran públicos, no haría falta usarlos pues se tendría acceso a ellos sin ningún tipo de control.

**SET**
Permiten modificar los atributos privados.
Ejemplo: Asignarle un color específico al atributo (color) del coche.

**GET**
Permiten a los objetos retomar los valores de sus atributos privados.
Ejemplo: Devolver el color del coche.

>💡En caso de el que atributo sea de tipo boolean (verdadero/falso), se usará la palara “is” en lugar de “get”.

En nuestro ejemplo de la clase Coche, al ser todos los atributos privados, necesitamos los métodos setters y getters para cada uno de ellos, de tal forma, que necesitamos el método get que nos permita devolver el valor de un atributo usando el return, cuyo nombre sería getColor. Igualmente, necesitamos el método set que nos permita asignar un valor a al atributo, cuyo nombre del método sería setColor.

```java
public class Coche {
 
    //declaración de atributos
    private String color;
    private double longitud;
    private int plazas;
    
    //declaración de método get que devuelve el color del coche
    public String getColor(){
        return color;
    }
    //declaración de método set que modifica el color del coche
    public void setColor (String Rojo){
        this.color = rojo;
    }
 
}
```

## Metodo Main

Aunque, por otro lado, una clase también puede estar compuesta por métodos estáticos que no necesitan de objetos, como es el caso del método Main.

El método main sirve para iniciar la ejecución de cualquier programa en Java. Dicho método se conoce como punto de entrada de una clase.

- Siempre debe incluir los modificadores: public (el método será visible para todas las clases en todas partes) y static (el método es estático, por tanto, se puede llamar o usar desde cualquier clase sin necesidad de crear una instancia de la clase en la que se ha creado dicho método).
- No puede retornar un valor como resultado, debe indicar el valor void como retorno.
- Su parámetro de entrada siempre será un array de tipo string que debe aparecer obligatoriamente como argumento de este método.

```java
public class Robot {
    public static void main (String[] args){
        System.out.println("Hola a todos!!!");
    }
}
```

>💡En Java se puede escribir el método Main de tres maneras diferentes sin que esto produzca un error en la ejecución del programa.\
`public static void main(String args[]) {}`\
`public static void main(String[] args){}`\
`public static void main(String... args){}`


<details>
<summary>Ejemplos Generales (poo, get, set)</summary>

```java
package Courses_Accenture;
import java.util.Scanner;

public class learn {
    
    
    int id;
    String nombre;
    String apellido;

    public void monstrarNombre(){
        System.out.print("Hola");
    }

    public void saberNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota numérica: ");
        int nota = scanner.nextInt();
        scanner.close(); // Cerrar el Scanner después de usarlo
        if (nota > 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }
    public static void main(String[] args) {
        // Aquí puedes agregar código para probar la funcionalidad de la clase learn
        // Por ejemplo:
        learn objeto = new learn();
        objeto.monstrarNombre();
        objeto.saberNota();
    }
    
}
```


```java
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

    //set (Establecer) - get (obtener)

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    //Para los demás atrbutos se hace lo mismo.
}
```

</details>



## Api de java
proporciona un conjunto de clases e interfaces predefinidas, que se copian durante la instalación de Java, para realizar nuestras aplicaciones, y podemos utilizarlas cuando sea necesario.

### Import

```java
package Courses_Accenture;

import java.util.Date;

public class learn {
    private String nombre;
    public Date fechaNacimiento;

    public void saludo() {
        System.out.println("Hola " + nombre);
    }
    public static void main (String[] args){
        learn objet = new learn();
        objet.nombre ="Mundo";
        objet.saludo();
    }

}
```

## Los objetos

Realicé un objeto de carros con constructor (plantilla) cpn ayuda de chatgpt

```java
package ClasesObjetos;

public class carObject {
    //Atributos
    private String brand;
    private String model;
    private String color;
    private int year;
    private float length;
    private String Typemotor;
    
    //Contructor
    public carObject(String brand, String model, String color, int year, float length, String Typemotor ){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.length = length;
        this.Typemotor = Typemotor;
    }

    //Metodos
    //Metodo General de dar info
    public void printInfoCar(){
        System.out.println("Info Car");
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
        System.out.println("Year: " + year);
        System.out.println("lenght: " + length);
        System.out.println("Type Motor: " + Typemotor);
    }
    
    //Print Metodos especificos

    public void start(){
        System.out.println("Car starting...");
    }
    public void stop(){
        System.out.println("Car stoping...");
    }
    public void speedUp(){
        System.out.println("Car speed up...");
    }
    public void slowDown(){
        System.out.println("Car slow down...");
    }

    //Metodo principal para probar la clase
    public static void main (String[] arg){
        //creación de objeto e impreción por medio de un metodo
        carObject myCar = new carObject ("Toyota", "Hilux", "black", 2001, 5.78f, "gas");

        //Mod Atributo en especifico
        myCar.color= "Red";

        //Llamado de metodos
        myCar.printInfoCar();
        myCar.start();
        myCar.stop();
    }
}
```

## Metodos de objetos


- `toString`: Para mostrar los valores de los objetos, ya que si solo se imprimen se mostrarán referencias a las variables de los objetos [🔗](https://youtu.be/r9rxz63p4XQ).

    ```java
    @override
    public String toString(){
        return "name" + this.name;
        //......
    }
    ```

- `equals()`:Sirve para comparar el contenido de dos **objetos** creados. Para ello se ha de sobrescribir el método donde se hará la definición de igualdad entre los objetos.
- `==`: Compara los valores de variables.

ejemplo

```java
int a = 7;
int b = 7;
//True
// ya que compara el valor de a y b, es decir, compara si 7 es igual a 7.

//Objeto

Coche c1 = new Coche (“verde”, 3, 2018, “Dacia”,”Duster”);
Coche c2 = new Coche(“verde”, 3, 2018, “Dacia”,”Duster”);

/*Falso, ya que, aunque todos los valores son iguales, hemos creado dos instancias diferentes que ocupan diferentes direcciones en la memoria.
c1 y c2 apuntan a dos lugares diferentes en la memoria.
*/

//Objetos 2

Coche c3 = new Coche (“rojo”, 4, 2011, “Ferrari”,”Portofino”);
Coche c4 = c3;

/*
ya que hemos creado una instancia y guardado su dirección de memoria en c3 
*/

```

### Ejercicio General (Equals & ToString POO)

Creación de la clase con los objetos con contructor, get, sets, toString, equals.

```java
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
        return "Persona [name= " + name + ", firstSurname= " + firstSurname + ", secondSurname= " + secondSurname
                + ", dni= " + dni + ", age= " + age + "]";
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
```
Creación de los objetos e impreción de datos usando el equals.

```java
package ClasesObjetos;
import java.util.Scanner;

public class AppPersonas {
    public static void main(String[] args) {
        //Crear objeto tipo scaner
        Scanner consola = new Scanner(System.in);

        //Crear instacia de tipo persona
        Persona individuo = new Persona();
        
        //Dar valores a los distintps atributos
        System.out.println("Introduce name: ");
        individuo.setName(consola.next());

        System.out.println("Introduce surname");
        individuo.setFirstSurname(consola.next());

        System.out.println("Introduce second surname");
        individuo.setSecondSurname(consola.next());

        System.out.println("Introduce dni");
        individuo.setDni(consola.nextInt());

        System.out.println("Introduce age");
        individuo.setAge(consola.nextInt());

        //Mostrar info del objeto

        System.out.println(individuo);
    }
}
```

# Java 2 
## Caracteristicas POO

### Sobrecarga - Sobreescritura

https://youtu.be/H9KE1HmFmTM

### Herencia
Puden heredar metodos o atrbutos de su clase padre, ej
Padre = Vehiculo
Hijo = Moto, carro, etc
Ya que todos parten de la base de vehiculos

```java
public class  Coche extends Vehiculo
```
### Polimorfismo
El polimorfismo trabaja cuando hay una herencia en la cual hereda el mismo metodo pero se modifica para cada objeto creado (cuando un objeto tiene un mismo objetivo pero diferente acción). Por ejemplo tenemos una espada ⚔️, el atrivuto del padre es atacar, pero al heredarlo, podemos seguir teniendo ese atributo en la herencia hija la cual tambien se puede modificar para atacar de formas diferentes. <br>
https://youtu.be/bblFTvuk4pY

### Encapsulamiento

Es el uso de los getters y setters para poder usar los modificadores de acceso. <br>
https://youtu.be/8aQSD36paWU


### Abstracción 
Saber elegir atributos y metodos que caracterisan de mejor manera el objeto a crear

## Clases abstractas e interfaces

**Metodo abstracto**: Es un metodo bacio, el cual no puede realizar una acción, en el cual se define que debe hacer pero no el como[🔗](https://youtu.be/I4o7fvSQvBA).

```java

//Se define la clase abstracta que no  hace nada.
package abstracto;

public abstract class Figura {
    protected double x;
    protected double y;

    protected Figura(){
        
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //Metodo abstracto
    public abstract double calclarArea();
    //si tiene contructores solo las pueden ser usados por las clases hijas (plantilla)

}
//-------------
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado, double x, double y){
        super (x, y); //referencia miebros de la super clase
        this.lado = lado;
    }



    //implemento de metodos abstractos
    @Override
    public double calclarArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
```

**Interfaces**: 



## Others

- Paquete = carpeta.
- Al establecer un dato `float` debemos colocar una "f" al final del número.

    ```java
    5.78f
    ```

- Abreviaturas: https://panamahitek.com/abreviaturas-utilizadas-en-netbeans-utilizando-la-tecla-tab/