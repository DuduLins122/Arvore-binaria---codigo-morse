public class ArvoreBinariaMorse {
    private No raiz;

    public void inicializar() {
        raiz = new No();
    }

    public void inserir(String morse, char caractere) {
        No atual = raiz;
        int i = 0;
        while (i < morse.length()) {
            char simbolo = morse.charAt(i);
            if (simbolo == '.') {
                if (atual.ponto == null) {
                    atual.ponto = new No();
                }
                atual = atual.ponto;
            } else if (simbolo == '-') {
                if (atual.traco == null) {
                    atual.traco = new No();
                }
                atual = atual.traco;
            }
            i = i + 1;
        }
        atual.caractere = caractere;
    }

    public char buscar(String morse) {
        No atual = raiz;
        int i = 0;
        while (i < morse.length()) {
            char simbolo = morse.charAt(i);
            if (simbolo == '.') {
                if (atual.ponto == null) {
                    return '?';
                }
                atual = atual.ponto;
            } else if (simbolo == '-') {
                if (atual.traco == null) {
                    return '?';
                }
                atual = atual.traco;
            }
            i = i + 1;
        }
        return atual.caractere;
    }

    public String decodificarFrase(String fraseMorse) {
        String resultado = "";
        int i = 0;
        String codigo = "";

        while (i < fraseMorse.length()) {
            char atual = fraseMorse.charAt(i);
            if (atual == ' ') {
                char letra = buscar(codigo);
                resultado = resultado + letra;
                codigo = "";
            } else {
                codigo = codigo + atual;
            }
            i = i + 1;
        }

        if (codigo.length() > 0) {
            resultado = resultado + buscar(codigo);
        }

        return resultado;
    }
}