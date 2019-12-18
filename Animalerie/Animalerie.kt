interface Animalerie {
    override fun parler(){
    }

    override fun quiSuisJe(){
    }
}

class Chien :Animalerie{
    override fun estunchien{
        override fun parler(){println("ouaf")}
        override fun quiSuisJe(){println("Chien")}
    }
}

class Chat :Animalerie{
    override fun estunchat{
        override fun parler(){println("miaou")}
        override fun quiSuisJe(){println("Chat")}
    }
}

class Perroquet :Animalerie{
    override fun estunperroquet{
        override fun parler(){println("croaa")}
        override fun quiSuisJe(){println("Perroquet")}
    }
}

class lanimalerie : Animalerie, Chien, Chat, Perroquet {
    var Nom: String? = null
    var type: String? = null

    var animal = animal();
    fun add() {


        println("quelle est le nom de l'animal :")
        var name = System.`in`

        println("quelle type d'animal est-ce ? :")
        var typeOf = System.`in`

        animal.Nom = name;
        animal.Type = animal;

        if (animal.type == "Chien") {
            override fun estunchien() {
                println("vous avez ajouté un chien !")
            }
        } else if (animal.type == "Chat") {
            override fun estunchat() {
                println("vous avez ajouté un chat !")
            }

        } else {
            override fun estunperroquet() {
                println("vous avez ajouté un perroquet !")
            }
        }




    }

    override fun quiSuisJe() {
        if (animal.type == "Chien") {
            println("je suis un Chien ")
        }
        else if (animal.type == "Chat") {
            println("je suis un Chat ")
        }
        else {
            println("je suis un Perroquet")
        }
    }
}

fun main(){
    var animal = animal("nom", "typeOf");
    animal.add()
    animal.quiSuisJe()

}