package unico;


import java.util.ArrayList;

public class TesteTriangulo {
    public static void main(String[] args) {


        ArrayList<Triangulo> tr = new ArrayList<Triangulo>();

        tr.add(new Triangulo(111, 5, 5, 5));
        tr.add(new Triangulo(108, 8, 10, 3));
        tr.add(new Triangulo(189, 4, 8, 10));
        tr.add(new Triangulo(234, 5, 5, 7));
        tr.add(new Triangulo(145, 7, 6, 7));


        for( int i = 0;i<tr.size(); i++){


            mostraTriangulo( tr.get(i) );
        }

    }

    static void mostraTriangulo(Triangulo tr){
        System.out.println("--------------------------------------------------------");
        System.out.println("Identificador....: " + tr.getIdTriangulo());
        System.out.println("lado A.............: " + tr.getLadoA());
        System.out.println("lado B..........: " + tr.getLadoB());
        System.out.println("lado C...: " + tr.getLadoC());
        System.out.println("area: " + tr.getArea());
        System.out.println("tipo: " + tr.getTipo());
    }

}

