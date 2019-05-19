import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Color;
//import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MyGUIForm extends JFrame{
    private JButton Accept;
    private JPanel rootPanel;
    private JButton Decline;
    private JButton RequesteePr;
    private JButton RequestSumm;
    private JLabel someoneAcceptedYourRequestLabel;

    public MyGUIForm()
    {
        //This uses the form designer form
        add (rootPanel);
        setTitle("Request Claim Acceptance");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //completely close the window with x button


        Accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(rootPanel, "You accepted the request");
                JOptionPane.showOptionDialog(rootPanel, "Do you wish to continue?", "You accepted the request", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, "NO");
            }
        });
        Decline.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(rootPanel, "You declined the request");
                JOptionPane.showOptionDialog(rootPanel, "Do you wish to continue?", "You declined the request", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, "NO");
            }
        });
        RequestSumm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Now you will see summary of your request"); //redirected to the use-case "Request Summary"
            }
        });
        RequesteePr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "You will be redirected to the requestee's profile");
            }
        });
    }

}
