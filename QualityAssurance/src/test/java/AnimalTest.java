import org.Ex_02.Alimento;
import org.Ex_02.Animal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal leao;
    private Animal elefante;

    @BeforeEach
    public void setUp() {
        leao = new Animal("Simba", Alimento.CARNE);
        elefante = new Animal("Dumbo", Alimento.FRUTAS);
    }


    @Test
    public void comerAlimentoQueGostaTest() {
        assertTrue(leao.estaComFome());
        leao.comer(Alimento.CARNE);
        assertFalse(leao.estaComFome());
    }

    @Test
    public void comerAlimentoQueNaoGostaTest() {
        assertTrue(leao.estaComFome());
        leao.comer(Alimento.VEGETAIS);
        assertTrue(leao.estaComFome());
    }

    @Test
    public void comerAlimentoQueGostaFruta() {
        elefante.comer(Alimento.FRUTAS);
        assertFalse(elefante.estaComFome());
    }

    @Test
    public void comerAlimentoQueNaoGostaVegetal() {
        elefante.comer(Alimento.CARNE);
        assertTrue(elefante.estaComFome());
    }

    @Test
    public void getNomeTestAnimal1() {
        assertEquals("Simba", leao.getNome());
    }

    @Test
    public void getNomeTestAnimal2() {
        assertEquals("Dumbo", elefante.getNome());
    }

    @Test
    public void getAlimentacaoTest1() {
        assertEquals(Alimento.CARNE, leao.getTipoAlimentacao());
    }

    @Test
    public void getAlimentacaoTest2() {
        assertEquals(Alimento.FRUTAS, elefante.getTipoAlimentacao());
    }

}
