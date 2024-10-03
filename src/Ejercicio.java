import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio {
    public static void punto1() {
        System.out.print("""
                ►Algoritmos de ordenamiento◄
                
                    ►Ordenamiento por inserción:
                    Inicialmente se tiene un solo elemento, que por defecto es
                    un conjunto ordenado. Después, cuando hay 'k' elementos ordenados de menor a
                    mayor, se toma el elemento 'k+1' y se compara con todos los elementos ya
                    ordenados, deteniéndose cuando se encuentra un elemento menor o cuando ya
                    no se encuentran elementos. En este punto se inserta el elemento k+1 debiendo
                    desplazarse los demás elementos.
                
                    ►Algoritmo de la burbuja:
                    Este algoritmo consiste en comparar cada elemento de la lista con el siguiente (por
                    parejas), si no están en el orden correcto, se intercambian entre sí sus valores. El
                    valor más pequeño flota hasta el principio de la lista como si fuera una burbuja.
                    Se recorrerá la lista intercambiando elementos desordenados hasta que no se encuentre
                    ninguno más fuera de orden.
                
                    ►Ordenamiento por selección:
                    Inicialmente se recorre toda la lista buscando el
                    menor de todos los elementos, una vez terminada la recorrida, el menor elemento
                    se coloca al inicio de la lista recorrida. En la siguiente iteración se recorre
                    nuevamente la lista pero comenzando en el segundo elemento. El
                    procedimiento continúa hasta que el último elemento recorrido es el menor de su
                    subconjunto.
                
                    ►Algoritmo quick-sort:
                    Elije un elemento de la lista de elementos a ordenar(pivote).
                    Luego resitua los demás elementos de la lista a cada lado del pivote, de manera que a
                    un lado queden todos los menores que él, y al otro los mayores.
                    En este momento, el pivote ocupa el lugar que le corresponderá en la lista ordenada y
                    la lista queda separada en dos sublistas, una formada por los elementos a la
                    izquierda del pivote, y otra por los elementos a su derecha.
                    Se repite este proceso de forma recursiva para cada sublista mientras éstas
                    contengan más de un elemento. Una vez terminado este proceso todos los
                    elementos estarán ordenados.
                
                ►Algoritmos de busqueda◄
                
                    ►Búsqueda secuencial:
                    Este algoritmo busca el elemento dado, recorriendo secuencialmente la lista desde
                    un elemento al siguiente, comenzando en la primera posición de la lista y se
                    detiene cuando encuentra el elemento buscado o bien se alcanza el final de la lista
                    sin haberlo encontrado.
                
                    ►Búsqueda Binaria:
                     Se utiliza cuando disponemos de una lista ordenada.
                     Primero, se define el valor del índice izquierdo, derecho y del medio, de la
                     siguiente forma: Índice izq = 0;
                                      Índice der = Longitud de la lista inicial -1
                                      Índice medio = (izq + der) / 2
                     A partir de la definición de estos índices, el siguiente paso es preguntar si en la
                     posición del medio se encuentra el elemento buscado. Si devuelve verdadero, entonces
                     la búsqueda finaliza. Si devuelve falso, entonces pregunta si el valor de la
                     lista en la posición medio es mayor o menor al valor buscado, para así saber si el
                     segmento que nos interesa es del medio hacia la izquierda o del medio hacia la derecha.
                     Luego vuelve a realizar el procedimiento descripto, pero considerando sólo el segmento
                     que nos interesa, que será cada vez mas chico, hasta determinar si el elemento existe
                     o no dentro de la lista.
                
                ►Algoritmos de Recorrido◄
                
                    ►Recorrido en profundidad:
                     El proceso exige un camino desde el nodo raız a través de un hijo, al descendiente
                     más lejano del primer hijo antes de proseguir a un segundo hijo. En otras palabras,
                     todos los descendientes de un hijo se procesan antes del siguiente hijo.
                     Para saber cómo regresarnos, va guardando los nodos visitados en una estructura de pila.
                
                     ►Recorrido en profunidad:
                     El proceso se realiza horizontalmente desde la raıź a todos sus hijos, a continuación,
                     a los hijos de sus hijos y así ́ sucesivamente hasta que todos los nodos han sido
                     procesados. En otras palabras, cada nivel se procesa totalmente antes de que comience
                     el siguiente nivel. Para poder saber qué vértices visitar, utilizamos una cola.
                """);
    }

    public static int[] A = {7, 2, 3, 1};
    public static int[] original={7, 2, 3, 1};
    public  static String [] nombre1 = {"juan","pedro","roberto","jose"};
    public static void punto2() {
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Elija el algoritmo fundamental que desea:\n" +
                    "1- Insercion\n" +
                    "2- Burbuja\n" +
                    "3- Seleccion\n" +
                    "4- Busqueda Secuencial\n" +
                    "0- Salir");
            opcion = new Scanner(System.in).nextInt();

            if (opcion == 1) {
                //Ordenamiento por inserción
                resetearLista();
                System.out.println("Array original: "+Arrays.toString(A));
                insercion();
                System.out.println(Arrays.toString(A));
            } else if (opcion == 2) {
                //Algoritmo de la burbuja
                resetearLista();
                System.out.println("Array original: "+Arrays.toString(A));
                burbuja();
                System.out.println("Array original: "+Arrays.toString(A));
            } else if (opcion == 3) {
                //Ordenamiento por selección
                resetearLista();
                System.out.println("Array original: "+Arrays.toString(A));
                seleccion();
                System.out.println(Arrays.toString(A));
            } else if (opcion == 4) {
                //Búsqueda secuencial
                System.out.println("Lista de nombres: "+Arrays.toString(nombre1));
                busquedaSecuencial();
            }
        }
    }
    public static void resetearLista(){
        A= Arrays.copyOf(original, original.length);
    }
    public static void insercion() {
        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > valor) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = valor;
        }
    }
    public static void burbuja() {
        int n = A.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (A[i - 1] > A[i]) {
                    int aux = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado == true);
    }
    public static void seleccion() {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minimo]) {
                    minimo = j;
                }
            }
            int aux = A[minimo];
            A[minimo] = A[i];
            A[i] = aux;
        }
    }
    public static void busquedaSecuencial() {
        int n = nombre1.length;
        boolean seEncontro = false;
        System.out.println("Ingrese el nombre que desea buscar:");
        String nombre=new Scanner(System.in).nextLine();
        for(int i=0; i<n; i++){
            if(nombre1[i].equals(nombre)){
                System.out.println("Nombre encontrado");
                seEncontro=true;
            }
        }
        if(!seEncontro){
            System.out.println("No se encontro.");
        }
    }



    public static void punto3(){
        int[] A = {5,2,9,1,5,6}; String[] L= {"juan","pedro","roberto","jose"}; String a = "pedro";
        System.out.println("Ingrese ASC o DESC");
        String orden= new Scanner(System.in).nextLine();
        insercionAscDesc(A, orden);
        burbujaAscDesc(A, orden);
        seleccionAscDesc(A, orden);
    }
    public static void insercionAscDesc(int[] A, String orden) {
        if(orden.equals("ASC")){
            for (int i = 1; i < A.length; i++) {
                int valor = A[i];
                int j = i - 1;
                while (j >= 0 && A[j] > valor) {
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = valor;
            }
            System.out.println("Insercion ASC: "+Arrays.toString(A));
        } else if (orden.equals("DESC")) {
            for (int i = 1; i < A.length; i++) {
                int valor = A[i];
                int j = i - 1;
                while (j >= 0 && A[j] < valor) {
                    A[j + 1] = A[j];
                    j--;
                }
                A[j + 1] = valor;
            }
            System.out.println("Insercion DESC: "+Arrays.toString(A));
        } else {
            punto3();
        }

    }
    public static void burbujaAscDesc(int[]A, String orden){
        if(orden.equals("ASC")){
            int n = A.length;
            boolean intercambiado;
            do {
                intercambiado = false;
                for (int i = 1; i < n; i++) {
                    if (A[i - 1] > A[i]) {
                        int aux = A[i - 1];
                        A[i - 1] = A[i];
                        A[i] = aux;
                        intercambiado = true;
                    }
                }
            } while (intercambiado == true);
            System.out.println("Burbuja ASC: "+Arrays.toString(A));
        } else if (orden.equals("DESC")) {
            int n = A.length;
            boolean intercambiado;
            do {
                intercambiado = false;
                for (int i = 1; i < n; i++) {
                    if (A[i - 1] < A[i]) {
                        int aux = A[i - 1];
                        A[i - 1] = A[i];
                        A[i] = aux;
                        intercambiado = true;
                    }
                }
            } while (intercambiado == true);
            System.out.println("Burbuja DESC: "+Arrays.toString(A));
        }else {
            punto3();
        }
    }
    public static void seleccionAscDesc(int[]A, String orden){
        if(orden.equals("ASC")){
            int n = A.length;
            for (int i = 0; i < n - 1; i++) {
                int minimo = i;
                for (int j = i + 1; j < n; j++) {
                    if (A[j] < A[minimo]) {
                        minimo = j;
                    }
                }
                int aux = A[minimo];
                A[minimo] = A[i];
                A[i] = aux;
            }
            System.out.println("Selección ASC: "+Arrays.toString(A));
        } else if (orden.equals("DESC")) {
            int n = A.length;
            for (int i = 0; i < n - 1; i++) {
                int minimo = i;
                for (int j = i + 1; j < n; j++) {
                    if (A[j] > A[minimo]) {
                        minimo = j;
                    }
                }
                int aux = A[minimo];
                A[minimo] = A[i];
                A[i] = aux;
            }
            System.out.println("Selección DESC: "+Arrays.toString(A));
        } else {
            punto3();
        }
    }



    public static void punto4(){
        System.out.println("Indique como desea ordenar el array: ASC o DESC");
        String orden=new Scanner(System.in).nextLine();
        System.out.println("Indique que metodo de ordenamiento desea utilizar:\n"+
                "1)insercion\n"+
                "2)burbuja\n"+
                "3)seleccion");
        int metodo=new Scanner(System.in).nextInt();
        if(metodo==1){
            insercionAscDesc(cargarArray(), orden);
        } else if (metodo==2) {
            burbujaAscDesc(cargarArray(), orden);
        } else if (metodo==3) {
            seleccionAscDesc(cargarArray(), orden);
        }else{
            punto4();
        }
    }
    public static int[] cargarArray(){
        int [] array= new int[20];
        for(int i=0; i<20; i++) {
            System.out.println("Ingrese 20 numeros enteros- "+(i+1)+"°: ");
            int numero = new Scanner(System.in).nextInt();
            array[i]=numero;
        }
        return array;
    }



    public static void punto5(){
        System.out.println("Ingrese la cantidad de filas, igual o mayor a 2:");
        int X = new Scanner(System.in).nextInt();
        System.out.println("Ingrese la cantidad de columnas, igual o mayor a 2:");
        int Y = new Scanner(System.in).nextInt();
        if(X>=2 && Y>=2){
            int [][]arreglo= crearArreglo(X,Y);
            int promedio = calcularPromedio(arreglo, X, Y);
            System.out.println("El promedio entero es: "+promedio);
            buscarPromedio(arreglo, promedio,X, Y);
        }else{
            punto5();
        }
    }
    public static int[][] crearArreglo(int X, int Y){
        int [][] arreglo = new int[X][Y];
        for(int i =0; i< X; i++){
            for(int j=0; j< Y; j++){
                System.out.println("Ingrese un entero para la celda: "+i+","+j+": ");
                arreglo[i][j]=new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Arreglo ingresado: ");
        for(int i=0;i<X;i++){
            for(int j=0;j<Y;j++){
                System.out.print(arreglo[i][j]+" ");
            }
            System.out.println();
        }
        return arreglo;
    }
    public static int calcularPromedio(int [][] arreglo, int X, int Y){
        int suma=0;
        for(int i=0; i<X; i++){
            for(int j=0; j<Y; j++){
                suma += arreglo[i][j];
            }
        }
        return suma / (X*Y);
    }
    public static void buscarPromedio(int[][] arreglo, int promedio,int X, int Y){
        boolean encontrado=false;
        for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    if (arreglo[i][j] == promedio) {
                        System.out.println("El valor "+promedio+" se encuentra en la posición con índice "+i+","+j);
                        encontrado=true;
                    }
                }
            }
        if(!encontrado) {
            System.out.println("Valor no encontrado.");
        }
    }
}
