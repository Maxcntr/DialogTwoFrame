import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton jRadioButton = new JRadioButton("Select this:");
    private JRadioButton jRadioButton1 = new JRadioButton("Select that:");
    private JCheckBox jCheckBox = new JCheckBox("Chek",false);

    public Window() {
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton);
        group.add(jRadioButton1);
        container.add(jRadioButton);
        jRadioButton.setSelected(true);
        container.add(jRadioButton1);
        container.add(jCheckBox);
        container.add(button);
        button.addActionListener(new ButtonEventListener ());

    }
    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is "+ input.getText() + "\n";
            message += (jRadioButton.isSelected() ? "Radio #1" : "Radio#2") + "is selected\n";
            message += "Checkbox is" + ((jCheckBox.isSelected())? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);


        }
    }
}
