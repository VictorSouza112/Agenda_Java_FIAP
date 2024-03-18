package opcoes;

import model.Contact;

import java.util.List;
import java.util.Scanner;

public class SrcContact {
    private final List<Contact> contacts;

    public SrcContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PESQUISAR CONTATO:\n");

        System.out.print("Nome.......: ");
        String name = scanner.nextLine();

        // Encontre o contato na lista de contatos
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                // O contato foi encontrado, imprima as informações do contato
                System.out.println("Registro encontrado!");
                System.out.println("Nome: " + contact.getName());
                System.out.println("Celular: " + contact.getCellNumber());
                System.out.println("Email: " + contact.getEmail());
                return;
            }
        }

        // Se chegarmos aqui, o contato não foi encontrado
        System.out.println("Registro não encontrado!");
    }
}
