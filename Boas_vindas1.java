package senai_java;

import javax.swing.JOptionPane;

public class Boas_vindas1 {
    public static void main(String[] args) {
        String resposta;
        int respostaDialog;

        do {
            // Caixa de diálogo verde
            JOptionPane.showMessageDialog(null, "Bem-Vindos Java Senai!", "Boas-vindas", JOptionPane.INFORMATION_MESSAGE);

            // Solicitando o nome do usuário
            String nome = JOptionPane.showInputDialog("Qual é o seu nome?");

            // Caixa de diálogo verde
            JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Bem-vindo ao mundo Java.", "Boas-vindas", JOptionPane.INFORMATION_MESSAGE);

            boolean respostaValida = false;
            do {
                // Caixa de diálogo azul
                respostaDialog = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (respostaDialog == JOptionPane.YES_OPTION || respostaDialog == JOptionPane.NO_OPTION) {
                    respostaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta inválida. Selecione 'Sim' ou 'Não'.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } while (!respostaValida);

        } while (respostaDialog == JOptionPane.YES_OPTION);

        // Caixa de diálogo amarela
        JOptionPane.showMessageDialog(null, "Programa encerrado. Continue estudando e se dedicando!", "Encerrado", JOptionPane.WARNING_MESSAGE);
    }
}
