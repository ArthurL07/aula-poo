package controle;


public class ControleTelevisao {


    private int idControle;
    private String modelo;
    private int canalAtual;
    private boolean ligado;


    public ControleTelevisao(int idControle, String modelo){
        this.idControle = idControle;
        this.modelo = modelo;
        this.ligado = false;
        this.canalAtual= 0;
    }


    public int getIdControle() {
        return idControle;
    }


    public String getModelo() {
        return modelo;
    }


    public int getCanalAnual() {
        return canalAtual;
    }


    public boolean getLigado() {
        return ligado;
    }


    public boolean ligarDesligar(){
        ligado = !ligado;
        if(ligado){
            canalAtual = 1;
        }else{
            canalAtual = 0;
        }
        return ligado;
    }


    public int avancarCanal(){
        if (!ligado) canalAtual = 0;
        canalAtual++;
        if (canalAtual > 5){
            canalAtual = 1;
        }
        return canalAtual;
    }


    public int retornarCanal(){
        if (!ligado) canalAtual = 0;
        canalAtual--;
        if (canalAtual < 1){
            canalAtual = 5;
        }
        return canalAtual;
    }


    public int irParaCanal(int canal){
        if (!ligado) canalAtual = 0;
        if (canal >= 1 && canal <= 5){
            canalAtual = canal;
            return canalAtual;
        }else{
            return -1;
        }
    }
}

