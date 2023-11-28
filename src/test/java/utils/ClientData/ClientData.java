package utils.ClientData;

import org.openqa.selenium.devtools.v85.schema.model.Domain;

public class ClientData {
    private final String DOMAIN = "test.lv";
    ClientDataGenerator clientDataGenerator = new ClientDataGenerator();
    private String clientName = clientDataGenerator.generateRandomFirstName();
    private String clientSurname = clientDataGenerator.generateRandomLastName();
    private String clientEmail = clientName + "." + clientSurname + "@" + DOMAIN;
    private String invalidEmail = clientName + "." + clientSurname + DOMAIN;
    private String toLongEmail = clientDataGenerator.randomString(65) + "@" + DOMAIN;
    private String passwordVeryShort = clientDataGenerator.randomString(2) ;
    private String passwordShort = clientDataGenerator.randomString(5) ;
    private String passwordMedium = clientDataGenerator.randomString(9);
    private String passwordStrong = clientDataGenerator.randomString(15);
    private String clientPersonalId = clientDataGenerator.generateRandomPersonalID();
    private String clientPhoneNumber = clientDataGenerator.generatePhoneNumber();

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPersonalId() {
        return clientPersonalId;
    }

    public void setClientPersonalId(String clientPersonalId) {
        this.clientPersonalId = clientPersonalId;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public ClientDataGenerator getClientDataGenerator() {
        return clientDataGenerator;
    }

    public void setClientDataGenerator(ClientDataGenerator clientDataGenerator) {
        this.clientDataGenerator = clientDataGenerator;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getToLongEmail() {
        return toLongEmail;
    }

    public void setToLongEmail(String toLongEmail) {
        this.toLongEmail = toLongEmail;
    }

    public String getPasswordVeryShort() {
        return passwordVeryShort;
    }

    public void setPasswordVeryShort(String passwordVeryShort) {
        this.passwordVeryShort = passwordVeryShort;
    }

    public String getPasswordShort() {
        return passwordShort;
    }

    public void setPasswordShort(String passwordShort) {
        this.passwordShort = passwordShort;
    }

    public String getPasswordMedium() {
        return passwordMedium;
    }

    public void setPasswordMedium(String passwordMedium) {
        this.passwordMedium = passwordMedium;
    }

    public String getPasswordStrong() {
        return passwordStrong;
    }

    public void setPasswordStrong(String passwordStrong) {
        this.passwordStrong = passwordStrong;
    }
}
