import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SampleGUI extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton ADDButton;
    private JButton SUBSTRACTButton;
    private JButton MULTIPLYButton;
    private JButton DIVIDEButton;
    private JTextField textField3;
    private JPanel SampleGUI;


    public SampleGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(SampleGUI);
        this.setSize(500, 400);
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;

                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());

                result = num1 + num2;
                textField3.setText(String.valueOf(result));

            }
        });
        SUBSTRACTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;

                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());

                result = num1 - num2;
                textField3.setText(String.valueOf(result));

            }
        });
        MULTIPLYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;

                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());

                result = num1 * num2;
                textField3.setText(String.valueOf(result));

            }
        });
        DIVIDEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;

                num1 = Float.parseFloat(textField1.getText());
                num2 = Float.parseFloat(textField2.getText());

                result = num1 / num2;
                textField3.setText(String.valueOf(result));

            }
        });
    }

    public static void main(String[] args) {
        JFrame s1 = new SampleGUI("Calculator");
        s1.setVisible(true);
    }
}
