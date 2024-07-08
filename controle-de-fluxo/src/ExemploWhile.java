import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0){
            double valorDoce = valorAleatório();
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("valor do Doce: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;

        }

        System.out.println("Mesada: " +mesada);
        System.out.println("Joãozinho gastou toda sua mesada");
    }
    private static double valorAleatório(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
    
}   