package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.Produto;

public class Programa {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n----------- MENU ------------");
            System.out.println("1 - Cadastrar produtos");
            System.out.println("2 - Exibir relatórios");
            System.out.println("3 - Realizar Venda");
            System.out.println("0 - Sair");
            opcao = ler.nextInt();
            ler.nextLine();

            switch(opcao){
                case 1:
             do{
                System.out.println("\nCADASTRAMENTO DE PRODUTOS");
                System.out.println("------------- ------------");
                System.out.println("1 - Consultar produto");
                System.out.println("2 - Incluir produto");
                System.out.println("0 - Voltar ao menu anterior");
                opcao = ler.nextInt();
                ler.nextLine();

                switch(opcao){
                    case 1:
                     System.out.println("\nCONSULTA DE PRODUTOS");
                     System.out.println("---------- ----------");
                     System.out.println("\nDigite o nome do produto a consultar.");
                     String nomeConsulta = ler.nextLine();

                     for (Produto produto : produtos) {
                     if(produto.getNome().equalsIgnoreCase(nomeConsulta)){
                         System.out.println("\nProduto localizado:"); 
                         System.out.println(produto); break;
                     } else
                      if(produto.getNome() == null){
                         System.out.println("Não há nenhum produto com esse código");
                     }
                 }
                    break;
                    case 2:
                     int cod;
                     do{
                     System.out.println("\nDigite o código do produto a incluir ou -1 para sair.");
                     cod = ler.nextInt();
                     ler.nextLine();

                         if(cod != -1){
                             System.out.println("\nDigite o nome do produto.");
                             String nomeProduto = ler.nextLine();
                             System.out.println("\nDigite o valor do produto.");
                             double valorProduto = ler.nextDouble();
                             System.out.println("\nDigite a quantidade em estoque.");
                             int quantidadeProduto = ler.nextInt();
                             ler.nextLine();
                             produtos.add(new Produto(cod, nomeProduto, valorProduto, quantidadeProduto));
                         }

                     } while(cod != -1);
                    break;
                    case 0:
                }

             } while(opcao != -1);
                   break;
                case 2:
                do{
                    System.out.println("1 - Produtos");
                    System.out.println("2 - Venda por período - detalhado");
                    System.out.println("3 - Venda por período - consolidado");
                    System.out.println("0 - Voltar ao menu anterior");

                } while(opcao != -1);
                    break;
                case 3:
                break;
                case 0:
                 System.out.println("Encerrando a aplicação...");
                break;
                default:
                 System.out.println("Opção inválida. Tente novamente!");
            }

        } while(opcao != -1);
        ler.close();

    }
}
