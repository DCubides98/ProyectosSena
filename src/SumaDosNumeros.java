import java.util.Scanner;

public class SumaDosNumeros {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor ingrese un numero: ");

        int num1 = scanner.nextInt();


        System.out.print("Por favor ingrese el segundo numero: ");

        int num2 = scanner.nextInt();


        int suma = num1 + num2;


        System.out.println("El resultado de la suma de los dos numeros es" + ": " + suma);
    }
}