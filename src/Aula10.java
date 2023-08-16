public class Aula10 {

    public static int somaEntre(int inicio, int fim){
        int soma = 0;
        for (int i = inicio; i <= fim; i++){
            //System.out.println(i);
            soma = soma + i;
        }
        return soma;
    }
    /*
    Faça uma subrotina media que tenha como parametros
    três notas (double) e uima letra (char).
    Se o valor da letra é A, retorne a média aritmética
    Se o valor da letra é P, retorne a média ponderada
    com pesos 1, 3 e 6.
     */
    public static double media(double nota1, double nota2, double nota3, char letra){
        double m = 0;
        if (letra == 'A'){
            m = (nota1 + nota2 + nota3) / 3;
        }
        else if (letra == 'P') {
            m = (nota1 + (nota2 * 3) + (nota3 * 6)) / 10;
        }
        return m;
    }
    public static double fatorial(double numero){
        double f = 1;
        for (int i = 1; i <= numero; i++){
            f = (f*i);
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(somaEntre(1, 10));
        System.out.println(somaEntre(10,12));
        System.out.println(somaEntre(2,9));
        System.out.println(media(1,2,5,'A'));
        System.out.println(fatorial(8));
    }
}