public class Nodo {
    
    private String valor;
    private Nodo esquerda;
    private Nodo direita;

    public Nodo(String valor) {
        this.valor = valor;
        this.direita = null;
        this.esquerda = null;
    }

    /*Getters para usar na classe ArvoreBinaria*/
    public Nodo getDireita() {
        return this.direita;
    }

    public Nodo getEsquerda() {
        return this.esquerda;
    }

    public String getValor() {
        return this.valor;
    }

    /*Setters para usar na classe ArvoreBinaria*/
    public void setDireita(Nodo direita) {
        this.direita = direita;
    }

    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
