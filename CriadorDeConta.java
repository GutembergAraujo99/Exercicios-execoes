package exercicioExcecoes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CriadorDeConta {

    static List <Conta> listaConta = new ArrayList<>();

    public void adicionaConta(Integer CPF, String nome, String banco, Integer agencia, Integer conta, Integer saldo) {
        Conta contas = new Conta(CPF, nome, banco, agencia, conta, saldo);

        listaConta.add(contas);
    }

    public void consultaCpf(Integer veirificaCpf) {

        for(Conta contas : listaConta) {
            if (contas.getCPF().equals(veirificaCpf)) {
                System.out.println(contas);
            }
        }
    }

    public static Object consultaSaldo(List <Conta> listaContas) {

        return conta.stream().allMatch(Conta -> "03".equals(conta.getCPF()));

    }

}