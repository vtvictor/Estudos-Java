package Programa;

public class Pessoa {

    private static int counter = 1;
    private String name;
    private String cpf;
    private String email;

    public Pessoa(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        counter = counter + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + this.getName() + '\'' +
                ", cpf='" + this.getCpf() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';

    }
}
