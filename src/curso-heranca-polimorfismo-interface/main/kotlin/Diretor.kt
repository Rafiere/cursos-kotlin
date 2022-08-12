class Diretor( //Aqui devemos inserir os atributos que diferem da classe herdada como "val".
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val participacaoDeLucros: Double
): Funcionario(nome, cpf, salario, 1){ //Aqui devemos chamar o método construtor da classe herdada.


}