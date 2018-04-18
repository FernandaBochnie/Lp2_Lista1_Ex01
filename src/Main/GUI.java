

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    
    private JPanel pnCentro = new JPanel();
    
    private JLabel lbNum = new JLabel("Número");
    
    private JTextField tfNumero = new JTextField();
    
    private JLabel lbResultado = new JLabel();
    
    private JLabel lbRes = new JLabel("Resultado");
    
    private JButton btCalcular = new JButton("Calcular");
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("GUI");
        
        cp.add(pnCentro, BorderLayout.CENTER);
        pnCentro.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnCentro.setLayout(new GridLayout(3,2));
        
        pnCentro.add(lbNum);
        pnCentro.add(tfNumero);
        
        pnCentro.add(lbRes);
        pnCentro.add(lbResultado);
        
        pnCentro.add(btCalcular);
        
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
                
                entidade.setNumero(Integer.valueOf(tfNumero.getText()));
                
                lbResultado.setText(String.valueOf(entidade.getResultado()));
            } 
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
