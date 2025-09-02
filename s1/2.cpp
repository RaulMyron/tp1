// Inserir as bibliotecas aqui, caso seja necessário
#include <iostream>
using namespace std;
#include <iomanip>

int main()
{

    float taxa;
    float conta;

    cin >> conta;

    if (conta <= 500)
    {
        taxa = 0.02;
        float total = conta * taxa;
        //cout << fixed << setprecision(2) << total << " " << fixed << setprecision(2) << 5.00 << " " << fixed << setprecision(2) << total + 5 << endl;
        printf("%.2f %.2f %.2f", total, 5.00, total+5);
    }
    else if (conta > 500 && conta <= 1000)
    {
        taxa = 0.1;
        float total = (500 * taxa) + (0.05 * (conta - 500));
        //cout << fixed << setprecision(2) << total << " " << fixed << setprecision(2) << 5.00 << " " << fixed << setprecision(2) << total + 5 << endl;
        printf("%.2f %.2f %.2f", total, 5.00, total+5);
    }
    else
    {
        taxa = 0.35;
        float total = (1000 * taxa) + (0.1 * (conta - 1000));
        printf("%.2f %.2f %.2f", total, 5.00, total+5);
    }

    return 0;
}
