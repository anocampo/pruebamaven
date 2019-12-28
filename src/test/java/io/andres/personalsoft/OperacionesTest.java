package io.andres.personalsoft;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones op;

    @Before
    public void setup(){
        op = new Operaciones();
    }

    @Test
    public void sumaTest() {
        Assert.assertEquals("La suma es igual", 11, op.resultadoSuma(5, 6));
    }

    @Test
    public void restaTest() {
        Assert.assertEquals("La resta es igual", 1, op.resultadoResta(6,5 ));
    }

    @Test
    public void multipliacionTest() {
        Assert.assertEquals("La multiplicacion es igual", 30, op.resultadoMultiplicacion(5, 6));
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals("La Division es igual", 5, op.resultadoDivision(10, 2));
    }
}

