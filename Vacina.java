/*Enunciado: 
    1. Uma classe que descreve o que é uma vacina. Vacinas têm descrição, lote e fabricante. 
    Todos os seus campos devem ser encapsulados e acessíveis indiretamente por outras classes. 
    O tipo de cada campo fica a seu critério.

    2. A classe Vacina deve possuir o construtor padrão.

    3. A classe Vacina deve possuir um construtor que recebe valores a serem atribuídos a 
    cada campo e faz as atribuições utilizando os métodos setters.*/

public class Vacina{
    //Campos encapsulados
    private String descricao, fabricante;
    private int lote;

    //Construtor Padrão
    Vacina(){
       System.out.println("Construindo uma vacina....");
    }

    //Construtor recebendo valores a serem atribuidos. Atribuições sendo feitas pelos metodos setters
    Vacina(String descricao, String fabricante, int lote){
        setDescricao(descricao);
        setFabricante(fabricante);
        setLote(lote);
     }

    //Metodos para acessar indiretamente(getters/setters)
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setLote(int lote){
        this.lote = lote;
    }

    public int getLote(){
        return this.lote;
    }
}