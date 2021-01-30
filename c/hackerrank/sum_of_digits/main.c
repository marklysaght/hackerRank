#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    int add = 0;
    int total = 0;
    while (n != 0)
    {
        add = n % 10;
        n /= 10;
        total += add;
    }
    printf("%d\n", total);
    return 0;
}