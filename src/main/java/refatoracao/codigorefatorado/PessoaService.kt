package refatoracao.codigorefatorado

import refatoracao.PessoaRepository

 class PessoaService(private val pessoaRepository: PessoaRepository) {
    fun buscarNomesPorLetra(letra: String): List<String> {
        val pessoas = pessoaRepository.pessoas
        return pessoas
                .map { it.nome }
                .filter{ nome -> nome.first() == letra.first() }
    }
 }
 fun main() {
    val nomes = PessoaService(PessoaRepository()).buscarNomesPorLetra("J")
    println(nomes)
 }








