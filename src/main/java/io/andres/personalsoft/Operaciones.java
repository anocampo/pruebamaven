package io.andres.personalsoft;

public class Operaciones {

    int resultadoSuma;
    int resultadoMultiplicacion;
    int resultadoResta;

    public int resultadoSuma(int a, int b) {
        resultadoSuma = a + b;
        return resultadoSuma;
    }

    public int resultadoResta(int a, int b) {
        resultadoResta = a - b;
        return resultadoResta;
    }

    public int resultadoMultiplicacion(int a, int b) {
        resultadoMultiplicacion = a * b;
        return resultadoMultiplicacion;
    }

    public int resultadoDivision(int a, int b) {
        return  a/b;
    }
}
