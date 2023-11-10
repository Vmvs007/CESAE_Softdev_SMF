import org.Ex_03.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RetanguloTest {

    Retangulo retangulo_01;
    Retangulo retangulo_02;

    @BeforeEach
    public void setUp() {
        retangulo_01 = new Retangulo(10, 7);
        retangulo_02 = new Retangulo(100, 20);
    }

    @Test
    public void instanciarRetanguloImpossivel(){

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo_impossivel = new Retangulo(0,0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo_impossivel = new Retangulo(0,10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo_impossivel = new Retangulo(10,0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo_impossivel = new Retangulo(10,-10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo_impossivel = new Retangulo(-10,10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retangulo_impossivel = new Retangulo(-10,-10);
        });
    }

    @Test
    public void calcularPerimetroTest_01() {
        assertEquals(34, retangulo_01.calcularPerimetro());
    }

    @Test
    public void calcularPerimetroTest_02() {
        assertEquals(240, retangulo_02.calcularPerimetro());
    }

    @Test
    public void calcularAreaTest_01() {
        assertEquals(70, retangulo_01.calcularArea());
    }

    @Test
    public void calcularAreaTest_02() {
        assertEquals(2000, retangulo_02.calcularArea());
    }


}
