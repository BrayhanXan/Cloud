Inicio Simulador de Elecciones 

//Definición de variables
INT c1 = 0  //Hollman
    c2 = 0  //Fernando
    c3 = 0  //Daniel
    c4 = 0  //Brayhan
    c5 = 0  //Joel
    
//Mostrar lista de candidatos con sus números
Imprimir "Lista de candidatos:"
Imprimir "1. Hollman"
Imprimir "2. Fernando"
Imprimir "3. Daniel"
Imprimir "4. Brayhan"
Imprimir "5. Joel"
    
//Pedir al usuario la cantidad de simulación de votos
Leer cantidad_votos

//Comenzar a hacer la simulación del voto
Para (i = 1, i ≤ cantidad_votos, i++) hacer
    Imprimir "Para el votante " i " su voto es para (ingrese el número correspondiente al candidato):"
    Leer int voto
    
    //Contar votos para los candidatos
    si (voto == 1) entonces
        c1 = c1 + 1
    } si no (voto == 2) entonces
        c2 = c2 + 1
    } si no (voto == 3) entonces
        c3 = c3 + 1
    } si no (voto == 4) entonces
        c4 = c4 + 1
    } si no (voto == 5) entonces
        c5 = c5 + 1
    }
    fin si
fin para

//Mostrar los resultados de la simulación
Imprimir "Los resultados de la simulación son:"
Imprimir "Hollman: " + c1
Imprimir "Fernando: " + c2
Imprimir "Daniel: " + c3
Imprimir "Brayhan: " + c4
Imprimir "Joel: " + c5

//Para organizar la presentación de votos

// Definir los arreglos de candidatos y votos
candidatos = {"Hollman", "Fernando", "Daniel", "Brayhan", "Joel"}
int votos = {c1, c2, c3, c4, c5}

// Ordenar candidatos según votos

Para (i=0, i<longitud(candidatos) - 1, i++) hacer
    Para (j=i+1, j<longitud(candidatos), j++ hacer
    
    Si (votos[i] < votos[j]) entonces
        int tempV = votos[i]                // Intercambiar votos
        votos[i] = votos[j]
        votos[j] = tempV    

        cadena tempC = candidatos[i]          // Intercambiar candidatos
        candidatos[i] = candidatos[j]
        candidatos[j] = tempC
    fin si
    fin para
fin para

//Mostrar resultados finales ordenados
Imprimir "Resultados Elecciones CUN"
    Para (i=0, i < longitud(candidatos), i++) hacer
        Imprimir i+1 + " candidato" : "votos"
    Fin Para


Final
