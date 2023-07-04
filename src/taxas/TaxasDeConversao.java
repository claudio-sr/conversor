package taxas;

import views.OpcoesDeMoedas;

import javax.swing.*;

public class TaxasDeConversao {

    OpcoesDeMoedas opcoesDeMoedas = new OpcoesDeMoedas();
        public void opcoesDeConversao() {

            try {


                double[] valorTaxas = {
                        5.00,
                        5.24,
                        6.07,
                        0.019,
                        0.0060,
                        0.033,
                        0.0037,
                        1 / 5.00,
                        1 / 5.24,
                        1 / 6.07,
                        1 / 0.019,
                        1 / 0.0060,
                };

//                JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter",
//                        "Menu Moedas", JOptionPane.QUESTION_MESSAGE, null, moedaConverter, moedaConverter[0]);

                opcoesDeMoedas.opcoes();

            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
}
