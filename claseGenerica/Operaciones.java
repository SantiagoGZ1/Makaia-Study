package claseGenerica;

//Clase generica que recibe un tipo generico "N"
//limitado a tipos numericos
public class Operaciones <N extends Number>{
   //Operaciones
   double suma(N numero){
    return numero.doubleValue() + 2; 
   } 
   double resta(N numero){
    return numero.doubleValue() - 2; 
   } 
   double multiplicacion(N numero){
    return numero.doubleValue() * 2; 
   } 
   double division(N numero){
    return numero.doubleValue() / 2; 
   }
   //todas las operaciones se realizan con el mismo número (N)
}
