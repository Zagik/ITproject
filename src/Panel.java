import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vovaz on 11.03.2016.
 */
public class Panel extends JFrame {
    private JPanel newRootPanel;
    private JTextArea outputTextArea;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JTextField aTextField;
    private JTextField bTextField;
    private JTextField eTextField;
    private JTextField maxIterationTextField;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel eLabel;
    private JLabel maxIterationLabel;
    private JButton calculateButton;
    private JTabbedPane tabbedPane1;
    private JPanel tabeFirst;
    private JLabel photoHalfDivisionLabel;
    private JButton startHalfDivisionButton;
    private JLabel functionlabel;
    private JPanel HalfDivisionPhotoPanel;
    private JPanel GoldenSectionPhotoPanel;
    private JButton startGoldenSectionButton;
    private JLabel photoGoldenSectionLabel;

    public Panel() {
        super("Calculate");

        photoHalfDivisionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/o.gif")));
        photoGoldenSectionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/o.gif")));
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Calculate calculate = new Calculate(Double.parseDouble(aTextField.getText()),Double.parseDouble(bTextField.getText()),
                        Double.parseDouble(eTextField.getText()),Integer.parseInt(maxIterationTextField.getText()));
                outputTextArea.setText(String.format("Half Division = %s;\nDone iterations - %s;\n\nGolden Section(min) = %s;\nDone iterations - %s;\nGolden Section(max) = %s;\n" +
                                "Done iterations - %s; ",String.valueOf(calculate.getXs()),HalfDivision.iteration,String.valueOf(calculate.getxMin()),
                        GoldenSection.iterationXMin,String.valueOf((calculate.getxMax())),GoldenSection.iterationXMax));

            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        frame.setContentPane(new Panel().newRootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}

