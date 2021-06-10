import java.util.Scanner;

public class Seudo10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        int suma2 = 0;
        int num;
        while (suma < 1000) {
            System.out.println("Ingrese numero");
            num = scanner.nextInt();
            if (num % 6 == 0) {
                contador++;
            }
            if (num >= 1 && num <= 10) {
                suma2 = suma2 + num;
            }
            suma = suma + num;
            System.out.println("La suma general va por " + suma);
            System.out.println("La suma de los numeros entre 1 y 10 por el momento es " + suma2);
            System.out.println("Has ingresado " + contador + " multiplos de 6");
        }
    }
}