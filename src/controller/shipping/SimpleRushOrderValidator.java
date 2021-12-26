package controller.shipping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleRushOrderValidator implements RushOrderInputValidator {

    @Override
    public boolean isValidReceiveTime(String time, String pattern) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDateTime localDateTime = LocalDateTime.parse(time, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean isValidRushOrderInfo(String info) {
        return validateBasicString(info);
    }

    @Override
    public boolean isValidRushOrderInstruction(String instruction) {
        return validateBasicString(instruction);
    }

    private boolean validateBasicString(String info) {
        if (info == null || info.isEmpty()) {
            return false;
        }

        for (char ch : info.toCharArray()) {
            if (!Character.isLetter(ch)) {
            	return false;
            }
        }
        return true;
    }
}
