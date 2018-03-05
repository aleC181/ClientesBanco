/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesbanco;

/**
 *
 * @author User
 */
public class CuentaAhorro extends CuentaCorriente {

    private double interes = 2.5;
//constructuroas

    public CuentaAhorro(Clientes c, int nc, double s, double inte) {
        super(c,nc,s);
        this.interes = inte;
    }

    public CuentaAhorro(Clientes c, int nc, double inte) {
        super(c,nc);
        this.interes = inte;
    }

    public CuentaAhorro(Clientes c, int nc) {
        super(c,nc);
    }

    public void setInteres(double inte) {
        this.interes = inte;
    }

    public double getInteres() {
        return this.interes;
    }

    public double calcularIntereses() {
        return super.getsaldo() * (1 + this.interes / 100);
    }

    public double calcularIntereses(double inte) {
        super.setSaldo(super.getsaldo()* (1 + inte / 100));
        return super.getsaldo();
    }
    public void imprimirDatosCuentaAh() {
        System.out.println("Apellido " + super.getClientes().getApellido() + " " + "nombre " + super.getClientes().getNombre() + " " + "edad " + super.getClientes().getEdad());
        System.out.println("Cuenta ahorro número: " + super.getNumC() + " " + "saldo " + super.getsaldo()+" "+"interes "+this.getInteres());
    }
}
