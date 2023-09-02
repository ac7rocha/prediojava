package predio;
public class Elevador {
    private int totalAndares = 3;
    private int andarAtual = 0;
    private int capacidadeElevador = 3;
    private int lotacaoElevador = 0;
    
    public int Inicializa(int capacidadeElevador, int totalAndares){
       
        return 0;
    }
    public void Entra(){
        if (this.getLotacaoElevador() < 3) {
            lotacaoElevador ++;    
        } else {
            System.out.println("Atingiu a capacidade máxima:");
        }
    }
    public void Sai(){
        if (this.getLotacaoElevador() > 0) {
            lotacaoElevador --;    
        }
        
    }
    public void Sobe(){
        
        if (this.getAndarAtual() < this.getTotalAndares()) {
            this.andarAtual += 1;
        } else {
            System.out.println("Elevador não pode subir, atigiu andar limite");
        }
    }
    public void Desce(){
        if (this.getAndarAtual() > 0) {
            this.andarAtual -= 1;
        } else {
            System.out.println("Elevador não pode descer, atingiu andar limite");
        }
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getLotacaoElevador() {
        return lotacaoElevador;
    }

    public void setLotacaoElevador(int lotacaoElevador) {
        this.lotacaoElevador = lotacaoElevador;
    }
    
    
    
    
}
