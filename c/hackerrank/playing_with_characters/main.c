#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char ch[255];
    scanf("%[^\n]%*c", ch);
    char s[255];
    scanf("%[^\n]%*c", s);
    char sen[255];
    scanf("%[^\n]%*c", sen);

    printf("%s\n", ch);
    printf("%s\n", s);
    printf("%s\n", sen);

    return 0;
}