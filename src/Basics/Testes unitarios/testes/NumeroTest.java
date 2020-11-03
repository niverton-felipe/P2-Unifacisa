package abc.com.br.unifacisa.p2.strings.testeunitarios.testes;

import abc.com.br.unifacisa.p2.strings.testeunitarios.classes.Numero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {
    Numero n = new Numero();
    @Test
    void numeroPar() {
        assertTrue(n.numeroPar(6));
    }

    @Test
    void calculaAreaQuadrada() {
        assertEquals(100, n.calculaAreaQuadrada(10));
    }
}


