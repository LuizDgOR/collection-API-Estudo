package ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String Nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        Nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}

class ComparatorPorAltura implements Comparator <Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}