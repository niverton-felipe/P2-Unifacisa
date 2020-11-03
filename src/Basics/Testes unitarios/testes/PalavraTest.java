package abc.com.br.unifacisa.p2.strings.testeunitarios.testes;

import abc.com.br.unifacisa.p2.strings.testeunitarios.classes.Palavra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalavraTest {

    @Test
    void ehPalidromo() {
        assertTrue(Palavra.ehPalidromo("Ana"));
    }

    @Test
    void binarioParaDecimal() {
        assertEquals(25, Palavra.binarioParaDecimal("1111"));
    }

    @Test
    void contaVogais(){
        assertEquals(3, Palavra.contaVogais("Niverton"));
    }
}