/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapolimorfismo;

import java.util.Calendar;

/**
 *
 * @author Evandro
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private Calendar dataNascimento;

    public PessoaFisica() {
        System.out.println("Construtor.....Pessoa Fisica");
    }  

    public PessoaFisica(String cpf, String rg, Calendar dataNascimento) {        
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    
    public String getCpf() {
        return cpf;
    }   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
    public String getRg() {
        return rg;
    }   
    public void setRg(String rg) {
        this.rg = rg;
    }   

    /**
     * @return the dataNascimento
     */
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Override
    public double calcularImpostoDeRenda(){
        double saltotal = 3000;
        if (saltotal > 2500) {
            return (saltotal*0.1);
        }else{
            return saltotal;
        }
    }
}
