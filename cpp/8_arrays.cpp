#include <iostream>

#define MAX 3

using std::cin;
using std::cout;
using std::endl;

int main()
{
    // const int numerosDeCalifiaciones = 3;

    // calificaciones
    float calculoVectorial = 7.9;
    float geometriaAnalitica = 4.5;
    float estructuraDeDatos = 9.0;

    cout << calculoVectorial << endl;

    float calificaciones[MAX];
    calificaciones[0] = 9;
    calificaciones[1] = 9.5;
    calificaciones[2] = 9.2;

    float promedio = calificaciones[0] + calificaciones[1] + calificaciones[2];
    promedio /= MAX;

    cout << "\nEl promedio es: " << promedio << endl;

    return 0;
}