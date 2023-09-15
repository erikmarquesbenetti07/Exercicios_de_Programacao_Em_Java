public class App {
    public static void main(String[] args) throws Exception {
        int somatorio = 0;
        int quantidade = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                somatorio += i;
                quantidade++;
            }
        }

        System.out.println(somatorio/quantidade);
    }
}
