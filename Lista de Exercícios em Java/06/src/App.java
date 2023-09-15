public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        
        aluno.nota1 = 10;
        aluno.nota2 = 8;
        aluno.nota3 = 9;
        aluno.nota4 = 9;
        aluno.nota5 = 10;

        System.out.println("Média = " + aluno.obterMedia());
        System.out.println("Situação = " + aluno.obterSituacao());
    }
}
