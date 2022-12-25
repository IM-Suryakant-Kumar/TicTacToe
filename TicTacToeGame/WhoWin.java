package TicTacToeGame;


import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WhoWin {
    WhoWin(String message) {
        JFrame jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(3);
        jf.setLayout((LayoutManager) null);
        JLabel jl = new JLabel(message);
        jl.setBounds(100, 100, 400, 50);
        jl.setFont(new Font("Arial", 1, 30));
        jl.setForeground(Color.MAGENTA);
        jf.add(jl);
        jf.setVisible(true);
    }
}
