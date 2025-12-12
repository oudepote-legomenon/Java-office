package com.oudepotelegomenon.Experiments;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.component.api.ribbon.RibbonTask;
import org.pushingpixels.radiance.component.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.DustCoffeeSkin;

import com.oudepotelegomenon.transcodedIcons.*; // icon package
import com.oudepotelegomenon.PagedEditorKit;
import com.oudepotelegomenon.PagePainter;

public class App2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new DustCoffeeSkin());

            JRibbonFrame mainFrame = new JRibbonFrame("Curiosity Word Pad");

            // Core text document
            JTextPane textPane = new JTextPane();
            textPane.setEditorKit(new PagedEditorKit());
            textPane.setOpaque(false);
            textPane.setMargin(new Insets(70, 50, 70, 50));

            PagePainter pagePainter = new PagePainter(textPane);

            JPanel contentPanel = new JPanel(new BorderLayout());

            JLayeredPane layeredPane = new JLayeredPane();
            layeredPane.add(pagePainter, JLayeredPane.DEFAULT_LAYER);
            layeredPane.add(textPane, JLayeredPane.PALETTE_LAYER);

            contentPanel.add(layeredPane, BorderLayout.CENTER);

            JScrollPane scrollPane = new JScrollPane(contentPanel);
            scrollPane.getVerticalScrollBar().setUnitIncrement(20);
            scrollPane.getViewport().setBackground(new Color(200, 200, 200));

            // Commands
            Command pasteCommand = Command.builder()
                    .setText("Paste")
                    .setIconFactory(paste2.factory())
                    .build();

            Command newPageCommand = Command.builder()
                    .setText("New Page")
                    .setIconFactory(icons8_page_40.factory())
                    .setAction(ev -> {
                        try {
                            StyledDocument doc = textPane.getStyledDocument();
                            int pos = textPane.getCaretPosition();
                            // Insert page break marker
                            SimpleAttributeSet attrs = new SimpleAttributeSet();
                            attrs.addAttribute("PAGE_BREAK", Boolean.TRUE);
                            doc.insertString(pos, "\n", attrs);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    })
                    .build();

            // Ribbon Band
            JRibbonBand clipBoardBand = new JRibbonBand("Clipboard", null);
            clipBoardBand.addRibbonCommand(
                    pasteCommand.project(
                            new CommandButtonPresentationModel.Builder().build()
                    ),
                    JRibbonBand.PresentationPriority.TOP
            );
            clipBoardBand.addRibbonCommand(
                    newPageCommand.project(
                            new CommandButtonPresentationModel.Builder().build()
                    ),
                    JRibbonBand.PresentationPriority.TOP
            );
           clipBoardBand.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(clipBoardBand));


            RibbonTask homeTask = new RibbonTask("Home", clipBoardBand);
            mainFrame.getRibbon().addTask(homeTask);

            // Add to frame
            mainFrame.add(scrollPane, BorderLayout.CENTER);
            mainFrame.setSize(1000, 700);
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
        });
    }
}
