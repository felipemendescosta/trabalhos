package sistemaescolar;


public class aluno {
    public String nome;
    public String sexo;
    public String matricula;
    public int dataNascimento;


    public void registro(){
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Sexo ou Genero do aluno: " + getSexo()); 
        System.out.println("Data de nascimento do aluno: " + getDataNascimento()); 
        System.out.println("Matricula do novo aluno: " + getMatricula()); 
   }
            
    public void registrarAluno(String nome, String sexo, String matricula, int dataNascimento){
        if (getNome().equals(getSexo()) ) {
            setDataNascimento(dataNascimento);
            setMatricula(matricula);
        } 
        
    }
        
    
    public aluno(String nome, String sexo, String matricula, int dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    }
