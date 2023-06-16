package Reto4.Principal;

import java.util.Scanner;

import Reto4.Circulo;

import Reto4.Rectangulo;
import Reto4.Trapecio;
import Reto4.Triangulo;

public class Ejecucion {
    public static void main(String[] args) {
        //Declaramos variables
        int opcion;
        int resp;
        //Instanciamos las clases
        Scanner leer=new Scanner(System.in);
        Trapecio trapecio=new Trapecio();
        Triangulo triangulo=new Triangulo();
        Rectangulo rectangulo=new Rectangulo();
        Circulo circulo=new Circulo();
        //Mostramos mensaje de bienvenida
        System.out.println("Bienvenido al programa que calcula el área de una figura");
        do{
        System.out.println("Por favor elija una opción");
        System.out.println("1.Trapecio\n2.Triangulo\n3.Rectángulo\n4.Círculo");
        opcion=leer.nextInt();
        if(opcion==1){
            trapecio.registrarDatos();
            trapecio.calcularArea();
        }
        if(opcion==2){
            triangulo.registrarDatos();
            triangulo.calcularArea();
        }
        if(opcion==3){
            rectangulo.registrarDatos();
            rectangulo.calcularArea();
        }
        if(opcion==4){
            circulo.registrarDatos();
            circulo.calcularArea();
        }
    
    
    System.out.println("¿Desea calcular otra área?\n1.Si\n2.No");
    resp=leer.nextInt();
        }
    while(resp==1);
        System.out.println("Gracias por utilizar nuestro programa");
        leer.close();
    }
    
    
}
