package Reto3;

import java.util.Scanner;

public class Persona {

    //Atributos
    private String tipoDoc;
    private int numeroDoc;
    private String nombre;
    private String apellido;

    //Metódo constructor vacio
    public Persona(){

    }
    //Método constructor con parámetros
    public Persona(String tipoDoc, int numeroDoc, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Métodos accesores
    //Getters y Setters
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Métodos
    public void registarPersona(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento");
        tipoDoc=leer.next();
        System.out.println("Ingrese el número de documento");
        numeroDoc=leer.nextInt();
        System.out.println("Ingrese los nombres");
        nombre=leer.next();
        System.out.println("Ingrese los apellidos");
        apellido=leer.next();
        

    }
    
    public void consultarPersona(){
        System.out.println("Tipo de documento: "+tipoDoc);
        System.out.println("Número de documento: "+numeroDoc);
        System.out.println("Nombres: "+nombre);
        System.out.println("Apellidos: "+apellido);   
    }
    
    
}
