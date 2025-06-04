package POO;

public class Acessorio extends Peca {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        try {
            System.out.print("Quantidade vendida de " + getDescricao() + ": ");
            int quantidadeVendida = scanner.nextInt();
            
            if (quantidadeVendida <= 0) {
                System.out.println("Quantidade inválida. Deve ser maior que zero.");
                return;
            }
            
            if (quantidadeVendida > getQuantidade()) {
                System.out.println("Estoque insuficiente. Disponível: " + getQuantidade());
                return;
            }
            
            setQuantidade(getQuantidade() - quantidadeVendida);
            System.out.println("Venda registrada. Novo estoque: " + getQuantidade());
        } catch (Exception e) {
            System.out.println("Digite um número inteiro.");
            scanner.next();
        }
    }
}
