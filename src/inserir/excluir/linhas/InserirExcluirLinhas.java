package inserir.excluir.linhas;

import inserir.excluir.linhas.ui.JCadastro;
import javax.swing.SwingUtilities;

/** Inicializa a aplicação de cadastro de contatos. */
public final class InserirExcluirLinhas {

    private InserirExcluirLinhas() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JCadastro().setVisible(true));
    }
}
