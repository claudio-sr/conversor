import Temperatura.Temperaturas;
import taxas.Moeda;
import views.OpcoesDeMoedas;
import views.ValorDeEntrada;

import javax.swing.*;

public class Menu {

    ValorDeEntrada valorDeEntrada = new ValorDeEntrada();
    OpcoesDeMoedas opcoesDeMoedas = new OpcoesDeMoedas();
    Moeda moeda = new Moeda();

    Temperaturas temperaturas = new Temperaturas();

    public void CallMenu() {

        String[] opcaoDeConvesor = {"Conversor de moeda", "Conversor de temperatura"};

        String escolhaDeConversor = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, opcaoDeConvesor, opcaoDeConvesor[0]);

        if (escolhaDeConversor == opcaoDeConvesor[0]) {
            calcularMoeda();
        } else {
            temperaturas.temperatura();
        }

    }

    public void yesNoCancelOptions() {
        while(true) {
            CallMenu();

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
    }

    public void calcularMoeda() {

        double valor = valorDeEntrada.entrada();
        int indice = opcoesDeMoedas.opcoes();

        double valorFinal = 0.0;

        if (indice == 0) {
            valorFinal = valor / moeda.getDolar();
        }
        if (indice == 1) {
            valorFinal = valor / moeda.getEuro();
        }
        if (indice == 2) {
            valorFinal = valor / moeda.getLibrasEterlina();
        }
        if (indice == 3) {
            valorFinal = valor / moeda.getPesoArgentino();
        }
        if (indice == 4) {
            valorFinal = valor / moeda.getPesoChileno();
        }
        if (indice == 5) {
            valorFinal = valor * moeda.getDolar();
        }
        if (indice == 6) {
            valorFinal = valor / moeda.getEuro();
        }
        if (indice == 7) {
            valorFinal = valor / moeda.getLibrasEterlina();
        }
        if (indice == 8) {
            valorFinal = valor / moeda.getPesoArgentino();
        }
        if (indice == 9) {
            valorFinal = valor / moeda.getPesoChileno();
        }

        JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", valorFinal));
    }
}
