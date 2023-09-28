package revision3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI_Two extends JFrame implements ActionListener {
    Container contentPane;

    JLabel name = new JLabel("Name");
    JLabel age = new JLabel("Age");
    JLabel gender = new JLabel("Gender");
    JLabel programme = new JLabel("Programme");

    JTextField nameField = new JTextField(20);
    JTextField ageField = new JTextField(20);

    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JRadioButton other = new JRadioButton("Other");

    ButtonGroup bgroup = new ButtonGroup();

    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    String[] strArr = {"Programming","Networking","Database","Accounting"};
    JList areaList = new JList(strArr);


    MyGUI_Two(){
        this.setTitle("GUI Example Two");
        this.setSize(500,400);
        this.setLocation(500,100);

        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel jcontainer = new JPanel(new GridLayout(4,2));
        areaList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jcontainer.add(name);
        jcontainer.add(nameField);

        jcontainer.add(age);
        jcontainer.add(ageField);

        jcontainer.add(gender);
        JPanel jp = new JPanel(new FlowLayout());
        bgroup.add(male);
        bgroup.add(female);
        bgroup.add(other);
        jp.add(male);
        jp.add(female);
        jp.add(other);
        jcontainer.add(jp);


        jcontainer.add(programme);
        jcontainer.add(areaList);

        contentPane.add(BorderLayout.CENTER,jcontainer);

        JPanel jforButton = new JPanel(new FlowLayout());
        jforButton.add(ok);ok.addActionListener(this);
        jforButton.add(cancel);cancel.addActionListener(this);

        contentPane.add(BorderLayout.SOUTH,jforButton);



    }

    public static void main(String[] args) {
        MyGUI_Two guitwo = new MyGUI_Two();
        guitwo.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String gender="";
        if(male.isSelected()){
            gender = male.getText();
        }

        if(female.isSelected()){
            gender = female.getText();
        }

        if(other.isSelected()){
            gender = other.getText();
        }

        Object[] arrObject = areaList.getSelectedValues();
        String areaSelect = "";
        for (int i = 0; i < arrObject.length; i++) {
            areaSelect += (String) arrObject[i]+" ";
        }

        String str="Name : "+nameField.getText()+"\n"+
                    "Age : "+ageField.getText()+"\n"+
                    "Gender : "+gender+"\n"+
                    "Programme : "+areaSelect;


        if(e.getSource().equals(ok)){
            JOptionPane.showMessageDialog(null,str);
        }

        if(e.getSource().equals(cancel)){
            System.exit(0);
        }
    }
}
