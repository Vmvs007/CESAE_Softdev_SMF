import org.Ex_09.GameStore;
import org.Ex_09.VideoGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GameStoreTest {

    private GameStore gs;

    @BeforeEach
    public void setUp() {
        gs = new GameStore();
    }

    @Test
    public void addGameToStockTest() {
        // Instanciar 1 jogo
        VideoGame skyrim = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);

        // Adicionar o jogo ao arrayList "stock"
        gs.addGameToStock(skyrim);

        // Testar se o array tem tamanho 1
        assertEquals(1, gs.getStock().size());
        // Testar se o jogo instanciado se encontra efetivamente no array
        assertEquals(skyrim, gs.getStock().get(0));
    }

    @Test
    public void addGameToStockTest2() {

        // Instanciar 3 jogow
        VideoGame skyrim = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);
        VideoGame gtaV = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        VideoGame zelda = new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 30.0, 60.0);

        // Adicionar o jogo ao arrayList "stock"
        gs.addGameToStock(skyrim);
        gs.addGameToStock(gtaV);
        gs.addGameToStock(zelda);

        // Testar se o array tem tamanho 1
        assertEquals(3, gs.getStock().size());

        // Testar se o jogo instanciado se encontra efetivamente no array
        assertEquals(skyrim, gs.getStock().get(0));
        assertEquals(gtaV, gs.getStock().get(1));
        assertEquals(zelda, gs.getStock().get(2));
    }

    @Test
    public void stockStartsWith0Size() {
        // Testar se o array começa com tamanho 0
        assertEquals(0, gs.getStock().size());
    }

    @Test
    public void salesStartsWith0Size() {
        // Testar se o array começa com tamanho 0
        assertEquals(0, gs.getSales().size());
    }

    @Test
    public void sellGameTest() {

        // Instanciar 3 jogos
        VideoGame skyrim = new VideoGame("Skyrim", "Beteshda", 10.0, 50.0);
        VideoGame gtaV = new VideoGame("GTA V", "Rockstar", 15.0, 70.0);
        VideoGame zelda = new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 30.0, 60.0);

        gs.addGameToStock(skyrim);
        gs.addGameToStock(gtaV);

        gs.sellGame(0);

        // Testar se o array stock fica sem o jogo vendido
        assertNotEquals(skyrim, gs.getStock().get(0));

        // Testar se o array sales fica com o jogo vendido
        assertEquals("Skyrim", gs.getSales().get(0).getName());
        assertEquals(50, gs.getSales().get(0).getSellingPrice());
    }



}
