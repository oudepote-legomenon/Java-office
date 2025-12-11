package com.oudepotelegomenon;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextEditorWithTables {

    private JFrame frame;
    private JTextPane textPane;

    public TextEditorWithTables() {
        frame = new JFrame("Java Text Editor with Editable Tables");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        textPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(textPane);

        // Toolbar with "Insert Table" button
        JToolBar toolBar = new JToolBar();
        JButton insertTableBtn = new JButton("Insert Table");
        insertTableBtn.addActionListener(this::insertTable);
        toolBar.add(insertTableBtn);

        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void insertTable(ActionEvent e) {
        // Ask user for table size
        String rowsStr = JOptionPane.showInputDialog(frame, "Number of rows:", "2");
        String colsStr = JOptionPane.showInputDialog(frame, "Number of columns:", "2");

        if (rowsStr == null || colsStr == null) return; // canceled
        int rows = Integer.parseInt(rowsStr);
        int cols = Integer.parseInt(colsStr);

        // Create table
        String[][] data = new String[rows][cols];
        String[] headers = new String[cols];
        for (int c = 0; c < cols; c++) headers[c] = "Col " + (c + 1);

        JTable table = new JTable(data, headers);
        table.setRowHeight(25);

        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setPreferredSize(new Dimension(cols * 80, rows * 30 + 20));

        // Insert into text pane at caret position
        textPane.insertComponent(tableScroll);

        // Optional: Add a newline after the table for smoother typing
        try {
            Document doc = textPane.getDocument();
            doc.insertString(textPane.getCaretPosition(), "\n", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditorWithTables::new);
    }
}
