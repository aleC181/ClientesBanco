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
public class Clientes {
   private String apellido;
   private String nombre;
   private int edad;
   
   //constructores
   
   
   //metodos
  public void setApellido(String ape){
      this.apellido=ape;
  }
  public String getApellido(){
      return this.apellido;
  }
  public void setNombre(String nomb){
      this.nombre=nomb;
  }
  public String getNombre(){
      return this.nombre;
  }
  public void setEdad(int ed){
      this.edad=ed;
  }
  public int getEdad(){
      return this.edad;
  }
  
}
