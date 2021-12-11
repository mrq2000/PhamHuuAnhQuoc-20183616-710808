import controller.PlaceRushOrderController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author QuocPha-20183616
 */
public class ValidateLocationSupportRushOrderTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Ha Noi,true",
            "Ho Chi Minh,true",
            "asdasdads,false",
            "Da Nang,true"
    })
    void test(String province, boolean expected) {
        boolean isValid = placeRushOrderController.isLocationSupportRushOrder(province);
        Assertions.assertEquals(isValid, expected);
    }
}
