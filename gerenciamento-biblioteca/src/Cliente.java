import java.util.ArrayList;


public class Cliente {
    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;
    private String CPF;
    private ArrayList<Livro> livrosEmprestados;

    public Cliente(Integer codigo, String nome, String email, String telefone, String CPF) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<Livro> mostraLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionaLivroEmprestado(Livro livrosEmprestado) {
        this.livrosEmprestados.add(livrosEmprestado);
    }

    public void removeLivroEmprestado(Livro livrosEmprestado) {
        this.livrosEmprestados.remove(livrosEmprestado);
    }

    public String mostraLivros(){
        return this.livrosEmprestados.toString();
    }

    @Override
    public String toString(){
        return  String.format("Cliente numero %d nome %s, email %s, telefone %s cpf %s livros emprestados: %s", codigo, nome
                , email, telefone, CPF, mostraLivros());
    }
}
