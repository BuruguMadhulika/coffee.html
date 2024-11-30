
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoListApp extends JFrame {

    private DefaultListModel<String> todoListModel;
    private JList<String> todoList;
    private JTextField taskInputField;

    public TodoListApp() {
        setTitle("To-Do List Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create a panel to hold the components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Create a label and input field for adding tasks
        JLabel taskLabel = new JLabel("Add Task:");
        taskInputField = new JTextField(20);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        // Panel to hold input components
        JPanel inputPanel = new JPanel();
        inputPanel.add(taskLabel);
        inputPanel.add(taskInputField);
        inputPanel.add(addButton);

        // Create the list model and list
        todoListModel = new DefaultListModel<>();
        todoList = new JList<>(todoListModel);

        // Create a scroll pane for the to-do list
        JScrollPane scrollPane = new JScrollPane(todoList);

        // Add components to the main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Set the main panel as content pane
        setContentPane(mainPanel);
    }

    // Method to add a new task to the list
    private void addTask() {
        String task = taskInputField.getText().trim();
        if (!task.isEmpty()) {
            todoListModel.addElement(task);
            taskInputField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Task cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TodoListApp todoListApp = new TodoListApp();
                todoListApp.setVisible(true);
            }
        });
    }
}