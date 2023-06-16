package Reto3;

public class Ejecucion {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ al programa");
    //Instanciamos la clase empleado
    Empleado pepe=new Empleado();
    //Invocar el método
    pepe.registarPersona();
    pepe.registrarEmpleado();
    pepe.consultarPersona();
    pepe.consultarEmpleado();
    pepe.calcularHonorario();
    }
    
    
}
