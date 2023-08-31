package utils.ClientData;

public class ClientData {
    ClientDataGenerator clientDataGenerator = new ClientDataGenerator();
    private String clientName = clientDataGenerator.generateRandomFirstName();
    private String clientSurname = clientDataGenerator.generateRandomLastName();
    private String clientEmail = clientName + "." + clientSurname + "@" + "test.lv";
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
}
