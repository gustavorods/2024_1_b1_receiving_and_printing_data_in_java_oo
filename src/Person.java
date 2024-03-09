import javax.swing.JOptionPane;
public class Person {
    // Atributos
    private String nome;
    private String endereco;
    private double salario;
    private String telefone;
    private String email;

    // Inicializando vaziu
    public Person() {
        this("", "", 0, "", "");
    }

    // Inicializando cheio (com argumentos)
    public Person(String nome, String enderco, double salario, String telefone, String email) {
        this.nome = nome;
        this.endereco = enderco;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
    }

    // Getter e setter

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void EnterDataPerson() {
        setNome(JOptionPane.showInputDialog("Insira seu nome: "));
        setEndereco(JOptionPane.showInputDialog("Insira seu endereço: "));
        setEmail(JOptionPane.showInputDialog("Insira seu Email: "));
        setTelefone( JOptionPane.showInputDialog("Insira seu telefone: "));
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira seu salário: ")));
    }

    public void ShowDataPerson() {
        JOptionPane.showMessageDialog(null, "Meu nome é " + getNome() + ", e aqui estão algumas das minhas informações: " + "\n" +
                "Endereco: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Salário: R$" + getSalario());
    }

}