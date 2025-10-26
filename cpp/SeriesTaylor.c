#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define PI 3.14159

double factorial(double n)
{
    if (n == 1.0)
    {
        return 1.0;
    }
    else
    {
        return n * factorial(n - 1.0);
    }
}

double degToRad(double deg)
{
    return (deg * PI) / 180;
}

double seno(double deg)
{
    double value = 0;
    int sentido = 1;

    for (int n = 1; n < 100; n += 2)
    {
        value += sentido * (pow(deg, n) / factorial(n));
        sentido *= -1;
    }

    return value;
}

int main(void)
{
    double deg = 0;
    printf("\n\t Digita un angulo: ");
    scanf("%lf", &deg);

    // printf("\n\t El angulo %lf en rads es: %lf", deg, degToRad(deg));
    // printf("\n\t El factorial de 5 es: %lf\n\n", factorial(5));

    deg = degToRad(deg);

    printf("\n\t Seno de %lf es: %lf\n\n", deg, seno(deg));

    return 0;
}