import java.util.ArrayList;

public class DatabaseBonus {
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Bonus getBonusById(int id) {
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                temp = bonus;
            }
        }
        return temp;
    }

    public static Bonus getBonusByRefferalCode(String refferalCode) {
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                temp = bonus;
            }
        }
        return temp;
    }

    public static boolean addBonus(Bonus bonus) {
        for (Bonus bonus2 : BONUS_DATABASE) {
            if (bonus.getReferralCode() == bonus2.getReferralCode()) {
                return false;
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id) {
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                temp = true;
            }
        }
        return temp;
    }

    public static boolean deactivateBonus(int id) {
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                temp = true;
            }
        }
        return temp;
    }

    public static boolean removeBonus(int id) {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }
}