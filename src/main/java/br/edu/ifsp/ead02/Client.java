package br.edu.ifsp.ead02;

import java.time.LocalDate;

public class Client {
    private String cpf;
    private String name;
    private LocalDate birthDate;
    private String phone;

    public  Client(){
    }

    public Client(String cpf, String name, LocalDate birthDate, String phone) {
        this.cpf = cpf;
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    protected String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return getCpf() + " " + getName() + " " + getBirthDate() + " " + getPhone();
    }
}
