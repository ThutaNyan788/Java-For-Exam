package revision3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIExample_Two extends JFrame implements ActionListener{
    JLabel lblName;
    JLabel lblAge;
    JLabel lblGender;
    JLabel lblInternship;
    JTextField txtName;
    JTextField txtAge;
    JRadioButton[] radgender;
    JList arealist;
    JLabel detail;
    JButton ok;
    JButton cancel;
    public GUIExample_Two()
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
        lblGender = new JLabel("Gender");
        lblInternship = new JLabel("Internship Area");
// TextBox
        txtName = new JTextField();
        txtAge = new JTextField();
// RadioButton
        String[] genderText = {"Male", "Female"};
        JPanel radioPanel = new JPanel(new GridLayout(1,1));
        ButtonGroup languageGroup = new ButtonGroup();
        radgender = new JRadioButton[genderText.length];
        radioPanel.add(lblGender);
        for (int i = 0; i < radgender.length; i++) {
            radgender[i] = new JRadioButton(genderText[i]);
            languageGroup.add(radgender[i]);
            radioPanel.add(radgender[i]);
        }
        radgender[0].setSelected(true);
// List
        String[] areaText = {"Programming", "Networking", "Database", "Accounting"};
        arealist = new JList(areaText);
        arealist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        detail = new JLabel();
        JPanel first = new JPanel(new GridLayout(0,2));
        first.add(lblName);
        first.add(txtName);
        first.add(lblAge);
        first.add(txtAge);
        first.add(radioPanel);
        first.add(lblInternship);
        first.add(arealist);
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
        GUIExample_Two fobj = new GUIExample_Two();
        fobj.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String name, age, gender;
        if(e.getSource().equals(cancel))
        {
            System.exit(0);
        }
        if(e.getSource().equals(ok))
        {
// TextBox
            name = txtName.getText();
            age = txtAge.getText();
// RadioButton
            gender = "";
            for (int i = 0; i < radgender.length; i++) {
                if (radgender[i].isSelected()) {
                    gender = radgender[i].getText() + "\n ";
                }
            }

// List
            Object[] list = arealist.getSelectedValues();
            String area_select = "";
            for (int i = 0; i < list.length; i++) {
                area_select += (String)list[i]+" ";
            }
            detail.setText("Detail Information : "+ name + " " + age + " " + gender + ": interest in "+ area_select);
        }
    }
}