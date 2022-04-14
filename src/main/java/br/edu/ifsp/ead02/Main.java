package br.edu.ifsp.ead02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ClientDAO clientDAO = new ClientDAO();
        Client c1 = new Client("123.123.123-99", "Caue",
        LocalDate.of(2003,3, 15), "(16)99999-9999");
        clientDAO.insert(c1);

        Client c2 = new Client("987.987.987-97", "Emily",
        LocalDate.of(2000,10, 23), "(44)88888-8888");
        clientDAO.insert(c2);

        System.out.println("Listando todos os clientes antes da primeira remoção...");
        clientDAO.findAll();

        System.out.println();

        System.out.println("Listando o cliente de cpf \"123.123.123-99\"...");
        System.out.println(clientDAO.findOne("123.123.123-99"));

        System.out.println();

        clientDAO.remove("123.123.123-99");
        System.out.println("Listando todos os clientes depois da primeira remoção...");
        clientDAO.findAll();

        c2.setName("Emily2");
        c2.setPhone("(44)xxxxx-xxxx");
        clientDAO.update(c2);
        System.out.println("c2 após a atualização:");
        clientDAO.findAll();
    }

}
