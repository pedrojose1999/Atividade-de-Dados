
// Grupo 08
// Pedro José 
// João Eduardo
// Camila Viana
// Gabriel Moreira 
// Kaique Sousa
// Germano Rodrigues
// Victor Campos

public class Cliente {

	private String nome;
    private String cpf;
    private String celular;
    private String email;

    // Construtor
    public Cliente(String nome, String cpf, String celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

}
