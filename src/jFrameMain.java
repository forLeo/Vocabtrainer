import javax.swing.*;
import java.awt.*;

public class jFrameMain {
    public jFrameMain() {
        //add a JFrame
        JFrame frame = new JFrame("Vocabtrainer");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        //new JMenuBar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createLineBorder(Color.black));
        //new JMenu File
        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);
        //new JMenuItems
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        menuFile.add(openMenuItem);
        menuFile.add(saveMenuItem);
        menuFile.add(exitMenuItem);
        //new JMenu Edit
        JMenu menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);
        //new JMenuItems
        JMenuItem addMenuItem = new JMenuItem("Add");
        JMenuItem deleteMenuItem = new JMenuItem("Delete");
        JMenuItem editMenuItem = new JMenuItem("Edit");
        JMenuItem setLanguagesMenuItem = new JMenuItem("Set Languages");
        JMenuItem switchLanguagesMenuItem = new JMenuItem("Switch Languages");
        menuEdit.add(addMenuItem);
        menuEdit.add(deleteMenuItem);
        menuEdit.add(editMenuItem);
        menuEdit.add(setLanguagesMenuItem);
        menuEdit.add(switchLanguagesMenuItem);
        //new JMenu Help
        JMenu menuHelp = new JMenu("Help");
        menuBar.add(menuHelp);
        //new JMenuItems
        JMenuItem helpMenuItem = new JMenuItem("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        menuHelp.add(helpMenuItem);
        menuHelp.add(aboutMenuItem);
        //set JMenuBar
        frame.setJMenuBar(menuBar);

        JLabel label = new JLabel("Vocabtrainer");
        JButton button = new JButton();
        button.setText("Click me");

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        //set size: width, height
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new jFrameMain();
    }
}