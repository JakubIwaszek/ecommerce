package pl.jiwaszek;

import org.junit.jupiter.api.Test;
import pl.jiwaszek.ecommerce.LolGreeter;

public class FirstTest {
    @Test
    void itSumDigits() {
        int a = 2;
        int b = 4;
        int result = a + b;
        assert result == 6;
    }

    @Test
    void isGreetLol() {
        String name = "Kuba";
        LolGreeter greeter = new LolGreeter();
        String result = greeter.greet(name);
        assert result.equals("loool Kuba");
    }
}
