package views;

import javax.swing.*;

public class ValorDeEntrada {

    public double entrada() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor",0.00));
        return valor;

    }
}
