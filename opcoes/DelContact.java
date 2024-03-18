package opcoes;

import model.Contact;

import java.util.List;
import java.util.Scanner;

public class DelContact {
    private final List<Contact> contacts;

    public DelContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE UM NOME:\n");

        System.out.print("Nome.......: ");
        String name = scanner.nextLine();

        // Encontre o contato na lista de contatos
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                // O contato foi encontrado, remova-o da lista de contatos
                contacts.remove(i);
                System.out.println("Registro apagado com Sucesso!");
                return;
            }
        }

        // Se chegarmos aqui, o contato não foi encontrado
        System.out.println("Registro não encontrado!");
    }
}
