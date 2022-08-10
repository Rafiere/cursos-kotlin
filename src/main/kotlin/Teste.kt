fun main(){
    //"val": O valor de uma variável não pode ser alterado.
    //"var": O valor de uma variável pode ser alterado.
    var titular: String = "Alex" //O Kotlin realiza a inferência de tipos quando atribuímos o valor a uma variável.
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    print("Nome do titular: $titular") //O "$" realiza a concatenação.

    //Não podemos atribuir um valor "Int" em uma variável do tipo "Double". O Kotlin é
    //estaticamente tipado, ele apenas não força que o tipo da variável seja declarado.

    //Todas as variáveis do Kotlin devem ser inicializadas.
}