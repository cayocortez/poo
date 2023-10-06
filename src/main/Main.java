package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        Financiamento financiamento = new Financiamento(InterfaceUsuario.calcularValorImovel(), InterfaceUsuario.calcularPrazoFinanciamento(), InterfaceUsuario.calcularTaxaJurosAnual());
        financiamento.dadosFinanciamento(); // método para mostrar o valor total do financiamento e do imóvel
    }

}
