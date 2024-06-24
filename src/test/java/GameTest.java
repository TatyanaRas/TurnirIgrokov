import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void competition1() {

        Player ivan = new Player(1, "Ivan", 100);
        Player tanya = new Player(2, "Tanya", 50);
        Game game = new Game();

        game.register(ivan);
        game.register(tanya);

        int actual = game.round("Ivan", "Tanya");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void competition2() {

        Player ivan = new Player(1, "Ivan", 100);
        Player tanya = new Player(2, "Tanya", 150);
        Game game = new Game();

        game.register(ivan);
        game.register(tanya);

        int actual = game.round("Ivan", "Tanya");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void competition3() {

        Player ivan = new Player(1, "Ivan", 100);
        Player tanya = new Player(2, "Tanya", 100);
        Game game = new Game();

        game.register(ivan);
        game.register(tanya);

        int actual = game.round("Ivan", "Tanya");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void notRegistered1() {

        Player ivan = new Player(1, "Ivan", 100);

        Game game = new Game();

        game.register(ivan);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Olga", "Ivan"));

    }

    @Test
    public void notRegistered2() {


        Player tanya = new Player(5, "Tanya", 50);
        Game game = new Game();


        game.register(tanya);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Tanya", "Olga"));

    }
}
