package com.mycompany.depositoagua;

public class Deposito {
    private final float capacidad = 1000.00f;
    private float volumenActual; 

    public Deposito( ) {
        this.volumenActual = 0;
    }

    public float getCapacidad() {
        return capacidad;
    }
    
    public float getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(float volumenActual) {
        this.volumenActual = volumenActual;
    }
    
    public void agregarAgua(float cantidadAgua){
        if (this.verificarDesbordamiento(cantidadAgua)== false)// LLAMADA AL MÉTODO PARA VERIFICAR DESBORDAMIENTO 
           this.setVolumenActual(this.getVolumenActual()+ cantidadAgua);
        else{
           this.setVolumenActual(cantidadAgua - this.calcularDesbordamiento(cantidadAgua));
        }
         /*   System.out.println("EL INGRESO DEL AGUA PRODUCE DESBORDAMEINTO. "
                    + " SOLO HAY ESPACIO PARA " + (this.getCapacidad()- this.getVolumenActual()) + " m3 DE AGUA"
                    + ". EL DEPOSITO ES DE MÁXIMO ES DE 1000 LITROS"); */
    }
    
    public void quitarAgua(float cantidadAgua){
        if (this.getVolumenActual()> 0 )
            this.setVolumenActual(this.getVolumenActual()- cantidadAgua);
        else
            System.out.println("NO SE PUEDE QUITAR AGUA PORQUE NO EXISTE  AGUA EN EL DEPOSITO");
        
    }
    
    public boolean verificarDesbordamiento(float cantidadAgua){
        if (this.getVolumenActual()+ cantidadAgua > this.getCapacidad())
           return true ;
       else
            return false;
        
    }
    
    public float calcularDesbordamiento(float cantidadAgua){
        float desbordamiento = 0; 
        desbordamiento = (this.getVolumenActual()+ cantidadAgua) - this.getCapacidad();
        return desbordamiento;
    }
    
    public String consultarVolumenActual(){
        return ("EL VOLUMEN ACTUAL DEL DEPOSITO ES " + this.getVolumenActual());
    }
      
}
