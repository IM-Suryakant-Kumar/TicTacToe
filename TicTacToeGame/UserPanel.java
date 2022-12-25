package TicTacToeGame;


import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserPanel implements ActionListener {
    JFrame jf = new JFrame("Tic Tac Toe Game by sujeet");
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JTextField jt1;
    JTextField jt2;
    JComboBox jcb;
    JButton jb;

    UserPanel() {
        this.jf.setSize(500, 700);
        this.jf.setDefaultCloseOperation(3);
        this.jf.setLayout((LayoutManager) null);
        this.jl1 = new JLabel("ENTER 1ST PLAYER NAME");
        this.jl1.setBounds(50, 100, 150, 30);
        this.jf.add(this.jl1);
        this.jt1 = new JTextField();
        this.jt1.setBounds(200, 100, 200, 40);
        this.jf.add(this.jt1);
        this.jl2 = new JLabel("ENTER 2ND PLAYER NAME");
        this.jl2.setBounds(50, 180, 150, 30);
        this.jf.add(this.jl2);
        this.jt2 = new JTextField();
        this.jt2.setBounds(200, 180, 200, 40);
        this.jf.add(this.jt2);
        this.jl3 = new JLabel("Select series");
        this.jl3.setBounds(50, 260, 150, 30);
        this.jf.add(this.jl3);
        String[] series = new String[] { "3", "5", "7", "9" };
        this.jcb = new JComboBox(series);
        this.jcb.setBounds(200, 260, 200, 40);
        this.jf.add(this.jcb);
        this.jb = new JButton("START GAME");
        this.jb.addActionListener(this);
        this.jb.setBounds(175, 500, 150, 40);
        this.jf.add(this.jb);
        this.jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jb) {
            String player1 = this.jt1.getText();
            String player2 = this.jt2.getText();
            String series = (String) this.jcb.getSelectedItem();
            GamePanel gp = new GamePanel(player1, player2, Integer.parseInt(series));
            gp.openGamePanel();
            this.jf.setVisible(false);
        }

    }
}
