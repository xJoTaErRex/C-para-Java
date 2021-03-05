/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopilha;

/**
 *
 * @author jr13f
 */
public class Pilha {
    
     private final int capacidade = 5; 
     private Funcionario[] dados = new Funcionario[capacidade];
     private int topo = -1;
     
     public int Tamanho(){
         return topo +1;    
     }
     
     public void Empilha(Funcionario funcionario)throws Exception{
         if(Tamanho()!= capacidade){
            topo++;
            dados[topo] = funcionario;
         }
         else
         {
             throw new Exception("A pilha está cheia!!!");
         }
             
     }
     
     public Funcionario Desempilha()throws Exception{
         
         if(Tamanho() == 0){
            throw new Exception("A pilha está vazia!!!");
         }
         else
         {
             topo --;
             return dados[topo + 1];
         }
             
     }
     
     public Funcionario RetornaTopo()throws Exception{
         if(Tamanho() == 0){
             throw new Exception("A pilha está vazia!!!");
         }
         else{
             return dados[topo];
         }
     
     }
                
}
