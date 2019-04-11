/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author ETECIA
 */
public class Carro {
    String nome;
    String marca;
    String cor;
    String fabricacao;
    String largura;
    String peso;
    
    public void mostrar(){
        System.out.println("O carro " + nome +"\n de marca: "+ marca +"\n da cor: " + cor +"\n frabricado em: " 
                + fabricacao +"\n de largura: " + largura +"\n e peso: " + peso );
     }

    public void acelerar(){
        System.out.println(" está acelerando...");
    }
    
    public void acionarTracao(){
    
    }

    public void freiar(){
    
    }
    
    public void acionarSeta(){
    
    }
}
