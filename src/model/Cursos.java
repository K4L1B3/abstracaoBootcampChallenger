package model;

public class Cursos extends Conteudo {
    
    private int cargahoraria;
    
    
    public Cursos (int cargahoraria){
        
        this.cargahoraria = cargahoraria;
        
    }
    
    
    public Cursos (){
    }
    
    @Override
    public double calcularXp() {
        return Xp_Default * cargahoraria;
    }
    
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Cursos [cargahoraria=" + cargahoraria + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
    }


    

}
