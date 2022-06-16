/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
//Trabajo Clase 16 junio 2022
public class Ejecutor2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        String nombre,apellido,identificacion;
        int edad,numeroCreditos;
        double costoCredito;
        
        boolean bandera = true;
        String cadena = "";
        
        while(bandera){
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese su identificacion: ");
        identificacion = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese su numero de creditos: ");
        numeroCreditos = sc.nextInt();
        System.out.println("Ingrese su costo de Credito: ");
        costoCredito = sc.nextDouble();
        
        EstudiantePresencial estPre = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numeroCreditos, costoCredito);
        
        estPre.calcularMatriculaPresencial();
        
        System.out.println(estPre);
        
            sc.nextLine();
            System.out.println("Si Desea Salir,PULSA la letra S");
            String opcion = sc.nextLine();
            
            if(opcion.equals("S")){
                bandera = false;
            }
        }
        System.out.printf("%s\n",cadena);
        
    }
}
