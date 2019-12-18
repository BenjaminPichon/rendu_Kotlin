fun main() {
    var nbrtry = 0;
    println("entez une valeur pour l'odinateur : ")

    var val1 = System.`in`

    println("entez une valeur pour le joueur : ")

    var val2 = System.`in`

    while (val1 == val2) {
        if (val1 < val2) {
            println("Trop grand!")

            println("entez une nouvelle valeur : ")
            val2 = System.`in`
            nbrtry++;
            println(nbrtry);
            println("continuez ?");
            var continuee = readLine()
            if(continuee == "non"){
                return 0;
            }

        } else {
            println("Trop petit!")

            println("entez une nouvelle valeur : ")
            val2 = System.`in`
            nbrtry++;
            println(nbrtry);
            println("continuez ?");
            var continuee = readLine()
            if(continuee == "non"){
                return 0;
            }


        }
    }
}