package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego{
     //Atributos
    private int opcion;
    private String jugador;
    private int eleccion;
    //Métodos constructores
    public Ppt(){

    }
    public Ppt(int opcion, String jugador, int eleccion) {
        this.opcion = opcion;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }
    //Instanciamos la clase Scanner
    Scanner leer=new Scanner(System.in);
    //Métodos
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        jugador=leer.nextLine();


    }
    public void jugar(){
        System.out.println("Realice su elección\n1.Piedra\n2.Papel\n3.Tijera");
        eleccion=leer.nextInt();
        Random aleatorio=new Random();
        opcion=aleatorio.nextInt(3)+1;
    }
    public void finalizar(){
        if(eleccion==1 && opcion==1 || eleccion==2 && opcion==2 || eleccion==3&&opcion==3){
            System.out.println("Empate");
        }
        else if(eleccion==1 && opcion==2){
            System.out.println("El sistema eligio papel, perdiste");
        }
        else if(eleccion==2 && opcion==3){
            System.out.println("El sistema eligió tijera, perdiste");
        }
        else if(eleccion==3 && opcion==2){
            System.out.println("El sistema eligió papel, ganaste");
        }
        else if(eleccion==3 && opcion==1){
            System.out.println("El sistema eligió piedra, perdiste");
        }
        else if(eleccion==2 && opcion==1){
            System.out.println("El sistema eligió piedra, ganaste");
        }
        else if(eleccion==1 && opcion==3){
            System.out.println("El sistema eligió tijera, ganaste");
        }
    }
    
}
