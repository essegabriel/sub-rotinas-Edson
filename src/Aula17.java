import java.util.Scanner;

public class Aula17 {
    static Scanner teclado = new Scanner(System.in);
    public static double soma(double numero1, double numero2){
        return numero1 + numero2;
    }
    public static void main(String[] args) {
        double n1, n2;
        System.out.println("Informe o primeiro número:");
        n1 = teclado.nextDouble();
        System.out.println("Informe o segundo número:");
        n2 = teclado.nextDouble();
        System.out.println("A soma é " + soma(n1,n2));
        System.out.println("A soma é " + soma(3,5));

        char letra; //contém apenas um caractere
//teclado.nextLine();
        System.out.println("Informe a letra");
        letra = teclado.next().charAt(0); //char
        if (letra == 'A'){
            System.out.println("letra é A");
        }else {
            System.out.println("Diferente de A");
        }
    }
}