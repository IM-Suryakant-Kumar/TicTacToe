package TicTacToeGame;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GamePanel implements ActionListener {
    JFrame jf;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JButton jb7;
    JButton jb8;
    JButton jb9;
    int count;
    String str;
    Color color;
    boolean win = false;
    String winner;
    boolean first_turn = false;
    int total_series;
    int series = 0;
    int player1_win;
    int player2_win;
    String player1;
    String player2;
    String message;

    GamePanel(String player1, String player2, int total_series) {
        this.player1 = player1;
        this.player2 = player2;
        this.total_series = total_series;
    }

    void openGamePanel() {
        this.jf = new JFrame();
        this.jf.setTitle(this.player1 + " x turn");
        this.jf.setSize(400, 400);
        this.jf.setDefaultCloseOperation(3);
        this.jf.setLayout(new GridLayout(3, 3));
        this.jb1 = new JButton();
        this.jb1.addActionListener(this);
        this.jf.add(this.jb1);
        this.jb2 = new JButton();
        this.jb2.addActionListener(this);
        this.jf.add(this.jb2);
        this.jb3 = new JButton();
        this.jb3.addActionListener(this);
        this.jf.add(this.jb3);
        this.jb4 = new JButton();
        this.jb4.addActionListener(this);
        this.jf.add(this.jb4);
        this.jb5 = new JButton();
        this.jb5.addActionListener(this);
        this.jf.add(this.jb5);
        this.jb6 = new JButton();
        this.jb6.addActionListener(this);
        this.jf.add(this.jb6);
        this.jb7 = new JButton();
        this.jb7.addActionListener(this);
        this.jf.add(this.jb7);
        this.jb8 = new JButton();
        this.jb8.addActionListener(this);
        this.jf.add(this.jb8);
        this.jb9 = new JButton();
        this.jb9.addActionListener(this);
        this.jf.add(this.jb9);
        this.jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        ++this.count;
        if (this.first_turn) {
            this.str = "0";
            this.color = Color.green;
            this.jf.setTitle(this.player1 + " x turn");
            this.first_turn = false;
        } else {
            this.str = "x";
            this.color = Color.orange;
            this.jf.setTitle(this.player2 + " 0 turn");
            this.first_turn = true;
        }

        if (e.getSource() == this.jb1) {
            this.jb1.setText(this.str);
            this.jb1.setFont(new Font("Arial", 1, 50));
            this.jb1.setBackground(this.color);
            this.jb1.setEnabled(false);
        }

        if (e.getSource() == this.jb2) {
            this.jb2.setText(this.str);
            this.jb2.setFont(new Font("Arial", 1, 50));
            this.jb2.setBackground(this.color);
            this.jb2.setEnabled(false);
        }

        if (e.getSource() == this.jb3) {
            this.jb3.setText(this.str);
            this.jb3.setFont(new Font("Arial", 1, 50));
            this.jb3.setBackground(this.color);
            this.jb3.setEnabled(false);
        }

        if (e.getSource() == this.jb4) {
            this.jb4.setText(this.str);
            this.jb4.setFont(new Font("Arial", 1, 50));
            this.jb4.setBackground(this.color);
            this.jb4.setEnabled(false);
        }

        if (e.getSource() == this.jb5) {
            this.jb5.setText(this.str);
            this.jb5.setFont(new Font("Arial", 1, 50));
            this.jb5.setBackground(this.color);
            this.jb5.setEnabled(false);
        }

        if (e.getSource() == this.jb6) {
            this.jb6.setText(this.str);
            this.jb6.setFont(new Font("Arial", 1, 50));
            this.jb6.setBackground(this.color);
            this.jb6.setEnabled(false);
        }

        if (e.getSource() == this.jb7) {
            this.jb7.setText(this.str);
            this.jb7.setFont(new Font("Arial", 1, 50));
            this.jb7.setBackground(this.color);
            this.jb7.setEnabled(false);
        }

        if (e.getSource() == this.jb8) {
            this.jb8.setText(this.str);
            this.jb8.setFont(new Font("Arial", 1, 50));
            this.jb8.setBackground(this.color);
            this.jb8.setEnabled(false);
        }

        if (e.getSource() == this.jb9) {
            this.jb9.setText(this.str);
            this.jb9.setFont(new Font("Arial", 1, 50));
            this.jb9.setBackground(this.color);
            this.jb9.setEnabled(false);
        }

        this.winningPossibilities();
        this.whoWins();
    }

    void winningPossibilities() {
        if (this.jb1.getText() != "" && this.jb1.getText() == this.jb2.getText()
                && this.jb2.getText() == this.jb3.getText()) {
            this.win = true;
        } else if (this.jb4.getText() != "" && this.jb4.getText() == this.jb5.getText()
                && this.jb5.getText() == this.jb6.getText()) {
            this.win = true;
        } else if (this.jb7.getText() != "" && this.jb7.getText() == this.jb8.getText()
                && this.jb8.getText() == this.jb9.getText()) {
            this.win = true;
        } else if (this.jb1.getText() != "" && this.jb1.getText() == this.jb5.getText()
                && this.jb5.getText() == this.jb9.getText()) {
            this.win = true;
        } else if (this.jb3.getText() != "" && this.jb3.getText() == this.jb5.getText()
                && this.jb5.getText() == this.jb7.getText()) {
            this.win = true;
        } else if (this.jb1.getText() != "" && this.jb1.getText() == this.jb4.getText()
                && this.jb4.getText() == this.jb7.getText()) {
            this.win = true;
        } else if (this.jb2.getText() != "" && this.jb2.getText() == this.jb5.getText()
                && this.jb5.getText() == this.jb8.getText()) {
            this.win = true;
        } else if (this.jb3.getText() != "" && this.jb3.getText() == this.jb6.getText()
                && this.jb6.getText() == this.jb9.getText()) {
            this.win = true;
        } else {
            this.win = false;
        }

    }

    void whoWins() {
        if (this.win) {
            if (this.str.equals("x")) {
                this.jf.setTitle(this.player1 + " win");
                JOptionPane.showMessageDialog(this.jf, this.player1 + " x wins");
                this.winner = this.player1 + " x";
                this.first_turn = false;
                ++this.player1_win;
            } else {
                this.jf.setTitle(this.player2 + " win");
                JOptionPane.showMessageDialog(this.jf, this.player2 + " 0 wins");
                this.winner = this.player2 + " 0";
                this.first_turn = true;
                ++this.player2_win;
            }

            ++this.series;
            if (this.series == this.total_series) {
                this.winSeries();
            } else {
                this.restartGame(this.winner);
            }
        } else if (!this.win && this.count == 9) {
            JOptionPane.showMessageDialog(this.jf, "Match Draw");
            ++this.series;
            if (this.series == this.total_series) {
                this.winSeries();
            } else {
                this.restartGame(this.winner);
            }
        }

    }

    void winSeries() {
        if (this.series == this.total_series) {
            if (this.player1_win > this.player2_win) {
                this.message = this.player1 + " win";
            } else {
                this.message = this.player2 + " win";
            }

            JOptionPane.showMessageDialog(this.jf, "Series Comleted...!!");
            new WhoWin(this.message);
            this.jf.setVisible(false);
        }

    }

    void restartGame(String winner) {
        int i = JOptionPane.showConfirmDialog(this.jf, "Do you want to resatart the game");
        if (i == 0) {
            this.jb1.setText("");
            this.jb2.setText("");
            this.jb3.setText("");
            this.jb4.setText("");
            this.jb5.setText("");
            this.jb6.setText("");
            this.jb7.setText("");
            this.jb8.setText("");
            this.jb9.setText("");
            this.jb1.setBackground((Color) null);
            this.jb2.setBackground((Color) null);
            this.jb3.setBackground((Color) null);
            this.jb4.setBackground((Color) null);
            this.jb5.setBackground((Color) null);
            this.jb6.setBackground((Color) null);
            this.jb7.setBackground((Color) null);
            this.jb8.setBackground((Color) null);
            this.jb9.setBackground((Color) null);
            this.btnsetEnabling(true);
            this.count = 0;
            this.str = "";
            this.win = false;
            this.jf.setTitle(winner);
        } else if (i == 1) {
            System.exit(0);
        } else {
            this.btnsetEnabling(false);
        }

    }

    void btnsetEnabling(boolean b) {
        this.jb1.setEnabled(b);
        this.jb2.setEnabled(b);
        this.jb3.setEnabled(b);
        this.jb4.setEnabled(b);
        this.jb5.setEnabled(b);
        this.jb6.setEnabled(b);
        this.jb7.setEnabled(b);
        this.jb8.setEnabled(b);
        this.jb9.setEnabled(b);
    }
}
