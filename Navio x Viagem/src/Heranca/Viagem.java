package Heranca;

import javax.xml.crypto.Data;

public class Viagem {
   private int idViagem;
   private Data data;
   private char situacao;
   private Navio navio;

    public Viagem(int idViagem, Data data) {
        this.idViagem = 1;
        this.data = data;
        this.situacao = 'P';
        this.navio = null;
    }
    public boolean alocarNavio(NavioContainer navioContainer){
        return alocarNavio(navioContainer);
    }

    public boolean alocarNavio(NavioGranaleiro navioGranaleiro){
        return alocarNavio(navioGranaleiro);
    }

    public boolean iniciarViagem(){

        if(this.navio == null){
            return false;
        }

        if (navio.getStatus() == 'L'){
            situacao = 'O';
            return true;
        }
        return false;

    }

    public boolean finalizarViagem(){
        if (this.navio == null){
            return false;
        }

        if (navio.getStatus() == 'V'){
            situacao = 'F';
            return true;
        }
        return false;
    }

}
