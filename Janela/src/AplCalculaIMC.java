import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
 
/**
 * classe é um Jframe interface com usuário
 */
class GuiPrincipal extends JFrame{
    //variaveis dos componentes
    private JTextField edtPeso;
    private JTextField edtAltura;
    private JButton btnCalcula;
    private JLabel lblPeso;
    private JLabel lblAltura;
    private JLabel lblResultado;
 
    /**
     * construtor
     */
    public GuiPrincipal(){
        //chamando metodo de configuração
        setConfig();
    }
 
    /**
     * seto todas configurações do formulario
     */
    private void setConfig() {
        //configuração do JFrame
        this.setTitle("Calcula IMC");//titulo
        this.setSize(600, 150);//tamanho do Jframe
        this.setLayout(new GridLayout(0, 2));//layout se comporta como uma tabela, mais detalhes: http://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha aplicação como padrão
        this.setLocationRelativeTo(null);//centraliza o JFrame
        this.getContentPane().setBackground(Color.BLUE);//cor de fundo é amarelo
         
        //instanciando componentes
        edtPeso=new JTextField();
        edtAltura=new JTextField();
        btnCalcula=new JButton("Calcular");
        lblPeso=new JLabel("Peso:");
        lblAltura=new JLabel("Altura:");
        lblResultado=new JLabel("Resultado: ");
         
        //add evento ao botão de calculo
        btnCalcula.addActionListener(new EventoCalculaIMC());
         
        //add componentes ao Jframe
        this.add(lblPeso);
        this.add(lblAltura);
        this.add(edtPeso);
        this.add(edtAltura);
        this.add(lblResultado);
        this.add(btnCalcula);
    }
 
   
    class EventoCalculaIMC implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
 
                //converte string em double
                double peso=Double.parseDouble(edtPeso.getText());
                double altura=Double.parseDouble(edtAltura.getText());
                //calcula imc
                double imc=peso/Math.pow(altura,2);
 
                //objeto para formatar saida, com uma decimal
                DecimalFormat df=new DecimalFormat("#0.0");
 
                String resultado="Resultado: "+df.format(imc);
                 
                //abaixo comparo valor do imc e concatena a string resultado
                if (imc < 18.5){
            System.out.println("Peso Baixo");
         }    
         else if (imc  >= 18.5 && imc <= 24.9 ){
            System.out.println("Peso Normal");
         }
         else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
         }
         else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade(Grau I)");
         }
         else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obedidade Severa (Grau II)");
         }
         else{
            System.out.println("Obesidade Mórbida (Grau III)");
         }
 
                //seta texto em label
                lblResultado.setText(resultado);
 
            }catch (ArithmeticException ar) {
                JOptionPane.showMessageDialog(null, "Erro aritmético, causa: "+ar.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido, causa: "+ex.getMessage());
            }
        }
    }
 
}
 
public class AplCalculaIMC {
    public static void main(String[] args) {
        //instanciando e exibindo
        new GuiPrincipal().setVisible(true);
    }
}