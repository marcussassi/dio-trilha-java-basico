public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("xuexxxxxx");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("caracteres do cep - quantidade errada");
        }
    }
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "23.765-064";
        }  
    
}