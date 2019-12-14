package refatoracao;

import java.util.List;
import java.util.stream.Collectors;

 public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<String> buscarNomesPorLetra (String letra) {
        List<Pessoa> pessoas = pessoaRepository.getPessoas();
        return pessoas.stream()
                .map(Pessoa::getNome)
                .filter(nome -> nome.substring(0, 1).equals(letra))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> nomes = new PessoaService(new PessoaRepository()).buscarNomesPorLetra( "J");
        System.out.println(nomes);
    }
 }








