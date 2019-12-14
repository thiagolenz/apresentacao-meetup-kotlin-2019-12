package refatoracao;

import java.util.Arrays;
import java.util.List;

public class PessoaRepository {
    public List<Pessoa> getPessoas() {
        return Arrays.asList(
                new Pessoa("Joaquim"),
                new Pessoa("Felipe"),
                new Pessoa("Janaina"),
                new Pessoa("Ana"));
    }
}
