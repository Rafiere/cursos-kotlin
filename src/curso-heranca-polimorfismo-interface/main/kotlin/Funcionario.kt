open class Funcionario( //O "open" permite que qualquer classe realize a herança dessa classe.
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    /**
     * Convertemos o método "calcularBonificacao()" em uma
     * property, assim, quando utilizamos o método "getBonificacao()", obteremos
     * o valor do método "bonificacao()".
     */

    open val bonificacao: Double
        get(){
            return salario * 0.2
        }

    //Podemos escrever o código acima em uma linha.
    //    open val bonificacao: Double get() = salario * 0.1
}