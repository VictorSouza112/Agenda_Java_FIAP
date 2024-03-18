package opcoes;

import model.Contact;

import java.util.List;
import java.util.Scanner;

public class EditContact {
    private final List<Contact> contacts;

    public EditContact(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("EDITANDO(PESQUISE O CONTATO):\n");

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        // Encontre o contato na lista de contatos
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                // O contato foi encontrado, peça ao usuário as novas informações
                System.out.println("Registro encontrado!");

                System.out.print("Novo nome: ");
                String newName = scanner.nextLine();

                System.out.print("Novo celular: ");
                String newCellNumber = scanner.nextLine();

                System.out.print("Novo e-mail: ");
                String newEmail = scanner.nextLine();

                // Atualize o contato com as novas informações
                contact.setName(newName);
                contact.setCellNumber(newCellNumber);
                contact.setEmail(newEmail);

                System.out.println("Registro editado com sucesso!");
                return;
            }
        }

        // Se chegarmos aqui, o contato não foi encontrado
        System.out.println("Registro não encontrado!");
    }
}