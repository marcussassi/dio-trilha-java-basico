public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("Imprimir com impacto do Break");
        for(int numeroBreak = 1 ; numeroBreak <= 5; numeroBreak ++){
            if(numeroBreak == 3)
                break;
            System.out.println (numeroBreak);
        }
        
        System.out.println("");
        System.out.println("Imprimir com impacto do Continue");
        for(int numeroContinue = 1 ; numeroContinue <= 5; numeroContinue ++){
            if(numeroContinue == 3)
                continue;
            System.out.println (numeroContinue);
            
        }
        
    }
}
