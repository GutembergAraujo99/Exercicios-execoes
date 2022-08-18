package exercicioExcecoes;

import java.util.List;

public class Exercicio1108 {

    public static void main(String[] args) {

        CriadorDeConta CriadorDeConta = new CriadorDeConta();

        CriadorDeConta.adicionaConta(03, "Tiago",  "Itau", 585, 587, 3);

        CriadorDeConta.consultaCpf(04);

        List<Conta> listaContas = null;
		exercicioExcecoes.CriadorDeConta.consultaSaldo(listaContas);

    }
}