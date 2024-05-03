import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Pesquisa();
    }

    public static void Pesquisa() {
        int tamanho = 500;
        double bitola = 0.35;

        if (bitola == 0.35) {
            if (tamanho <= 800) {
                System.out.println("Nivel D");
            } else if (tamanho > 800.1 && tamanho <= 1500) {
                System.out.println("Nivel C");
            } else if (tamanho > 1500.1 && tamanho <= 2000) {
                System.out.print("Nivel B");
            } else if (tamanho > 2000) {
                System.out.println("Nivel A");
            }
        } else if (bitola == 0.50) {
            if (tamanho <= 500) {
                System.out.println("Nivel D");
            } else if (tamanho > 500.1 && tamanho <= 1000) {
                System.out.println("Nivel C");
            } else if (tamanho > 1000.1 && tamanho <= 1500) {
                System.out.print("Nivel B");
            } else if (tamanho > 1500) {
                System.out.println("Nivel A");
            }
        } else if (bitola == 1) {
            if (tamanho <= 200) {
                System.out.println("Nivel D");
            } else if (tamanho > 200.1 && tamanho <= 500) {
                System.out.println("Nivel C");
            } else if (tamanho > 500.1 && tamanho <= 1000) {
                System.out.print("Nivel B");
            } else if (tamanho > 1000) {
                System.out.println("Nivel A");
            }
        }
    }

}
