package Estoque;

public class Roupa {
	private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorTotal() {
        return quantidade * valor;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Estoque insuficiente para remover.");
        } else {
            this.quantidade -= qtd;
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n Detalhes da Roupa:");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.printf("Valor unitário: R$ %.2f\n", valor);
        System.out.printf("Valor total em estoque: R$ %.2f\n", calcularValorTotal());
        System.out.println("──────────────────────────────────────");
    }

    @Override
    public String toString() {
        return tipo + " " + marca + " (Tam: " + tamanho + ") - Qtd: " + quantidade;
    }

}
