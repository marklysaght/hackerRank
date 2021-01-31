#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

void calculate_the_maximum(int n, int k)
{
    //Write your code here.

    // for each number i from 1 through n, find the maximum vaslue of the logical
    // and, or and zor when compared against all integers through n that are greater than i.
    // consider a value only if the comparison returns a ruslt less than k

    int and = 0;
    int or = 0;
    int xor = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = i + 1; j <= n; j++)
        {
            if (((i & j) > and) && ((i & j) < k))
            {
                and = i & j;
            }
            if (((i | j) > or) && ((i | j) < k))
            {
                or = i | j;
            }
            if (((i ^ j) > xor) && ((i ^ j) < k))
            {
                xor = i ^ j;
            }
        }
    }
    printf("%d\n%d\n%d\n", and, or, xor);
}

int main()
{
    int n, k;

    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);

    return 0;
}
