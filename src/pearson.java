
//Exercício 1: Crie uma classe chamada "Pessoa" com atributos como nome, idade e endereço.
//Em seguida, crie objetos dessa classe e exiba suas informações na tela.

public class pearson {
    // Defina a classe Pessoa
    public class Pessoa {
        // Atributos da classe Pessoa
        private String nome;
        private int idade;
        private String endereco;

        // Construtor da classe Pessoa
        public Pessoa(String nome, int idade, String endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

        // Método para exibir informações da pessoa
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Endereço: " + endereco);
        }

        // Método principal para testar a classe
        public void main(String[] args) {
            // Criar objetos da classe Pessoa
            Pessoa pessoa1 = new Pessoa("João", 30, "Rua A");
            Pessoa pessoa2 = new Pessoa("Maria", 25, "Rua B");

            // Exibir informações das pessoas
            System.out.println("Informações da Pessoa 1:");
            pessoa1.exibirInformacoes();

            System.out.println("\nInformações da Pessoa 2:");
            pessoa2.exibirInformacoes();
        }
    }
    public pearson() {
    }
}
