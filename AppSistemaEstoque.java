package POO;

import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Peca[] estoque = new Peca[5];
        

        estoque[0] = new RoupaTamanhoUnico("Camisa", 15, 5, 20);
        estoque[1] = new RoupaPMG("Saia", 10, 8, 5, 3, 15);
        estoque[2] = new Acessorio("Cinto", 12, 4, 20);
        estoque[3] = new Acessorio("Pulseira", 8, 2, 15);
        estoque[4] = new RoupaTamanhoUnico("Saída de praia", 5, 2, 10);
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== MENU DE PRODUTOS ===");
            for (int i = 0; i < estoque.length; i++) {
                System.out.println(i + " - " + estoque[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema");
            
            try {
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                if (opcao < 0 || opcao > 5) {
                    System.out.println("Opção inválida. Digite um número entre 0 e 5.");
                    continue;
                }
                
                if (opcao == 5) {
                    System.out.println("\n=== ESTOQUE FINAL ===");
                    for (Peca peca : estoque) {
                        System.out.println(peca);
                    }
                    System.out.println("Sistema encerrado.");
                    break;
                }
                

                estoque[opcao].venda();
                estoque[opcao].reposicaoEstoque();
                
            } catch (Exception e) {
                System.out.println("Digite um número.");
                scanner.next();
                opcao = 0;
            }
        } while (true);
        
        scanner.close();
    }
}
