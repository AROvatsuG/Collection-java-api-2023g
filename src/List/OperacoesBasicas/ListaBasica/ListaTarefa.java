package List.OperacoesBasicas.ListaBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa (){
        this.tarefaList =  new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotaldeTarefa(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é:" + listTarefa.obterNumeroTotaldeTarefa());

        //adicionando Tarefas
        listTarefa.adicionarTarefa( "Tarefa 1");
        listTarefa.adicionarTarefa( "Tarefa 2");
        listTarefa.adicionarTarefa( "Tarefa 3");


        System.out.println("O numero total de elementos na lista é:" + listTarefa.obterNumeroTotaldeTarefa());

        listTarefa.removerTarefa("Tarefa 1");

        System.out.println("O numero total de elementos na lista é:" + listTarefa.obterNumeroTotaldeTarefa());

        listTarefa.obterDescricoesTarefas();

    }

}