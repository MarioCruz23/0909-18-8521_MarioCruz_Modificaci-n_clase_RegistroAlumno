package com.company;

public class RegistroAlumno {
    //{ Area de declaraciones}
    private String[] alumnosRegistrados;// solo se declara el vector
    private String[] alumnosInscritos;
    private int indiceVector;

    //{ Area de métodos de clase}
    public RegistroAlumno(int cantidadDeRegistros){
        //se inicializan los valores
        this.alumnosRegistrados = new String[cantidadDeRegistros];
        this.alumnosInscritos = new String[cantidadDeRegistros];
        this.indiceVector=0;
    }

    public boolean registrarAlumno(String nombreAlumno){
        // if(this.existeAlumnoRegistrado(nombreAlumno)==false){
        if(!(this.existeAlumnoRegistrado(nombreAlumno))){
            this.alumnosRegistrados[this.indiceVector]=nombreAlumno;
            this.incrementarIndice();
            return true;
        }else{
            return false;
        }
    }

    private void incrementarIndice(){
        this.indiceVector=this.indiceVector+1;
    }

    //getAlumnosRegistrados();
    public String[] obtenerAlumnosRegistrados(){
        return this.alumnosRegistrados;
    }

    public boolean existeAlumnoRegistrado(String nombreAlumno){
        for(int i=0; i<this.alumnosRegistrados.length; i++){//length devuelve el tamaño del vector
            if(this.alumnosRegistrados[i]!=null){
                //nombreAlumno==alumnosRegistrados[i] esto tambien funciona
                if(nombreAlumno.equals(this.alumnosRegistrados[i])){
                    return true;
                }
            }
        }
        return false;
    }
}
