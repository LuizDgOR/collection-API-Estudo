package ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenaPessoas {

    private List<Pessoa> pessoaList;

    public OrdenaPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome , int idade , double altura){

        pessoaList.add(new Pessoa( nome, idade , altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List <Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenaPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }
}
