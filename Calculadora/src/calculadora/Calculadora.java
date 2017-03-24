/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author estudiantes
 */
public class Calculadora {
    
    double numero1,numero2,resultado;
    
    public double sumar(){
    double suma;
    suma=numero1+numero2;
    return suma;
    }
    public Double restar(){
        
    double resta;
    resta=numero1-numero2;
    return resta;
      
    }
    public Double multiplicar(){
        
    double multiplicacion;
    multiplicacion=numero1*numero2;
    return multiplicacion;
    }
    public Double dividir(){
    double division;
        division=numero1/numero2;
    return division;
    }    
    
   public Double Seno()
   {
       double x;
       x= Math.toRadians(this.numero1);
       resultado= Math.sin(x);
       return resultado;
   }
   public Double Coseno()
   {
    double x;
       x= Math.toRadians(this.numero1);
       resultado= Math.cos(x);
       return resultado;
   }
   public Double Tangente()
   {
    double x;
       x= Math.toRadians(this.numero1);
       resultado= Math.tan(x);
       return resultado;
   }
}

