/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.geae;

/**
 *
 * @author giovanna62565106
 */
public class PessoaAssistida {
    private String nome;
    private String endereco;
    private String telefone;
    private int membrosFamilia;
    private boolean temCriancas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getMembrosFamilia() {
        return membrosFamilia;
    }

    public void setMembrosFamilia(int membrosFamilia) {
        this.membrosFamilia = membrosFamilia;
    }

    public boolean isTemCriancas() {
        return temCriancas;
    }

    public void setTemCriancas(boolean temCriancas) {
        this.temCriancas = temCriancas;
    }
    
    public PessoaAssistida(String nome, String endereco, String telefone, int membrosFamilia, boolean temCriancas){
        this.endereco = endereco;
        this.membrosFamilia = membrosFamilia;
        this.nome = nome;
        this.temCriancas = temCriancas;
        this.telefone = telefone;
    }
    
    public void exibirDetalhes(){
        if(temCriancas == false){
        System.out.println("Assistido: "+nome+"\n"+
                "Telefone: "+telefone+"\n"+
                "Endereco: "+endereco+"\n"+
                "Quantidade de membros na familia: "+membrosFamilia+"\n"+
                "Sem criancas na familia");
        }
        else{
            System.out.println("Assistido: "+nome+"\n"+
                "Telefone: "+telefone+"\n"+
                "Endereco: "+endereco+"\n"+
                "Quantidade de membros na familia: "+membrosFamilia+"\n"+
                "Tem criancas na familia");
        }
    }
}
