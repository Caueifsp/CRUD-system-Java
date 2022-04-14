package br.edu.ifsp.ead02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientDAO implements GenericDAO <Client, String>{
    Map<String, Client> clients;

    public ClientDAO() {
        clients = new LinkedHashMap<>();
    }

    public void insert(Client c) {
        clients.put(c.getCpf(), c);
    }

    public Client findOne(String primaryKey) {
        return clients.get(primaryKey);
    }

    public void findAll() {
        for(Map.Entry<String, Client> entry : clients.entrySet())
            System.out.println(entry.getValue());
    }

    public void update(Client c) {
        /*final Scanner scanner = new Scanner(System.in);
        System.out.print("Novo nome: ");
        c.setName(scanner.nextLine());
        System.out.print("Novo telefone: ");
        c.setPhone(scanner.nextLine());*/
        clients.replace(c.getCpf(), c);
    }

    public void remove(String primaryKey) {
        if(!clients.containsKey(primaryKey)) return;
        clients.remove(primaryKey);
    }
}
