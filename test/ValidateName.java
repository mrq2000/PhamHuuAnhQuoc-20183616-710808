import controller.PlaceOrderController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author QuocPha-20183616
 */
public class ValidateName {

    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Quoc,true",
            "Quoc Pham,false",
            "%Quoc,false",
            "Q425,false",
            "Q()a,false"
    })
    void test(String name, boolean expected) {
        boolean isValid = placeOrderController.validateName(name);
        Assertions.assertEquals(isValid, expected);
    }
}
