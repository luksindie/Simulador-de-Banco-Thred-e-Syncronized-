/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;
/**
 *
 */
public class ContaConjunta {
    TelaPrincipal tela = new TelaPrincipal();
    
    private double saldo = tela.getSaldo();
        
	// reuperar valor do saldo
    public double getSaldo() {
    	return saldo;    	
    }
    //realização do saque
    //synchronized faz o bloqueio da thread
    public void sacar(int valor, String cliente){
            //System.out.println("Saldo Conta "+ tela.getSaldo());
    	if(saldo >= valor){
               
    		double saldoOriginal = saldo;                
    		System.out.println(cliente + " vai sacar" );
    		//tempo para aguardar saque
    		try{
    			System.out.println(cliente + " esperando" );
    			Thread.sleep(1000); // aguarda processamento de 1 seg
    		} catch (InterruptedException e){}
    		
    		saldo -= valor;
    		String msg = cliente + " SACOU " + valor 
    			+ " [Saldo Original= " + saldoOriginal 
    			+ " Saldo Final= " + saldo + "]";
    		System.out.println(msg);
    	}else{
    		System.out.println("Saldo insuficiente para " + cliente );
    	}
    	
    }
     
}
