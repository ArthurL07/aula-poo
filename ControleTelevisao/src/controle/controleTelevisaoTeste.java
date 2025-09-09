package controle;

public class controleTelevisaoTeste {

    public static void main(String[] args) {

        ControleTelevisao con = new ControleTelevisao(341098, "LG magic controler");

        System.out.println("1 - tenta ligar o controle: espera true");
        resultadoTeste(con.ligarDesligar() == true);

        System.out.println("2 - tenta avançar o canal para o 2; espera 2");
        resultadoTeste(con.avancarCanal() == 2);

        System.out.println("3 - tenta ir para o canal 7; espera -1");
        resultadoTeste(con.irParaCanal(7) == -1);

        System.out.println("4 - tenta ir para o canal 1; espera 1");
        resultadoTeste(con.irParaCanal(1) == 1);

        System.out.println("5 - mostra o canal atual; espera 1");
        resultadoTeste(con.getCanalAnual() == 1);

        System.out.println("6 - tenta mostrar o canal atual; espera 1");
        resultadoTeste(con.retornarCanal() == 5);

        System.out.println("7 - tenta desligar o controle; espera 0");
        resultadoTeste(con.ligarDesligar() == false);

        System.out.println("8 - tenta avançar com estando desligado; espera 0");
        resultadoTeste(con.avancarCanal() == 0);
    }

    public static void resultadoTeste(Boolean valor) {
        final String RES_VERDE = "\u001B[32m";
        final String RES_VERMELHO = "\u001B[31m";
        final String RES_RESTART = "\u001B[0m";

        System.out.println((valor ? RES_VERDE + "passou!" :
                RES_VERMELHO + "não passou ") + RES_RESTART);
    }
}