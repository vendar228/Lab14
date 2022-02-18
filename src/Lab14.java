import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab14 extends Frame{
    Lab14(){;
        setTitle("Lab14");
        setSize(400,400);
        setLocation(500, 500);
        setLayout(null);
        Label labelA = new Label("a");
        labelA.setSize(40,25);
        labelA.setLocation(50,50);

        Label labelB = new Label("b");
        labelB.setSize(40,25);
        labelB.setLocation(50,80);
        Label labelSum = new Label("sum");
        labelSum.setSize(40,25);
        labelSum.setLocation(50,110);

        TextField textFieldA = new TextField();
        textFieldA.setBounds(100,50,40,25);
        TextField textFieldB = new TextField();
        textFieldB.setBounds(100,80,40,25);
        TextField textFieldSum = new TextField();
        textFieldSum.setBounds(100,110,40,25);
        textFieldSum.setEditable(false);

        Button calc = new Button("Calculate");
        calc.setBounds(70,150,70,30);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(textFieldA.getText());
                    int b = Integer.parseInt(textFieldB.getText());
                    int sum = a + b;
                    textFieldSum.setText(Integer.toString(sum));
                }
                catch (NumberFormatException ne){
                    textFieldSum.setText("error");
                }
            }
        });
        Button clear = new Button("clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldSum.setText("");
            }
        });
        clear.setBounds(70,180,70,30);

        add(labelA);
        add(labelB);
        add(labelSum);
        add(textFieldA);
        add(textFieldB);
        add(textFieldSum);
        add(calc);
        add(clear);


        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Lab14();
    }
}