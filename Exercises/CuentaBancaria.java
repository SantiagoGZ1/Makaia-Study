package Exercises;

public class CuentaBancaria {
    private int saldo;
    private int numAcount;

    public CuentaBancaria(int saldo, int numAcount) {
        this.saldo = saldo;
        this.numAcount = numAcount;
    }

    //ger y set
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumAcount() {
        return numAcount;
    }

    public void setNumAcount(int numAcount) {
        this.numAcount = numAcount;
    }
    //depositar
    public void depositar (int cantidad){
        saldo += cantidad;
        System.out.println("se depositó " + cantidad + "$" + " Saldo actual " + saldo);
    }
    //retirar
    public void retirar(int cantidad){
        if(saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("Se retiró: " + cantidad + "$" + " Saldo en la cuenta: " + saldo );
        }else{
            System.out.println("Error, Dinero insuficiente");
        }
    }
    public static void main(String[] args) {
        //Instancia Cueneta Bancaria
        CuentaBancaria cuenta = new CuentaBancaria(13000, 12331212);
        System.out.println("Su cuenta es: " + cuenta.getNumAcount());
        System.out.println("Su saldo es:" + cuenta.getSaldo());

        cuenta.depositar(190000);
        cuenta.retirar(20000);
        cuenta.retirar(50000000);

        System.out.println("Saldo Fina: "+ cuenta.getSaldo());
    }
}
