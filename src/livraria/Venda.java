
package livraria;

public class Venda {
    private int codigo;
    private int quantidade;
    private double desconto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade == 1){
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade acima de 1 unidade não permitida.");
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void imprimir (String cliente, String produto, double valor,
            double desconto){
        double valorFinal = valor - (desconto * valor / 100);
        System.out.println("Resumo de Venda:\nNome do Cliente: "+cliente+
                "\nProduto: "+produto+"\nValor: "+valor+"\nValor com o Desconto: "+valorFinal);
    }
}
