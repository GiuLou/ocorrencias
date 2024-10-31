public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar("A"); 
        fila.enfileirar("B"); 
        fila.enfileirar("A"); 
        fila.enfileirar("C"); 

        int contagem = fila.contarOcorrencias("A");
        System.out.println("Contagem de 'A': " + contagem); 

        contagem = fila.contarOcorrencias("B");
        System.out.println("Contagem de 'B': " + contagem); 

        contagem = fila.contarOcorrencias("C");
        System.out.println("Contagem de 'C': " + contagem); 
        contagem = fila.contarOcorrencias("D");
        System.out.println("Contagem de 'D': " + contagem); 
    }
}
