package aulas;

import aulas.secao19.ServicoDeImpressao;

public class Main {
    public static void main(String[] args) {

        ServicoDeImpressao servico = new ServicoDeImpressao();

        servico.add(20);
        servico.add(100);
        servico.add(80);

        System.out.println("Primeiro da lista: " + servico.primeiro());

        System.out.println("Ultimo da lista: " + servico.ultimo());
        servico.imprimir();






    }
}