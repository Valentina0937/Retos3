package Reto1.Salud;

import java.util.Scanner;

public class Persona {
    //Atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    //Método constructor vacío
    public Persona(){

    }
    //Métodos
    public void pedirDatos(){
        //Instanciamos la clase Scanner
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento");
        tipoDoc=leer.nextLine();
        System.out.println("Ingrese el número de documento");
        documento=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese el apellido");
        apellido=leer.nextLine();
        System.out.println("Ingrese el peso");
        peso=leer.nextDouble();
        System.out.println("Ingrese la estatura");
        estatura=leer.nextDouble();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Por favor ingrese el sexo");
        sexo=leer.nextLine();
        leer.close();
    }
    
    public void mostrarPersona(){
        System.out.println("Sus datos ingresados son: ");
        System.out.println("Tipo de documento: "+tipoDoc);
        System.out.println("Número de documento: "+documento);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
    }
    public void calcularImc(){
        double imc=peso/(estatura*estatura);
        System.out.println("El imc es "+imc);
        if(imc<20){
            System.out.println("El peso está por debajo de lo ideal");
        }
        else if(imc>=20 && imc<=25){
            System.out.println("El peso es ideal");
        }
        else if(imc>25){
            System.out.println("Tiene sobrepeso");
        }
    }
    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }
        else{
            System.out.println("Usted es menor de edad");
        }
    }

    
    
}

