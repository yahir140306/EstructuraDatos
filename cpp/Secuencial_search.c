#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int SecSearch(int *arr, int number);

int main()
{
    int *array = malloc(MAX * sizeof(int));

    for (int i = 0; i < MAX; i++)
    {
        array[i] = i + 1;
    }

    int number, index;

    printf("\n\t Digite que elemento deseas buscar: ");
    scanf("%d", &number);

    index = SecSearch(array, number);

    if (index >= 0)
    {
        printf("\nEl elemento fue encontrado en %d\n", index);
    }
    else
    {
        printf("\nElemento no encontrado");
    }

    return 0;
}

int SecSearch(int *arr, int number)
{
    int steps = 0;

    for (int i = 0; i < MAX; i++)
    {
        if (arr[i] == number)
        {
            printf("\nPasos requeridos %d\n", steps);
            return i;
        }
        steps++;
    }
    return -1;
}