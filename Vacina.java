public class Vacina{
    private String descricao, fabricante;
    private int lote;

    Vacina(){
       System.out.println("Construindo uma vacina....");
    }

    Vacina(String descricao, String fabricante, int lote){
        setDescricao(descricao);
        setFabricante(fabricante);
        setLote(lote);
     }

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