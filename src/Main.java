import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, result;
        String opera;
        char continuar = 's';

        do {
            System.out.println("Digite um numero");
            num1 = sc.nextInt();

            System.out.println("Digite outro numero");
            num2 = sc.nextInt();

            System.out.println("Digite o sinal da operação: +, -, *, /");
            opera = sc.next();

            switch (opera) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida");
                    continue;
            }

            System.out.println(num1 + " " + opera + " " + num2 + " = " + result);

            System.out.println("Deseja continuar? (s/n)");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        sc.close();
        System.out.println("Programa encerrado.");
    }
}
