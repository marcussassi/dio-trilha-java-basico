public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "MARCOS", "JULIANA","JONAS"};
        for (int x = 0; x < alunos.length; x ++) {
            System.out.println("O aluno no ìndice " + x + " " + alunos[x]);
        }

        System.out.println(" ");
        System.out.println("Os alunos são: ");
        for(String elementos : alunos ){
            System.out.println(elementos);
        }
    }

}
