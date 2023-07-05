package views;

import javax.swing.*;

public class ValorDeEntrada {

    public double entrada() {
        double valor = 0.0;
        try {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor",0.00));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro no valor informado,\n Informe um valor correto");
        }
        return valor;
    }
}
