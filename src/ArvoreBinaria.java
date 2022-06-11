
public class ArvoreBinaria {
    private Nodo raiz;
    
    public ArvoreBinaria(String valorRaiz){
        this.raiz = new Nodo(valorRaiz);   
    }

    public Nodo getRaiz() {
        return raiz;
    }

    /*Frufru para mostrar no console*/
    public void titulo(){
        System.out.println(" _____                        _   _             _     ");
        System.out.println("|  _  |___ _ _ ___ ___ ___   | |_|_|___ ___ ___|_|___ ");
        System.out.println("|     |  _| | | . |  _| -_|  | . | |   | .'|  _| | .'|");
        System.out.println("|__|__|_|  \\_/|___|_| |___|  |___|_|_|_|__,|_| |_|__,|");
        System.out.println("                                                      ");
    }

    /*Popular a árvore*/
    public void criarArvore(){ 

        // criação manual da árvore
        raiz.setEsquerda(new Nodo("/"));
        raiz.setDireita(new Nodo("+"));
        
        raiz.getEsquerda().setEsquerda(new Nodo("x"));
        raiz.getEsquerda().setDireita(new Nodo("+"));
        raiz.getDireita().setEsquerda(new Nodo("x"));
        raiz.getDireita().setDireita(new Nodo("6"));
        
        raiz.getEsquerda().getEsquerda().setEsquerda(new Nodo("+"));
        raiz.getEsquerda().getEsquerda().setDireita(new Nodo("3"));
        raiz.getEsquerda().getDireita().setEsquerda(new Nodo("-"));
        raiz.getEsquerda().getDireita().setDireita(new Nodo("2"));
        raiz.getDireita().getEsquerda().setEsquerda(new Nodo("3"));
        raiz.getDireita().getEsquerda().setDireita(new Nodo("-"));

        raiz.getEsquerda().getEsquerda().getEsquerda().setEsquerda(new Nodo("3"));
        raiz.getEsquerda().getEsquerda().getEsquerda().setDireita(new Nodo("1"));
        raiz.getEsquerda().getDireita().getEsquerda().setEsquerda(new Nodo("9"));
        raiz.getEsquerda().getDireita().getEsquerda().setDireita(new Nodo("5"));
        raiz.getDireita().getEsquerda().getDireita().setEsquerda(new Nodo("7"));
        raiz.getDireita().getEsquerda().getDireita().setDireita(new Nodo("4"));
    }

    /*Métodos sem parâmetro, 
    para começar a recursão da raiz
    (somente esses métodos podem ser chamados por uma instância) */
    public void preordem() {
        preordem(this.raiz);
    }

    public void emordem() {
        emordem(this.raiz);
    }

    public void posordem(){
        posordem(this.raiz);
    }
    
    /*Métodos privados recebendo um nodo como parâmetro
    esta parte que possibilita a recursão, devido ao parâmetro*/
    
    /*Método de percurso Preordem (r, e, d)*/
    private void preordem(Nodo meuNodo) {
        
        if(meuNodo != null){ // Validar se meuNodo atual é nulo, caso não seja, realizará a recursão    
            /*
            // Condição para adicionar o início dos parenteses 
            
            if(meuNodo.esquerda != null){
                System.out.print("( ");
            }
            */
            
            // Executa o percurso do Preordem - raiz, esquerda, direita
            System.out.print(meuNodo.getValor() + " "); // printamos a raiz do nodo
            // Chamada recursiva passando a esquerda como parâmetro para avançar na árvore
            preordem(meuNodo.getEsquerda());
            // Chamada recursiva passando a direita como parâmetro para avançar na árvore
            preordem(meuNodo.getDireita());
            
            /*
            // Condição para adicionar o fechamento dos parenteses
            if(meuNodo.direita != null){
                System.out.print(") ");
            } 
            */  
        }
    }

    /*Método de percurso Emorder (e, r, d)*/
    private void emordem(Nodo meuNodo) {
        /*Este método realiza a mesma validação do método anterior,
        porém dentro do if chamamos nossa função em uma ordem diferente.*/
        if(meuNodo != null){    
            emordem(meuNodo.getEsquerda()); // Vamos até o último nodo a esquerda
            System.out.print(meuNodo.getValor() + " ");  // Após chegar ao último a esquerda printamos seu conteúdo
            emordem(meuNodo.getDireita());  // Após printar percorremos para os nodos da direita
        }
    }

    private void posordem(Nodo meuNodo) {
        if(meuNodo != null){
            posordem(meuNodo.getEsquerda());
            posordem(meuNodo.getDireita());
            System.out.print(meuNodo.getValor() + " "); // printamos somente ao final o nodo
        }
    }
}
