public class App {
    public static void main(String[] args) throws Exception {
        Pesquisa();
    }

    public static void Pesquisa() {
        int tamanho = 2000;
        double bitola = 0.50;

        if (bitola == 0.50) {
            if (tamanho <= 500) {
                System.out.println("Nivel D");
            } else if (tamanho > 500.1 && tamanho <= 1000) {
                System.out.println("Nivel C");
            } else if (tamanho > 1000.1 && tamanho <= 1500) {
                System.out.print("Nivel B");
            } else if (tamanho > 1500) {
                System.out.println("Nivel A");
            }
        }
    }
}
