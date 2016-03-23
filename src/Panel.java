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
    private String goldenSection = "  Розділимо відрізок [a,b] навпіл точкою  c=(a+b)/2 , яка буде наближеним значенням кореня  х.\n" +
            "  Для зменшення похибки наближення кореня уточнюють відрізок ізоляції кореня.\n" +
            "  У цьому випадку продовжують ділити відрізки, що містять корінь, навпіл.\n" +
            "  З відрізків [a;c]і [c;b]  вибирають той, для якого виконується нерівність f(a)*f(b)<0 \n" +
            "  У нашому випадку це відрізок [c,b], де f(c)*f(b)<0" +
            "  Далі повторюємо операцію ділення відрізка навпіл, тобто знаходимо c = (c+b)/2 \n" +
            "  і так далі до тих пір, поки не буде досягнута задана точність E\n";
    private String halfDivision = "  Основна ідея методу золотого січення  полягає в тому, що інтервал пошуку ділиться" +
            "на дві частини так, щоб відношення довжини великого \n  відрізка до довжини всього інтервалу" +
            " було таке, що дорівнює відношенню z1/z = z2/z1";
    public Panel() {
        super("Calculate");

        photoHalfDivisionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photoHalfDivision.gif")));
        photoGoldenSectionLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photoGoldenSection.png")));
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Calculate calculate = new Calculate(Double.parseDouble(aTextField.getText()),Double.parseDouble(bTextField.getText()),
                        Double.parseDouble(eTextField.getText()),Integer.parseInt(maxIterationTextField.getText()));
                outputTextArea.setText(String.format(" Half Division = %s;\n Done iterations - %s;\n\n Golden Section(min) = %s;\n Done iterations - %s;\n Golden Section(max) = %s;\n" +
                                " Done iterations - %s; ",String.valueOf(calculate.getXs()),HalfDivision.iteration,String.valueOf(calculate.getxMin()),
                        GoldenSection.iterationXMin,String.valueOf((calculate.getxMax())),GoldenSection.iterationXMax));

            }
        });
        startHalfDivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextArea.setText(goldenSection);
            }
        });
        startGoldenSectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextArea.setText(halfDivision);
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

