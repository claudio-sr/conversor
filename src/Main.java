import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();


        while(true) {
            menu.CallMenu();

            int continuarPrograma = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "continuar",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (continuarPrograma == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }

            if (continuarPrograma == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa Concluído");
                break;
            }
        }

        /*
        double valorMoeda = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor:"));


        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ 25.10");

        JOptionPane.showMessageDialog(null, "Valor invalido");

        JOptionPane.showConfirmDialog(null, "Deseja continuar?");



        */
    }
}