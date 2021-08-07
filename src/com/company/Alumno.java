package com.company;

import java.util.Date;

public class Alumno {
    private String numcarne;
    private String nombre;
    private String apellido;
    private Date DPI;
    private Date telefono;
    private String correo;
    private int indice;

       public Alumno(){
       this.indice=1;
   }
    //Constructor #2
   public Alumno(String nombre, String apellido, String numcarne, Date DPI, Date telefono, String correo){
       this.nombre=nombre;
       this.apellido=apellido;
       this.numcarne=numcarne;
       this.DPI=DPI;
       this.telefono=telefono;
       this.correo=correo;
   }

    public void realizarTareas(){
        //
    }

   public String obtenerNombre(){
       return "";
   }

   public String obtenerNumeroCarne(){
       return "";
   }

   public void establecerNombre(String parametroNombre){
        this.nombre=parametroNombre;
   }


}