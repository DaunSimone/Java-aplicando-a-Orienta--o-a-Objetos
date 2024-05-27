public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (this.idade < 18) {
            System.out.println("Pessoa menor de idade: "+ idade);
            
        } else {
            System.out.println("Pessoa maior de idade: "+ idade);
            
        }
        
    }

    

}
