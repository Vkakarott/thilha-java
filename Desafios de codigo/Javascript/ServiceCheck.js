const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Digite o nome do servico: ', (serviceName) => {
    rl.question('Digite os dados do cliente: ', (clientData) => {
        let clientPieces = clientData.trim().split(',');
        let found = false;

        for (let i = 1; i < clientPieces.length; i++) {
            if (clientPieces[i].trim() === serviceName) found = true;
        }

        if (found) console.log('Servico encontrado');
        else console.log('Servico nao encontrado');

        rl.close();
    });
});