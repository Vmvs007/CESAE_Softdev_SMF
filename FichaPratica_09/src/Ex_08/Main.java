package Ex_08;

public class Main {
    public static void main(String[] args) {

        // Instanciar Alunos
        Aluno vitor = new Aluno("Vitor S.","Eng. Informática",24,20);
        Aluno quim = new Aluno("Quim A.", "Calceiteiro", 40, 19);
        Aluno joana = new Aluno("Joana T.", "Eng. Informática", 19,15);
        Aluno diamantino = new Aluno("Diamantino S.", "Eng. Eletronica", 29,5);

        //
        System.out.println("***** Situação dos Alunos da Turma *****");
        System.out.println(vitor.getNome()+": "+vitor.situacao());
        System.out.println(quim.getNome()+": "+quim.situacao());
        System.out.println(joana.getNome()+": "+joana.situacao());
        System.out.println(diamantino.getNome()+": "+diamantino.situacao());
    }
}
