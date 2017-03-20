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
public class TestePessoa {
    public static void main(String[] args) {
        //criando instancia das classes Pessoa, PessoaFisica, PessoaJuridica
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Calendar c  = Calendar.getInstance();
       
        c.set(1988, 03, 21);
        
        
        System.out.println();
        
        System.out.println("#################################################################");
        System.out.println("PessoaFisica");
        pf.setNome("João");
        pf.setEndereco("Rua Pilares");
        pf.setCpf("013.625.431-50");
        pf.setRg("652452");
        pf.setTelefone("3245-8574");
        pf.setDataNascimento(c);
        
        System.out.println("Nome...................."+pf.getNome());
        System.out.println("Endereço................"+pf.getEndereco());
        System.out.println("CPF....................."+pf.getCpf());
        System.out.println("RG......................"+pf.getRg());
        System.out.println("Telefone................"+pf.getTelefone());      
        System.out.println("Data nascimento........."
                +pf.getDataNascimento().get(Calendar.DAY_OF_MONTH)+"/"
                +pf.getDataNascimento().get(Calendar.MONTH)+"/"
                +pf.getDataNascimento().get(Calendar.YEAR));      
        System.out.println("Imposto de Renda........"+pf.calcularImpostoDeRenda());      
        System.out.println();
        System.out.println("#################################################################");
        System.out.println("PessoaJuridica");
        pj.setNome("João");
        pj.setEndereco("Rua Pilares");       
        pj.setTelefone("3245-8574");
        pj.setInscEstadual("125b12");
        pj.setInscMunicipal("521c17");
        pj.setCnpj("412454/00122");
        System.out.println("Nome...................."+pj.getNome());
        System.out.println("Endereço................"+pj.getEndereco());
        System.out.println("CNPJ...................."+pj.getCnpj());
        System.out.println("Inscrição Estadual......"+pj.getInscEstadual());
        System.out.println("Telefone................"+pj.getTelefone());      
        System.out.println("Inscrição Municipal....."+pj.getInscMunicipal());      
        System.out.println("Imposto de Renda........"+pj.calcularImpostoDeRenda());      
        System.out.println("#################################################################");
                
    }
}
