import controller.PlaceOrderController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author QuocPha-20183616
 */
public class ValidateAddressTest {

    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Ha ---- Noi,false",
            "Ha No*i,false,",
            "Ha Noi,true"
    })
    void test(String address, boolean expected) {
        boolean isValid = placeOrderController.validateAddress(address);
        Assertions.assertEquals(isValid, expected);
    }
}
