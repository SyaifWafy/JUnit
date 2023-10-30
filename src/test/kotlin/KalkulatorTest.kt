import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows

class CalculatorTest {
    private lateinit var kalkulator: Kalkulator

    @BeforeEach
    fun setUp() {
        kalkulator = Kalkulator()
    }

    @Test
    fun testAddition() {
        //melakukan pengujian penambahan, jika berhasil maka akan langsung passed, jika gagal langsung failed.
        val result = kalkulator.add(5.0, 3.0)
        assertEquals(8.0, result, 0.001)
    }

    @Test
    fun testSubtraction() {
        //melakukan pengujian pengurangan, jika berhasil maka akan langsung passed, jika gagal langsung failed.
        val result = kalkulator.subtract(5.0, 3.0)
        assertEquals(2.0, result, 0.001)
    }

    @Test
    fun testMultiplication() {
        //melakukan pengujian perkalian, jika berhasil maka akan langsung passed, jika gagal langsung failed.
        val result = kalkulator.multiply(5.0, 3.0)
        assertEquals(15.0, result, 0.001)
    }

    @Test
    fun testDivision() {
        //melakukan pengujian pembagian, jika berhasil maka akan langsung passed, jika gagal langsung failed.
        val result = kalkulator.divide(6.0, 3.0)
        assertEquals(2.0, result, 0.001)
    }
}