public class SortInsercion {

    public void sortAscInsercion(int [] numeros, boolean pasos){

        for (int i = 1; i < numeros.length ; i++) {
            int j = i - 1;
            int aux = numeros[i];

            if (pasos) {
                System.out.println("i: " + i + "j: " + j + "aux: " + aux);
            }
            while (j >= 0 && aux < numeros[j]) {
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);

                numeros[j + 1] = numeros[j];

                if (pasos)
                    printArray(numeros);

                j--; 

                if (pasos)
                    System.out.println("\nMueve numeros [" + (j + i) + "] a numeros[" + (i + 2) + "]");

            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + "en la posicion " + (j + 1));
                System.out.println("Estado Actual ");
                printArray(numeros);
            }
        }
    }
    public void sortDescInsercion(int [] numeros, boolean pasos){

        for (int i = 1; i < numeros.length ; i++) {
            int j = i - 1;
            int aux = numeros[i];

            if (pasos) {
                System.out.println("i: " + i + "j: " + j + "aux: " + aux);
            }
            while (j >= 0 && aux > numeros[j]) {
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);

                numeros[j + 1] = numeros[j];

                if (pasos)
                    printArray(numeros);

                j--; 

                if (pasos)
                    System.out.println("\nMueve numeros [" + (j + i) + "] a numeros[" + (i + 2) + "]");

            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + "en la posicion " + (j + 1));
                System.out.println("Estado Actual ");
                printArray(numeros);
            }
        }
    }

    public void sortByName(String[] cadena){
        for (int i = 1; i < cadena.length ; i++) {
            int j = i - 1;
            String aux = cadena[i];

            while (j >= 0 && cadena[j].compareTo(aux) > 0) { 
                cadena[j + 1] = cadena[j];
                j--; 
            }

            cadena[j + 1] = aux;
        }
    }

    public void sortPersonaByName(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            int j = i -1;

            while (j >= 0 && personas[j].getNombre().compareTo(aux.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    public void sortPersonasByAge(Persona[] personas) {

        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getEdad() < personas[j].getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    public void printArray(int[] numeros){
        System.out.print("[");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if(i<numeros.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public void printArrayS(String[] cadena) {
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i] + " []");
        }
        System.out.println();
    }

    public void printArrayPersonas(Persona[] personas) {

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
        }
    }


}
