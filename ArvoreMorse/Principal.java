public class Principal {
    public static void main(String[] args) {
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        arvore.inicializar();

        // Inserção de exemplo
        arvore.inserir("...", 'S');
        arvore.inserir("---", 'O');

        // Testes
        System.out.println(arvore.buscar("...")); // Deve imprimir 'S'
        System.out.println(arvore.buscar("---")); // Deve imprimir 'O'
        System.out.println(arvore.decodificarFrase("... --- ...")); // Deve imprimir 'SOS'
    }
}