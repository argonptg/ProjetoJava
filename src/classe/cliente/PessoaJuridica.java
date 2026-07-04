package classe.cliente;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
    String cnpj;
    String nomeFantasia;
    String ramoAtividade;
    String responsavelLegal;

    public PessoaJuridica(int id, String email, String telefone, String nome, String endereco, String CEP, LocalDate dataCadastro,
            boolean ativo, String cnpj, String nomeFantasia, String ramoAtividade, String responsavelLegal) {
        super(id, email, telefone, endereco, CEP, dataCadastro, ativo);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.ramoAtividade = ramoAtividade;
        this.responsavelLegal = responsavelLegal;
    }    

    @Override
    public String toString() {
        String old = super.toString();
        String newStr = String.format("""
CNPJ: %s
Nome Fantasia: %s
Ramo de Atividade: %s
Responsável Legal: %s
                """, cnpj, nomeFantasia, ramoAtividade, responsavelLegal);

        return old + newStr;
    }
}