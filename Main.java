import java.util.Scanner; //Para ter a inserção de dados precisa importar o Scanner

public class Main {
    public static void main(String[] args) {

        ContaBanco obj1 = new ContaBanco("Lucas", "Lasdf456"); // Chamando as funções
        obj1.menu();
    }   
}
    class ContaBanco{
        int saldo;
        int extrato;
        String nomeUsuario;
        String idUsuario;

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

        void menu(){
            char option = '\0';
            Scanner sc = new Scanner(System.in); // Definindo o objeto Scanner como sc

            System.out.println("Bem vindo "+ nomeUsuario);
            System.out.println("Seu ID é: "+idUsuario);
            System.out.println("A. Saldo");
            System.out.println("B. Depositar");
            System.out.println("C. Efetuar Saque");
            System.out.println("D. Extrato");
            System.out.println("E. Sair");

            do{
                System.out.println("---------------");
                System.out.println("Entre com uma opção:");
                option = sc.next().charAt(0);
                System.out.println("\n");

                switch(option){

                    case 'A':
                        System.out.println("---------------");
                        System.out.println("Saldo: "+ saldo);
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("---------------");
                        System.out.println("Entre con um valor a ser depositado:");
                        int quantidade = sc.nextInt();
                        deposite(quantidade);
                        System.out.println("\n");
                        break;
                        
                    case 'C':
                        System.out.println("---------------");
                        System.out.println("Quanto gostaria de sacar?");
                        int quantidade2 = sc.nextInt();
                        sacar(quantidade2);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("---------------");
                        pegarExtrato();
                        System.out.println("\n");

                    case 'E':
                        System.out.println("Obrigado e Volte Sempre");
                        break;

                    default:
                        System.out.println("Opção invalida, tente novamente");
                        break;
                }
                
            }while(option != 'E');
        
        }
    }
