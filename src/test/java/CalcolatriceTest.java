import it.unisa.cristyanesposito.Calcolatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {
    Calcolatrice calcolatrice;

    @BeforeEach
    public final void setUp () {
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void TestSomma () {
        Assertions.assertEquals(10, calcolatrice.somma(7, 3), "somma corretta");
    }

    @Test
    public void TestMoltiplicazione () {
        Assertions.assertEquals(21, calcolatrice.somma(7, 3), "moltiplicazione corretta");
    }

}
