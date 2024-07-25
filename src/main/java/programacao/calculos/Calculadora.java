package programacao.calculos;

// Calculadora.java
public class Calculadora {

    // Método para soma de dois números
    public int soma(int a, int b) {
        return a + b;
    }

    // Método para subtração de dois números
    public int subtracao(int a, int b) {
        return a - b;
    }

    // Método para calcular o fatorial de um número
    public int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo para calcular o fatorial.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular a sequência de Fibonacci até o enésimo termo
    public int[] fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Número deve ser maior que zero para calcular Fibonacci.");
        }
        int[] sequencia = new int[n];
        sequencia[0] = 0;
        if (n > 1) {
            sequencia[1] = 1;
            for (int i = 2; i < n; i++) {
                sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
            }
        }
        return sequencia;
    }

    // Método para calcular a tabuada de um número até um certo limite
    public int[] tabuada(int numero, int limite) {
        if (numero <= 0 || limite <= 0) {
            throw new IllegalArgumentException("Número e limite devem ser maiores que zero para calcular a tabuada.");
        }
        int[] tabuada = new int[limite];
        for (int i = 1; i <= limite; i++) {
            tabuada[i - 1] = numero * i;
        }
        return tabuada;
    }
}

