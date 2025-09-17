#include <stdio.h>
#include <stdlib.h>

// funcion que imprime un array
void printArr(double array[]);

int main(int argc, char **argv)
{
    // array de forma clasica
    double Darr[10];

    // Dinamico
    double *arr = malloc(10 * sizeof(double));

    for (int i = 0; i < 10; i++)
    {
        Darr[i] = i * 3.0;
        arr[i] = i * 2.0;
    }

    printArr(Darr);
    printArr(arr);
    printf("\n\t%.3f\n", *(arr + 2));  // arr[2];
    printf("\n\t%.3f\n", *(Darr + 2)); // Darr[2];
    printf("\n\t%p\n", Darr);          // x10;
    printf("\n\t%p\n", arr);           // x10;

    return 0;
}

// definicion
void printArr(double array[])
{
    printf("\n\t");

    for (int i = 0; i < 10; i++)
    {
        printf("%.3f ", array[i]);
    }
    printf("\n");
}
