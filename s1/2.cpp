// Inserir as bibliotecas aqui, caso seja necessário
#include <iostream>
using namespace std;
#include <iomanip>

int main()
{

    float taxa;
    int conta;

    cin >> conta;

    if (conta < 500)
    {
        taxa = 0.02;
        float total = conta * taxa;
        cout << fixed << setprecision(2) << total << " " << fixed << setprecision(2) << 5.00 << " " << fixed << setprecision(2) << total + 5 << endl;
    }
    else if (conta > 500 && conta < 1000)
    {
        taxa = 0.1;
        float total = (500 * taxa) + (0.05 * (conta - 500));
        cout << fixed << setprecision(2) << total << " " << fixed << setprecision(2) << 5.00 << " " << fixed << setprecision(2) << total + 5 << endl;
    }
    else
    {
        taxa = 0.35;
        float total = (500 * taxa) + (0.1 * (conta - 1000));
        cout << fixed << setprecision(2) << total << " " << fixed << setprecision(2) << 5.00 << " " << fixed << setprecision(2) << total + 5 << endl;
    }

    return 0;
}
