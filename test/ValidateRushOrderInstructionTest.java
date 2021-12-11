import controller.PlaceRushOrderController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author QuocPha-20183616
 */
public class ValidateRushOrderInstructionTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "123,false",
            "Nga tu queo trai,true",
            "@123,false"
    })
    void test(String instruction, boolean expected) {
        boolean isValid = placeRushOrderController.validateRushOrderInstruction(instruction);
        Assertions.assertEquals(isValid, expected);
    }
}
