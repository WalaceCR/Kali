package aulas.aula1;

import java.util.ArrayList;
import java.util.List;

public class Aula1ListasExercicio {

    public String retornarPrimeiroDaLista(int Quantidade){

        List<Integer> numeros = new ArrayList<>();

        for (int inicio = 0; inicio < Quantidade; inicio ++){
            numeros.add(inicio);
        }

        return "Primeiro: " + numeros.getFirst();

    }
}
