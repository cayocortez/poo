package modelo;

public class Financiamento {

    //atributos
    private double valorImovel;
    private int prazoFinancimento;
    private double taxaJurosAnual;

    // construtor
    public Financiamento (double valorImovel, int prazoFinancimento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinancimento = prazoFinancimento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //getters e setters
    public double getValorImovel() {
        return valorImovel;
    }
    public double setValorImovel() {
        return this.valorImovel = valorImovel;
    }

    public int getPrazoFinancimento() {
        return prazoFinancimento;
    }
    public int setPrazoFinanciamento() {
        return this.prazoFinancimento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
    public double setTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    //métodos
    public double calcularPagMensal() { // cálculo do pagamento mensal
        double pagMensal;
        pagMensal = (valorImovel / prazoFinancimento) * (1 + (taxaJurosAnual / 12));
        return pagMensal;
    }

    public double calcularPagTotal() { // cálculo do pagamento total
        double pagTotal;
        pagTotal = (calcularPagMensal()) * prazoFinancimento;
        return pagTotal;
    }

    public void dadosFinanciamento() {
        System.out.printf("O valor total do financiamento é de: R$ %.3f", calcularPagMensal());
        System.out.printf("\nO valor total do imóvel é de: R$ %.3f", calcularPagTotal());
    }
}



























