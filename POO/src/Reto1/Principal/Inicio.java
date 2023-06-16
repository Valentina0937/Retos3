package Reto1.Principal;

import Reto1.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //instanciar la clase o crear objeto
        Persona mariana=new Persona();
        //Invocar o llamar un método
        mariana.pedirDatos();
        mariana.mostrarPersona();
        mariana.mayorEdad();
        mariana.calcularImc();
    }
}
