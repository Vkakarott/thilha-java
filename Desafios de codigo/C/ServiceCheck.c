#include <stdio.h>
#include <string.h>

int main() {
    char serviceName[100];
    char clientData[500];
    char clientPieces[100][100];
    int found = 0;

    printf("Digite o nome do servico: ");
    scanf("%s", serviceName);

    printf("Digite os dados do cliente: ");
    scanf(" %[^\n]", clientData);

    int j, k = 0;
    for (int i = 1; i < strlen(clientData); i++) {
        if (clientData[i] == ',') {
            clientPieces[j][k] = '\0';
            j++;
            k = 0;
        } else {
            clientPieces[j][k] = clientData[i];
            k++;
        }
    }

    for (int i = 0; i < j; i++) {
        if (strcmp(clientPieces[i], serviceName) == 0) {
            found = 1;
            break;
        }
    }

    if (found) printf("Servico encontrado!\n");
    else printf("Servico nao encontrado!\n");
}