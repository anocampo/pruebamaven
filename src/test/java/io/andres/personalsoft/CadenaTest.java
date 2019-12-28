package io.andres.personalsoft;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CadenaTest {

    private Cadena cd;

    @Before
    public void setup() throws Exception{
        cd = new Cadena();
    }

    @Test
    public void concatenar() {
        String esperado = "Pedro Perez";
        Assert.assertEquals("No es lo esperado", esperado, cd.concatenar("Pedro", "Perez"));

    }
}