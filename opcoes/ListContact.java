package opcoes;

import model.Contact;

import java.util.List;

public class ListContact {
    private final List<Contact> contacts;

    public ListContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void execute() {
        System.out.println("CONTATOS DA AGENDA\n");

        for (Contact contact : contacts) {
            System.out.println("Nome: " + contact.getName());
            System.out.println("Celular: " + contact.getCellNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println();
        }

        System.out.println("FIM DA AGENDA");
    }
}
