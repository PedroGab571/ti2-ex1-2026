```java
package ex1;

// Importa a classe Scanner, que permite receber dados digitados pelo usuário
import java.util.Scanner;

// Declara a classe principal do programa
public class SomaDoisNumeros {

    // Método principal: é onde a execução do programa começa
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem solicitando que o usuário digite o primeiro número
        System.out.print("Digite o primeiro número inteiro: ");

        // Lê o primeiro número inteiro digitado pelo usuário
        int numero1 = scanner.nextInt();

        // Exibe uma mensagem solicitando que o usuário digite o segundo número
        System.out.print("Digite o segundo número inteiro: ");

        // Lê o segundo número inteiro digitado pelo usuário
        int numero2 = scanner.nextInt();

        // Soma os dois números e armazena o resultado na variável "soma"
        int soma = numero1 + numero2;

        // Exibe na tela o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o Scanner e libera o recurso utilizado para entrada de dados
        scanner.close();
    }
}
```
