package revision3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI_One extends JFrame implements ActionListener {
    Container contentPane;
    JLabel name = new JLabel("Name");
    JLabel age = new JLabel("Age");
    JLabel semester = new JLabel("Semester");

    JLabel program = new JLabel("Choose Program ");

    JTextField nameField = new JTextField(20);
    JTextField ageField = new JTextField(20);
    String[] arrString = {"SemesterI","SemesterII","SemesterIII","SemesterIV"};

    JCheckBox cplus = new JCheckBox("C++");
    JCheckBox java = new JCheckBox("Java");
    JCheckBox chash = new JCheckBox("C#");
    JCheckBox python = new JCheckBox("Python");

    ButtonGroup bgroup = new ButtonGroup();


    JButton ok = new JButton("Ok");
    JButton cancel = new JButton("Cancel");
    JComboBox jcombo = new JComboBox(arrString);
    MyGUI_One(){
        this.setTitle("GUI Example One");
        this.setSize(500,400);
        this.setLocation(500,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);



        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel jpContainer = new JPanel(new GridLayout(4,2));

        jpContainer.add(name);
        jpContainer.add(nameField);

        jpContainer.add(age);
        jpContainer.add(ageField);

        jpContainer.add(semester);
        jpContainer.add(jcombo);

        jpContainer.add(program);
        bgroup.add(cplus);
        bgroup.add(java);
        bgroup.add(chash);
        bgroup.add(python);
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(cplus);cplus.addActionListener(this);
        jp.add(java);java.addActionListener(this);
        jp.add(chash);java.addActionListener(this);
        jp.add(python);java.addActionListener(this);
        jpContainer.add(jp);

        contentPane.add(BorderLayout.CENTER,jpContainer);
        JPanel jbforButton = new JPanel(new FlowLayout());
        jbforButton.add(ok);ok.addActionListener(this);
        jbforButton.add(cancel);cancel.addActionListener(this);

        contentPane.add(BorderLayout.SOUTH,jbforButton);

    }


    public static void main(String[] args) {
        MyGUI_One  guione= new MyGUI_One();
        guione.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cp ="";
        if(cplus.isSelected()){
            cp = cplus.getText();
        }

        if(java.isSelected()){
            cp = java.getText();
        }

        if(chash.isSelected()){
            cp = chash.getText();
        }

        if(python.isSelected()){
            cp = python.getText();
        }



        if(e.getSource().equals(ok)){
            String str =  "Name : "+nameField.getText()+"\n"+
                    "Age : "+ageField.getText()+"\n"+
                    "Semester : "+jcombo.getSelectedItem()+"\n"+
                    "Program : "+cp;
            JOptionPane.showMessageDialog(null,str);
        }
    }
}
