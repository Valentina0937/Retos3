package Reto4;

import java.util.Scanner;

public class Circulo extends Figura{
    //Atributos
    private double radio;
    //Método constructor vacío
    public Circulo(){

    }
    //Método contructor con parametros
    public Circulo(int radio){
        super();
        this.radio=radio;
    }
    //Métodos accesores
    public double getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    //Métodos
    public void registrarDatos(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextDouble();
    }
    public void calcularArea(){
        double area=3.1416*(radio*radio);
        System.out.println("El área del círculo es "+area);
    }

}
