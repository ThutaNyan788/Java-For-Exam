package revision3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI_Example_One extends JFrame implements ActionListener{
    JLabel lblName;
    JLabel lblAge;
    JLabel lblSemester;
    JLabel lblLanguage;
    JTextField txtName;
    JTextField txtAge;
    JComboBox semester;
    JCheckBox[] chklanguage;
    JTextArea detail;
    JButton ok;
    JButton cancel;
    public GUI_Example_One()
    {
        setTitle("GUI Example");
        setSize(500,500);
        setLocation(150,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentpane = getContentPane();
        contentpane.setLayout(new BorderLayout());
// Label
        lblName = new JLabel("Name");
        lblAge = new JLabel("Age");
        lblSemester = new JLabel("Semester");
        lblLanguage = new JLabel("Can Program in :");
// TextBox
        txtName = new JTextField();
        txtAge = new JTextField();
// ComboBox
        String[] semesterText = {"Semester V", "Semester VI", "Semester VII", "Semester VIII"};
                semester = new JComboBox(semesterText);
// CheckBox
        JPanel checkPanel = new JPanel(new FlowLayout());
        checkPanel.add(lblLanguage);
        String[] checkboxText = {"C++", "Java", "C#", "Python"};
        chklanguage = new JCheckBox[checkboxText.length];
        for (int i = 0; i < chklanguage.length; i++) {
            chklanguage[i] = new JCheckBox(checkboxText[i]);
            checkPanel.add(chklanguage[i]);
        }
        detail = new JTextArea();
        JPanel first = new JPanel(new GridLayout(0,2));
        first.add(lblName);
        first.add(txtName);
        first.add(lblAge);
        first.add(txtAge);
        first.add(lblSemester);
        first.add(semester);
        first.add(checkPanel);
        first.add(detail);
        JPanel buttonpanel = new JPanel(new FlowLayout());
        ok = new JButton("OK");
        ok.addActionListener(this);
        buttonpanel.add(ok);
        cancel = new JButton("CANCEL");
        cancel.addActionListener(this);
        buttonpanel.add(cancel);
        contentpane.add(first, BorderLayout.CENTER);
        contentpane.add(buttonpanel, BorderLayout.SOUTH);
}
        public static void main(String[] args) {
        GUI_Example_One fobj = new GUI_Example_One();
        fobj.setVisible(true);
    }
        public void actionPerformed(ActionEvent e) {
        String name, age, sem, language;
        if(e.getSource().equals(cancel))
        {
            System.exit(0);
        }
        if(e.getSource().equals(ok))
        {
// TextBox
            name = txtName.getText();
            age = txtAge.getText();

// ComboBox
            sem = (String) semester.getSelectedItem();
// CheckBox
            language = "";
            for (int i = 0; i < chklanguage.length; i++) {
                if (chklanguage[i].isSelected()) {
                    language += chklanguage[i].getText() + "\n ";
                }
            }
            detail.setText("Detail Information: \n");
            detail.append(name + "\n" + age +"\n"+ sem + "\n"+ language);
        }
    }
    }
