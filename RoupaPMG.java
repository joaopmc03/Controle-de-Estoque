package POO;

public class RoupaPMG extends Peca {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, 
                    int estoqueMinimo, int estoqueMaximo) {
        super(descricao, 0, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }

    @Override
    public void venda() {
        try {
            System.out.print("Tamanho da roupa (P/M/G): ");
            String tamanho = scanner.next().toUpperCase();
            
            switch (tamanho) {
                case "P":
                    if (quantidadeP <= 0) {
                        System.out.println("Estoque esgotado para tamanho P");
                        return;
                    }
                    quantidadeP--;
                    break;
                case "M":
                    if (quantidadeM <= 0) {
                        System.out.println("Estoque esgotado para tamanho M");
                        return;
                    }
                    quantidadeM--;
                    break;
                case "G":
                    if (quantidadeG <= 0) {
                        System.out.println("Estoque esgotado para tamanho G");
                        return;
                    }
                    quantidadeG--;
                    break;
                default:
                    System.out.println("Tamanho inválido. Use P, M ou G.");
                    return;
            }
            
            System.out.println("Venda registrada para tamanho " + tamanho);
            System.out.println(this);
        } catch (Exception e) {
            System.out.println("Erro ao processar venda.");
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < getEstoqueMinimo()) {
            quantidadeP = getEstoqueMaximo();
            System.out.println("Estoque P reposto para " + getEstoqueMaximo());
        }
        if (quantidadeM < getEstoqueMinimo()) {
            quantidadeM = getEstoqueMaximo();
            System.out.println("Estoque M reposto para " + getEstoqueMaximo());
        }
        if (quantidadeG < getEstoqueMinimo()) {
            quantidadeG = getEstoqueMaximo();
            System.out.println("Estoque G reposto para " + getEstoqueMaximo());
        }
    }

    @Override
    public String toString() {
        return getDescricao() + " - P: " + quantidadeP + ", M: " + quantidadeM + 
               ", G: " + quantidadeG + " (Mín: " + getEstoqueMinimo() + 
               ", Máx: " + getEstoqueMaximo() + ")";
    }


    public int getQuantidadeP() {
        return quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }
}
