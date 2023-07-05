package views;

import javax.swing.*;

public class OpcoesDeMoedas {

    public int opcoes() {

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

        String moedaEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter",
                "Menu Moedas", JOptionPane.QUESTION_MESSAGE, null, moedaConverter, moedaConverter[0]);

        int indice = 0;

        for (int i = 0; i < moedaConverter.length; i++) {
            if (moedaEscolhida.equals(moedaConverter[i])) {
                indice = i;
                break;
            }
        }
        return indice;
    }
}
