package `1 - Getting Started`

fun main() {

/** --------------------------------------------------------------------------------------------------------------------

    Val veya var ile değişken tanımla, isim ver, iki nokta (:) ile tipini belirt, son olarak da veriyi yaz.

    Val, değeri tekrar değiştirilemeyen bir değişkendir. Bu yüzden aşağıdaki örnekte "Kara" soyadı değiştirilemez.

    Var değeri ise sınırsız değiştirilebilir.

    Kodu yazarken her zaman "val" ile başla. Gerekirse daha sonra kolayca değiştirebilirsin.

    Kotlin'de "var" değişkeni, "val"a göre çok az da olsa daha performanslı çalışır. Çünkü "var" kullanılırsa değişiklik
    yapabileceğin için daha fazla işlem yapılmış olur.

    val = immutable (değişmez)
    var = mutable (değişebilir)

--------------------------------------------------------------------------------------------------------------------- */

    var name = "Hasan"          // Alttaki örnek yerine, String tipini belirtmeden böyle de yazabilirsin. Tip çıkarımı (Type Inference) -> String
    val surName: String = "Kara"
    val age = 21               // Sayısal değerler tırnak içinde yazılmaz. Burada da değişken türü belirtmene gerek yok çünkü tip çıkarımı (Type Inference) -> Int

    println (name)
    println (surName)
    println (age)

    name = "Furkan"        // "var" ile tanımladığımız için kod çalıştığında isim de değişir.
//  surName = "Yalçınkaya" // Kara soyadını "val" ile tanımladığımız için bu değer değiştirilemez, hata verir.

    println (name)
    println (surName)
    println (age)

    val eyeColor: String  // Bu şekilde, değişken tanımı yapıldıktan sonra alt satıra geçip atama yapabilirsin.
    eyeColor = "Hazel"

//  eyeColor = 2 // String olmadığı için hata verir.

//  val skinTone // Ya değer atayacaksın ya da türünü belirteceksin, yoksa bu kod çalışmaz.
//  skinTone = "White"

}