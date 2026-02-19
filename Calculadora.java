import java.util.Scanner;

// Clase principal que maneja la interacción 
public class Calculadora {
   private Operaciones operaciones;

   public Calculadora() {
      this.operaciones = new Operaciones();
   }

   public static void main(String[] args) {
      Calculadora calc = new Calculadora();
      calc.iniciar();
   }

   public void iniciar() {
      System.out.println("Bienvenido a la calculadora");

      // Suma
      System.out.println("Inicio SUMA");
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
      long resultado = operaciones.sumar(num1, num2);
      imprimir(resultado);

      // Multiplicación
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
      resultado = operaciones.multiplicar(num1, num2);
      imprimir(resultado);

      // División
      System.out.println("Inicio DIVISION");
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
      resultado = operaciones.dividir(num1, num2);
      if (resultado != -1) {
         imprimir(resultado);
      }

      System.out.println("GRACIAS POR PARTICIPAR");
   }

   public long leer() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite un numero : ");
      String dato = sc.nextLine();
      if (dato.isEmpty()) {
         return -1;
      } else {
         return Long.parseLong(dato);
      }
   }

   public void imprimir(long numero) {
      System.out.println("Resultado es " + numero);
   }
}

// Clase peraciones matemáticas
class Operaciones {
   public long sumar(long a, long b) {
      return a + b;
   }

   public long multiplicar(long a, long b) {
      long resultado = 0;
      for (long i = 0; i < b; i++) {
         resultado += a;
      }
      return resultado;
   }

   public long dividir(long a, long b) {
      if (b == 0) {
         System.out.println("Error: División por cero no permitida.");
         return -1; // Indicador de error
      }
      return a / b;
   }
}
