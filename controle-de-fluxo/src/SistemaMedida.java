public class SistemaMedida {
    
public static void main(String[] args) {
    
    String sigla = "j";
    /*
    if (sigla == "P")
        System.out.println("Pequeno");
    else if (sigla=="M")
        System.out.println("Medio");
    else if(sigla=="G")
        System.out.println("Grande");
    else
    System.out.println("Indefinido");
     */

     //com o swicht case
     switch (sigla) {
        case "P":
            System.out.println("Pequeno");
            break;
        
        case "M":
            System.out.println("Médio");
            break;
        
        case "G":
            System.out.println("Grande");
            break;
        
        default:
            System.out.println("indefinido");
            break;
     }
}   
    
}
