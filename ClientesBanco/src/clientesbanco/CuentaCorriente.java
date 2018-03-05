package clientesbanco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CuentaCorriente {

    private Clientes titular;
    private int numeroCuenta;
    private double saldo;
    //constructoras 

    public CuentaCorriente(Clientes cli, int numC, double s) {
        this.titular = cli;
        this.numeroCuenta = numC;
        this.saldo = s;
    }

    public CuentaCorriente(Clientes cli, int numC) {
        this.titular = cli;
        this.numeroCuenta = numC;
        this.saldo = 0;
    }
    //metodos

    public void setCliente(Clientes c) {
        this.titular = c;
    }

    public Clientes getClientes() {
        return this.titular;
    }

    public void setNumC(int nc) {
        this.numeroCuenta = nc;
    }

    public int getNumC() {
        return this.numeroCuenta;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public double depositar(double d) {
        return this.saldo += d;
    }

    public double extraer(double e) {
        if (this.saldo < e) {
            this.saldo = 0;
            return this.saldo;
        } else {
            return this.saldo -= e;
        }
    }

    public void imprimirDatosCuenta() {
        System.out.println("Apellido " + this.titular.getApellido() + " " + "nombre " + this.titular.getNombre() + " " + "edad " + this.titular.getEdad());
        System.out.println("Cuenta Corriente número: " + this.numeroCuenta + " " + "saldo " + this.saldo);
    }

    public boolean igual(CuentaCorriente cc) {
        return (this.numeroCuenta == (cc.numeroCuenta));
    }

}
