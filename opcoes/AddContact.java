package opcoes;
import model.Contact;

import java.util.Scanner;
import java.util.List;

public class AddContact {
    private final List<Contact> contacts;

    public AddContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PREENCHA O NOVO CONTATO:\n");

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Celular: ");
        String cellNumber = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, cellNumber, email);
        contacts.add(newContact);

        System.out.println("Registro gravado com sucesso!");
    }
}