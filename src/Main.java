import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Object[] conversor = {"Conversor de moeda", "Conversor de temperatura"};
        JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversor, "Conversor de moeda").toString();
        double valorMoeda = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor:"));

        Object[] moedaConverter = {"Reais -> Dólar", "Reais -> Euro", "Reais -> Libras Esterlinas", "Reais -> Peso argentino",
        "Reais -> Peso Chileno", "Dólar -> Reais", "Euro -> Reais", "Libras Esterlinas -> Reais", "Peso argentino ->  Reais", "Peso Chileno -> Reais"};

        JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter", "Menu", JOptionPane.PLAIN_MESSAGE, null, moedaConverter, "Conversor de moeda").toString();

    }
}