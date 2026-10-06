package inserir.excluir.linhas.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/** Modelo da tabela de contatos, responsável por armazenar e expor os dados. */
public final class ContatoTableModel extends AbstractTableModel {

    private static final String[] COLUNAS = {"Nome", "Endereço", "Telefone"};
    private final List<Contato> contatos = new ArrayList<>();

    @Override
    public int getRowCount() {
        return contatos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUNAS.length;
    }

    @Override
    public String getColumnName(int coluna) {
        return COLUNAS[coluna];
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return String.class;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Contato contato = contatos.get(linha);
        switch (coluna) {
            case 0:
                return contato.getNome();
            case 1:
                return contato.getEndereco();
            case 2:
                return contato.getTelefone();
            default:
                throw new IndexOutOfBoundsException("Coluna inválida: " + coluna);
        }
    }

    public void adicionar(Contato contato) {
        int novaLinha = contatos.size();
        contatos.add(contato);
        fireTableRowsInserted(novaLinha, novaLinha);
    }

    public void remover(int linha) {
        contatos.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
}
