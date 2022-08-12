class Gerente( //Aqui devemos inserir os atributos que diferem da classe herdada como "val".
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int

): Funcionario(nome, cpf, salario){ //Aqui devemos chamar o método construtor da classe herdada.

    override val bonificacao: Double = 0.0
        get() {
            return field * 0.2 //O "field" corresponde ao próprio campo.
        }
}
