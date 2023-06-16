package Reto4;

import java.util.Scanner;

public class Rectangulo extends Figura {
    //Atributos
    private double base;
    private double altura;
    //Método constructor vacío
    public Rectangulo(){

    }
    //Método constructor con parametros
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    //Métodos accesores
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Métodos
    public void registrarDatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        base=leer.nextDouble();
        System.out.println("Ingrese la altura del cuadrado");
        altura=leer.nextDouble();
        leer.close();
    }
    public void calcularArea(){
        double area=base*altura;
        System.out.println("El área del rectángulo es "+area);
    }
    
}
