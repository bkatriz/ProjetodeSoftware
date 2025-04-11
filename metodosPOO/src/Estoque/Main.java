package Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Roupa> roupas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===============================");
            System.out.println("GERENCIAMENTO DE ESTOQUE");
            System.out.println("===============================");
            System.out.println("1 - Registrar nova roupa");
            System.out.println("2 - Adicionar peças ao estoque");
            System.out.println("3 - Remover peças do estoque");
            System.out.println("4 - Exibir todas as roupas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastro de Nova Roupa:");
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Tamanho (P/M/G): ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Valor unitário (R$): ");
                    double valor = scanner.nextDouble();

                    roupas.add(new Roupa(marca, tipo, tamanho, quantidade, valor));
                    System.out.println("Roupa cadastrada com sucesso.");
                    break;

                case 2:
                    if (roupas.size() == 0) {
                        System.out.println("Nenhuma roupa cadastrada.");
                        break;
                    }

                    mostrarResumoRoupas(roupas);
                    System.out.print("Escolha o número da roupa: ");
                    int indiceAdd = scanner.nextInt();
                    if (indiceAdd < 0 || indiceAdd >= roupas.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = scanner.nextInt();
                    roupas.get(indiceAdd).adicionarEstoque(qtdAdd);
                    System.out.println("Estoque atualizado.");
                    roupas.get(indiceAdd).exibirInformacoes();
                    break;

                case 3:
                    if (roupas.size() == 0) {
                        System.out.println("Nenhuma roupa cadastrada.");
                        break;
                    }

                    mostrarResumoRoupas(roupas);
                    System.out.print("Escolha o número da roupa: ");
                    int indiceRem = scanner.nextInt();
                    if (indiceRem < 0 || indiceRem >= roupas.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = scanner.nextInt();
                    roupas.get(indiceRem).removerEstoque(qtdRem);
                    System.out.println("Estoque atualizado.");
                    roupas.get(indiceRem).exibirInformacoes();
                    break;

                case 4:
                    if (roupas.size() == 0) {
                        System.out.println("Nenhuma roupa cadastrada.");
                    } else {
                        System.out.println("\nLista de Roupas:");
                        for (Roupa r : roupas) {
                            r.exibirInformacoes();
                        }
                    }
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    public static void mostrarResumoRoupas(ArrayList<Roupa> roupas) {
        System.out.println("\nRoupas cadastradas:");
        for (int i = 0; i < roupas.size(); i++) {
            System.out.println(i + " - " + roupas.get(i).toString());
        }
    }

}
