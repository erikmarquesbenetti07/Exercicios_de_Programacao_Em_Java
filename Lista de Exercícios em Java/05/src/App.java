public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        calculadora.operando1 = 2;
        calculadora.operando2 = 1;
        System.out.println("Soma = " + calculadora.somar());
        System.out.println("Subtração = " + calculadora.subtrair());
        System.out.println("Multiplicação = " + calculadora.multiplicar());
        System.out.println("Divisão = " + calculadora.dividir());
    }
}
