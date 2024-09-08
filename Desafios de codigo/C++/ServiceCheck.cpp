#include <iostream>
#include <string>
using namespace std;

int main() {
    std::string serviceName;
    std::string clientData;
    std::string clientPieces[100];
    bool found = false;

    std::cout << "Digite o nome do servico: ";
    std::cin >> serviceName;

    std::cin.ignore();

    std::cout << "Digite os dados do cliente: ";
    std::getline(std::cin, clientData);

    int j = 0;
    int k = 0;
    for (int i = 0; i < clientData.length(); i++) {
        if (clientData[i] == ',' || i == clientData.length() - 1) {
            clientPieces[j] = clientData.substr(k, i - k);
            k = i + 1;
            j++;
        }
    }

    for (int i = 1; i < j; i++) {
        if (clientPieces[i] == serviceName) {
            found = true;
            break;
        }
    }

    if (found) std::cout << "Servico encontrado!" << std::endl;
    else std::cout << "Servico nao encontrado!" << std::endl;

}