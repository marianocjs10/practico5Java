import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.print("Ingrese el ejercicio que desea ver:");
            opcion = new Scanner(System.in).nextInt();
            if(opcion==1){
                Ejercicio.punto1();
            } else if (opcion == 2) {
                Ejercicio.punto2();
            } else if (opcion == 3) {
                Ejercicio.punto3();
            } else if (opcion == 4) {
                Ejercicio.punto4();
            } else if (opcion == 5) {
                Ejercicio.punto5();
            }
        }while (opcion != 0);
    }
}