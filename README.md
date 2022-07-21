# Conta Corrente
A conta corrente é uma forma prática de movimentar o dinheiro do dia a dia. Trata-se de uma conta de depósito, geralmente mantida em um banco

##

Importar o Scanner para ter a inserção de dados

```javascript
import java.util.Scanner;
```
Definindo as funções básicas de uma conta corrente
```javascript
        ContaBanco(String cname, String cid){ // Construtor
            nomeUsuario = cname;
            idUsuario = cid;
        }

        void deposite(int quantidade){
            if(quantidade > 0){
                saldo += quantidade;
                extrato = quantidade;
            }
        }

        void sacar(int quantidade){
            if(quantidade > 0){
                saldo -= quantidade;
                extrato = -quantidade;
            }
        }

        void pegarExtrato(){ 
            if(extrato > 0){
                System.out.println("No banco: " + extrato);
            } else if(extrato < 0){
                System.out.print("Sacou: "+ Math.abs(extrato));
            } else {
                System.out.println("Nenhuma transação");
            }
        }
```
## O output:
![image](https://user-images.githubusercontent.com/106561653/180302813-878eca84-fa3c-4770-a886-9ab2c749816e.png)
