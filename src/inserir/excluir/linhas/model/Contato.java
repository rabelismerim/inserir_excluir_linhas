package inserir.excluir.linhas.model;

/** Representa um contato cadastrado na tabela. */
public final class Contato {

    private final String nome;
    private final String endereco;
    private final String telefone;

    public Contato(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
