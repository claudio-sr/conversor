import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de moeda", "Conversor de temperatura"}, "Conversor de moeda").toString();
    }
}