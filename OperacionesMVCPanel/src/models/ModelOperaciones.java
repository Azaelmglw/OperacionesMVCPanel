package models;

/**
 *
 * @author Azael_Mendoza
 */
public class ModelOperaciones {
    private double numero_1 = 6.0;
    private double numero_2 = 6.0;
    private double resultado = 6.0;
    
    public double getNumero_1(){
        return numero_1;
    }
    
    public double getNumero_2(){
        return numero_2;
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public void setNumero_1(double numero_1){
        this.numero_1 = numero_1;
    }
    
    public void setNumero_2(double numero_2){
        this.numero_2 = numero_2;
    }
    
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    
    public void Sumar(){
        resultado = numero_1 + numero_2;
    }
    
    public void Restar(){
        resultado = numero_1 - numero_2;
    }
    
    public void Multiplicar(){
        resultado = numero_1 * numero_2;
    }
    
    public void Dividir(){
        resultado = numero_1 / numero_2;
    }
    
}