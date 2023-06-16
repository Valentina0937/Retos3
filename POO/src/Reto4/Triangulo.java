package Reto4;

import java.util.Scanner;

public class Triangulo extends Figura{
    //Atributos
    private double base;
    private double altura;

    //Método constructor vacío
    public Triangulo(){

    }
    //Método constructor con parametros
    public Triangulo(double base,double altura){
        super();
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
        System.out.println("Ingrese la base");
        base=leer.nextInt();
        System.out.println("Ingrese la altura");
        altura=leer.nextDouble();
    }
    public void calcularArea(){
        double area=(base*altura)/2;
        System.out.println("El área del triangulo es "+area);
        
    }
}
