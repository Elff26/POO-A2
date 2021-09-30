/*Enunciado:
    4. Escreva uma classe chamada Pessoa. Pessoas têm nome e idade, ambos encapsulados e acessíveis indiretamente. 
    A classe Pessoa define um construtor que recebe valores para atribuir a suas variáveis de instância e o 
    faz por meio dos métodos setters.*/

public class Pessoa {
    //Campos encapsulados
    private String nome;
    private int idade;

    //Construtor recebendo valores para atribuir a variaveis de instacia por meio de metodos setters
    Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    //Metodos para acessar indiretamente(getters/setters)
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}
