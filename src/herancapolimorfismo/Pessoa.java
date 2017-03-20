/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapolimorfismo;

/**
 *
 * @author Evandro
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
        System.out.println("Construtor......Pessoa");
    }
    
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }    
    public String getTelefone() {
        return telefone;
    }    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public double calcularImpostoDeRenda(){
       double sal = 0;
        if (true) {
            
        }
        
        return 0;
    
    };   
    
}
