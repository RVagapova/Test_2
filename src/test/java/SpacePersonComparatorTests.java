import org.example.SpacePersonComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpacePersonComparatorTests {
    SpacePersonComparator sut = new SpacePersonComparator();
    @Test
    public void amountCharSTest() {
        String name = "Steev";
        int expected = 1;
        int result = sut.amountCharS(name);
        Assertions.assertEquals(expected, result);
    }
}
