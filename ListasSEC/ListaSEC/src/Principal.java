public class Principal {
    public static void main(String[] args) throws Exception {
        ListaSEC lista = new ListaSEC();

        Celula c1 = new Celula(1);
        Celula c2 = new Celula(2);
        Celula c3 = new Celula(3);
        lista.inserirNoInicio(c1);
        lista.inserirNoInicio(c2);
        lista.inserirNoFinal(c3);
        lista.removerNoInicio();
        lista.Imprimir();
    }
}
