// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val id: Int, val nome: String) 

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    println("Inscritos: $inscritos")
    fun matricular(usuario: Usuario) {

        inscritos.add(usuario)
        println("Inscritos: $inscritos")
        
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario = Usuario(1, "João")
    val conteudo = ConteudoEducacional("Kotlin", 60)
    val formacao = Formacao("Android", listOf(conteudo))

    formacao.matricular(usuario)

    println("Formação: $formacao")

}
