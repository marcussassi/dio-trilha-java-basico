public class CaixaEletronico {
    public static void main(String[] args) {
        double  saldo = 25.0;
        double valorSolicitado = 24;
        /*condicional simple
            if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            }
        */
        //condicional composta
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor Autorizado ");
            System.out.println("Saldo Atual: " + saldo);

        }else{
            System.out.println("Valor Insufuciente");
            System.out.println("Valor Disponivel: " + saldo);
         }
        
    }
}
