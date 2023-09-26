package arvores.binarias;

// Classe para representar um nó da árvore binária
class NoArvoreBinaria {
    int dado;                   // Valor armazenado no nó
    NoArvoreBinaria esquerda;   // Referência para o filho esquerdo
    NoArvoreBinaria direita;    // Referência para o filho direito

    public NoArvoreBinaria(int dado) {
        this.dado = dado;
        this.esquerda = null;
        this.direita = null;
    }
}