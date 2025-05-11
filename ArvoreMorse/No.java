public class No {
    public char caractere;
    public No ponto;  // Equivale ao filho esquerdo (.)
    public No traco;  // Equivale ao filho direito (-)

    public No() {
        this.caractere = ' ';
        this.ponto = null;
        this.traco = null;
    }

    public No(char caractere) {
        this.caractere = caractere;
        this.ponto = null;
        this.traco = null;
    }
}