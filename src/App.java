public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numeros = {5, 7, 0, -1, 10, 8};
        System.out.println("Estudiante: Erika Collaguazo");
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
        
        SortSeleccion sortSeleccionAsc = new SortSeleccion();

        System.out.println("Array Original : ");
        sortSeleccionAsc.printArray(numeros);
        System.out.println("\nOrdenado Ascendente: ");
        sortSeleccionAsc.sortAscendente(numeros);
        sortSeleccionAsc.printArray(numeros);
        System.out.println("\nOrdenado Descendente: ");
        sortSeleccionAsc.sortDescendente(numeros);
        sortSeleccionAsc.printArray(numeros);

        
    }
}
