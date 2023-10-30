class Kalkulator {
    // Fungsi ini digunakan untuk melakukan penambahan dua bilangan.
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Fungsi ini digunakan untuk melakukan pengurangan dua bilangan.
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Fungsi ini digunakan untuk melakukan perkalian dua bilangan.
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Fungsi ini digunakan untuk melakukan pembagian dua bilangan.
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Tidak dapat melakukan pembagian oleh nol.")
        }
        return a / b
    }
}