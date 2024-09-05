import java.util.Scanner;

//Definição da clase do Heroi
public class Heroi {
    // Propriedades da classe Heroi
    private String nome;
    private int idade;
    private String tipo;

    //Construtor da classe do Heroi
    public Heroi(String nome, int idade, String tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método para realizar o ataque
    public void atacar() {
        String ataque;

        // Determinando o tipo de ataque com base na propriedade tipo
        if (tipo.equalsIgnoreCase("mago")) {
            ataque = "magia";
        } else if (tipo.equalsIgnoreCase("guerreiro")) {
            ataque = "espada";
        } else if (tipo.equalsIgnoreCase("monge")) {
            ataque = "artes marciais";
        } else if (tipo.equalsIgnoreCase("ninja")) {
            ataque = "shuriken";
        } else {
            ataque = "ataque desconhecido";
        }

        // Exibindo a mensagem do ataque
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    // Método principal para testar a classe Heroi
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o nome do herói
        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        // Solicitar ao usuário que insira a idade do herói
        System.out.print("Digite a idade do herói: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha restante

        // Solicitar ao usuário que insira o tipo do herói
        System.out.print("Digite o tipo do herói (mago, guerreiro, monge, ninja): ");
        String tipo = scanner.nextLine();

        // Criando uma instância da classe Heroi
        Heroi heroi = new Heroi(nome, idade, tipo);

        // Chamando o método atacar para o herói criado
        heroi.atacar();

        // Fechando o scanner
        scanner.close();
    }
}


