package controle;

public class ControleTelevisaoObjetivos {
    public static void main(String[] args) {
        ControleTelevisao ct1 = new ControleTelevisao(1, "ABC");
        ControleTelevisao ct2 = new ControleTelevisao(2, "XVZ");
        ControleTelevisao ct3 = new ControleTelevisao(3, "WW3");

        ct2.ligarDesligar();

        mostrarControleRemoto(ct1);
        mostrarControleRemoto(ct2);
        mostrarControleRemoto(ct3);

    }

    public static void mostrarControleRemoto(ControleTelevisao ct) {

        System.out.println();
        System.out.println("Indentificador: " + ct.getIdControle());
        System.out.println("Modelo: " + ct.getModelo());
        System.out.println("Canal atual: " + ct.getCanalAnual());
        System.out.println("Ligado....... " + ct.getLigado());
    }
}



