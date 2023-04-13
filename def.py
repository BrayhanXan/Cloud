candidatos = ["Hollman", "Fernando", "Daniel", "Brayahn", "Joel"]
votos = [0, 0, 0, 0, 0]

n = int(input("Ingrese el número de estudiantes que van a votar (máximo 20): "))
if n > 20: # Si el número de estudiantes es mayor a 20, se limita a 20
    n = 20

for i in range(1, n+1):
    print("Candidatos:")
    for j in range(1, 6):
        print(j, ".", candidatos[j-1])

    voto = int(input("Estudiante " + str(i) + ", ingrese el número del candidato por el que quiere votar: "))
    votos[voto-1] = votos[voto-1] + 1

clasificacion = ordenar_por_votos(candidatos, votos)

print("Resultados de la emulación:")
for i in range(1, 6):
    print(i, ".", clasificacion[i-1], ": ", votos[clasificacion[i-1]], " votos")

def ordenar_por_votos(candidatos, votos):
    orden = [1, 2, 3, 4, 5]
    for i in range(0, 4):
        for j in range(i+1, 5):
            if votos[orden[i]-1] < votos[orden[j]-1]:
                orden[i], orden[j] = orden[j], orden[i]
    return orden
