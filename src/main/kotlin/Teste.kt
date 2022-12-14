import java.time.LocalDate

fun main(){
    //"val": O valor de uma variável não pode ser alterado.
    //"var": O valor de uma variável pode ser alterado.
    var titular: String = "Alex" //O Kotlin realiza a inferência de tipos quando atribuímos o valor a uma variável.
    val numeroConta: Int = 1000
    var saldo: Double = 2.0

    print("Nome do titular: $titular") //O "$" realiza a concatenação.

    //Não podemos atribuir um valor "Int" em uma variável do tipo "Double". O Kotlin é
    //estaticamente tipado, ele apenas não força que o tipo da variável seja declarado.

    //Todas as variáveis do Kotlin devem ser inicializadas.

//    if(saldo > 0.0){
//        println("\nA conta é positiva!")
//    } else if(saldo == 0.0){
//        println("\nA conta é neutra!")
//    } else {
//        println("A conta é negativa")
//    }

    //O "when" abaixo se refere ao "if()" acima.
    testaCondicoes(saldo)

    //Quando cada condição do "when" possui essa estrutura, podemos retirar as chaves.
    when {
        saldo > 0.0 -> println("\nA conta é positiva!")
        saldo == 0.0 -> println("\nA conta é neutra!")
        else -> println("A conta é negativa")
    }

    for(i in 1..3){
        print("$i: Testando\n")
    }

    for(i in 5 downTo 1 step 2){
        print("$i\n")
    }


//    conta.titular = "Alex"
//    conta.numero = 1000
//    conta.saldo = 200.00
//    println(conta.titular)
}

private fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("\nA conta é positiva!")
        }
        saldo == 0.0 -> {
            println("\nA conta é neutra!")
        }
        else -> {
            println("A conta é negativa")
        }
    }
}

class Conta (titular: String, numero: Int) { //Esse é o construtor primário. Devemos utilizar o construtor primário como padrão e o construtor secundario apenas caso queiramos enviar properties.
    //Sempre devemos inicializar os atributos com "val", e, apenas caso precisemos alterar o valor desse atributo, devemos utilizar o "val".
    var titular = ""
    var numero = 0
    var saldo = 0.0 //Isso é uma property.
//        set(valor){ //Para alterarmos o valor interno da property, devemos utilizar o "field".
//            field = valor
//        }
        private set //Se os atributos forem privados, não é obrigado deixarmos o "set" privado.
                    //Assim, não devemos utilizar "getSaldo()", e sim, apenas o "saldo = valor", e essa
                    //atributição apenas estará disponível dentro da classe "Conta".

    fun deposita(valor: Double): Boolean { //O tipo padrão do retorno de uma função é "Unit", mesmo que ela não tenha um "return".
        this.saldo += valor

        return true
    }

    //Esse é um construtor secundário.
//    constructor(titular: String, numero: Int){ //Criando o método construtor.
//        this.titular = titular
//        this.numero = numero
//    }

//    fun getTitular(): String {
//
//        return this.getTitular()
//    }
//
//    fun setTitular(titular: String){
//
//        this.titular = titular
//    }
}