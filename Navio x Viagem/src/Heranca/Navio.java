package Heranca;

public class Navio {
    private int idNavio;
    private String nome;
    private int capacidadeCarga;
    private char status;
    private boolean alocado;

    public Navio(int idNavio, String nome, int capacidadeCarga) {
        this.idNavio = idNavio;
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
        this.status = 'V';
        this.alocado = false;
    }

    public boolean alocar(){

        if (this.alocado = false){
            status = 'V';
            return true;
        }
            return false;
    }

    public boolean iniciarCarregamento(){

        if (this.alocado && this.status == 'V'){
          this.status = 'C';
          return true;
        }
          return false;
    }

    public boolean finalizarCarregamento(){

        if (this.status == 'C'){
           this.status = 'L';
           return true;
        }
        return false;
    }

    public boolean descarregar(){

        if (this.status == 'L'){
            this.status = 'V';
            this.alocado = false;
            return true;
        }
        return false;
    }

    public int getIdNavio() {
        return idNavio;
    }

    public boolean isAlocado() {
        return alocado;
    }

    public char getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
