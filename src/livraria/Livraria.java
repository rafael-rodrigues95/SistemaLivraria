
package livraria;

/**
 * Belo Horizonte, 04 de novembro de 2021
 * 
 * Cria algumas classes com seus métodos e atributos
 * definindo as regras de negócio estabelecidas de 
 * acordo com o pedido na atividade de estudo.
 * 
 * @author Rafael Rodrigues de Souza
 * Matrícula: 1907053-5
 * 
 */

public class Livraria {
    
        public void venda(){
            
        }
    
    public static void main(String[] args) {
               
        Cliente c1 = new Cliente();
        c1.setNome("Rafael");
        
        Produto p1 = new Produto();
        p1.setDescricao("Camiseta Geek");
        p1.setPreco(200);
        
        Venda v1 = new Venda();
        v1.setDesconto(25);
        v1.imprimir(c1.getNome(), p1.getDescricao(), p1.getPreco(), v1.getDesconto());
    }
    
}
