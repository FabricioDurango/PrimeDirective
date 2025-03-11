import java.util.ArrayList;

public class PrimeDirective {

    public boolean isPrime(int numbers) {
        if (numbers == 2) {
            return true;
        } else if (numbers < 2) {
            return false;
        } else {
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }
}

