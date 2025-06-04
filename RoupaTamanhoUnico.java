package POO;

public class RoupaTamanhoUnico extends Peca {
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if (getQuantidade() <= 0) {
            System.out.println("Estoque esgotado para " + getDescricao());
            return;
        }
        
        setQuantidade(getQuantidade() - 1);
        System.out.println("Venda registrada. Novo estoque: " + getQuantidade());
    }
}
