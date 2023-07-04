import taxas.TaxasDeConversao;

import javax.swing.*;

public class Menu {

    public void CallMenu() {

        TaxasDeConversao taxasDeConversao = new TaxasDeConversao();

        String[] opcaoDeConvesor = {"Conversor de moeda", "Conversor de temperatura"};

        String escolhaDeConversor = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, opcaoDeConvesor, opcaoDeConvesor[0]);

        if (escolhaDeConversor == opcaoDeConvesor[0]) {
            taxasDeConversao.opcoesDeConversao();
        }
    }
}
