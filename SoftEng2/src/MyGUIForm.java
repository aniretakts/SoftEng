import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Color;
//import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class MyGUIForm extends JFrame {

    //private JPanel rootPanel;
    private JButton Start;
    private JButton Confirm;
    private JButton Edit;
    private JPanel rootPanel;

    public MyGUIForm ()
    {
        //This uses the form designer form
        add(rootPanel);

        setTitle("Request Tracking Update");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //completely close the window with x button


        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Next step just started");
            }
        });
        Confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showOptionDialog(rootPanel, "Are you sure you want to continue with the confirmation?", "You confirmed the request", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, "NO");
            }
        });
    }



}
