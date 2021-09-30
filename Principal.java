public class Principal {
    public static void main(String[] args) {
        Vacina vacina = new Vacina("Vacina Covid-19","Pfizer",53);
        ProfissionalDeSaude profissionalDeSaude = new ProfissionalDeSaude("Maria", 27, 11223344);
        Pessoa pessoa = new Pessoa("João", 43);
        Paciente paciente = new Paciente(pessoa.getNome(), pessoa.getIdade());
        profissionalDeSaude.aplicar(vacina,paciente);
    }
}
