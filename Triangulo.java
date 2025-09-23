package unico;


public class Triangulo {

    private int idTriangulo;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double area;
    private String tipo;

    public Triangulo(int idTriangulo, double ladoA, double ladoB, double ladoC) {


        this.idTriangulo = idTriangulo;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        calcularArea();
        definirTipo();
    }

    public int getIdTriangulo() {
        return idTriangulo;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularArea() {

        if (ladoA + ladoB > ladoC) {
            double sp = ladoA + ladoB + ladoC / 2;
            area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));

        }else if(ladoA + ladoC > ladoB){
            double sp = ladoA + ladoB + ladoC / 2;
            area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));

        }else if(ladoB + ladoC > ladoA){
            double sp = ladoA + ladoB + ladoC / 2;
            area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));

        }else {
            area = 0;
        }
        return area;


    }
    public String definirTipo(){

        if(ladoA == ladoB && ladoB == ladoC){
            tipo="Equilatero";
        }if(ladoA != ladoB && ladoB != ladoC){
            tipo="Escaleno";
        }if(ladoA == ladoB && ladoB != ladoC){
            tipo="Isosceles";
        }else{
            tipo="Indefinido";
        }
        return tipo;

    }
}

























