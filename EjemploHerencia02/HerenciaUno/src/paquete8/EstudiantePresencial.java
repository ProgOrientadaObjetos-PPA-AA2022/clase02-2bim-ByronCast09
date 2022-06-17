/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

/**
 *
 * @author USUARIO 2020
 */

    public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numeroCre, double costoCre){
        super(ap, iden, e);
        establecerNombresEstudiante(n);
        numeroCreditos = numeroCre;
        costoCredito = costoCre;
    }
    
    
    @Override
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom.toLowerCase();  
    }
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Numero de Credito: %d\n"
                + "Costo Credito: %.2f\n"
                + "Total Matricula Presencial: %.2f\n",
                nombresEstudiante,
                obtenerApellidoEstudiante(), // apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }

}

