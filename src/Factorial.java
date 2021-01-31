import java.math.BigInteger;

public class Factorial {
    public BigInteger calculate(int value) {

        BigInteger result = new BigInteger("1");

//        Факториал от 0
        if (value == 0) {
            return result;
        }
//        Факториал отриц. чисел
        else if (value < 0) {
            return null;
        }
//Факториал от натурального числа
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }

        return result;
    }
}
