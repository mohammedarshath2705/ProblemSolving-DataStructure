package Arrays;

public class CountPrime {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int cnt = 0;

        for (int i = 2; i < n; i++)
            prime[i] = true;

        for (int i = 2; i < n; i++) {
            if (prime[i])
                cnt++;

            for (int j = 2 * i; j < n; j += i)
                prime[j] = false;
        }

        return cnt;
    }

    public static void main(String[] args) {
        CountPrime cp = new CountPrime();
        int n = 10;
        System.out.println("Number of primes less than " + n + ": " + cp.countPrimes(n));
    }
}
