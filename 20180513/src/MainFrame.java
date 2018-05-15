import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    JButton jbut [][] = new JButton[4][4];
    JLabel jlb = new JLabel();
    private Container cp ;
    private JPanel jpnn = new JPanel(new GridLayout());
    private JPanel jpnc = new JPanel(new GridLayout(4,4,3,3));
    public MainFrame (){
        init();
    }
    private void init (){
        this.setBounds(100,100,400,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpnn,BorderLayout.NORTH);
        cp.add(jpnc,BorderLayout.CENTER);
        jpnn.add(jlb);

        jbut[0][0] = new JButton("7");
        jbut[0][1] = new JButton("8");
        jbut[0][2] = new JButton("9");
        jbut[0][3] = new JButton("/");
        jbut[1][0] = new JButton("4");
        jbut[1][1] = new JButton("5");
        jbut[1][2] = new JButton("6");
        jbut[1][3] = new JButton("*");
        jbut[2][0] = new JButton("1");
        jbut[2][1] = new JButton("2");
        jbut[2][2] = new JButton("3");
        jbut[2][3] = new JButton("-");
        jbut[3][0] = new JButton("0");
        jbut[3][1] = new JButton(".");
        jbut[3][2] = new JButton("=");
        jbut[3][3] = new JButton("+");

        for (int i = 0 ; i<4 ; i++){
            for (int j = 0; j<4 ; j++){
                jbut[i][j].setFont(new Font(null,Font.BOLD,22));
                jpnc.add(jbut[i][j]);
            }
        }

        for (int i = 0 ; i<4 ; i++){
            for (int j= 0 ; j<4 ; j++){
                jbut[i][j].addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        JButton tmp = (JButton) actionEvent.getSource();
                        jlb.setText(jlb.getText()+tmp.getText());
                    }
                });
            }
        }
    }

}
