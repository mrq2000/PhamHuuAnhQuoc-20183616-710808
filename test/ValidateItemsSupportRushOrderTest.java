import controller.PlaceRushOrderController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author QuocPha-20183616
 */
public class ValidateItemsSupportRushOrderTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "1,true",
            "2,true",
            "8,false"
    })
    void test(int mediaID, boolean expected) {
        boolean isValid = placeRushOrderController.isItemsSupportRushOrder(mediaID);
        Assertions.assertEquals(isValid, expected);
    }
}
