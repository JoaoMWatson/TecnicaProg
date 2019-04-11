package loja;
import java.util.Scanner;

public class ClassePrincipal  {

    public static void main(String[] args) {

    Carro objCarro;
    objCarro = new Carro();
    
    Carro objCorsa; 
    objCorsa = new Carro();
    objCorsa.nome = "Corsa";
    objCorsa.marca = "Chevrolet";
    objCorsa.cor = "Vinho";
    objCorsa.fabricacao = "1994";
    objCorsa.largura =  "1.646";
    objCorsa.peso = "1.020";
     
    objCorsa.mostrar();
    objCorsa.acelerar();
   
    Carro objPalio;
    objPalio = new Carro();
    objPalio.nome = "Palio";
    objPalio.marca = "Fiat";
    objPalio.cor = "Cinza";
    objPalio.fabricacao = "2007";
    objPalio.largura = "1.634";
    objPalio.peso = "940";
    
    objPalio.mostrar();
    objPalio.acelerar();
    
    
    }

}