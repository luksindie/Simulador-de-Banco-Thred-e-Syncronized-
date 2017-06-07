/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author verap
 */
public class ComprasEmFamilia implements Runnable {	
        
	ContaConjunta conta = new ContaConjunta();
	TelaPrincipal tela = new TelaPrincipal();
        
	public  static void main(String[] args){
		
	}
            
    public void run() {
    	//quem esta sacando
    	String cliente = Thread.currentThread().getName();   
                //System.out.println("v11 "+tela.getV1());
                try{        
    		conta.sacar(tela.getV1(), cliente);
    		if(conta.getSaldo() < 0){
    			System.out.print("Estourou\n");
    		}    	
    	//}
        }catch(Exception e){
        
                    System.out.println(e.getMessage()+e.getCause());
        }
 
    
    }
    
}