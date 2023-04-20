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
Para (i = 1, i ≤ cantidad_votos, i++) {
    Imprimir "Para el votante " i " su voto es para (ingrese el número correspondiente al candidato):"
    Leer int voto
    
    //Contar votos para los candidatos
    si (voto == 1) {
        c1 = c1 + 1
    } si no (voto == 2) {
        c2 = c2 + 1
    } si no (voto == 3) {
        c3 = c3 + 1
    } si no (voto == 4) {
        c4 = c4 + 1
    } si no (voto == 5) {
        c5 = c5 + 1
    }
    }fin si
}fin para

//Mostrar los resultados de la simulación
Imprimir "Los resultados de la simulación son:"
Imprimir "Hollman: " + c1
Imprimir "Fernando: " + c2
Imprimir "Daniel: " + c3
Imprimir "Brayhan: " + c4
Imprimir "Joel: " + c5

//Organizar candidatos de mayor a menor votación

Imprimir "Resultados Elecciones CUN"

Final
