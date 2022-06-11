
public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria minhaArvore = new ArvoreBinaria("-");
  
        minhaArvore.titulo();

        System.out.println("-> Atividade feita por: Bernardo Porto e Silva Souza");
        // método para criar a árvore dada pelo professor
        minhaArvore.criarArvore();
        
        System.out.print("\nImpressão Em Preordem (r, e, d): ");
        minhaArvore.preordem();

        System.out.print("\nImpressão Em Emordem (e, r, d):  ");
        minhaArvore.emordem();

        System.out.print("\nImpressão Em Pósordem (e, d, r): ");
        minhaArvore.posordem();
        
        System.out.println("\n");
    }
}
