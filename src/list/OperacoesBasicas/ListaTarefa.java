package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao){

        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String decricao){

        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(decricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){

        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){

        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa 1 ");
        listaTarefa.adicionarTarefa("Tarefa 2 ");


        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("número total de elementos" + listaTarefa.obterNumeroTotalTarefas());


    }
}
