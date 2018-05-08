import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {
    private JButton jbtnrun = new JButton("產生");
    private JButton jbtnexit = new JButton("結束");
    private JButton jbtns[] = new JButton[6];
    private Container cp;
    private JPanel A = new JPanel(new GridLayout(1, 6, 3, 3));
    private JPanel B = new JPanel(new GridLayout(1, 2, 6, 6));

    private boolean buttn = true;
    private Random rand = new Random();

    public MainFrame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(3);//設定關閉視窗的按鈕
        this.setLayout(null);//設置布局為空
        this.setBounds(100, 100, 500, 180);//設置介面大小
        MainFrame.this.setTitle("樂透開獎");

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));

        cp.add(A, BorderLayout.CENTER);
        cp.add(B, BorderLayout.SOUTH);

        B.add(jbtnrun);
        B.add(jbtnexit);
        jbtnrun.setFont(new Font(null, Font.BOLD, 30));
        jbtnexit.setFont(new Font(null, Font.BOLD, 30));

        for (int i = 0; i < 6; i++) {
            jbtns[i] = new JButton();
            jbtns[i].setBackground(new Color(92, 250, 195));
            jbtns[i].setEnabled(false);

            A.add(jbtns[i]);
        }
    }
}