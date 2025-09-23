//Inserir as bibliotecas aqui, caso seja necessário
#include <iostream>
using namespace std;
#include <iomanip>

int main() {

    float a;
    char sexo;
    cin >> a;
    cin >> sexo;

    float peso;

    //cout << (a > 0) << a << endl;

    if (a > 0){
        if (sexo == 'm'){
            // cout << "male" << endl;
            peso =  (72.7 * a) - 58;
        }
        else if (sexo == 'f') {
            // cout << "female" << endl;
            peso =  (62.1 * a) - 44.7;
        }
        else {
            cout << "Entrada inválida!";
            return 0;
        }
    } 
    else {
        cout << "Entrada inválida!";
        return 0;
    }

    cout << fixed << setprecision(1) << peso << " kg" << endl;

    return 0;

}
