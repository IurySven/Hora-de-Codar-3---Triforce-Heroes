fun Att1(){

    var num1: Double
    do {
        print("Digite Outro Valor: ")
        num1 = readLine()!!.toDouble()
    } while (num1 <= 0)

    var num2: Double
    do {
        print("Digite Outro Valor: ")
        num2 = readLine()!!.toDouble()
    } while (num2 <= 0)

    var resul = num1?.div(num2)

    println("O Resultado dos Dois Numeros é $resul")

}

fun Att2(){

    var contage:Int = 11

    while (contage > 1){
        contage--
        Thread.sleep(1000)
        println("$contage")
    }
    println("BOOOOOOM!!!")

}

fun Att3(){

    var lista: List<Int> = listOf(1 , 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val ordem = lista.sortedDescending()

    println("Numeros em Ordem Decrecente: $ordem")

}

fun Att4(){

    var mediaI = 15
    var mediaF = 100

    var somar = (mediaI..mediaF).sum()
    var i = (mediaF - mediaI + 1)
    var media = somar / i

    println("A media entre os numeros 15 e 100 é: $media")

}

fun Att5(){

    print("Digite um Numero: ")
    var num1 = readln().toInt()

    do {
        print("Digite Outro Numero (que seja menor): ")
        var num2 = readln().toInt()
    } while (num2 <= num1)

    print("Digite Outro Numero (que seja menor): ")
    var num2 = readln().toInt()

    var somar = num1 + num2

    var media = somar / 2

    println("A Media dos Dois Numeros São: $media")

}

fun Att6(){

    var progect:Boolean = true
    var lista = 0

    while (progect == true) {

        print("Primeira Nota: ")
        var nota1 = readln().toDouble()
        print("Segunda Nota: ")
        var nota2 = readln().toDouble()

        var media = (nota1 + nota2) / 2

        if (media >= 9.5){
            println("Aproved")
            lista++
        }else{
            println("Re-pro-vado!")
        }

        print("Continuar? (S/N): ")
        var continuar = readln().toLowerCase()
        if (continuar == "n") {
            progect = false
        }
    }

    println("Aprovado(s): $lista")

}

fun Att7(){

    var lista = mutableListOf<Int>()
    var i = 1
    var soma = 0

    while (i < 6) {
        print("Digite a $i nota: ")
        var notas = readln().toInt()
        if (notas in 0..10){
            lista.add(notas)
            soma += notas
            i++
        }else{
        println("Nota inválida. Digite um valor entre 0 e 10.")
        }
    }
    var media = soma / 6
    println("A media do aluno(a) é: $media")

}

fun Att8() {

    var n:Int

    while (true) {
        print("Digite um Numero Maior que 0: ")
        n = readln().toInt()
        if (n > 0) break
        println("Valor Invalido, coloque um numero valido")
    }
    for (i in 1..n) {
        println(i)
    }
}

fun Att9(){

    var cem = 100
    var i = 0

    while (i < 10){
        cem++
        println("$cem")
        i++

    }
}

fun Att10(){

    var n:Int
    var i = 1

    print("Digite um Numero: ")
    n = readln().toInt()

    while (i <= n){

        println("$i x $n = ${i * n}")
        i++
    }

}

fun Att11(){

    var i = 0
    val dentro = mutableListOf<Int>()
    var contD = 0
    val fora = mutableListOf<Int>()
    var contF = 0

    while (i < 10) {
        print("Digite um Número: ")
        val num = readln().toInt()
        i++
        if (num >= 24 && num <= 42) {
            contD++
            dentro.add(num)
        } else {
            contF++
            fora.add(num)
        }
    }

    println("Dentro do Intervalo entre 24 a 42 há $contD número(s): $dentro")
    println("Fora do Intervalo entre 24 a 42 há $contF número(s): $fora")
}