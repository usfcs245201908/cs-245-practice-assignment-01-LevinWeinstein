import java.security.InvalidParameterException;

public class Practice01MathRecursive implements Practice01Math {
    public int fact(int n) throws InvalidParameterException{
        if (n < 0)
            throw new InvalidParameterException("N must b 0 or greater");
        return n <= 1 ? 1 : n * fact(n - 1);
    }

    public int fib(int n) throws InvalidParameterException {
        if (n < 0)
            throw new InvalidParameterException("N must be 0 or greater");
        if (n == 1 || n == 0)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
