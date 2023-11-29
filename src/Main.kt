
fun main() {
    //TODO Aufgabe 1: Variablen und Datentypen

    // Füge jetzt manuell, das heißt mit der richtigen Funktion/Syntax und nicht einfach, indem du die originale Map bearbeitest, folgendes hinzu:
    val berlinerTapas : String= "Berliner Tapas"
    var productsBerlinerTapas: MutableMap<String,Double> = mutableMapOf("tortilla" to 4.5, "paella" to 12.3, "croquetas" to 1.5, "patatas bravas"  to 3.2, "gazpacho" to 4.4)
    val filialNumber : Int = 13

    println("owner name: ")
    var nameOwnerBerlinerTapas : String = readln()
    println("owner age: ")
    var ageOwnerBerlinTapas : Int = readln().toInt()
    var discountSession: Boolean = false

    // verringere den Preis von 3 Produkten deiner Wahl um 1.50 Euro

    productsBerlinerTapas["tortilla"] = productsBerlinerTapas.getValue("tortilla") - 1.50
    productsBerlinerTapas["paella"] = productsBerlinerTapas.getValue("paella") - 1.50
    productsBerlinerTapas["gazpacho"] = productsBerlinerTapas.getValue("gazpacho") - 1.50

    println(productsBerlinerTapas)
    // Entferne das teuerste Produkt (du musst das Programm nicht rausfinden lassen, welches das teuerste ist, sondern kannst es selbst identifizieren)
    productsBerlinerTapas.remove("paella")

    //5. Prüfe, ob das Produkt "Kaugummi" noch in der Map existiert und printe eine entsprechende Nachricht in die Konsole aus. Dafür brauchst du if else.
    if ("kagumi" in productsBerlinerTapas) {
        println("Kaugummi is on the products list")
    } else {
        println("Kaugummi is not on the products list")
    }

    //6. Prüfe, ob es ein Produkt mit dem Preis 1.49 in der Map gibt und drucke eine entsprechende Nachricht in der Konsole aus.
if(productsBerlinerTapas.containsValue(1.49)) {
    println("there is a product with the price 1.49")
}

//    7. Listen anlegen: Lege jetzt jeweils eine Liste an mit
//       - allen Produkten
//       - allen Preisen
    println("all the products")
println(productsBerlinerTapas.keys)
    println("all the prices")
    println(productsBerlinerTapas.values)

    // 8. Was ist eigentlich nochmal ein Set im Unterschied zu einer Liste/Map?
    // ein set ist eine sammlung von elementen, die keine duplikate enthalten kann, die Liste kann duplikate enthalten und
    // die map ist eine sammlung von key-value paaren, die KEINE duplikate von keys enthalten kann, aber duplikate von values



}

