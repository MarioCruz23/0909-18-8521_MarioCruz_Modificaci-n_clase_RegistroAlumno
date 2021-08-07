package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        RegistroAlumno registros = new RegistroAlumno(10);
        Scanner entredaDeTeclado = new Scanner(System.in);
        int opcion=0;
        do {
          opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione las siguientes opciones: \n"+
                  "1. Registrar alumno: \n"+
                  "2. Mostrar alumno: \n"+
                  "3. Mofificar datos de alumno\n"));
        switch(opcion){
        case 1: 
        System.out.println("Ingresar nombre  y apellido del alumno a registrar");
        String nombreAlumno = entredaDeTeclado.nextLine();
        System.out.println("Ingresar DPI del alumno a registrar");
        String DPIAlumno;
        DPIAlumno = entredaDeTeclado.nextLine();
        System.out.println("Ingresar telefono del alumno a registrar");
        String telefonoAlumno;
        telefonoAlumno = entredaDeTeclado.nextLine();
        System.out.println("Ingresar correo del alumno a registrar");
        String correoAlumno;
        correoAlumno = entredaDeTeclado.nextLine();
        //Numero aleatorios para el carne del alumno
        int a = (int) (Math.random()*10 +1);
        int b = (int) (Math.random()*10 +1);
        int c = (int) (Math.random()*10 +1);
        int d = (int) (Math.random()*10 +1);
        int e = (int) (Math.random()*10 +1);
        int f = (int) (Math.random()*10 +1);
        int g = (int) (Math.random()*10 +1);
        int h = (int) (Math.random()*10 +1);
        int i = (int) (Math.random()*10 +1);
        int j = (int) (Math.random()*10 +1);
        System.out.println("El carne del alumno es :");
        System.out.println(""+a+""+b+""+c+""+d+""+e+""+f+""+g+""+h+""+i+""+j+"");
        if(registros.registrarAlumno(nombreAlumno)==true){
            System.out.println("Alumno registrado exitosamente");
        }else{
            System.out.println("El alumno ya está registrado");
        }
        System.out.println("Ingresar nombre del alumno a registrar");
        String nombreAlumno2 = entredaDeTeclado.nextLine();
        System.out.println("Ingresar DPI del alumno a registrar");
        String DPIAlumno2;
        DPIAlumno2 = entredaDeTeclado.nextLine();
        System.out.println("Ingresar telefono del alumno a registrar");
        String telefonoAlumno2;
        telefonoAlumno2 = entredaDeTeclado.nextLine();
        System.out.println("Ingresar correo del alumno a registrar");
        String correoAlumno2;
        correoAlumno2 = entredaDeTeclado.nextLine();
        //Numero aleatorios para el carne del alumno
        int a1 = (int) (Math.random()*10 +1);
        int b1 = (int) (Math.random()*10 +1);
        int c1 = (int) (Math.random()*10 +1);
        int d1 = (int) (Math.random()*10 +1);
        int e1 = (int) (Math.random()*10 +1);
        int f1 = (int) (Math.random()*10 +1);
        int g1 = (int) (Math.random()*10 +1);
        int h1 = (int) (Math.random()*10 +1);
        int i1 = (int) (Math.random()*10 +1);
        int j1 = (int) (Math.random()*10 +1);
        System.out.println("El carne del alumno es :");
        System.out.println(""+a1+""+b1+""+c1+""+d1+""+e1+""+f1+""+g1+""+h1+""+i1+""+j1+"");
        if(registros.registrarAlumno(nombreAlumno2)==true){
            System.out.println("Alumno registrado exitosamente");
        }else{
            System.out.println("El alumno ya está registrado");
        }
        break;
        case 2: 
        String[] vector = registros.obtenerAlumnosRegistrados();
        System.out.println("Lista de Alumnos Registrados " + '\n');
        for (String vector1 : vector) {
            //if(vector[i]!=null) // otra forma de escribirlo
            if (!(vector1 == null)) {
                //se valida si el registro no es nulo
                System.out.println(vector1);
            }
        }; break;
        case 3: Modificar(); break;
        default: JOptionPane.showMessageDialog(null,"Opcion no validad\n", "Error",JOptionPane.WARNING_MESSAGE);
        }
        }while (opcion!=3);
        }   
    public static void Modificar(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Modicar alumno: \n"+
                "Eliga 0 o 1"));//Como solo se crearon 2 vectores el cual son vector0 y vector1 se tiene que agregar 0 o 1
        int vector = 0;
    if (vector >= 2){
        JOptionPane.showInputDialog(null,"Eligio incorrectamente");
        Modificar();
    } 
    else{
        vector = Integer.parseInt(JOptionPane.showInputDialog("Nuevo dato del alumno: "));
        } 
    }
}