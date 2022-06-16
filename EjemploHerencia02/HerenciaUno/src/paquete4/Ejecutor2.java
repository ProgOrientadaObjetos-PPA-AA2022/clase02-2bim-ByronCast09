/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[]args){
        
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial estP = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        estP.establecerNumeroCreditos(56);
        estP.establecerCostoCredito(465.3);
        estP.calcularMatriculaPresencial();
        System.out.println(estP);
    }
}
