import java.util.Scanner;

// Clase principal de la calculadora
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

      // Potencia
      System.out.println("Inicio POTENCIA");
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
      resultado = operaciones.potencia(num1, num2);
      imprimir(resultado);

      // Raíz cuadrada
      System.out.println("Inicio RAIZ CUADRADA");
      num1 = leer();
      if (num1 == -1) {
         System.out.println("No es un numero, Finaliza programa ");
         return;
      }
      resultado = operaciones.raizCuadrada(num1);
      imprimir(resultado);

      System.out.println("GRACIAS POR PARTICIPAR");
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

// Clase operaciones matemáticas
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

   public long potencia(long a, long b) {
      long resultado = 1;
      for (long i = 0; i < b; i++) {
         resultado *= a;
      }
      return resultado;
   }

   public long raizCuadrada(long a) {
      return (long) Math.sqrt(a);
   }
}