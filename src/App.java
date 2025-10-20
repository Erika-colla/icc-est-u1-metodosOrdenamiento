public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numeros = {5, 7, 0, -1, 10, 8};

        SortBubble sort = new SortBubble();

        System.out.println("Array Original : ");
        sort.printArray(numeros);
        System.out.println("\nOrdenado Ascendente: ");
        sort.sortAscendente(numeros);
        sort.printArray(numeros);
        System.out.println("\nOrdenado Descendente: ");
        sort.sortDescendente(numeros);
        sort.printArray(numeros);
        

        
    }
}
