from sortSeleccion import SortSeleccion

def main():
    numero = [5, 2, 9, 1, 5, 6,]
    print('Estudiante: Erika Collaguazo')
    print("Original", numero)
    
    ## Instanciar la clase
    seleccion = SortSeleccion()
    seleccion.sort_ascendente(numero)
    print("Ordenado Asc: ", numero)
    seleccion.sort_descendente(numero)
    print("Ordenado Desc: ", numero)

if __name__ == "__main__":
    main()