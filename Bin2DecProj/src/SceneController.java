import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SceneController {

    JFrame frame;

    public SceneController(){
        frame = new JFrame();
        JTextField in = new JTextField();
        in.setBounds(120,50,150,20);
        JButton calcBtn = new JButton("Calculate");
        calcBtn.setBounds(120,100,100,40);
        TextArea result = new TextArea();
        result.setBounds(120,200,200,20);
        result.setText("The result will display here");

        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("Result: "+BinaryToDecimal.calculateBinary(in.getText()));

            }
        });


        frame.add(in);
        frame.add(calcBtn);
        frame.add(result);
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.setVisible(true);

    }



}
