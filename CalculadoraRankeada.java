import java.util.Scanner;

public class CalculadoraRankeada {

    //Funcao para calcular o nivel do jogador com base nas vitorias
    public static String calcularNivel(int vitorias) {
        if (vitorias < 10) {
            return "Ferro";
        }
        else if (vitorias >= 10 && vitorias <=20) {
            return "Bronze";
        }
        else if (vitorias >= 21 && vitorias <=50) {
            return "Prata";
        }
        else if (vitorias >= 51 && vitorias <=80) {
            return "Ouro";
        }
        else if (vitorias >= 81 && vitorias <=90) {
            return "Diamante";
        }
        else if (vitorias >= 91 && vitorias <=100) {
            return "Lendario";
        }
        else {
            return "Imortal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebe a quantidade de vitórias e derrotas do usuário
        System.out.println("Digite a quantidade de vitorias: ");
        int vitorias = sc.nextInt();

        System.out.println("Digite a quantidade de derrotas: ");
        int derrotas = sc.nextInt();

        //Calcula o saldo de vitorias
        int saldoVitorias = vitorias - derrotas;

        //Calcula oi nivel do jogador
        String nivel = calcularNivel(vitorias);

        //Exibe a mensagem
        System.out.println("O heroi tem de saldo de " + saldoVitorias + " ,e está no nivel de " + nivel + ".");

        sc.close();
    }
}
