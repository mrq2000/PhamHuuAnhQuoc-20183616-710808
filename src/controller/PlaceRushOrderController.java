package controller;

import java.util.List;

/**
 * @author QuocPham-20183616
 */
public class PlaceRushOrderController {

    /**
     * Specify provinces that support rush order
     */
    public static List<String> PROVINCES_SUPPORT_RUSH_ODER = List.of("Ha Noi", "Ho Chi Minh", "Da Nang");  
   
    /**
     * Specify media id that support rush order
     */
    public static List<Integer> MEDIA_IDS_SUPPORT_RUSH_ORDER =  List.of(1, 2, 3, 4, 5); 

    /**
     * Method checks user's location is support rush order or not
     * @param location User's province
     */
    public boolean isLocationSupportRushOrder(String location) {
        if (PROVINCES_SUPPORT_RUSH_ODER.contains(location)) {
            return true;
        }
        return false;
    }

    /**
     * Method checks user's media support is rush order or not
     * @param mediaID Cart's media id
     */
    public boolean isItemsSupportRushOrder(int mediaID) {
        if (MEDIA_IDS_SUPPORT_RUSH_ORDER.contains(mediaID)) {
            return true;
        }
        return false;
    }

    /**
     * Method checks user's info support rush order or not
     * @param location User's province
     * @param mediaID Cart's media id
     */
    public boolean isSupportRushOrder(String location, int mediaID) {
        return isLocationSupportRushOrder(location) && isItemsSupportRushOrder(mediaID);
    }
   
    /**
     * Method validates user's rush order info
     * @param info User's rush order info
     */
    public boolean validateRushOrderInfo(String info) {
        return isOnlyLetterAndSpace(info);
    }

    /**
     * Method validates user's rush order instruction
     * @param instruction User's rush order instruction
     */
    public boolean validateRushOrderInstruction(String instruction) {
        return isOnlyLetterAndSpace(instruction);
    }

    private boolean isOnlyLetterAndSpace(String info) {
        if (info == null || info.isEmpty()) {
            return false;
        }

        for (char ch : info.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isSpace(ch) ) {
                return false;
            }
        }

        return true;
    }
}
