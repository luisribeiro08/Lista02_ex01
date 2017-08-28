package lista02_ex01;


class Estoque{
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    
    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        
    }
    
    public void imprimeEstoque(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade Atual: " + this.qtdAtual);
        System.out.println("Quantidade Atual: " + this.qtdMinima + "\n");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQtdMin(int qtdMinima){
        if(qtdMinima >= 0)
            this.qtdMinima = qtdMinima;
    }
    
    public void setQtdAtual(int qtdAtual){
        if(qtdAtual >= 0)
            this.qtdAtual = qtdAtual;
    }
    
    public void reporEstoque(int qtd){
        if(qtd>=0)
            this.qtdAtual += qtd;
    }
    
    public void baixaEstoque(int qtd){
        if(qtd - this.qtdAtual >= 0)
            this.qtdAtual -= this.qtdAtual;
    }
    
    public boolean precisaRepor(){
        if(this.qtdAtual <= this.qtdMinima)
            return true;
        
        return false;
    }
}
