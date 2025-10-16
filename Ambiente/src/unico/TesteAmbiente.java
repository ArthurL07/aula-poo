package unico;

public class TesteAmbiente {
    public static void main(String[] args) {

        Ambiente sala = new Ambiente(1, "Laboratório 1", 3);

        sala. regristrarEntrada(); // 1 pessoa
        sala. regristrarEntrada(); // 2 pessoas
        sala. regristrarEntrada(); // 3 pessoas — bloqueado agora
        sala. regristrarEntrada(); // não entra mais

        System.out.println("Situação: " + sala.getSituacao()); // Deve mostrar 'B'
        System.out.println("Qtde atual: " + sala.getQtdeAtual()); // Deve mostrar 3

        sala.regristrarSaida(); // 2 pessoas
        System.out.println("Situação: " + sala.getSituacao()); // Deve mostrar 'L'

    }
}
