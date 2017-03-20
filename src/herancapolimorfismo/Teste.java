/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapolimorfismo;

import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); 
        
        c.set(Calendar.YEAR, 1988);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 10);
        
        System.out.println("Data/Hora atual: "+c.getTime());
        
    }
}
