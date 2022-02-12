package model;

import java.time.LocalDate;

public class Mentorias extends Conteudo {
    
private LocalDate date;

public Mentorias (LocalDate date){
    this.date = date;
}

public Mentorias (){
    
}

public LocalDate getDate() {
    return date;
}

public void setDate(LocalDate date) {
    this.date = date;
}


@Override
public String toString() {
    return "Mentorias [date=" + date + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
}

@Override
public double calcularXp() {
    return Xp_Default + 20d;
}



}
