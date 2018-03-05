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
public class TestBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //creación de clientes instanciados
    Clientes cli1=new Clientes();
    Clientes cli2=new Clientes();
    cli1.setApellido("Lopez");
    cli1.setNombre("Benicio");
    cli1.setEdad(35);
    cli2.setApellido("Palacio");
    cli2.setNombre("Ana");
    cli2.setEdad(40);
    //creación de cuentas corrientes
    CuentaCorriente cc1=new CuentaCorriente(cli1,235,30535);
    CuentaCorriente cc2=new CuentaCorriente(cli2,238);
      
    //creación de cajas de ahorro
    CuentaAhorro ca1=new CuentaAhorro(cli1,23511,2300,5.5);
    CuentaAhorro ca2=new CuentaAhorro(cli2,23811,4.5);
    CuentaAhorro ca3=new CuentaAhorro(cli2,23812);
    //impresión de datos de las cuentas
    cc1.imprimirDatosCuenta();
    cc2.imprimirDatosCuenta();
    ca1.imprimirDatosCuentaAh();
    ca2.imprimirDatosCuentaAh();
    ca3.imprimirDatosCuentaAh();
    //comparación de las cuentas
    System.out.println("Las cuentas corrientes son iguales "+cc1.igual(cc2));
    System.out.println("Las cajas de ahorro 1 2 son iguales "+ca1.igual(ca2));
    System.out.println("Las cajas de ahorro 1 3 son iguales "+ca1.igual(ca2));
    System.out.println("Las cajas de ahorro 2 3 son iguales "+ca2.igual(ca3));
    CuentaAhorro ca4=new CuentaAhorro(cli1,23511,2300,5.5);
    ca4.imprimirDatosCuentaAh();
    System.out.println("Las cajas de ahorro 1 4 con iguales "+ca1.igual(ca4));
    //calculo de intereses
    ca1.calcularIntereses(15.5);
    System.out.println("se calculan intereses en la caja de ahorro "+ca1.getNumC());
    ca1.imprimirDatosCuentaAh();
    
  }
    }
    

