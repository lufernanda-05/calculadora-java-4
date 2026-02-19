import java.util.Scanner;

/**
 *
 * @author salas
 */
public class Main2 {

    public static void main(String[] lkjh) {
        System.out.println("Inicio SUMA");
        // suma
        long num1 = leer();
        if (num1 == -1) {
            System.out.println("No es un numero,  Finaliza programa ");
            return;
        }

        long num2 = leer();
        if (num2 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }
        long resultado = sumar(num2, num1);
        imprimir(resultado);

        // multiplicacion
        System.out.println("Inicio MULTIPLICACION");
        num1 = leer();
        if (num1 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }
        num2 = leer();
        if (num2 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }
        resultado = multiplicar(num2, num1);
        imprimir(resultado);
        // divicion
        System.out.println("Inicio DIVIDIR");
        num1 = leer();
        if (num1 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }
        num2 = leer();
        if (num2 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }
        resultado = dividir(num2, num1);
        imprimir(resultado);

        System.out.println("Fin");
    }

    public static long leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero : ");
        String dato = sc.nextLine();
        sc.close();
        if (dato.isEmpty()) {
            return -1;
        } else {
            return Long.parseLong(dato);
        }

    }

    public static void imprimir(long numero) {
        System.out.println("Resultado es " + numero);
    }

    public static long sumar(long a, long b) {
        return a + b;
    }

    public static long multiplicar(long a, long b) {

        return a * b;
    }

    public static long dividir(long a, long b) {

        return a / b;
    }
}// FIN DE CLASE
