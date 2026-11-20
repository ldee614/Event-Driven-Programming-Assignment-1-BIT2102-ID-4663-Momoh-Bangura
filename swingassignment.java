import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Basic Java Swing GUI assignment.
 * Demonstrates inheritance, constructor, JFrame, JPanel, JLabel and ImageIcon.
 */
public class swingassignment extends JFrame {

    // Required GUI variables
    JFrame Frame;
    JPanel panel;
    JLabel Label;

    // Additional controls and state
    private JButton textButton;
    private JButton colorButton;
    private int colorIndex = 0;

    private final Color[] panelColors = {
        new Color(232, 241, 255),
        new Color(230, 247, 239),
        new Color(255, 240, 225),
        new Color(244, 235, 255)
    };

    // Constructor: builds and configures the application window.
    public swingassignment() {
        Frame = this;
        panel = new JPanel(new GridBagLayout());
        Label = new JLabel(
            "<html><div style='width:620px;text-align:center;'>"
            + "Welcom to Java swing first individual Assignment by Momoh Bangura"
            + "</div></html>"
        );

        setTitle("Java Swing Assignment");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Load the original application icon from the assets folder.
        ImageIcon appIcon = new ImageIcon("assets/swing-leaf-icon.png");
        if (appIcon.getIconWidth() > 0) {
            setIconImage(appIcon.getImage());
        }

        buildInterface();
        setVisible(true);
    }

    private void buildInterface() {
        panel.setBackground(panelColors[colorIndex]);
        panel.setBorder(BorderFactory.createEmptyBorder(40, 45, 40, 45));

        Label.setFont(new Font("SansSerif", Font.BOLD, 23));
        Label.setForeground(new Color(35, 48, 68));
        Label.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel heading = new JLabel("JAVA SWING ASSIGNMENT", SwingConstants.CENTER);
        heading.setFont(new Font("SansSerif", Font.BOLD, 17));
        heading.setForeground(new Color(39, 75, 125));

        JLabel subtitle = new JLabel("A simple interactive desktop application", SwingConstants.CENTER);
        subtitle.setFont(new Font("SansSerif", Font.PLAIN, 15));
        subtitle.setForeground(new Color(91, 105, 125));

        textButton = new JButton("Change Welcome Text");
        colorButton = new JButton("Change Panel Background");

        styleButton(textButton);
        styleButton(colorButton);

        textButton.addActionListener((ActionEvent e) ->
            Label.setText("Hello, Momoh Bangura! Welcome to Java Swing.")
        );

        colorButton.addActionListener((ActionEvent e) -> {
            colorIndex = (colorIndex + 1) % panelColors.length;
            panel.setBackground(panelColors[colorIndex]);
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 8, 12, 8);

        gbc.gridy = 0;
        gbc.insets = new Insets(12, 8, 24, 8);
        panel.add(heading, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(12, 8, 12, 8);
        panel.add(Label, gbc);

        gbc.gridy = 2;
        panel.add(subtitle, gbc);

        gbc.gridy = 3;
        gbc.insets = new Insets(38, 8, 10, 8);
        panel.add(textButton, gbc);

        gbc.gridy = 4;
        gbc.insets = new Insets(10, 8, 12, 8);
        panel.add(colorButton, gbc);

        add(panel);
    }

    private void styleButton(JButton button) {
        button.setFont(new Font("SansSerif", Font.BOLD, 15));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(39, 75, 125));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(14, 22, 14, 22));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(swingassignment::new);
    }
}
