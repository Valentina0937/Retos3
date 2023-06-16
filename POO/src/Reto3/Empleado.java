package Reto3;

import java.util.Scanner;

public class Empleado extends Persona{
    //Atributos
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    //Método constructor vacío
    public Empleado(){

    }
    //Método constructor
    public Empleado(String tipoDoc, int numeroDoc, String nombre, String apellido, String cargo, double valorHora,
            int horasTrabajadas, String departamento) {
        super(tipoDoc, numeroDoc, nombre, apellido);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    //Métodos accesores

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Métodos

    public void registrarEmpleado(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el cargo");
        cargo=leer.next();
        System.out.println("Ingrese el valor de la hora");
        valorHora=leer.nextDouble();
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas=leer.nextInt();
        System.out.println("Ingrese el departamento");
        departamento=leer.next();
        leer.close();
        

        

    }
    public double calcularHonorario(){
        double reteica=((valorHora*horasTrabajadas)*0.966)/100;
        double total=(valorHora*horasTrabajadas)-reteica;
        return total;
    }
    public void consultarEmpleado(){
        System.out.println("Cargo: "+cargo);
        System.out.println("Horas trabajadas: "+horasTrabajadas);
        System.out.println("Valor por hora: "+valorHora);
        System.out.println("Honorario: "+calcularHonorario());
    }
    
}
