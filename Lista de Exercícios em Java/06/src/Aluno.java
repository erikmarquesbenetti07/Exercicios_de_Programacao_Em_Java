public class Aluno {
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double nota5;

    double obterMedia() {
        return (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
    }

    String obterSituacao() {
        if(obterMedia() >= 7) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }
}
