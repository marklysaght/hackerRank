#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int n, m;
    float o, p;

    scanf("%d %d", &n, &m);
    scanf("%f %f", &o, &p);

    printf("%d %d\n", n + m, n - m);
    printf("%.1f %.1f\n", o + p, o - p);

    return 0;
}