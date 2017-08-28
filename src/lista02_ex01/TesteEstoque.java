package lista02_ex01;

public class TesteEstoque {

    public static void main(String[] args) {
        Estoque produto1 = new Estoque("Impressora JT", 13, 16);
        Estoque produto2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque produto3 = new Estoque("Mouse óptico", 6, 2);
        
        produto1.baixaEstoque(5);
        produto2.reporEstoque(7);
        produto3.baixaEstoque(4);
        
        
        produto1.imprimeEstoque();
        produto2.imprimeEstoque();
        produto3.imprimeEstoque();
        
    }
}
