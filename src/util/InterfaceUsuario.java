package util;

import java.util.Scanner;

public class InterfaceUsuario {


    public static double calcularValorImovel() { // método para usuário inserir o valor do imóvel
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do imóvel: ");
        double valorImovel = scanner.nextDouble();
        if (valorImovel < 0) { // condição caso o usuário insira um prazo negativo
            do {
                System.out.println("O valor do imóvel deve ser positivo!");
                valorImovel = scanner.nextDouble();
            } while (valorImovel < 0); // preso no loop enquanto o usuário não usar um valor positivo
        }
        return valorImovel;
    }

    public static int calcularPrazoFinanciamento() { // método para o usuário inserir o prazo do financiamento
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o prazo do financiamento em anos: ");
        int prazoFinanciamento = scanner.nextInt();
        if (prazoFinanciamento < 0) { // condição caso o usuário insira um prazo que seja negativo
            do {
                System.out.println("O prazo de financiamento deve ser positivo!");
                prazoFinanciamento = scanner.nextInt();
            } while (prazoFinanciamento < 0); // preso no loop enquanto o usuário não usar um valor positivo
        }
        return prazoFinanciamento;
    }

    public static double calcularTaxaJurosAnual() { // método para o usuário inserir a taxa de juros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agora, digite a taxa de juros anual: ");
        double taxaJurosAnual = scanner.nextDouble();
        if (taxaJurosAnual < 0 || taxaJurosAnual > 100) { // condição caso o usuário insira um prazo que seja negativo ou maior que 100
            do {
                System.out.println("O valor da taxa de juros anual deve ser positiva e menor do que 100!");
                taxaJurosAnual = scanner.nextDouble();
            } while (taxaJurosAnual < 0 || taxaJurosAnual > 100); // preso no loop enquanto o usuário não usar um valor positivo e abaixo de 100
        }
        return taxaJurosAnual/100;
    }

}
