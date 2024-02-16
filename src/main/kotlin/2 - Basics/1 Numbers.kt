package `2 - Basics`

fun main() {

    /**
     *     Küçükten büyüğe -> byte, short, int, long
     *     Kesirli işlemler için -> float ve double
     *     Tip çıkarımı (Type Inference) sırasında, eğer sayı Int ifadeden büyük değilse tipi default olarak Int kabul edilir.
     *     Tip çıkarımı (Type Inference) sırasında, eğer sayı Int ifadeden büyük ise tipi default olarak Long kabul edilir.
     */

    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    val minDoubleValue: Double = Double.MIN_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE

    println("minByteValue :" + minByteValue)
    println("maxByteValue :" + maxByteValue)
    println("minShortValue :" + minShortValue)
    println("maxShortValue :" + maxShortValue)
    println("minIntValue :" + minIntValue)
    println("maxIntValue :" + maxIntValue)
    println("minLongValue :" + minLongValue)
    println("maxLongValue :" + maxLongValue)
    println("minFloatValue :" + minFloatValue)
    println("maxFloatValue :" + maxFloatValue)
    println("minDoubleValue :" + minDoubleValue)
    println("maxDoubleValue :" + maxDoubleValue)

/* ------------------------------------------------------------------------------------------------------------------ */

    /**
     *    Long         değişkenler için sayının sonuna "L" konularak değer ataması yapılabilir.
     *    Float        değişkenler için sayının sonuna "F" ve "f" konularak değer ataması yapılabilir.
     *    Double       değişkenler için geleneksel gösterim desteklenir.
     *    Decimal      tanımı yapılabilir. [0,9]
     *    Octal        tanımı yapılabilir. [0,7]
     *    Hexadecimal  tanımı yapılabilir.
     *    Binary       tanımı yapılabilir. [0,1]
     */

    val longNumber = 1792L
    val floatNumber = 17.92F
    var floatNumber2 = 14f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1907
//  val octalNumber = 01792 // Kotlin'de 0 ile başlayan bir değer verilemez, kod çalışmaz.
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b01000011

/* ------------------------------------------------------------------------------------------------------------------ */

    // Number değişken tanımı yapılırken underscore "_" kullanılabilir.

    val oneMillion = 1_000_000 // Program kodu okurken "_" bu yokmuş gibi okur -> 1000000
    val creditCardNumber = 1234_5678_9012_3456L
    val bytes = 0b01110101_01100101_0010110_0111011

/* ------------------------------------------------------------------------------------------------------------------ */

    /**
     *     Boxed     -> Değişkenin obje referansı olarak tutulmasıdır.
     *     UnBoxed   -> Değişkenin primitive olarak tutulmasıdır.
     *
     *     === operatörü, değişkenlerin referansını karşılaştırırken kullanılır.
     *     ==  operatörü ise değişkenlerin değerini karşılaştırırken kullanılır.
     *
     */


}