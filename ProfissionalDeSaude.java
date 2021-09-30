/*Enunciado:
    5. Escreva uma classe ProfissionalDeSaude que herda de Pessoa. Profissionais de saúde possuem um atributo chamado 
    matricula, também encapsulado e acessível indiretamente.

    6. A classe ProfissionalDeSaude deve definir um construtor que recebe nome, idade e matricula e faz as atribuições 
    corretamente, em particular, utilizando o operador super e o método setter de matrícula.

    8. A classe ProfissionalDeSaude define um método chamado aplicar. O método aplicar recebe um objeto do tipo 
    Vacina e um objeto do tipo Paciente como parâmetros. O método aplicar exibe a seguinte mensagem: 
    <nomePaciente> vacinado com <fabricante>. Exemplo: José vacinado com Pfizer.*/

public class ProfissionalDeSaude extends Pessoa{
    //Campos encapsulados
    private int matricula;

    //Construtor recebendo campos e atribuindo por meio do operador super e do metodo setter
    ProfissionalDeSaude(String nome, int idade, int matricula) {
        super(nome, idade);
        setMatricula(matricula);
    }

    //Metodos para acessar indiretamente(getters/setters)
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
