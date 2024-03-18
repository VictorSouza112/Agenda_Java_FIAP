package model;

public class Contact {
    private String name;
    private String cellNumber;
    private String email;

    public Contact(String name, String cellNumber, String email) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
