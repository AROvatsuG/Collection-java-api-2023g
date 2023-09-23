package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados (){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);;

    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 12346);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 12347);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 12348);
//
        conjuntoConvidados.removerConvidadoPorCodigoConvite(12345);
        conjuntoConvidados.exibirConvidados();


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
    }

}
