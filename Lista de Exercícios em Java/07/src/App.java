public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.experiencia = 7;
        funcionario.salario = 1000;
        System.out.println("Experiencia (anos) = " + funcionario.experiencia);
        System.out.println("Salário Atual = R$" + funcionario.salario);
        funcionario.aumentarSalario();
        System.out.println("Salário Aumentado = R$" + funcionario.salario);
    }
}
