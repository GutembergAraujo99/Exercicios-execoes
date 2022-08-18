package exercicioExcecoes;

public class Conta {

    private Integer CPF;
    private String nome;
    private String banco;
    private Integer agencia;
    private Integer conta;
    private Integer saldo;

    public Conta(Integer CPF, String nome, String banco, Integer agencia, Integer conta, Integer saldo ) {
        this.CPF = CPF;
        this.nome = nome;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String toString() {
        return "CPF:" + CPF + "\nNome:" + nome +   "\nBanco:" + banco + "\nAgencia:" + agencia + "\nConta:" + conta + "\nSaldo:" + saldo;
    }

    public Integer getCPF() {
        return CPF;
    }
    public void setCPF(Integer cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        nome = nome;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        banco = banco;
    }
    public Integer getAgencia() {
        return agencia;
    }
    public void setAgencia(Integer agencia) {
        agencia = agencia;
    }
    public Integer getConta() {
        return conta;
    }
    public void setConta(Integer conta) {
        conta = conta;
    }
    public Integer getSaldo() {
        return saldo;
    }
    public void setSaldo(Integer saldo) {
        saldo = saldo;
    }



}