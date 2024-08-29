/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_prueba1p2;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_Prueba1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner(System.in);
        String palabras[]={"radar", "level", "world", "civic", "java", 
            "deified", "python", "rotor", "language", "madam", 
            "refer", "stats", "noon", "hello", "moon", 
            "wow", "racecar", "kayak", "apple", "deed" };
        int contador=0;
        
        System.out.println("Lista de Palabras:");
        
        for (int i = 0; i < 20; i++) {
            System.out.println("["+i+"]: "+palabras[contador]);
            contador++;
        }
        System.out.println("\nIngresar el tamaño de los Arreglos: ");
        int tamaño=lea.nextInt();
        
        String[] ArregloA=new String[tamaño];
        String[] ArregloB=new String[tamaño];
        
        System.out.println("\nLista Palabras Palindroma arreglo A:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("[" + i + "]: ");
            ArregloA[i] = lea.next();
        }
        System.out.println("\nLista Palabras Palindroma arreglo B:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("[" + i + "]: ");
            ArregloB[i] = lea.next();
        }
        System.out.println("\nPalabras del Arreglo A que no están en el Arreglo B son:");
        for (int i = 0; i < tamaño; i++) {
            boolean found = false;
            for (int j = 0; j < tamaño; j++) {
                if (ArregloA[i]==(ArregloB[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("[" + i + "]: " + ArregloA[i]);
            }
        }
        }
    }
    

