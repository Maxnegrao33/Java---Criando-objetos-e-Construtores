/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.executavel;

//Chamando a classe Aluno
import cursojava.classes.Aluno;
/**
 *
 * @author Maciel Oliveira
 */
public class AprendizadoJava {

    //Main é o objeto principal Java
    public static void main(String[] args) {
     
        //Criando um objeto Aluno na Memória        
        Aluno aluno1 = new Aluno();
        
        Aluno aluno2 = new Aluno();
        
        //Contrutor padrão
        Aluno aluno3 = new Aluno();
        
        //Contrutor com um parâmetro
        Aluno aluno4 = new Aluno("Maria");
        
        //Contrutor com dois parâmetros
        Aluno aluno5 = new Aluno("José", 16);
    }
    
}
