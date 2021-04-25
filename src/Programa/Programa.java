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
                     ler.nextLine(); 

                     if (produtos.isEmpty()){
                        System.out.println("Não há nenhum produto cadastrado.");
                    } else
                     System.out.println("\n--------------------------");
                     System.out.println("-------- PRODUTOS ----------");
                     System.out.println("----------------------------");
                     System.out.println("\nProdutos encontrados:");
                     System.out.println("***********************");
                     for (Produto produto : produtos) {
                         System.out.println(produto);
                     }
                     
                    break;
                    case 2:
                     System.out.println("\n--------- INCLUSÃO DE PRODUTOS ----------");
                     System.out.println("-------------------------------------------");
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
                     break;
                    default:
                    System.out.println("Opção inválida! Tente novamente ou volte ao menu inicial.");
                }

             } while(opcao != 0);
                   break;
                case 2:
                do{
                    System.out.println("\n----------------------------------");
                    System.out.println("----------- RELATÓRIOS -----------");
                    System.out.println("----------------------------------");
                    System.out.println("\n1 - Produtos");
                    System.out.println("2 - Venda por período - detalhado");
                    System.out.println("3 - Venda por período - consolidado");
                    System.out.println("0 - Voltar ao menu anterior");
                    opcao = ler.nextInt();
                    ler.nextLine();

                    switch(opcao){
                        case 1:
                        System.out.println("\n--------RELATÓRIO PRODUTOS--------");

                        if(produtos.isEmpty()){
                         System.out.println("\nNão há dados/produtos para a emissão do relatório"); 
                        } else
                          for (Produto produto : produtos) {
                            System.out.println(produto);
                            System.out.println("\nCódigo                Nome          Valor($)         Estoque");
                              System.out.println("------------------------------------------------------------");
                         }

                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                        case 0:
                        break;
                    }

                } while(opcao != 0);
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
