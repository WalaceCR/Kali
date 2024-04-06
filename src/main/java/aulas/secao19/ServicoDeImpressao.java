package aulas.secao19;

import java.util.ArrayList;

public class ServicoDeImpressao {
    private ArrayList<Integer> listaDeNumeros = new ArrayList<>();

    public void add(int valor){
        listaDeNumeros.add(valor);

    }

    public Object primeiro(){
        if (listaDeNumeros.isEmpty())
            //TODO PROGRAMAÇÃO DEFENSIVA - ENTENDER MAIS
            throw new IllegalStateException("Lista vazia");

        return listaDeNumeros.getFirst();
    }

    public Object ultimo(){
        if (listaDeNumeros.isEmpty())
            throw new IllegalStateException("Lista vazia");
        return listaDeNumeros.getLast();
    }

    public void imprimir(){
        listaDeNumeros.forEach(numero -> {
            System.out.println("Numero: " + numero);
        });

        System.out.println("Todos na sequencia: \n" + listaDeNumeros );
    }



}
