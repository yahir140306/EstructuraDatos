#include <stdio.h>
#include <stdlib.h>

#define MAX 10000

int BinSearch(int *arr, int number);

int main()
{

    int *array = malloc(MAX * sizeof(int));

    for (int i = 0; i < MAX; i++)
    {
        array[i] = i + 1;
    }

    int number, index;
    printf("\nDigita que elemento deseas encontrar: ");
    scanf("%d", &number);

    index = BinSearch(array, number);

    if (index >= 0)
    {
        printf("\nElemento encontrado en %d", index);
    }
    else
    {
        printf("\nElemento no encontrado");
    }

    return 0;
}

int BinSearch(int *arr, int number)
{
    int first, last, middle;
    int steps = 0;

    first = 0;
    last = MAX - 1;

    while (last >= first)
    {
        middle = (first + last) / 2;

        if (arr[middle] == number)
        {
            printf("\nPasos requeridos %d", steps);
            return middle;
        }
        else if (arr[middle] < number)
        {
            first = middle + 1;
        }
        else
        {
            last = middle - 1;
        }
        steps++;
    }
    return -1;
}