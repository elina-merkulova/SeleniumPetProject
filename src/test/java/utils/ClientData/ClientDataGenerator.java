package utils.ClientData;

import java.util.Random;

public class ClientDataGenerator {
    private static final String[] FIRST_NAMES = {"Irina", "Laura", "Valdis", "Daniels", "Ieva", "Uldis"};
    private static final String[] LAST_NAMES = {"Lauva", "Oga", "Perle", "Egle", "Zvaigzne", "Bruks"};

    private final Random random = new Random();

    public String generateRandomFirstName() {
        return FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
    }

    public String generateRandomLastName() {
        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }
    public String generateRandomPersonalID() {
        int number1 = 1000000 + random.nextInt(9000000);
        int number2 = 100000 + random.nextInt(900000);
        String firstPart = Integer.toString(number1);
        String secondPart = Integer.toString(number2);
        return firstPart + "-" + secondPart;
    }
    public String generatePhoneNumber() {
        int randomNumber = (int) (Math.random() * 100000000);
        return "2" + String.format("%07d", randomNumber);
    }
}
