// Importe todas as outras classes necessárias
import model.Contact;
import opcoes.AddContact;
import opcoes.EditContact;
import opcoes.SrcContact;
import opcoes.ListContact;
import opcoes.DelContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();

        int opcao;
        do {
            System.out.print("\nMENU:");
            System.out.print("\n1 - Adicionar novo contato");
            System.out.print("\n2 - Editar um contato");
            System.out.print("\n3 - Pesquisar contato");
            System.out.print("\n4 - Lista de contatos");
            System.out.print("\n5 - Apagar um contato");
            System.out.print("\n6 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = entrada.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    new AddContact(contacts).execute();
                    break;
                case 2:
                    new EditContact(contacts).execute();
                    break;
                case 3:
                    new SrcContact(contacts).execute();
                    break;
                case 4:
                    new ListContact(contacts).execute();
                    break;
                case 5:
                    new DelContact(contacts).execute();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 6);
    }
}

