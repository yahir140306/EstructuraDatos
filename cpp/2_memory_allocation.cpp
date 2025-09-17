#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char **argv)
{
    // Memory allocation en C++
    int *int_ptr = nullptr;
    int_ptr = new int;

    // asignamos valor a un int_ptr
    *int_ptr = 10;
    cout << "\n\t" << *int_ptr << endl;

    // liberar la memoria
    delete int_ptr;
    cout << "\n\t =================== ";

    // Memory allocation con arrays
    int *array_ptr = nullptr;
    size_t size = 0; // unsigned int
    cout << "\n\t Digita el tamaño de tu array: ";
    cin >> size;
    array_ptr = new int[size]; // En la memoria HEAP

    for (int i = 0; i < size; i++)
    {
        array_ptr[i] = i * 2;
    }

    for (int i = 0; i < size; i++)
    {
        cout << array_ptr[i] << " ";
    }

    delete[] array_ptr; // array_ptr - basura

    cout << "\n\n";

    return 0;
}