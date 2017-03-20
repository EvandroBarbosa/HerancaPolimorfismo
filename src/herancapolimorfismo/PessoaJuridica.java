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
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscEstadual;
    private String inscMunicipal;

    public PessoaJuridica() {
        System.out.println("Contrutor.....PessoaJuridica");
    }

    public PessoaJuridica(String cnpj, String inscEstadual, String inscMunicipal) {        
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.inscMunicipal = inscMunicipal;
    }
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getInscEstadual() {
        return inscEstadual;
    }
  
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
   
    public String getInscMunicipal() {
        return inscMunicipal;
    }
   
    public void setInscMunicipal(String inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }   
    @Override
    public double calcularImpostoDeRenda(){
        double renBruta = 120000;
        if (renBruta > 100000) {
            return (renBruta*0.10);
            
        }else{
            return renBruta;
        }
    }
}
