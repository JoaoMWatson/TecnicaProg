package loja;
import java.util.Scanner;

public class ClassePrincipal  {

    public static void main(String[] args) {

 /* Cria variavel que armazena referencias da classe carro e cria objeto com
   atributos da classe carro. */
    Carro objCarro;
    objCarro = new Carro();   
 // ==============================================================================================       
    // Cria variavel scan que le a informação digitada pelo usuario. Equivalente ao input.
    Scanner scan = new Scanner(System.in);
 // ==============================================================================================
    // Leitura do usuario 
    System.out.println("CARRO 01");
    System.out.println("==============================================================");
        
    System.out.print("Nome do carro: ");
    objCarro.nome = scan.next();
     System.out.print("Marca do carro: ");
    objCarro.marca = scan.next();
     System.out.print("Cor do carro: ");
    objCarro.cor = scan.next();
     System.out.print("Fabricação do carro: ");
    objCarro.fabricacao = scan.nextInt();
     System.out.print("Largura do carro: ");
    objCarro.largura = scan.nextFloat();
     System.out.print("Peso do carro: ");
    objCarro.peso = scan.nextFloat();
  // Metodo que mostra as informações digitadas pelo usuario do objCarro
    objCarro.mostrar();
 // ==============================================================================================   
    
  // Segundo obj com os parametros e atributos da classe carro. 
    Carro objCarro2;
    objCarro2 = new Carro();
     System.out.println("CARRO 02");
    System.out.println("==============================================================");
    
    System.out.print("Nome do carro: ");
    objCarro2.nome = scan.next();
     System.out.print("Marca do carro: ");
    objCarro2.marca = scan.next();
     System.out.print("Cor do carro: ");
    objCarro2.cor = scan.next();
     System.out.print("Fabricação do carro: ");
    objCarro2.fabricacao = scan.nextInt();
     System.out.print("Largura do carro: ");
    objCarro2.largura = scan.nextFloat();
     System.out.print("Peso do carro: ");
    objCarro2.peso = scan.nextFloat();
  // Metodo que mostra as informações digitadas pelo usuario do objCarro2   
    objCarro2.mostrar();
  // ================================================================================================
//  Criação do obj carro 3
    Carro objCarro3;
    objCarro3 = new Carro();
    
  // Leitura de parametros pelo input do usuario
    System.out.println("CARRO 03");
    System.out.println("==============================================================");
    
    System.out.print("Nome do carro: ");
    objCarro2.nome = scan.next();
     System.out.print("Marca do carro: ");
    objCarro2.marca = scan.next();
     System.out.print("Cor do carro: ");
    objCarro2.cor = scan.next();
     System.out.print("Fabricação do carro: ");
    objCarro2.fabricacao = scan.nextInt();
     System.out.print("Largura do carro: ");
    objCarro2.largura = scan.nextFloat();
     System.out.print("Peso do carro: ");
    objCarro2.peso = scan.nextFloat();
    
// Metodo mostrar as informações coletadas da var obj carro3
    objCarro3.mostrar();
    }
}