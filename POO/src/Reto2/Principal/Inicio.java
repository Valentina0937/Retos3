package Reto2.Principal;

import Reto2.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //instanciar la clase o crear objeto
        Persona mariana=new Persona();
        //Invocar o llamar un método
        mariana.pedirDatos();
        mariana.mostrarPersona();
        mariana.mayorEdad();
        String imc=mariana.calcularImc();
        if (imc.equals("Pesobajo")) {
            System.out.println("Su IMC indica que tiene peso bajo.");
        } else if (imc.equals("Pesoideal")) {
            System.out.println("Su IMC indica que tiene peso ideal.");
        } else if (imc.equals("Sobrepeso")) {
            System.out.println("Su IMC indica que tiene sobrepeso.");
        }

    }
    
}
