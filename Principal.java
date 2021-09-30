/*Enunciado:
    9. Escreva uma classe chamada Principal. A classe Principal faz o seguinte:

        9.1 Define o método main.

        9.2 No método main, instancia uma vacina de lote igual a 53, descrição igual a "vacina covid-19" e 
        fabricante "Pfizer".

        9.3 No método main, instancia uma profissional de saúde chamada Maria, de idade igual a 27 e 
        matricula igual a 11223344.

        9.4 No método main, instancia um objeto do tipo Pessoa chamado João. João tem 43 anos.

        9.5. No método main, chama o método aplicar do profissional de saúde, passando a vacina e a 
        pessoa instanciadas anteriormente como argumentos.*/

public class Principal {
    public static void main(String[] args) {
        //Instaciando Vacina
        Vacina vacina = new Vacina("Vacina Covid-19","Pfizer",53);

        //Instaciando Profissional de Saude
        ProfissionalDeSaude profissionalDeSaude = new ProfissionalDeSaude("Maria", 27, 11223344);

        //Instanciando Pessoa
        Pessoa pessoa = new Pessoa("João", 43);

        //Passando pessoa como parametro para acessar seus atributos indiretamente pelo metodo getter e 
        //torna-la um paciente.
        Paciente paciente = new Paciente(pessoa.getNome(), pessoa.getIdade());

        //Metodo que aplica a vacina
        profissionalDeSaude.aplicar(vacina,paciente);
    }
}
