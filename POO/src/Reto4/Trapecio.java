package Reto4;

import java.util.Scanner;

public class Trapecio extends Figura {
    //Atributos
    private double baseMenor;
    private double baseMayor;
    private double altura;

    //Método contructor vacío
    public Trapecio(){

    }
    //Método constructor on parametros

    public Trapecio(double baseMenor, double baseMayor, double altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
    }
    //Método accesores

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Métodos
    public void registrarDatos(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la base menor del trapecio");
        baseMenor=leer.nextDouble();
        System.out.println("Ingrese la base mayor del trapecio");
        baseMayor=leer.nextDouble();
        System.out.println("Ingrese la altura del trapecio");
        altura=leer.nextDouble();

    }
    public void calcularArea(){
        double area=((baseMayor+baseMenor)/2)*altura;
        System.out.println("EL área del trapecio es: "+area);
    }
    
}
