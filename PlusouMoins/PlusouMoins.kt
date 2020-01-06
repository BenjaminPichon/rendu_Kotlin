import kotlin.math.absoluteValue
import kotlin.system.exitProcess

fun main(){

    print("entrer le nombre de l'ordinateur")
    val nombreOrdi: Int = readLine()!!.toInt()
    var nombreJoueur: Int = -1

    while(nombreJoueur != nombreOrdi){
        print("Veuillez entrer votre essaye (ou -1 si vous voulez quitter) :")
        nombreJoueur = readLine()!!.toInt()

        when{
            nombreJoueur == -1 -> exitProcess(300)
            nombreJoueur > nombreOrdi -> println("Trop grand!")
            nombreJoueur < nombreOrdi -> println("Trop petit!")
            nombreJoueur == nombreOrdi -> gagne()
        }
    }


}

fun gagne(){
    println("c'est gagné")
    exitProcess(-1)
}