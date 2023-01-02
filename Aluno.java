/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

/**
 @author Maciel Oliveira
 *Engenheiro da Computação
 * Pós em Engenharia de Software
 * Dev. full Stack
 */
public class Aluno {
    
    String nome;
    int idade;
    String dataNascimento;
    String endereco;
    String registroGeral;
    String numeroCPF;
    String nomeMae;
    String nomePai;
    String telefoneResposavel;
    String dataMatricula;
    String nomeEscola;
    String curso;
    String serieMatriculado;
    
    //Chamando o Construtor
    //Cria os dados na memória como Java
    public Aluno(){
       
    }
    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }
    
    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    
        
    }
}
