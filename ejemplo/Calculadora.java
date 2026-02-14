package ejemplo;

// Clase principal que maneja la logica de la calculadora y la interacción con el usuario
import java.util.Scanner;

public class Calculadora {
    private Operaciones operaciones;

    public Calculadora() {
        this.operaciones = new Operaciones();
    }

    public void iniciar() {
        System.out.println("Bienvenido a la calculadora");

        // Suma
        realizarOperacion("SUMA");

        // Multiplicación
        realizarOperacion("MULTIPLICACION");

        // División
        realizarOperacion("DIVISION");

        // Potencia
        realizarOperacion("POTENCIA");

        // Raíz cuadrada
        realizarRaizCuadrada();

        System.out.println("GRACIAS POR PARTICIPAR");
    }

    private void realizarOperacion(String tipo) {
        System.out.println("Inicio " + tipo);
        long num1 = leer();
        if (num1 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }

        long num2 = leer();
        if (num2 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }

        long resultado = 0;
        switch (tipo) {
            case "SUMA":
                resultado = operaciones.sumar(num1, num2);
                break;
            case "MULTIPLICACION":
                resultado = operaciones.multiplicar(num1, num2);
                break;
            case "DIVISION":
                resultado = operaciones.dividir(num1, num2);
                if (resultado == -1)
                    return; // Manejo de error
                break;
            case "POTENCIA":
                resultado = operaciones.potencia(num1, num2);
                break;
        }
        imprimir(resultado);
    }

    private void realizarRaizCuadrada() {
        System.out.println("Inicio RAIZ CUADRADA");
        long num1 = leer();
        if (num1 == -1) {
            System.out.println("No es un numero, Finaliza programa ");
            return;
        }
        long resultado = operaciones.raizCuadrada(num1);
        imprimir(resultado);
    }

    public long leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        try {
            return scanner.nextLong();
        } catch (Exception e) {
            return -1;
        }
    }

    public void imprimir(long numero) {
        System.out.println("Resultado es " + numero);
    }
}
