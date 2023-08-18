import java.util.Scanner;

public class Calculadora {
    public double realizarOperacao(double v1, double v2, char escolha) {
        switch (escolha) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                if (v2 != 0) {
                    return v1 / v2;
                } else {
                    System.out.println("Erro: Divisão por zero");
                    return 0;
                }
            default:
                System.out.println("Operador inválido");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = calculadora.realizarOperacao(valor1, valor2, operador);
        System.out.println("Resultado: " + resultado);
    }
}
