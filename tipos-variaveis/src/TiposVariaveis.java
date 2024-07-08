public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Marcus";
        System.out.println("Hello, World! I'm " + meuNome);

        //variaveis nativas mais usadas
        
        byte idade = 23;
        System.out.println("Idade atual: " + (idade +2));
        short ano = 2024;
        int cep = 12410110; //se começar com zero melhor usar texto
        long cpf = 14815654843L; //usar notação L
        float pi = 3.14F; //usar notação F, usar sempre ponto para decimal
        double salarioMedio = 2500.33; // mais comum, usar ponto para decimal

        //Java altamente tipado
        short numeroCurto = 10;
        int numeroNormal = numeroCurto; //atribuição correta - "int" recebe um "short"
        short numeroCurto2 = (short) numeroNormal;
        // acima, casting de tipo de dado, usado eventualmente

        //constantes - guarda um valor na memória que não pode ser alterado
        //usamos a palavra final no inicio da declaração, tipo e nome em caixa alta
        final String ESTADOS_BR = "27";
        System.out.println("Quantidade de estados no Brasil: " + ESTADOS_BR);
        final double constanteX = 1.8657;
        System.out.println("numero Xconst: " + constanteX*2);
        
    }
}
