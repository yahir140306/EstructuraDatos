#include <iostream>
#define MAX 3
using std::cin;
using std::cout;
using std::endl;

int main()
{
    int numero = 10;

    // cout << &numero << endl;
    // cout << numero << endl;

    // Tipo de dato
    int *ptr_numero = &numero;

    // cout << ptr_numero << endl;
    // cout << *ptr_numero << endl;

    float calificaciones[MAX];
    calificaciones[0] = 9;
    calificaciones[1] = 9.5;
    calificaciones[2] = 9.2;
    cout << calificaciones << endl;
    cout << *calificaciones << endl;
    cout << sizeof(float) << endl;

    return 0;
}