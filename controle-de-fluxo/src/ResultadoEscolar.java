public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 7;
    
            if (nota>=7) //criar um bloco "{}" caso mais de uma instrução no IF/Else
                System.out.println("Aprovado, Parabéns");
            
                else if(nota >= 5 && nota <7)
                System.out.println("Agendar Recuperação");
            
                else
                System.out.println("Reprovado");

            //mesmo encadeamento, agora na forma ternário
            String resultado1 = nota >= 7? "Aprovado - ternario" : "Reprovado - ternário";
            System.out.println(resultado1);

            //ternario composto
            String resultado2 = nota>=7? "Aprovado" : nota>=5 && nota<7? "Recuperação " : "Reprovado";
            System.out.println(resultado2);

            
    }
}