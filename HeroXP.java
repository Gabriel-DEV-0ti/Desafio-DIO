import java.util.Scanner;

public class HeroXP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de variáveis
        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de experiência (XP) do herói: ");
        int xp = scanner.nextInt();

        String nivel = "";

        // Estrutura de decisão para determinar o nível do herói
        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp <= 2000) {
            nivel = "Bronze";
        } else if (xp <= 5000) {
            nivel = "Prata";
        } else if (xp <= 7000) {
            nivel = "Ouro";
        } else if (xp <= 8000) {
            nivel = "Platina";
        } else if (xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp <= 10000) {
            nivel = "Imortal";
        } else if (xp > 10000) {
            nivel = "Radiante";
        }

        // Saída
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
    }
}
