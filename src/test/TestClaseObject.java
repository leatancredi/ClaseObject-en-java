package test;

import domain.*;

public class TestClaseObject {
    public static void main(String[] args) {
        //comparacion 2 objetos
        Empleado empleado1 = new Empleado("juan" , 5000);
//        cuando usamos la palabra new referimos a espacio de memoria
        Empleado empleado2 = new Empleado("juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        
        if (empleado1.equals(empleado2)){
            System.out.println("son iguales en contenido");
        }else{
            System.out.println("los objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el hash code del contenido es el mismo");
        }else{
            System.out.println("el distitno el hash code");
        }
    }
      

           
}
