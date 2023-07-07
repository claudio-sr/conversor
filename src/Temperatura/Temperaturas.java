package Temperatura;

import javax.swing.*;

public class Temperaturas {

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void temperatura() {
        try {
            String[] opcao = {
                    "De Celsius(C) Para Fahrenheit(F)",
                    "De Celsius(C) Para Kelvin(K)",
                    "De Fahrenheit(F) Para Celsius(C)",
                    "De Fahrenheit(F) Para Kelvin(K)",
                    "De Kelvin(K) Para Fahrenheit(F)",
                    "De Kelvin(K) Para Celsius(C)" };

            double temperatura = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite a Temperatura ", 0));

            String tempEscolhida = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter",
                    "Menu Moedas", JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
            int indice = 0;

            for (int i = 0; i < opcao.length; i++) {
                if (tempEscolhida.equals(opcao[i])) {
                    indice = i;
                    break;
                }
            }

            switch (indice) {
                case 0:
                    setTemperatura((temperatura * 9 / 5) + 32);
                    break;
                case 1:
                    setTemperatura(temperatura + 273.15);
                    break;
                case 2:
                    setTemperatura((temperatura - 32) * 5 / 9);
                    break;
                case 3:
                    setTemperatura((temperatura - 32) * 5 / 9 + 273.15);
                    break;
                case 4:
                    setTemperatura((temperatura - 273.15) * 9 / 5 + 32);
                    break;
                case 5:
                    setTemperatura(temperatura - 273.15);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            JOptionPane.showMessageDialog(null, "O resultado da temperatura é: " + String.format("%.2f", getTemperatura()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro no valor Informado.\n informe uma Temperatura correto");
        }
    }
}
