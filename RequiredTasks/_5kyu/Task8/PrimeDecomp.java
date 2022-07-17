package RequiredTasks._5kyu.Task8;

import java.util.ArrayList;
import java.util.List;

public class PrimeDecomp {

    public static String factors(int lst)
    {
        List<String> primes = new ArrayList<String>();
        for (var number = 2; number <= lst; number++)
        {
            int count = 0;
            while (lst % number == 0)
            {
                count++;
                lst /= number;
            }

            if (count == 0) continue;
            primes.add(String.format(count == 1 ? "(%d)" : "(%d**%d)", number, count));
        }
        return String.join("", primes);
    }

}