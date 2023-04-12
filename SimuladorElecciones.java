/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladorelecciones;

import java.util.Random;

/**
 *
 * @author Joel Vargas
 */
public class SimuladorElecciones {
    
    public static void main(String[] args) {
        String[] candidatos = {"Hollman", "Fernando", "Daniel", "Brayhan", "Joel"};
        int[] votos = new int[candidatos.length];
        int numVotos = 20; 
        
        Random rand = new Random();
        
        System.out.println("Simulación de Elecciones Estudiantiles con " + numVotos + " votos:");
        for (int i = 0; i < numVotos; i++) {
            int candidatoVotado = rand.nextInt(candidatos.length); // Generar un número aleatorio para los candidatos en el arreglo
            votos[candidatoVotado]++; // Aumentar en 1 el contador de votos del candidato correspondiente
        }
        
        // Ordenación de los candidatos de acuerdo a la cantidad de votos
        for (int i = 0; i < candidatos.length - 1; i++) {
            for (int j = i + 1; j < candidatos.length; j++) {
                if (votos[i] < votos[j]) {
                    int ordVotos = votos[i];
                    votos[i] = votos[j];
                    votos[j] = ordVotos;
                    String ordCandidato = candidatos[i];
                    candidatos[i] = candidatos[j];
                    candidatos[j] = ordCandidato;
                }
            }
        }
        // Mostrar el resultado
        System.out.println("Resultados Elecciones Universidad:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i+1) + ". " + candidatos[i] + " " + votos[i]);
        }
    }
}
