fun main() {

    // integer
    var byte:Byte = 123
    var short:Short = 123
    var int:Int = 123
    var long:Long = 123L
    var hex:Int = 0xf
    var bin:Int = 0b11

    println(byte)
    println(hex)
    println(bin)

    // double & float
    var double:Double = 123.4
    var dbExp:Double = 123.4e10

    var float:Float = 123.4f

    println(double)
    println(dbExp)

    println(float)

    // char
    var a:Char = 'a'
    var あ:Char = 'あ'
    var 가:Char = '가'

    println(a)
    println(あ)
    println(가)

    // boolean
    var boolean:Boolean = true

    println(boolean)

    // String
    var apple:String = "apple"
    val banana = "banana"

    val longString = """
    this
    is
    too
    long
    """

    println(apple)
    println(banana)
    println(longString)
}