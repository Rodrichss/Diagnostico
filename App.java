import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opc=0;
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar a la lista");
            System.out.println("2. Eliminar de la lista");
            System.out.println("3. Buscar en la lista");
            System.out.println("0. Salir del programa");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Introduzca el número a agregar: ");
                    
                    lista.agregar();
                    break;
                case 2:
                    lista.eliminar();
                    break;
                case 3:
                    lista.buscar();
                    break;
                case 0:
                default:
                    break;
            }
        }while(opc!=0);
    }
}
