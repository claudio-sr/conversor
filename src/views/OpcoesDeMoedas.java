package views;

import javax.swing.*;

public class OpcoesDeMoedas {

    public void opcoes() {

        Object[] moedaConverter = {
                "Reais -> Dólar",
                "Reais -> Euro",
                "Reais -> Libras Esterlinas",
                "Reais -> Peso argentino",
                "Reais -> Peso Chileno",
                "Dólar -> Reais",
                "Euro -> Reais",
                "Libras Esterlinas -> Reais",
                "Peso argentino ->  Reais",
                "Peso Chileno -> Reais"
        };

        JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter",
                "Menu Moedas", JOptionPane.QUESTION_MESSAGE, null, moedaConverter, moedaConverter[0]);

    }
}
