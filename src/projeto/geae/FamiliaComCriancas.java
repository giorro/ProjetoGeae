/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.geae;

/**
 *
 * @author giovanna62565106
 */
public class FamiliaComCriancas extends PessoaAssistida {
    
    private int quantidadeCriancas;
    private int idadeCriancas;

    public int getIdadeCriancas() {
        return idadeCriancas;
    }

    public void setIdadeCriancas(int idadeCriancas) {
        this.idadeCriancas = idadeCriancas;
    }
    
    public int getQuantidadeCriancas() {
        return quantidadeCriancas;
    }

    public void setQuantidadeCriancas(int quantidadeCriancas) {
        this.quantidadeCriancas = quantidadeCriancas;
    }
    
    public FamiliaComCriancas(String nome, String endereco, String telefone, int membrosFamilia, boolean temCriancas, int quantidadeCriancas, int idadeCriancas) {
        super(nome, endereco, telefone, membrosFamilia, true);
        this.quantidadeCriancas = quantidadeCriancas;
        this.idadeCriancas = idadeCriancas;
    }
    
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Quantidade de criancas: "+this.quantidadeCriancas+"\n"+
                "Idade criancas: ");
    }
}
