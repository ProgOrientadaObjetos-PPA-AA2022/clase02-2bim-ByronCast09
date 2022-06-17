/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

public class Ejecutor2 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numeroCreditos = 5;
        double costoCredito = 50.26;
        
        EstudiantePresencial estPre = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numeroCreditos, costoCredito);
        
        estPre.calcularMatriculaPresencial();
        System.out.println(estPre);
    }
}
