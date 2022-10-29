import javax.swing.*;

public class Panels extends JFrame {

    JPanel jp = new JPanel();
    JButton jb = new JButton("Jag är en knapp");
//// CHange
    public Panels(){
        add(jp);
        jp.add(jb);
        jb.addMouseListener(new MouseA());
        setSize(200,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

