package classe.cliente;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    String cpf;
    LocalDate dob;
    String nome;
    String sexo;
    double limiteCredito;

    // vscode carregando o desenvolvimento nas costas
    public PessoaFisica(int id, String email, String telefone, String nome, String endereco, String CEP, LocalDate dataCadastro,
            boolean ativo, String cpf, LocalDate dob, String sexo, double limiteCredito) {
        super(id, email, telefone, endereco, CEP, dataCadastro, ativo);
        this.cpf = cpf;
        this.dob = dob;
        this.nome = nome;
        this.sexo = sexo;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        String old = super.toString();
        String newStr = String.format("""
CPF: %s
Data de Nascimento: %s
Nome: %s
Sexo: %s
Limite de Crédito: %f
                """, cpf, dob.toString(), nome, sexo, limiteCredito);

        return old + newStr; // concatenando pra evitar repetição
    }
}