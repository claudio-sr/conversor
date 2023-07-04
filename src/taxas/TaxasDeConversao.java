package taxas;

import views.OpcoesDeMoedas;
import views.ValorDeEntrada;

import javax.swing.*;

public class TaxasDeConversao {

    OpcoesDeMoedas opcoesDeMoedas = new OpcoesDeMoedas();
    ValorDeEntrada valorDeEntrada = new ValorDeEntrada();
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

                valorDeEntrada.entrada();

                opcoesDeMoedas.opcoes();

            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
}
