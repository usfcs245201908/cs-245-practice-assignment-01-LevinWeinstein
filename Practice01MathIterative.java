/*
 * I am Levin Weinstein. Hear me roar.
 */

public class Practice01MathIterative implements Practice01Math {
    public int fact(int n) throws Exception{
        if (n < 0)
            throw new Exception("N must be 0 or greater");
        int output = 1;
        for (int i = 1; i <= n; i++)
            output *=  i;
        return output;
    }

    public int fib(int n) throws Exception {
        if (n < 0)
            throw new Exception("N must be 0 or greater");

        int prev = 0;
        int cur = 1;
        for (int count = 2; count <= n; count++){
            int tmp = cur;
            cur = cur + prev;
            prev = tmp;
        }
        return n == 0 ? 0 : cur;
    }
}
