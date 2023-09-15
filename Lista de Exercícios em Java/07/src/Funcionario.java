public class Funcionario {
    double salario;
    int experiencia;

    void aumentarSalario() {
        if(experiencia >= 0 && experiencia <= 2) {
            // 10%
            salario += salario * 0.1;
        } else {
            if(experiencia >=  3 && experiencia <= 5) {
                // 15%
                salario += salario * 0.15;
            } else {
                if(experiencia > 5) {
                    // 20%
                    salario += salario * 0.2;
                }
            }
        }
    }
}
