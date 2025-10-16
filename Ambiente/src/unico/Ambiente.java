package unico;

public class Ambiente {

    private int idAmbiente;
    private String nome;
    private int capacidade;
    private int qtdeAtual;
    private char situacao;

    public Ambiente(int idAmbiente, String nome, int capacidade){

        this.idAmbiente = idAmbiente;
        this.nome = nome;
        this.capacidade = capacidade;
        this.qtdeAtual = 0;
        this.situacao = 'L';
        regristrarEntrada();
        regristrarSaida();
        calcularDisponibilidade();
    }

    public int getIdAmbiente() {
        return idAmbiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeAtual() {
        return qtdeAtual;
    }

    public char getSituacao() {
        return situacao;
    }

    public boolean regristrarEntrada(){

        if(situacao == 'L' && qtdeAtual < capacidade){
            qtdeAtual++;
            ajustarSituacao();
            return true;
        }else{
            return false;
        }
    }
     public boolean regristrarSaida(){

        if(qtdeAtual > 0){
            qtdeAtual--;
            ajustarSituacao();
            return true;
        }else{
            return false;
        }
     }

     public char ajustarSituacao(){
         if (qtdeAtual >= capacidade) {
             situacao = 'B';
         } else {
             situacao = 'L';
         }
         return situacao;
     }

     public int calcularDisponibilidade(){
        return capacidade - qtdeAtual;
     }
}
