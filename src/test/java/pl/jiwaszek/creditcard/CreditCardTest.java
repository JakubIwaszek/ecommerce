package pl.jiwaszek.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import pl.jiwaszek.ecommerce.creditcard.CreditBelowThresholdException;
import pl.jiwaszek.ecommerce.creditcard.CreditCard;
import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignInitialCredit() {
        CreditCard card = new CreditCard("1234-5678");
        card.assignCredit(BigDecimal.valueOf(1000));
        assertEquals(BigDecimal.valueOf(1000), card.getCurrentBalance());
    }

    @Test
    void itShouldThrowCreditBelowTreshholdException() {
        CreditCard card = new CreditCard("1234-5678");
        assertThrows(
                CreditBelowThresholdException.class,
                () -> card.assignCredit(BigDecimal.valueOf(10)));
    }
}
