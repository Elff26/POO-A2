public class ProfissionalDeSaude extends Pessoa{
    private int matricula;

    ProfissionalDeSaude(String nome, int idade, int matricula) {
        super(nome, idade);
        setMatricula(matricula);
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void aplicar(Vacina vacina, Paciente paciente){
        System.out.printf("%s vacinado com %s", paciente.getNome(), vacina.getFabricante());
    }
}
