import java.util.LinkedList;

public class Fila {
    private LinkedList<Elemento> elementos;

    public Fila() {
        elementos = new LinkedList<>();
    }

    public void enfileirar(String valor) {
        elementos.addLast(new Elemento(valor));
    }

    public String desenfileirar() {
        return elementos.removeFirst().getValor();
    }

    public void inverter() {
        LinkedList<Elemento> pilha = new LinkedList<>();
        while (!elementos.isEmpty()) {
            pilha.addFirst(elementos.removeFirst());
        }
        while (!pilha.isEmpty()) {
            elementos.addLast(pilha.removeFirst());
        }
    }

    public int contarOcorrencias(Object valor) {
        int contagem = 0;
        for (Elemento elemento : elementos) {
            if (elemento.getValor().equals(valor)) {
                contagem++;
            }
        }
        return contagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elementos.size(); i++) {
            sb.append(elementos.get(i).getValor());
            if (i < elementos.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
