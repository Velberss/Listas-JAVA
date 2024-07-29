public class ListaSEC {
    Celula cabeca = new Celula(-1);

    public ListaSEC() {
        Celula cabeca = new Celula(-1);
        cabeca.prox = cabeca;
    }

    public boolean Vazia() {
        return (cabeca.prox == cabeca);
    }

    public void inserirNoInicio(Celula c) {
        Celula aux = cabeca.prox;
        cabeca.prox = c;
        c.prox = aux;
    }

    public void inserirNoFinal(Celula c) {
        {
            {
                if (Vazia()) {
                } else {
                    Celula aux = cabeca.prox;
                    while (aux.prox != cabeca) {
                        aux = aux.prox;
                        aux.prox = c;
                        c.prox = cabeca;
                    }
                }
            }
        }
    }

    public void removerNoInicio() {
        if (Vazia()) {
            System.out.println("Lista vazia!");
        } else {
            Celula aux = cabeca.prox;
            cabeca.prox = aux.prox;
            aux.prox = null;
        }

    }

    public boolean removerNoFinal() {
        if (Vazia()) {
            return true;
        } else {
            Celula aux = cabeca.prox;
            if (aux.prox != cabeca) {
                while ((aux.prox).prox != cabeca) {
                    aux = aux.prox;
                }
                Celula aux2 = aux.prox;
                aux.prox = cabeca;
                aux2.prox = null;
                return true;
            } else {
                cabeca.prox = cabeca;
                aux.prox = null;
                return true;
            }

        }
    }

    public void Imprimir() {
        Celula aux = cabeca.prox;
        while (aux != cabeca) {
            System.out.println("Valor " + aux.valor);
            aux = aux.prox;
        }
    }

    public Celula Pesquisar(int valor) {
        Celula aux = cabeca.prox;
        while (aux != cabeca && valor != aux.valor) {
            aux = aux.prox;
        }
        if (aux == cabeca) {
            System.out.println("Valor não encontrado!");
            return null;
        }
        System.out.println("O Valor "+valor+" foi encontrado com sucesso!");
        return aux;
    }

}
