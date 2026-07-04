package classe.cliente;

import java.time.LocalDate;

class Cliente {
    int id;
    String email;
    String telefone;
    String endereco;
    String CEP;
    LocalDate dataCadastro;
    boolean ativo;

    public Cliente(int id, String email, String telefone, String endereco, String CEP, LocalDate dataCadastro, boolean ativo) {
        this.id = id;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CEP = CEP;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        String formatted = String.format("""
ID: %d
EMail: %s
Telefone: %s
Endereço: %s
CEP: %S
Data do Cadastro: %s
Conta ativa: %b
                """, id, email, telefone, endereco, CEP, dataCadastro.toString(), ativo);

        return formatted;
    }
}