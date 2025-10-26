public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("\nEstudiante: Erika Collaguazo");
        /* 
        SortBubble sort = new SortBubble();

        System.out.println("Array Original : ");
        sort.printArray(numeros);
        System.out.println("\nOrdenado Ascendente: ");
        sort.sortAscendente(numeros);
        sort.printArray(numeros);
        System.out.println("\nOrdenado Descendente: ");
        sort.sortDescendente(numeros);
        sort.printArray(numeros);
        */
        
        /*SortSeleccion sortSeleccionAsc = new SortSeleccion();

        System.out.println("Array Original : ");
        sortSeleccionAsc.printArray(numeros);
        System.out.println("\nOrdenado Ascendente: ");
        sortSeleccionAsc.sortAscendente(numeros);
        sortSeleccionAsc.printArray(numeros);
        System.out.println("\nOrdenado Descendente: ");
        sortSeleccionAsc.sortDescendente(numeros);
        sortSeleccionAsc.printArray(numeros); */

        SortInsercion ascIns = new SortInsercion();

        System.out.println("Array Original : ");
        ascIns.printArray(numeros);
        System.out.println("\nOrdenado Ascendente: ");
        ascIns.sortAscInsercion(numeros, false);
        ascIns.printArray(numeros);
        System.out.println("\nOrdenado Descendente");
        ascIns.sortDescInsercion(numeros, false);
        ascIns.printArray(numeros);
        System.out.println();

        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};

        System.out.println("\nEstudiante: Erika Collaguazo");
        System.out.println("Array de Nombres Original:");
        ascIns.printArrayS(nombres);
        System.out.println("Ordenado por Nombre:");
        ascIns.sortByName(nombres);
        ascIns.printArrayS(nombres);

        Persona [] personas = new Persona[] {
            new Persona ("Pedro", 3),
            new Persona("Ana", 25),
            new Persona ("Maria", 28),
            
        };

        System.out.println("\nEstudiante: Erika Collaguazo");
        System.out.println("Array de Personas Original:"); 
        ascIns.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Nombre de Personas:");
        ascIns.sortPersonaByName(personas);
        ascIns.printArrayPersonas(personas) ; 


        System.out.println("\nEstudiante: Erika Collaguazo");
        System.out.println("Array de Personas Original:"); 
        ascIns.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Edad de Personas:");
        ascIns.sortPersonasByAge(personas) ; 
        ascIns.printArrayPersonas (personas);

        
    }
}
