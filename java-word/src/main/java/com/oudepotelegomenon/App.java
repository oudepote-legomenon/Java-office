package com.oudepotelegomenon;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;

import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.RichTooltip;
import org.pushingpixels.radiance.component.api.common.icon.ColorRadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.BaseCommand;
import org.pushingpixels.radiance.component.api.common.model.ColorSelectorCommand;
import org.pushingpixels.radiance.component.api.common.model.ColorSelectorCommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandToggleGroupModel;
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.popup.JColorSelectorPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel.ColorPreviewListener;
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuGroupModel;
import org.pushingpixels.radiance.component.api.common.projection.ColorSelectorCommandButtonProjection;
import org.pushingpixels.radiance.component.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.component.api.ribbon.JFlowRibbonBand;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame;
import org.pushingpixels.radiance.component.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.radiance.component.api.ribbon.RibbonTask;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonApplicationMenuCommand;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryContentModel;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection;
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonGalleryProjection;
import org.pushingpixels.radiance.component.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.RibbonDefaultComboBoxContentModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.RibbonSpinnerNumberContentModel;
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.RibbonComboBoxProjection;
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.RibbonSpinnerProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlueSteelSkin;
import java.awt.*;
import java.awt.print.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;

import com.oudepotelegomenon.transcodedIcons.*; // icon package

public class App {
    public static Locale locale = Locale.forLanguageTag("ko-KR");
    public static ResourceBundle bundle = ResourceBundle.getBundle("i18n.MessagesBundle", locale);
    private static JPanel pagesPanel;
    private static JScrollPane scrollPane;
    private static List<JTextPane> pages = new ArrayList<>();
    private static JLabel statusLabel; // for the status bar 
    private static JTextPane lastFocusedPage = null; // remember last focused page

    // Page size (A4 portrait at ~96 DPI)
    private static final Dimension PAGE_SIZE = new Dimension(794, 1123);
    private static final int MARGIN = 72; // ~1 inch @96dpi

    //The page
    static JTextPane page = getFocusedPage();
    // --- Guards ---
    private static int bulkEditDepth = 0;
    private static boolean isBackspaceMergeInProgress = false;
    private static boolean isUpdatingFontSizeUI = false;

    //--- Spell check---//
    public static Command spellCheckCommand;
    
    // --- Models for font controls ---
    private static RibbonDefaultComboBoxContentModel<String> fontBoxContentModel;
    private static RibbonDefaultComboBoxContentModel<String> fontSizeModel;

    // --- Format Painter ---
    private static AttributeSet copiedAttributes;

    // Initialize commands 
    // ---- Secondary Commands for the save as primary Command on the application menu----//
    public static Command wordDocumentCommand;
    public static Command pdfDocumentCommand;
    public static Command textDocumentCommand;

    // ---- Secondary Commands for the open primary Command on the application menu----//
    public static Command recentDocumentsCommand;
    public static Command cloudCommand;
    public static Command computerCommand;
    public static Command addCommand;
    public static Command browseCommand;

    // ---- Secondary Commands for the print primary Command on the application menu----//
    public static Command printCommand;
    public static Command quickPrintCommand;
    public static Command printPreviewCommand;

    // ---- Secondary Commands for the open primary Command on the application menu----//
    public static Command blankDocumentCommand;
    public static Command conceptTemplateCommand;
    public static Command examTemplateCommand;
    public static Command articleTemplateCommand;
    public static Command resumeTemplateCommand;
    public static Command surveyTemplateCommand;

    // --- primary Commands on the application menu ---//
    public static Command newFileCommand;
    public static Command openCommand;
    public static Command saveAsCommand;
    public static Command printdocumentCommand;
    public static Command shareCommand;
    public static Command exitCommand;

    // --- footer "option" Command on the application menu ---//
    public static Command optionsCommand;

    // --- Ribbon commands---//
    public static Command formatPainterCommand;
    public static Command pasteCommand;
    public static Command cutCommand;
    public static Command copyCommand;
    public static Command selectAllCommand;
    public static Command formatpainterCommand;
    public static Command newPageCommand;
    public static Command boldCommand;
    public static Command italicCommand;
    public static Command underlineCommand;
    public static Command strikethroughCommand;
    public static Command subscriptCommand;
    public static Command superscriptCommand;
    public static Command saveCommand;
    public static Command increaseFontSizeCommand;
    public static Command decreaseFontSizeCommand;
    public static Command changeCaseCommand;
    public static Command tableCommand;
    public static Command pictureCommand;
    public static Command shapesCommand;
    public static Command numberedListCommand;
    public static Command bulletedListCommand;
    public static Command tickedListCommand;
    public static Command increaseIndentCommand;
    public static Command decreaseIndentCommand;
    public static CommandToggleGroupModel alignmentToggleGroupModel;
    public static Command leftAlignCommand;
    public static Command centerAlignCommand;
    public static Command justifyAlignCommand;
    public static Command rightAlignCommand;
    public static CommandToggleGroupModel lineSpacingToggleGroup;
    public static Command lineSpacingCommand;
    public static Command singleLineSpacingCommand;
    public static Command oneAndHalfLineSpacingCommand;
    public static Command doubleLineSpacingCommand;
    public static Command increaseFirstLineIndentCommand;
    public static Command decreaseFirstLineIndentCommand;
    public static RibbonSpinnerNumberContentModel spaceAfterParagraphContentModel;
    public static RibbonSpinnerNumberContentModel spaceBeforeParagraphContentModel;
    
    // Text styles band commands
    public static Command h1Command;
    public static Command h2Command;
    public static Command h3Command;
    public static Command h4Command;
    public static Command h5Command;
    public static Command h6Command;
    public static Command normalTextCommand;
    public static Command paragraphCommand;
    public static Command quoteCommand;

    public static ColorSelectorCommand shadingCommand;
    public static ColorSelectorCommand fontColorCommand;
    public static ColorSelectorCommand textHighlightCommand;

    public static Command findCommand;
    public static Command replaceCommand;
    public static Command gotoCommand;
    
    private static java.awt.event.KeyListener numberedListKeyListener;
    private static java.awt.event.KeyListener bulletListKeyListener;
    private static java.awt.event.KeyListener tickedListKeyListener;
    private static int listCounter = 1;
    private static final String BULLET = "\u2022 ";
    private static final String TICK = "\u2713 ";
    private static Color originalColor;
    private static boolean isPreviewing = false;
    private static Color originalHighlightColor;
    private static boolean isFillPreviewing = false;


    public static Color[] myColors = {
                                new Color(255,255,255), new Color(0,0,0),
                                new Color(255,0,0),     new Color(0,255,0),
                                new Color(0,0,255),     new Color(255,255,0),
                                new Color(0,255,255),   new Color(255,0,255),
                                new Color(128,128,128), new Color(192,192,192)
                        };
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(false);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlueSteelSkin());

            final JRibbonFrame mainFrame = new JRibbonFrame("Curiosity Word Pad");
            // ----------------------- Application menu starts here ------------------------------------//
            blankDocumentCommand = Command.builder()
                    .setText(bundle.getString("cmd.blankDocument"))
                    .setIconFactory(icons8_file_50.factory())
                    .setExtraText(bundle.getString("cmd.blankDocument.extra"))
                    .build();

            blankDocumentCommand.setAction(e -> {
                if (getWordCount() > 0) {
                    int result = JOptionPane.showConfirmDialog(mainFrame,
                            bundle.getString("cmd.blankDocument.saveMessageDialog.message"),
                            bundle.getString("cmd.blankDocument.saveMessageDialog.title"),
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (result == JOptionPane.YES_OPTION) {
                        if (saveAs(mainFrame)) {
                            openBlankDocument();
                        }
                    } else if (result == JOptionPane.NO_OPTION) {
                        openBlankDocument();
                    }
                } else {
                    openBlankDocument();
                }
            });

            blankDocumentCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.blankDocument"))
                        .addDescriptionSection(bundle.getString("cmd.blankDocument.description"))
                        .build()
                    );

           conceptTemplateCommand = Command.builder()
                    .setText(bundle.getString("cmd.concept"))
                    .setIconFactory(icons8_concept_50.factory())
                    .setExtraText(bundle.getString("cmd.concept.extra"))
                    .build();

            conceptTemplateCommand.setAction(e->comingSoonDialog(mainFrame));
            conceptTemplateCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.concept"))
                        .addDescriptionSection(bundle.getString("cmd.concept.description"))
                        .build()
                    );

            examTemplateCommand = Command.builder()
                    .setText(bundle.getString("cmd.exam"))
                    .setIconFactory(icons8_exam_50.factory())
                    .setExtraText(bundle.getString("cmd.exam.extra"))
                    .build();

            examTemplateCommand.setAction(e->comingSoonDialog(mainFrame));
            examTemplateCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.exam"))
                        .addDescriptionSection(bundle.getString("cmd.exam.description"))
                        .build()
                    );
            articleTemplateCommand = Command.builder()
                    .setText(bundle.getString("cmd.hotArticle"))
                    .setIconFactory(icons8_hot_article_50.factory())
                    .setExtraText(bundle.getString("cmd.hotArticle.extra"))
                    .build();

            articleTemplateCommand.setAction(e->comingSoonDialog(mainFrame));
            articleTemplateCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.hotArticle"))
                        .addDescriptionSection(bundle.getString("cmd.hotArticle.description"))
                        .build()
                    );

            resumeTemplateCommand = Command.builder()
                    .setText(bundle.getString("cmd.resume"))
                    .setIconFactory(icons8_resume_50.factory())
                    .setExtraText(bundle.getString("cmd.resume.extra"))
                    .build();

            resumeTemplateCommand.setAction(e->comingSoonDialog(mainFrame));
            resumeTemplateCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.resume"))
                        .addDescriptionSection(bundle.getString("cmd.resume.description"))
                        .build()
                    );

            surveyTemplateCommand = Command.builder()
                    .setText(bundle.getString("cmd.survey"))
                    .setIconFactory(icons8_view_50.factory())
                    .setExtraText(bundle.getString("cmd.survey.extra"))
                    .build();
            surveyTemplateCommand.setAction(e->comingSoonDialog(mainFrame));
            surveyTemplateCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.survey"))
                        .addDescriptionSection(bundle.getString("cmd.survey.description"))
                        .build()
                    );
            CommandMenuContentModel newFileMenu = new CommandMenuContentModel(
                    new CommandGroup(bundle.getString("cmd.new"),
                            blankDocumentCommand,
                            conceptTemplateCommand,
                            examTemplateCommand,
                            articleTemplateCommand,
                            resumeTemplateCommand,
                            surveyTemplateCommand
                            )
            );

            // ---- Secondary Commands for the open primary Command on the application menu----//
            recentDocumentsCommand = Command.builder()
                    .setText(bundle.getString("cmd.recent"))
                    .setIconFactory(recent.factory())
                    .setExtraText(bundle.getString("cmd.recent.extra"))
                    .build();

            recentDocumentsCommand.setAction(e->comingSoonDialog(mainFrame));

            cloudCommand = Command.builder()
                    .setText(bundle.getString("cmd.cloud"))
                    .setIconFactory(icons8_cloud_folder_40.factory())
                    .setExtraText(bundle.getString("cmd.cloud.extra"))
                    .build();

            cloudCommand.setAction(e->comingSoonDialog(mainFrame));

            computerCommand = Command.builder()
                    .setText(bundle.getString("cmd.thisPC"))
                    .setIconFactory(icons8_this_pc_40.factory())
                    .setExtraText(bundle.getString("cmd.thisPC.extra"))
                    .build();
            
            computerCommand.setAction((e -> {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Open");
                fileChooser.setFileFilter(new FileNameExtensionFilter("Word Document", "docx"));

                int userSelection = fileChooser.showOpenDialog(mainFrame);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                    loadFromDocx(filePath);
                }
            }));

            addCommand = Command.builder()
                    .setText(bundle.getString("cmd.addPlace"))
                    .setIconFactory(icons8_add_48.factory())
                    .setExtraText(bundle.getString("cmd.addPlace.extra"))
                    .build();

            addCommand.setAction(e->comingSoonDialog(mainFrame));

            addCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.addPlace"))
                .addDescriptionSection(bundle.getString("cmd.addPlace.description"))
                .build()
            );

            browseCommand = Command.builder()
                    .setText(bundle.getString("cmd.browse"))
                    .setIconFactory(icons8_browse_64.factory())
                    .setExtraText(bundle.getString("cmd.browse.extra"))
                    .build();

            browseCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.browse"))
                .addDescriptionSection(bundle.getString("cmd.browse.description"))
                .build()
            );

            browseCommand.setAction((e -> {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Open");
                fileChooser.setFileFilter(new FileNameExtensionFilter("Word Document", "docx"));

                int userSelection = fileChooser.showOpenDialog(mainFrame);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                    loadFromDocx(filePath);
                }
            }));

            CommandMenuContentModel openMenu = new CommandMenuContentModel(
                    new CommandGroup(bundle.getString("cmd.open"),
                         recentDocumentsCommand,
                         cloudCommand,
                         computerCommand
                         ),
                    new CommandGroup(bundle.getString("cmd.more"),
                        addCommand,
                        browseCommand
                        )
            );


            // ---- Secondary Commands for the save as primary Command on the application menu----//
            wordDocumentCommand = Command.builder()
                    .setText(bundle.getString("cmd.wordDocument"))
                    .setIconFactory(icons8_word_file_50.factory())
                    .setExtraText(bundle.getString("cmd.wordDocument.extra"))
                    .build();


            wordDocumentCommand.setAction(e -> saveAs(mainFrame));

            wordDocumentCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.wordDocument"))
                .addDescriptionSection(bundle.getString("cmd.wordDocument.description"))
                .build()
            );

            pdfDocumentCommand = Command.builder()
                    .setText(bundle.getString("cmd.pdf"))
                    .setIconFactory(icons8_pdf_50.factory())
                    .setExtraText(bundle.getString("cmd.pdf.extra"))
                    .build();

            pdfDocumentCommand.setAction(e->comingSoonDialog(mainFrame));

            pdfDocumentCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.pdf"))
                .addDescriptionSection(bundle.getString("cmd.pdf.description"))
                .build()
            );

            textDocumentCommand = Command.builder()
                    .setText(bundle.getString("cmd.textDocument"))
                    .setIconFactory(icons8_txt_50.factory())
                    .setExtraText(bundle.getString("cmd.textDocument.extra"))
                    .build();

            textDocumentCommand.setAction(e->comingSoonDialog(mainFrame));

            textDocumentCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.textDocument"))
                .addDescriptionSection(bundle.getString("cmd.textDocument.description"))
                .build()
            );

            CommandMenuContentModel saveAsMenu = new CommandMenuContentModel(
                    new CommandGroup(bundle.getString("cmd.saveAs"),
                         wordDocumentCommand,
                        pdfDocumentCommand,
                        textDocumentCommand
                        )
             );

            // ---- Secondary Commands for the print file primary Command on the application menu----//
            printCommand = Command.builder()
                    .setText(bundle.getString("cmd.print"))
                    .setIconFactory(icons8_print_40.factory())
                    .build();
            printCommand.setAction(e -> {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(new DocumentPrintable(pages));
                boolean doPrint = job.printDialog();
                if (doPrint) {
                    try {
                        job.print();
                    } catch (PrinterException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(mainFrame,
                                "Error printing: " + ex.getMessage(),
                                "Print Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            quickPrintCommand = Command.builder()
                    .setText(bundle.getString("cmd.quickPrint"))
                    .setIconFactory(quick_print2.factory())
                    .setExtraText(bundle.getString("cmd.quickPrint.extra"))
                    .build();
            quickPrintCommand.setAction(e->comingSoonDialog(mainFrame));

            printPreviewCommand = Command.builder()
                    .setText(bundle.getString("cmd.preview"))
                    .setIconFactory(icons8_preview_64.factory())
                    .setExtraText(bundle.getString("cmd.preview.extra"))
                    .build();

            printPreviewCommand.setAction(e->comingSoonDialog(mainFrame));

            CommandMenuContentModel printMenu = new CommandMenuContentModel(
                    new CommandGroup(bundle.getString("cmd.print"),
                         printCommand,
                         quickPrintCommand,
                         printPreviewCommand
                         )
            );

            // --- primary Commands on the application menu ---//
            newFileCommand = Command.builder()
                    .setText(bundle.getString("cmd.new"))
                    .setIconFactory(newfile.factory())
                    .setSecondaryContentModel(newFileMenu)
                    .build();


            newFileCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.new"))
                .addDescriptionSection(bundle.getString("cmd.new.description"))
                .build()
            );

            openCommand = Command.builder()
                    .setText(bundle.getString("cmd.open"))
                    .setIconFactory(open.factory())
                    .setSecondaryContentModel(openMenu)
                    .build();

            openCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.open"))
                .addDescriptionSection(bundle.getString("cmd.open.description"))
                .build()
            );

            saveAsCommand = Command.builder()
                    .setText(bundle.getString("cmd.saveAs"))
                    .setIconFactory(save_as.factory())
                    .setSecondaryContentModel(saveAsMenu)
                    .build();

            saveAsCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.saveAs"))
                .addDescriptionSection(bundle.getString("cmd.saveAs.description"))
                .build()
            );

            printdocumentCommand = Command.builder()
                    .setText(bundle.getString("cmd.print"))
                    .setIconFactory(icons8_print_40.factory())
                    .setSecondaryContentModel(printMenu)
                    .build();
            
            printdocumentCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.print"))
                .addDescriptionSection(bundle.getString("cmd.print.description"))
                .build()
            );

            shareCommand = Command.builder()
                .setText(bundle.getString("applicationMenu.share"))
                .setIconFactory(icons8_share_48.factory())
                .setActionEnabled(false)
                .build();

            exitCommand = Command.builder()
                .setText(bundle.getString("applicationMenu.exit"))
                .setIconFactory(System_log_out.factory())
                .setAction(commandActionEvent -> System.exit(0))
                .build();

            exitCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("applicationMenu.exit"))
                .addDescriptionSection(bundle.getString("applicationMenu.exit.description"))
                .build()
            );
            
            optionsCommand = Command.builder()
                    .setText(bundle.getString("cmd.options"))
                    .setIconFactory(icons8_settings_40.factory())
                    .build();

            optionsCommand.setAction(e->comingSoonDialog(mainFrame));
            optionsCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.options"))
                        .addDescriptionSection(bundle.getString("cmd.options.description"))
                        .build()
                    );
                    
            RibbonApplicationMenu applicationMenu = new RibbonApplicationMenu(
                new CommandGroup(bundle.getString("applicationMenu.file"),newFileCommand,openCommand,saveAsCommand),
                new CommandGroup(bundle.getString("applicationMenu.output"),printdocumentCommand, shareCommand),
                new CommandGroup(bundle.getString("applicationMenu.exit"), exitCommand)

            );

            applicationMenu.addFooterCommand(optionsCommand);
            
            RibbonApplicationMenuCommandButtonProjection applicationMenuCommandButtonProjection =
                new RibbonApplicationMenuCommandButtonProjection(
                        RibbonApplicationMenuCommand.builder()
                        .setText(bundle.getString("task.applicationMenu"))
                        .setSecondaryContentModel(applicationMenu)
                        .build(),
                        CommandButtonPresentationModel.builder().setPopupKeyTip("F").build()
                );

             Map<Command, CommandButtonPresentationState> secondaryContentStates = new HashMap<>();
                secondaryContentStates.put(newFileCommand,
                RibbonApplicationMenuCommandButtonProjection.RIBBON_APP_MENU_SECONDARY_LEVEL
             );

            secondaryContentStates.put(openCommand,
                RibbonApplicationMenuCommandButtonProjection.RIBBON_APP_MENU_SECONDARY_LEVEL
             );

            secondaryContentStates.put(saveAsCommand,
                RibbonApplicationMenuCommandButtonProjection.RIBBON_APP_MENU_SECONDARY_LEVEL
            );

            secondaryContentStates.put(printdocumentCommand,
                RibbonApplicationMenuCommandButtonProjection.RIBBON_APP_MENU_SECONDARY_LEVEL
            );

            applicationMenuCommandButtonProjection.setSecondaryLevelCommandPresentationState(secondaryContentStates);

         mainFrame.getRibbon().setApplicationMenuCommand(applicationMenuCommandButtonProjection);
         //---------------------------Application Menu Button ends here-----------------------------//

        //----------------------------- HOME RIBBON TASK -------------------------------------------------------//
        
         // ---------------------------- Clipboard Band -------------------------------------------//
            formatPainterCommand = Command.builder()
                    .setText(bundle.getString("cmd.formatPainter"))
                    .setToggle()
                    .setIconFactory(Format_painter.factory())
                    .build();

            formatPainterCommand.setAction(e -> {
                if (formatPainterCommand.isToggleSelected()) {
                    // "Pick up" the format
                    onFocusedPage(page -> {
                        int pos = page.getSelectionStart();
                        copiedAttributes = page.getStyledDocument().getCharacterElement(pos).getAttributes();
                        setFormatPainterCursor(true);
                    });
                } else {
                    // Canceled by clicking the button again
                    copiedAttributes = null;
                    setFormatPainterCursor(false);
                }
            });
            formatPainterCommand.setActionRichTooltip(
                        RichTooltip.builder()
                        .setTitle(bundle.getString("cmd.formatPainter"))
                        .addDescriptionSection(bundle.getString("cmd.formatPainter.description"))
                        .build()
                    );
            pasteCommand = Command.builder()
                    .setText(bundle.getString("cmd.paste"))
                    .setIconFactory(paste2.factory())
                    .build();

            pasteCommand.setAction(e -> onFocusedPage(JTextPane::paste));
            pasteCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.paste") + " (Ctrl + V)")
                .addDescriptionSection(bundle.getString("cmd.paste.description"))
                .build()
            );

            cutCommand = Command.builder()
                    .setText(bundle.getString("cmd.cut"))
                    .setIconFactory(cut2.factory())
                    .build();

            cutCommand.setAction(e -> onFocusedPage(JTextPane::cut));

            cutCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.cut") + " (Ctrl + X)")
                .addDescriptionSection(bundle.getString("cmd.cut.description"))
                .build()
            );

            copyCommand = Command.builder()
                    .setText(bundle.getString("cmd.copy"))
                    .setIconFactory(copy.factory())
                    .build();
            copyCommand.setAction(e -> onFocusedPage(JTextPane::copy));

            copyCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.copy") + " (Ctrl + C)")
                .addDescriptionSection(bundle.getString("cmd.copy.description"))
                .build()
            );

            selectAllCommand = Command.builder()
                    .setText(bundle.getString("cmd.selectAll"))
                    .setIconFactory(icons8_select_all_50_5.factory())
                    .build();

            selectAllCommand.setAction(e -> selectAllText());

            selectAllCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.selectAll") + " (Ctrl + A)")
                .addDescriptionSection(bundle.getString("cmd.selectAll.description"))
                .build()
            );

            // Ribbon Band
            JRibbonBand clipBoardBand = new JRibbonBand(bundle.getString("band.clipboard"), null);
            clipBoardBand.setResizePolicies(
                CoreRibbonResizePolicies.getCorePoliciesNone(clipBoardBand));
                
            // Add commands to the clipboard band
            clipBoardBand.addRibbonCommand(formatPainterCommand.project(
                    new CommandButtonPresentationModel.Builder().setActionKeyTip("FP").build()),
                    JRibbonBand.PresentationPriority.TOP
            );
            clipBoardBand.addRibbonCommand(
                pasteCommand.project(
                    new CommandButtonPresentationModel.Builder().setActionKeyTip("V").build()),
                    JRibbonBand.PresentationPriority.TOP
            );
            clipBoardBand.addRibbonCommand(
                cutCommand.project(
                    new CommandButtonPresentationModel.Builder().setActionKeyTip("X").build()),
                    JRibbonBand.PresentationPriority.MEDIUM
            );
            clipBoardBand.addRibbonCommand(
                copyCommand.project(
                    new CommandButtonPresentationModel.Builder().setActionKeyTip("C").build()),
                    JRibbonBand.PresentationPriority.MEDIUM
            );
            clipBoardBand.addRibbonCommand(
                selectAllCommand.project(
                    new CommandButtonPresentationModel.Builder().setActionKeyTip("A").build()),
                    JRibbonBand.PresentationPriority.MEDIUM
            );
            
        // ---------------------------- Clipboard Band stops here -------------------------------------------//

        // ---------------------------- Font Band -------------------------------------------//
            fontBoxContentModel = RibbonDefaultComboBoxContentModel.<String>builder()
                    .setItems(GraphicsEnvironment
                                .getLocalGraphicsEnvironment()
                                .getAvailableFontFamilyNames()
                            )
                    .build();

            fontBoxContentModel.addListDataListener(
                new ListDataListener() {

                        @Override
                        public void intervalAdded(ListDataEvent e) {

                        }

                        @Override
                        public void intervalRemoved(ListDataEvent e) {

                        }

                        @Override
                        public void contentsChanged(ListDataEvent e) {
                                Object selectedItem = fontBoxContentModel.getSelectedItem();
                            if (selectedItem == null) {
                                // Do nothing if the selection is cleared (e.g., inconsistent font sizes)
                                return;
                            }
                            onFocusedPage(page -> {
                                int start = page.getSelectionStart();
                                int end = page.getSelectionEnd();
                                String selectedFont = String.valueOf(fontBoxContentModel.getSelectedItem());

                                if (start == end) {
                                    StyleConstants.setFontFamily(
                                            page.getInputAttributes(),
                                            selectedFont);
                                } else {
                                    StyledDocument doc = page.getStyledDocument();
                                    SimpleAttributeSet sas = new SimpleAttributeSet();
                                    StyleConstants.setFontFamily(sas, selectedFont);
                                    doc.setCharacterAttributes(start, end - start, sas, false);
                                }
                            });
                        }
                        
                }
             );

             fontBoxContentModel.setSelectedItem("Times New Roman");

            increaseFontSizeCommand = Command.builder()
                    .setIconFactory(icons8_increase_font_50.factory())
                    .build();
            increaseFontSizeCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.increaseFontSize"))
                .addDescriptionSection(bundle.getString("cmd.increaseFontSize.description"))
                .build()
            );
            
            decreaseFontSizeCommand = Command.builder()
                    .setIconFactory(icons8_decrease_font_50.factory())
                    .build();
            
            decreaseFontSizeCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.decreaseFontSize"))
                .addDescriptionSection(bundle.getString("cmd.decreaseFontSize.description"))
                .build()
            );

            fontSizeModel = RibbonDefaultComboBoxContentModel.<String>builder()
                        .setItems(new String[]{"8","10","12","14","16", //maximum font size is 70
                                                "18","20","22","24","26",
                                                "28","30","32","34","36",
                                                "38","40","42","44","46",
                                                "48","50","52","54","56",
                                                "58","60","62","64","66",
                                                "68","70"

                                        })
                        .build();
            fontSizeModel.setSelectedItem("12");
            fontSizeModel.addListDataListener(
                new ListDataListener() {
                       
                        @Override
                        public void intervalAdded(ListDataEvent e) {
                                
                        }

                        @Override
                        public void intervalRemoved(ListDataEvent e) {
                                
                        }

                        @Override
                        public void contentsChanged(ListDataEvent e) {
                            // This listener is for when the user *selects* an item in the combo box.
                            // If the change is coming from our own CaretListener updating the UI, do nothing.
                            if (isUpdatingFontSizeUI) {
                                return;
                            }

                            // We apply the selected font size to the selected text, or to the
                            // input attributes if there is no selection.

                            Object selectedItem = fontSizeModel.getSelectedItem();
                            if (selectedItem == null) {
                                // Do nothing if the selection is cleared (e.g., inconsistent font sizes)
                                return;
                            }
                            onFocusedPage(page -> {
                                // converting an object to a string then to an integer
                                int newSize = Integer.parseInt((String) selectedItem);

                                int start = page.getSelectionStart();
                                int end = page.getSelectionEnd();

                                if (start == end) {
                                    MutableAttributeSet inputAttributes = page.getInputAttributes();
                                    StyleConstants.setFontSize(inputAttributes, newSize);
                                } else {
                                    StyledDocument doc = page.getStyledDocument();
                                    SimpleAttributeSet sas = new SimpleAttributeSet();
                                    StyleConstants.setFontSize(sas, newSize);
                                    doc.setCharacterAttributes(start, end - start, sas, false);
                                }

                                // Update button states
                                increaseFontSizeCommand.setActionEnabled(newSize < 70);
                                decreaseFontSizeCommand.setActionEnabled(newSize > 8);
                            });
                        }
                        
                }
            );

            // Action for increasing font size
            increaseFontSizeCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                int start = page.getSelectionStart();
                int end = page.getSelectionEnd();

                int currentSize;
                if (start == end) {
                    // No selection, get size from what's about to be typed
                    MutableAttributeSet inputAttributes = page.getInputAttributes();
                    currentSize = StyleConstants.getFontSize(inputAttributes);

                } else {
                    // There's a selection and so get the size of the first character
                    StyledDocument doc = page.getStyledDocument();
                    AttributeSet as = doc.getCharacterElement(start).getAttributes();
                    currentSize = StyleConstants.getFontSize(as);

                }

                int newSize = currentSize + 2;

                // This will trigger the listener which will apply the change.
                // We just need to update the model.
                fontSizeModel.setSelectedItem(String.valueOf(newSize));
            }));
            // Action for decreasing font size
            decreaseFontSizeCommand.setAction(
                    CommandActionEvent -> onFocusedPage(page -> {
                        int start = page.getSelectionStart();
                        int end = page.getSelectionEnd();
                        int currentSize;
                        if (start == end) {
                            currentSize = StyleConstants.getFontSize(
                                    page.getInputAttributes());
                        } else {
                            currentSize = StyleConstants.getFontSize((page.getStyledDocument()
                                    .getCharacterElement(start)
                                    .getAttributes()));
                        }

                        int newSize = currentSize - 2;
                        fontSizeModel.setSelectedItem(String.valueOf(newSize));
                    }));
            CommandToggleGroupModel formatToggleGroupModel = new CommandToggleGroupModel();
            formatToggleGroupModel.setAllowsClearingSelection(true);
            
            boldCommand = Command.builder()
                .setIconFactory(bold.factory())
                .setToggle()
                .build();

            boldCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.bold"))
                .addDescriptionSection(bundle.getString("cmd.bold.description"))
                .build()
            );

            boldCommand.setAction(
                commandActionEvent -> onFocusedPage(page -> {
                    // Use the command's toggle state to determine if we need to bold or un-bold
                    boolean makeBold = commandActionEvent.getCommand().isToggleSelected();

                    int start = page.getSelectionStart();
                    int end = page.getSelectionEnd();

                    if (start == end) {
                        // No selection - we are affecting the style of the new characters
                        // that will be typed. Get the pane's input attributes and modify them.
                        MutableAttributeSet inputAttributes = page.getInputAttributes();
                        StyleConstants.setBold(inputAttributes, makeBold);
                    } else {
                        // We have a selection. Apply the new attribute set to the selected text.
                        StyledDocument doc = page.getStyledDocument();
                        SimpleAttributeSet sas = new SimpleAttributeSet();
                        StyleConstants.setBold(sas, makeBold);
                        doc.setCharacterAttributes(start, end - start, sas, false);
                    }
                }));

            italicCommand = Command.builder()
                .setIconFactory(italic.factory())
                .setToggle()
                .build();

            italicCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.italic"))
                .addDescriptionSection(bundle.getString("cmd.italic.description"))
                .build()
            );

            italicCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                boolean makeItalic = italicCommand.isToggleSelected();

                int start = page.getSelectionStart();
                int end = page.getSelectionEnd();
                if (start != end) {
                        StyledDocument doc = page.getStyledDocument();
                        SimpleAttributeSet sas = new SimpleAttributeSet();
                        StyleConstants.setItalic(sas, makeItalic);
                        doc.setCharacterAttributes(start, end-start, sas, false);
                } else {
                        MutableAttributeSet mas = page.getInputAttributes();
                        StyleConstants.setItalic(mas, makeItalic);
                }
             }));
             
             
            underlineCommand = Command.builder()
                .setIconFactory(underline.factory())
                .setToggle()
                .build();

            underlineCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.underline"))
                .addDescriptionSection(bundle.getString("cmd.underline.description"))
                .build()
            );

            underlineCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                boolean Underline = underlineCommand.isToggleSelected();
                int start = page.getSelectionStart();
                int end = page.getSelectionEnd();

                if (start == end) {
                        MutableAttributeSet mas = page.getInputAttributes();
                        StyleConstants.setUnderline(mas, Underline);
                } else {
                        SimpleAttributeSet sas = new SimpleAttributeSet();
                        StyledDocument doc = page.getStyledDocument();
                        StyleConstants.setUnderline(sas, Underline);
                        doc.setCharacterAttributes(start, end-start, sas, false);
                }
            }));

            strikethroughCommand =Command.builder()
                .setIconFactory(strikethrough.factory())
                .setToggle()
                .build();

            strikethroughCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.strikethrough"))
                .addDescriptionSection(bundle.getString("cmd.strikethrough.description"))
                .build()
            );

            strikethroughCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                boolean strikethrough = strikethroughCommand.isToggleSelected();
                int start = page.getSelectionStart();
                int end = page.getSelectionEnd();

                if (start != end) {
                        StyledDocument doc = page.getStyledDocument();
                        SimpleAttributeSet sas = new SimpleAttributeSet();
                        StyleConstants.setStrikeThrough(sas, strikethrough);
                        doc.setCharacterAttributes(start, end-start, sas, false);
                } else {
                        MutableAttributeSet mas = page.getInputAttributes();
                        StyleConstants.setStrikeThrough(mas, strikethrough);
                }
            }));
            subscriptCommand =Command.builder()
                .setIconFactory(subscript_svgrepo_com.factory())
                .setToggle()
                .inToggleGroup(formatToggleGroupModel)
                .build();

           subscriptCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.subscript"))
                .addDescriptionSection(bundle.getString("cmd.subscript.description"))
                .build()
           );

           subscriptCommand.setAction(
                CommandActionEvent -> onFocusedPage(page -> {
                        boolean makeSubscript = subscriptCommand.isToggleSelected();
                        int start = page.getSelectionStart();
                        int end = page.getSelectionEnd();

                        if (start == end) {
                            MutableAttributeSet inputAttributes = page.getInputAttributes();
                            if (makeSubscript) {
                                StyleConstants.setSuperscript(inputAttributes, false); // Remove superscript
                            }
                            StyleConstants.setSubscript(
                                    inputAttributes, makeSubscript);
                        } else {
                                StyledDocument doc = page.getStyledDocument();
                                SimpleAttributeSet sas = new SimpleAttributeSet();
                                if (makeSubscript) {
                                    StyleConstants.setSuperscript(sas, false); // Remove superscript
                                }
                                StyleConstants.setSubscript(sas, makeSubscript);
                                doc.setCharacterAttributes(start, end-start, sas, false);
                        }
                })
           );
           superscriptCommand =Command.builder()
                .setIconFactory(superscript_svgrepo_com.factory())
                .setToggle()
                .inToggleGroup(formatToggleGroupModel)
                .build();

           superscriptCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.superscript"))
                .addDescriptionSection(bundle.getString("cmd.superscript.description"))
                .build()
           );

           superscriptCommand.setAction(
                CommandActionEvent -> onFocusedPage(page -> {
                        boolean makeSuperscript = superscriptCommand.isToggleSelected();
                        int start = page.getSelectionStart();
                        int end = page.getSelectionEnd();

                        if (start == end) {
                            MutableAttributeSet inputAttributes = page.getInputAttributes();
                             // Remove subscript incase its there otherwise there will be a logical error
                            if (makeSuperscript) {
                                StyleConstants.setSubscript(inputAttributes, false);
                            }
                            StyleConstants.setSuperscript(
                                    inputAttributes, makeSuperscript);
                        } else {
                                StyledDocument doc = page.getStyledDocument();
                                SimpleAttributeSet sas = new SimpleAttributeSet();
                             // Remove subscript incase its there otherwise there will be a logical error
                                if (makeSuperscript) {
                                    StyleConstants.setSubscript(sas, false);
                                }
                                StyleConstants.setSuperscript(sas, makeSuperscript);
                                doc.setCharacterAttributes(start, end-start, sas, false);
                        }
                })
           );

            changeCaseCommand = Command.builder()
                .setIconFactory(font_size_svgrepo_com.factory())
                .build();

            changeCaseCommand.setAction(e -> showChangeCaseDialog(mainFrame));
            changeCaseCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.changeCase"))
                .addDescriptionSection(bundle.getString("cmd.changeCase.description"))
                .build()
            );
            
            Map<Command, CommandButtonPresentationModel.Overlay> formatOverlays = new HashMap<>();
            formatOverlays.put(boldCommand,
            CommandButtonPresentationModel.overlay().setActionKeyTip("1"));
            formatOverlays.put(italicCommand,
            CommandButtonPresentationModel.overlay().setActionKeyTip("2"));
            formatOverlays.put(underlineCommand,
            CommandButtonPresentationModel.overlay().setActionKeyTip("3"));
            formatOverlays.put(strikethroughCommand,
            CommandButtonPresentationModel.overlay().setActionKeyTip("4"));
            formatOverlays.put(subscriptCommand,
            CommandButtonPresentationModel.overlay().setActionKeyTip("5"));
            formatOverlays.put(superscriptCommand,
            CommandButtonPresentationModel.overlay().setActionKeyTip("6"));
            CommandStripProjection formatStripProjection = new CommandStripProjection(
                new CommandGroup(boldCommand,
                 italicCommand,
                 underlineCommand,
                 strikethroughCommand,
                 subscriptCommand,
                 superscriptCommand),
                CommandStripPresentationModel.builder().setFocusable(false).build());
            
            formatStripProjection.setCommandOverlays(formatOverlays);

            Map<Command, CommandButtonPresentationModel.Overlay> fontSizeOverlays = new HashMap<>();
            fontSizeOverlays.put(increaseFontSizeCommand,
                    CommandButtonPresentationModel.overlay().setActionKeyTip("FG"));
            fontSizeOverlays.put(decreaseFontSizeCommand,
                    CommandButtonPresentationModel.overlay().setActionKeyTip("FK"));
            CommandStripProjection fontSizeStripProjection = new CommandStripProjection(
                new CommandGroup(
                        increaseFontSizeCommand,
                        decreaseFontSizeCommand),
                         CommandStripPresentationModel.builder()
                         .setFocusable(false)
                         .build());
            fontSizeStripProjection.setCommandOverlays(fontSizeOverlays);

            JFlowRibbonBand fontBand = new JFlowRibbonBand(bundle.getString("band.font"), null);
            fontBand.setResizePolicies(CoreRibbonResizePolicies.getCoreFlowPoliciesRestrictive(fontBand, 2));

            fontBand.addFlowComponent(new RibbonComboBoxProjection<>(
                    fontBoxContentModel,
                    ComponentPresentationModel.builder()
                            .setKeyTip("FF")
                            .build())
            );

            fontBand.addFlowComponent(new RibbonComboBoxProjection<>(
                    fontSizeModel,
                    ComponentPresentationModel.builder()
                            .setKeyTip("FS")
                            .build())
            );

            fontBand.addFlowComponent(formatStripProjection);
            fontBand.addFlowComponent(fontSizeStripProjection);
            Map<Command, CommandButtonPresentationModel.Overlay> changeCaseOverlays = new HashMap<>();
            changeCaseOverlays.put(changeCaseCommand,
                    CommandButtonPresentationModel.overlay().setActionKeyTip("7"));
            CommandStripProjection changeCaseStripProjection = new CommandStripProjection(
                new CommandGroup(changeCaseCommand),
                CommandStripPresentationModel.builder()
                    .setFocusable(false)
                    .build());
            changeCaseStripProjection.setCommandOverlays(changeCaseOverlays);
            fontBand.addFlowComponent(changeCaseStripProjection);


        // ---------------------------- Font Band ends here -------------------------------------------//    
            
        // ---------------------------- Paragraph Band Starts here ------------------------------------//
            CommandToggleGroupModel paragraphToggleGroupModel = new CommandToggleGroupModel();

            numberedListCommand = Command.builder()
                .setIconFactory(list_order_svgrepo_com.factory())
                .setToggle()
                .inToggleGroup(paragraphToggleGroupModel)
                .build();
            
            numberedListCommand.setAction(
                CommandActionEvent -> onFocusedPage(page -> {
                        boolean makeNumbered = numberedListCommand.isToggleSelected();
                        if(makeNumbered) {
                                try {
                                        StyledDocument doc = page.getStyledDocument();
                                        int start = page.getSelectionStart();
                                        int end = page.getSelectionEnd();

                                        if(start != end){
                                                ///In StyledDocument (and also PlainDocument),
                                                ///  the document is internally split into elements — often paragraphs or lines.
                                                /// The root element is the top-level container that holds all line elements.
                                                Element root = doc.getDefaultRootElement();
                                                int startLine = root.getElementIndex(start);
                                                int endLine = root.getElementIndex(end);

                                                /// Iterate backwards through the selected lines to avoid offset issues
                                                /// Backward is safer when modifying document text because inserting changes offsets
                                                for (int i = endLine; i >= startLine; i--) {
                                                        //Get the line and its starting position
                                                        Element line = root.getElement(i);
                                                        int lineStart = line.getStartOffset();

                                                        // If the selection ends at the very start of the last line,
                                                        // it means that line is not really part of the selection content.
                                                        // "lineStart >= end" means that “Does the starting position of the current line come after the end of the user’s selection?”
                                                        if (lineStart >= end && i == endLine) {
                                                                continue;
                                                        }

                                                        // Get attributes from the first character of the line to apply to the number
                                                        AttributeSet lineAttributes = doc.getCharacterElement(lineStart).getAttributes();

                                                        ///Recall that i = current line index in the loop (starting from the end and going backward)
                                                        /// startLine = index of the first selected line
                                                        /// Example where startLine=3 and endLine=5
                                                        /// Line 3: Apples   so for this case, i = 3. using the formula, listNumber = (3-3)+1 = 1
                                                        /// Line 4: Bananas  for this case, i = 4. using the formula, listNumber = (4-3)+1    = 2
                                                        /// Line 5: Cherries for this case, i = 5. using the formula, listNumber = (5-3)+1    = 3
                                                        int listNumber = (i - startLine) + 1;
                                                        doc.insertString(lineStart, listNumber + ". ", lineAttributes);
                                                }
                                }
                                else{ // No text selected, so we start a new list
                                        listCounter = 1;
                                        doc.insertString(page.getCaretPosition(), listCounter + ". ", page.getInputAttributes());
                                        listCounter++;
                                        page.addKeyListener(numberedListKeyListener);
                                        }
                                } catch (BadLocationException e) {
                                        e.printStackTrace();
                                }
                        } else {
                            // Numbered list mode is turned off
                            page.removeKeyListener(numberedListKeyListener);

                            // If there is a selection, remove numbering from the selected lines
                            try {
                                StyledDocument doc = page.getStyledDocument();
                                int start = page.getSelectionStart();
                                int end = page.getSelectionEnd();

                                if (start != end) {
                                    Element root = doc.getDefaultRootElement();
                                    int startLine = root.getElementIndex(start);
                                    int endLine = root.getElementIndex(end);

                                    // Iterate backwards to avoid offset issues when removing text
                                    for (int i = endLine; i >= startLine; i--) {
                                        Element line = root.getElement(i);
                                        int lineStart = line.getStartOffset();

                                        if (lineStart >= end && i == endLine) {
                                            continue;
                                        }

                                        String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
                                        // Regex to find "1. ", "2. ", etc. at the start of the line
                                        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("^\\d+\\.\\s+")
                                                .matcher(lineText);
                                        if (matcher.find()) {
                                            // Remove the matched numbering prefix
                                            doc.remove(lineStart, matcher.end());
                                        }
                                    }
                                }
                            } catch (BadLocationException e) {
                                e.printStackTrace();
                            }
                        }
                }
           ));

            // Key listener for handling automatic numbering when Enter is pressed.
            numberedListKeyListener = new java.awt.event.KeyAdapter() {
                @Override
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                        try {

                            JTextPane page = getFocusedPage();
                            if(page!=null){
                            evt.consume(); // Prevent the default Enter key action
                            StyledDocument doc = page.getStyledDocument();
                            int caretPos = page.getCaretPosition();

                            // Check if the current line is an empty list item to end the list

                            ///In StyledDocument (and also PlainDocument),
                            ///  the document is internally split into elements — often paragraphs or lines.
                            /// The root element is the top-level container that holds all line elements.
                            
                            Element root = doc.getDefaultRootElement();//Gets the top-level container that holds all the lines.
                            int lineIndex = root.getElementIndex(caretPos);//This line tells you: "Which line number is the cursor in?"
                            Element lineElement = root.getElement(lineIndex);//This gets the specific line, based on the index from above.Now you can inspect this line’s start and end positions.
                            int lineStart = lineElement.getStartOffset();//This gets the position where the line starts in the document.
                            String lineText = doc.getText(lineStart, caretPos - lineStart);//This is done to look at what the user typed on that line before they hit Enter.
                            ///regex(regular expression) \d+ --one or more digits , \. matches a dot
                            /// The trim() method removes any leading or trailing whitespace
                            /// trim() is used to ignore accidental spaces when the user presses Enter.
                            /// It makes the program more user-friendly and less strict.
                            /// Without it, even " 4. " would not count as "just 4." — which could confuse the user.
                            
                            /// If the line is just "X. " with nothing after, end the list
                            if (lineText.trim().matches("\\d+\\.")) {
                                doc.remove(lineStart, caretPos - lineStart);
                                // De-select the toggle button, which will trigger its action
                                // to remove this key listener.
                                numberedListCommand.setToggleSelected(false);
                                // Explicitly remove the key listener to stop automatic numbering.
                                // Programmatically setting the toggle state does not fire the action.
                                page.removeKeyListener(numberedListKeyListener);
                            } else {
                                // Otherwise, continue the list with the next number
                                doc.insertString(caretPos, "\n" + listCounter + ". ", page.getInputAttributes());
                                listCounter++;
                            }}
                        } catch (BadLocationException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            };


            numberedListCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.numberedList"))
                .addDescriptionSection(bundle.getString("cmd.numberedList.description"))
                .build()
            );

            bulletedListCommand = Command.builder()
                .setIconFactory(bullet_list_svgrepo_com_1.factory())
                .inToggleGroup(paragraphToggleGroupModel)
                .build();
            bulletedListCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {boolean makeBulleted = bulletedListCommand.isToggleSelected();
                                if (makeBulleted) {
                                        try {
                                                StyledDocument doc = page.getStyledDocument();
                                                int start = page.getSelectionStart();
                                                int end = page.getSelectionEnd();
                                                if (start != end) {
                                                        Element root = doc.getDefaultRootElement();
                                                        int startLine = root.getElementIndex(start);
                                                        int endLine = root.getElementIndex(end);
                                                        for (int i = endLine; i >= startLine; i--) {
                                                                Element line = root.getElement(i);
                                                                int lineStart = line.getStartOffset();
                                                                if (lineStart >= end && i == endLine) continue;
                                                                AttributeSet lineAttributes = doc.getCharacterElement(lineStart).getAttributes();
                                                                String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
                                                                if (!lineText.trim().startsWith("\u2022")) {
                                                                        doc.insertString(lineStart, BULLET, lineAttributes);
                                                                }
                                                        }
                                                } else {
                                                        doc.insertString(page.getCaretPosition(), BULLET, page.getInputAttributes());
                                                        page.addKeyListener(bulletListKeyListener);
                                                }
                                        } catch (BadLocationException e) {
                                                e.printStackTrace();
                                        }
                                } else {
                                        page.removeKeyListener(bulletListKeyListener);
                                        try {
                                                StyledDocument doc = page.getStyledDocument();
                                                int start = page.getSelectionStart();
                                                int end = page.getSelectionEnd();
                                                if (start != end) {
                                                        Element root = doc.getDefaultRootElement();
                                                        int startLine = root.getElementIndex(start);
                                                        int endLine = root.getElementIndex(end);
                                                        for (int i = endLine; i >= startLine; i--) {
                                                                Element line = root.getElement(i);
                                                                int lineStart = line.getStartOffset();
                                                                if (lineStart >= end && i == endLine) continue;
                                                                String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
                                                                if (lineText.trim().startsWith("\u2022")) {
                                                                        int idx = lineText.indexOf(BULLET);
                                                                        if (idx == 0) {
                                                                                doc.remove(lineStart, BULLET.length());
                                                                        }
                                                                }
                                                        }
                                                }
                                        } catch (BadLocationException e) {
                                                e.printStackTrace();
                                        }
                                }}));

            // Key listener for handling automatic bullets when Enter is pressed.
                        bulletListKeyListener = new java.awt.event.KeyAdapter() {
                                @Override
                                public void keyPressed(java.awt.event.KeyEvent evt) {
                                        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                                                try {
                                                        JTextPane page = getFocusedPage(); 
                                                        if(page!=null){
                                                        evt.consume();
                                                        StyledDocument doc = page.getStyledDocument();
                                                        int caretPos = page.getCaretPosition();
                                                        Element root = doc.getDefaultRootElement();
                                                        int lineIndex = root.getElementIndex(caretPos);
                                                        Element lineElement = root.getElement(lineIndex);
                                                        int lineStart = lineElement.getStartOffset();
                                                        String lineText = doc.getText(lineStart, caretPos - lineStart);
                                                        if (lineText.trim().equals("\u2022")) {
                                                                doc.remove(lineStart, caretPos - lineStart);
                                                                bulletedListCommand.setToggleSelected(false);
                                                                page.removeKeyListener(bulletListKeyListener);
                                                        } else {
                                                                doc.insertString(caretPos, "\n" + BULLET, page.getInputAttributes());
                                                     }  }
                                                } catch (BadLocationException ex) {
                                                        ex.printStackTrace();
                                                }
                                        }
                                }
                        };


            bulletedListCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.bulletedList"))
                .addDescriptionSection(bundle.getString("cmd.bulletedList.description"))
                .build()
            );
            
            tickedListCommand = Command.builder()
                .setIconFactory(icons8_to_do_list_50_3.factory())
                .inToggleGroup(paragraphToggleGroupModel)
                .build();
            tickedListCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                boolean makeTicked = tickedListCommand.isToggleSelected();
                if (makeTicked) {
                        try {
                                StyledDocument doc = page.getStyledDocument();
                                int start = page.getSelectionStart();
                                int end = page.getSelectionEnd();
                                if (start != end) {
                                        Element root = doc.getDefaultRootElement();
                                        int startLine = root.getElementIndex(start);
                                        int endLine = root.getElementIndex(end);
                                        for (int i = endLine; i >= startLine; i--) {
                                                Element line = root.getElement(i);
                                                int lineStart = line.getStartOffset();
                                                if (lineStart >= end && i == endLine) continue;
                                                AttributeSet lineAttributes = doc.getCharacterElement(lineStart).getAttributes();
                                                String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
                                                if (!lineText.trim().startsWith("\u2713")) {
                                                        doc.insertString(lineStart, TICK, lineAttributes);
                                                }
                                        }
                                } else {
                                        doc.insertString(page.getCaretPosition(), TICK, page.getInputAttributes());
                                        page.addKeyListener(tickedListKeyListener);
                                }
                        } catch (BadLocationException e) {
                                e.printStackTrace();
                        }
                } else {
                        page.removeKeyListener(tickedListKeyListener);
                        try {
                                StyledDocument doc = page.getStyledDocument();
                                int start = page.getSelectionStart();
                                int end = page.getSelectionEnd();
                                if (start != end) {
                                        Element root = doc.getDefaultRootElement();
                                        int startLine = root.getElementIndex(start);
                                        int endLine = root.getElementIndex(end);
                                        for (int i = endLine; i >= startLine; i--) {
                                                Element line = root.getElement(i);
                                                int lineStart = line.getStartOffset();
                                                if (lineStart >= end && i == endLine) continue;
                                                String lineText = doc.getText(lineStart, line.getEndOffset() - lineStart);
                                                if (lineText.trim().startsWith("\u2713")) {
                                                        int idx = lineText.indexOf(TICK);
                                                        if (idx == 0) {
                                                                doc.remove(lineStart, TICK.length());
                                                        }
                                                }
                                        }
                                }
                        } catch (BadLocationException e) {
                                e.printStackTrace();
                        }
                }
            }));

            // Key listener for handling automatic ticks when Enter is pressed.
            tickedListKeyListener = new java.awt.event.KeyAdapter() {
                @Override
                public void keyPressed(java.awt.event.KeyEvent evt) {
                        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                                try {
                                        JTextPane page = getFocusedPage();
                                    if(page!=null){
                                        evt.consume();
                                        StyledDocument doc = page.getStyledDocument();
                                        int caretPos = page.getCaretPosition();
                                        Element root = doc.getDefaultRootElement();
                                        int lineIndex = root.getElementIndex(caretPos);
                                        Element lineElement = root.getElement(lineIndex);
                                        int lineStart = lineElement.getStartOffset();
                                        String lineText = doc.getText(lineStart, caretPos - lineStart);
                                        if (lineText.trim().equals("\u2713")) {
                                                doc.remove(lineStart, caretPos - lineStart);
                                                tickedListCommand.setToggleSelected(false);
                                                page.removeKeyListener(tickedListKeyListener);
                                        } else {
                                                doc.insertString(caretPos, "\n" + TICK, page.getInputAttributes());
                                        }
                                    }
                                } catch (BadLocationException ex) {
                                        ex.printStackTrace();
                                }
                        }
                }
            };

            tickedListCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.tickedList"))
                .addDescriptionSection(bundle.getString("cmd.tickedList.description"))
                .build()
            );

            Map<Command, CommandButtonPresentationModel.Overlay> listOverlays = new HashMap<>();
            listOverlays.put(numberedListCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("N"));
            listOverlays.put(bulletedListCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("U"));
            listOverlays.put(tickedListCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("TM"));
            CommandStripProjection listProjection = new CommandStripProjection(
                    new CommandGroup(
                            numberedListCommand,
                            bulletedListCommand,
                            tickedListCommand
                            ),
                    CommandStripPresentationModel.builder()
                        .setFocusable(false)
                        .build());
            listProjection.setCommandOverlays(listOverlays);
            
            increaseIndentCommand = Command.builder()
                .setIconFactory(right_indent_svgrepo_com.factory())
                .build();
            increaseIndentCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                try {
                    StyledDocument doc = page.getStyledDocument();
                    int caretPos = page.getCaretPosition();
                    Element paragraph = doc.getParagraphElement(caretPos);
                    int start = paragraph.getStartOffset();
                    int end = paragraph.getEndOffset();
                    AttributeSet attrs = paragraph.getAttributes();
                    float current = StyleConstants.getLeftIndent(attrs);
                    float newIndent = Math.min(current + 20f, page.getWidth() - 40f);
                    SimpleAttributeSet sas = new SimpleAttributeSet();
                    StyleConstants.setLeftIndent(sas, newIndent);
                    doc.setParagraphAttributes(start, end - start, sas, false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }}
            ));

            increaseIndentCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.increaseIndent"))
                .addDescriptionSection(bundle.getString("cmd.increaseIndent.description"))
                .build()
            );

            decreaseIndentCommand = Command.builder()
                .setIconFactory(left_indent_svgrepo_com.factory())
                .build();

            decreaseIndentCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                try {
                    StyledDocument doc = page.getStyledDocument();
                    int caretPos = page.getCaretPosition();
                    Element paragraph = doc.getParagraphElement(caretPos);
                    int start = paragraph.getStartOffset();
                    int end = paragraph.getEndOffset();
                    AttributeSet attrs = paragraph.getAttributes();
                    float current = StyleConstants.getLeftIndent(attrs);
                    float newIndent = Math.max(0f,current - 20f);
                    SimpleAttributeSet sas = new SimpleAttributeSet();
                    StyleConstants.setLeftIndent(sas, newIndent);
                    doc.setParagraphAttributes(start, end - start, sas, false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }}
            ));

            decreaseIndentCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.decreaseIndent"))
                .addDescriptionSection(bundle.getString("cmd.decreaseIndent.description"))
                .build()
            );

            Map<Command, CommandButtonPresentationModel.Overlay> indentOverlays = new HashMap<>();
            indentOverlays.put(increaseIndentCommand,
                    CommandButtonPresentationModel.overlay().setActionKeyTip("AO"));
            indentOverlays.put(decreaseIndentCommand,
                    CommandButtonPresentationModel.overlay().setActionKeyTip("AI"));
            CommandStripProjection indentProjection = new CommandStripProjection(
                    new CommandGroup(
                            increaseIndentCommand,
                            decreaseIndentCommand
                            ),
                    CommandStripPresentationModel.builder()
                    .setFocusable(false)
                    .build());
            indentProjection.setCommandOverlays(indentOverlays);
                       
            increaseFirstLineIndentCommand = Command.builder()
                .setIconFactory(firstLineIndent_svgrepo_com.factory())
                .build();

            increaseFirstLineIndentCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                try {
                    StyledDocument doc = page.getStyledDocument();
                    int caretPos = page.getCaretPosition();
                    Element paragraph = doc.getParagraphElement(caretPos);
                    int start = paragraph.getStartOffset();
                    int end = paragraph.getEndOffset();
                    AttributeSet attrs = paragraph.getAttributes();
                    float current = StyleConstants.getFirstLineIndent(attrs);
                    float newIndent = Math.min(current + 20f, page.getWidth() - 40f);
                    SimpleAttributeSet sas = new SimpleAttributeSet();
                    StyleConstants.setFirstLineIndent(sas, newIndent);
                    doc.setParagraphAttributes(start, end - start, sas, false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }}
            ));
            

            decreaseFirstLineIndentCommand = Command.builder()
                .setIconFactory(firstLineOutdent2_svgrepo_com.factory())
                .build();

           decreaseFirstLineIndentCommand.setAction(CommandActionEvent -> onFocusedPage(page -> {
                try {
                    StyledDocument doc = page.getStyledDocument();
                    int caretPos = page.getCaretPosition();
                    Element paragraph = doc.getParagraphElement(caretPos);
                    int start = paragraph.getStartOffset();
                    int end = paragraph.getEndOffset();
                    AttributeSet attrs = paragraph.getAttributes();
                    float current = StyleConstants.getFirstLineIndent(attrs);
                    float newIndent = Math.max(0f, current - 20f);
                    SimpleAttributeSet sas = new SimpleAttributeSet();
                    StyleConstants.setFirstLineIndent(sas, newIndent);
                    doc.setParagraphAttributes(start, end - start, sas, false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
           }));   
            alignmentToggleGroupModel = new CommandToggleGroupModel();

            leftAlignCommand = Command.builder()
                .setIconFactory(text_align_left_svgrepo_com.factory())
                .inToggleGroup(alignmentToggleGroupModel)
                .build();
            leftAlignCommand.setAction(e->setParagraphAlignment(StyleConstants.ALIGN_LEFT));

            leftAlignCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.leftAlign"))
                .addDescriptionSection(bundle.getString("cmd.leftAlign.description"))
                .build()
            );
            
            centerAlignCommand = Command.builder()
                .setIconFactory(text_align_center_svgrepo_com.factory())
                .inToggleGroup(alignmentToggleGroupModel)
                .build();
            centerAlignCommand.setAction(e->setParagraphAlignment(StyleConstants.ALIGN_CENTER));

            centerAlignCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.centerAlign"))
                .addDescriptionSection(bundle.getString("cmd.centerAlign.description"))
                .build()
            );
                
            justifyAlignCommand = Command.builder()
                .setIconFactory(text_align_justify_svgrepo_com.factory())
                .inToggleGroup(alignmentToggleGroupModel)
                .build();
            justifyAlignCommand.setAction(e->setParagraphAlignment(StyleConstants.ALIGN_JUSTIFIED));

            justifyAlignCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.justifyAlign"))
                .addDescriptionSection(bundle.getString("cmd.justifyAlign.description"))
                .build()
            );
                
            rightAlignCommand = Command.builder()
                .setIconFactory(text_align_right_svgrepo_com.factory())
                .inToggleGroup(alignmentToggleGroupModel)
                .build();

            rightAlignCommand.setAction(e->setParagraphAlignment(StyleConstants.ALIGN_RIGHT));

            rightAlignCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.rightAlign"))
                .addDescriptionSection(bundle.getString("cmd.rightAlign.description"))
                .build()
            );

            Map<Command, CommandButtonPresentationModel.Overlay> alignmentOverlays = new HashMap<>();
            alignmentOverlays.put(leftAlignCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("AL"));
            alignmentOverlays.put(rightAlignCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("AR"));
            alignmentOverlays.put(centerAlignCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("AC"));
            alignmentOverlays.put(justifyAlignCommand, CommandButtonPresentationModel.overlay().setActionKeyTip("AJ"));
            CommandStripProjection alignmentStripProjection = new CommandStripProjection(
                new CommandGroup(
                        leftAlignCommand,
                        rightAlignCommand,
                        centerAlignCommand,
                        justifyAlignCommand
                ), CommandStripPresentationModel.builder().setFocusable(false).build());
            alignmentStripProjection.setCommandOverlays(alignmentOverlays);

           lineSpacingToggleGroup = new CommandToggleGroupModel();
           lineSpacingToggleGroup.setAllowsClearingSelection(true);
            singleLineSpacingCommand = Command.builder() //Default spacing (0.0)
                .setIconFactory(line_spacing_svgrepo_com.factory())
                .setText(bundle.getString("cmd.singleLineSpacing"))
                .setToggle()
                .inToggleGroupAsSelected(lineSpacingToggleGroup)
                .build();
           
           singleLineSpacingCommand.setAction(e -> setLineSpacing(0.0f));

            oneAndHalfLineSpacingCommand = Command.builder() // 1.5 spacing (0.5)
                .setIconFactory(line_spacing_svgrepo_com.factory())
                .setText(bundle.getString("cmd.oneAndHalfLineSpacing"))
                .setToggle()
                .inToggleGroup(lineSpacingToggleGroup)
                .build();

           oneAndHalfLineSpacingCommand.setAction(e -> setLineSpacing(0.5f));

            doubleLineSpacingCommand = Command.builder() // Double spacing (1)
                .setIconFactory(line_spacing_svgrepo_com.factory())
                .setText(bundle.getString("cmd.doubleLineSpacing"))
                .setToggle()
                .inToggleGroup(lineSpacingToggleGroup)
                .build();

           doubleLineSpacingCommand.setAction(e -> setLineSpacing(1.0f));

          CommandMenuContentModel lineSpacingPopup =  new CommandMenuContentModel(
                        Arrays.asList(new CommandGroup(
                                singleLineSpacingCommand,
                                oneAndHalfLineSpacingCommand,
                                doubleLineSpacingCommand
                        )));
            lineSpacingCommand = Command.builder()
                .setIconFactory(line_space_svgrepo_com.factory())
                .setSecondaryContentModel(lineSpacingPopup)
                .build();

            lineSpacingCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.lineSpacing"))
                .addDescriptionSection(bundle.getString("cmd.lineSpacing.description"))
                .build()
            );

            Map<Command, CommandButtonPresentationModel.Overlay> lineSpacingOverlays = new HashMap<>();
            lineSpacingOverlays.put(lineSpacingCommand,
                    CommandButtonPresentationModel.overlay().setActionKeyTip("K"));
            CommandStripProjection lineSpacingStripProjection = new CommandStripProjection(
                new CommandGroup(lineSpacingCommand), CommandStripPresentationModel.builder().setFocusable(false).build());
            lineSpacingStripProjection.setCommandOverlays(lineSpacingOverlays);
            spaceAfterParagraphContentModel = 
            RibbonSpinnerNumberContentModel.builder()
                    .setValues(3,1,20,1)
                    .setCaption(bundle.getString("cmd.spaceAfterParagraphCaption"))
                    .setIconFactory(paragraph_spacing_svgrepo_com.factory())
                    .setRichTooltip(
                        RichTooltip.builder()
                            .setTitle(bundle.getString("cmd.spaceAfterParagraph"))
                            .addDescriptionSection(bundle.getString("cmd.spaceAfterParagraphDescription"))
                            .build())
                    .build();

                   spaceAfterParagraphContentModel.addChangeListener(CommandActionEvent -> onFocusedPage(page -> {
                           if (page != null) {
                                   int value = (Integer)spaceAfterParagraphContentModel.getValue();
                                   int caretPos = page.getCaretPosition();
                                   StyledDocument doc = page.getStyledDocument();
                                   Element paragraph = doc.getParagraphElement(caretPos);
                                   int start = paragraph.getStartOffset();
                                   int end = paragraph.getEndOffset();
                                   SimpleAttributeSet sas = new SimpleAttributeSet();
                                   StyleConstants.setSpaceBelow(sas, (float) value);
                                   doc.setParagraphAttributes(start, end - start, sas, false);
                           }
                   }));

            spaceBeforeParagraphContentModel = 
                  RibbonSpinnerNumberContentModel.builder()
                    .setValues(3,1,40,1)
                    .setCaption(bundle.getString("cmd.spaceBeforeParagraphCaption"))
                    .setIconFactory(paragraph_spacing_svgrepo_com.factory())
                    .setRichTooltip(
                        RichTooltip.builder()
                            .setTitle(bundle.getString("cmd.spaceBeforeParagraph"))
                            .addDescriptionSection(bundle.getString("cmd.spaceAfterParagraphDescription"))
                            .build())
                    .build();   
           spaceBeforeParagraphContentModel.addChangeListener(CommandActionEvent -> onFocusedPage(page -> {
                           if (page != null) {
                                   int value = (Integer)spaceBeforeParagraphContentModel.getValue();
                                   int caretPos = page.getCaretPosition();
                                   StyledDocument doc = page.getStyledDocument();
                                   Element paragraph = doc.getParagraphElement(caretPos);
                                   int start = paragraph.getStartOffset();
                                   int end = paragraph.getEndOffset();
                                   SimpleAttributeSet sas = new SimpleAttributeSet();
                                   StyleConstants.setSpaceAbove(sas, (float) value);
                                   doc.setParagraphAttributes(start, end - start, sas, false);
                           }
                   }));
            JFlowRibbonBand paragraphBand = new JFlowRibbonBand(bundle.getString("band.paragraph"), null);
            paragraphBand.setResizePolicies(CoreRibbonResizePolicies.getCoreFlowPoliciesRestrictive(paragraphBand, 2));

            paragraphBand.addFlowComponent(listProjection);
            paragraphBand.addFlowComponent(indentProjection);
            paragraphBand.addFlowComponent(new CommandStripProjection(
                new CommandGroup(
                        increaseFirstLineIndentCommand,
                        decreaseFirstLineIndentCommand
                ), CommandStripPresentationModel.builder().setFocusable(false).build())
            );
            paragraphBand.addFlowComponent(alignmentStripProjection);
            paragraphBand.addFlowComponent(lineSpacingStripProjection); 
            
            
            paragraphBand.addFlowComponent(
                new RibbonSpinnerProjection(
                        spaceAfterParagraphContentModel,
                        ComponentPresentationModel.builder().build()
                ));    
            paragraphBand.addFlowComponent(
                new RibbonSpinnerProjection(
                        spaceBeforeParagraphContentModel,
                        ComponentPresentationModel.builder().build()
                ));    
        //---------------------------- Paragraph Band ends here -----------------------------------------//

        //---------------------------- Text Styles Band starts here -----------------------------------------//
            // Commands for text styles gallery
            h1Command = Command.builder()
                .setText(bundle.getString("cmd.h1"))
                .setIconFactory(heading_h1_svgrepo_com.factory())
                .setToggle()
                .build();
            h1Command.setAction(e->applyTextStyle(page, "Times New Roman", 26, StyleConstants.ALIGN_CENTER, true, false, new Color(54, 96, 145), 10f, 10f));

            h1Command.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.h1"))
                .addDescriptionSection(bundle.getString("cmd.h1.description"))
                .build()
            );

            h2Command = Command.builder()
                .setText(bundle.getString("cmd.h2"))
                .setIconFactory(heading_h2_svgrepo_com.factory())
                .setToggle()
                .build();
            h2Command.setAction(e->applyTextStyle(page, "Times New Roman", 22, StyleConstants.ALIGN_CENTER, true, false, new Color(54, 96, 145), 10f, 5f));

            h2Command.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.h2"))
                .addDescriptionSection(bundle.getString("cmd.h2.description"))
                .build()
            );

            h3Command = Command.builder()
                .setText(bundle.getString("cmd.h3"))
                .setIconFactory(heading_h3_svgrepo_com.factory())
                .setToggle()
                .build();
            h3Command.setAction(e->applyTextStyle(page, "Times New Roman", 18, StyleConstants.ALIGN_CENTER, true, false, new Color(54, 96, 145), 10f, 5f));

            h3Command.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.h3"))
                .addDescriptionSection(bundle.getString("cmd.h3.description"))
                .build()
            );

            h4Command = Command.builder()
                .setText(bundle.getString("cmd.h4"))
                .setIconFactory(heading_h4_svgrepo_com.factory())
                .setToggle()
                .build();
            h4Command.setAction(e->applyTextStyle(page, "Calibri", 18, StyleConstants.ALIGN_LEFT, true, true, Color.BLACK, 10f, 5f));

            h4Command.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.h4"))
                .addDescriptionSection(bundle.getString("cmd.h4.description"))
                .build()
            );

            h5Command = Command.builder()
                .setText(bundle.getString("cmd.h5"))
                .setIconFactory(heading_h5_svgrepo_com.factory())
                .setToggle()
                .build();
            h5Command.setAction(e->applyTextStyle(page, "Calibri Light", 16, StyleConstants.ALIGN_LEFT, true, false, Color.BLACK, 10f, 5f));

            h5Command.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.h5"))
                .addDescriptionSection(bundle.getString("cmd.h5.description"))
                .build()
            );

            h6Command = Command.builder()
                .setText(bundle.getString("cmd.h6"))
                .setIconFactory(heading_h6_svgrepo_com.factory())
                .setToggle()
                .build();
            h6Command.setAction(e->applyTextStyle(page, "Calibri Light", 14, StyleConstants.ALIGN_LEFT, true, false, Color.GRAY, 10f, 5f));

            h6Command.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.h6"))
                .addDescriptionSection(bundle.getString("cmd.h6.description"))
                .build()
            );

            normalTextCommand = Command.builder()
                .setText(bundle.getString("cmd.normalText"))
                .setIconFactory(text_style_1212_svgrepo_com.factory())
               .setToggle()
                .build();
            normalTextCommand.setAction(e->applyTextStyle(page, "Calibri", 13, StyleConstants.ALIGN_JUSTIFIED, false, false, Color.BLACK, 1f, 1f));

            normalTextCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.normalText"))
                .addDescriptionSection(bundle.getString("cmd.normalText.description"))
                .build()
            );

            paragraphCommand = Command.builder()
                .setText(bundle.getString("cmd.paragraph"))
                .setIconFactory(paragraph_670_svgrepo_com.factory())
                .setToggle()
                .build();
            paragraphCommand.setAction(e->applyTextStyle(page, "Calibri Light", 13, StyleConstants.ALIGN_LEFT, false, false, Color.BLACK, 1f, 1f));

            paragraphCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.paragraph"))
                .addDescriptionSection(bundle.getString("cmd.paragraph.description"))
                .build()
            );

            quoteCommand = Command.builder()
                .setText(bundle.getString("cmd.quote"))
                .setIconFactory(icons8_quote_96.factory())
                .setToggle()
                .build();
            quoteCommand.setAction(e->applyTextStyle(page, "Times New Roman", 13, StyleConstants.ALIGN_CENTER, false, true, Color.BLUE, 1f, 1f));

            quoteCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.quote"))
                .addDescriptionSection(bundle.getString("cmd.quote.description"))
                .build()
            );

            RibbonGalleryContentModel galleryContentModel = new RibbonGalleryContentModel(null,
                new ArrayList<>(List.of(
                    new CommandGroup(
                        h1Command,
                        h2Command,
                        h3Command,
                        h4Command,
                        h5Command,
                        h6Command,
                        normalTextCommand,
                        paragraphCommand,
                        quoteCommand
                    )
                ))
            );

            Map<JRibbonBand.PresentationPriority,Integer> visibleCommands = new HashMap<>();
            visibleCommands.put(JRibbonBand.PresentationPriority.LOW,3);
            visibleCommands.put(JRibbonBand.PresentationPriority.MEDIUM,3);
            visibleCommands.put(JRibbonBand.PresentationPriority.TOP,3);
            
            Map<Command, CommandButtonPresentationModel.Overlay> styleGalleryOverlays = new HashMap<>();
            styleGalleryOverlays.put(h1Command,
             CommandButtonPresentationModel.overlay().setActionKeyTip("H1"));
            styleGalleryOverlays.put(h2Command,
             CommandButtonPresentationModel.overlay().setActionKeyTip("H2"));
            styleGalleryOverlays.put(h3Command,
             CommandButtonPresentationModel.overlay().setActionKeyTip("H3"));
            styleGalleryOverlays.put(h4Command,
             CommandButtonPresentationModel.overlay().setActionKeyTip("H4"));
            styleGalleryOverlays.put(h5Command,
             CommandButtonPresentationModel.overlay().setActionKeyTip("H5"));
            styleGalleryOverlays.put(h6Command,
             CommandButtonPresentationModel.overlay().setActionKeyTip("H6"));
            styleGalleryOverlays.put(normalTextCommand,
             CommandButtonPresentationModel.overlay().setActionKeyTip("NT"));
            styleGalleryOverlays.put(paragraphCommand,
             CommandButtonPresentationModel.overlay().setActionKeyTip("PA"));
            styleGalleryOverlays.put(quoteCommand,
             CommandButtonPresentationModel.overlay().setActionKeyTip("Q"));
            RibbonGalleryProjection galleryProjection = new RibbonGalleryProjection(
                galleryContentModel,
                 RibbonGalleryPresentationModel.builder()
                 .setPreferredVisibleCommandCounts(visibleCommands)
                 .setPopupLayoutSpec(new MenuPopupPanelLayoutSpec(3, 3))
                 .setCommandPresentationState(JRibbonBand.BIG_FIXED_LANDSCAPE)
                 .setExpandKeyTip("G")
                 .build()
            );
            
            galleryProjection.setCommandOverlays(styleGalleryOverlays);
            //------------------ Color selectors --------------------//
            Color defaultColor = Color.BLACK;
            ColorSelectorPopupMenuContentModel.ColorActivationListener
                fontColorActivationListener =
                        (Color color)->{
                                System.out.println("Color selected: "+color);
                                JTextPane page = getFocusedPage();
                                if (page != null) {
                                                 StyledDocument doc = page.getStyledDocument();
                                                 int start = page.getSelectionStart();
                                                 int end = page.getSelectionEnd();
                                                 if (start != end) {
                                                         SimpleAttributeSet attr = new SimpleAttributeSet();
                                                         StyleConstants.setForeground(attr, color);
                                                         doc.setCharacterAttributes(start, end - start, attr, false);
                                                 } else {
                                                         SimpleAttributeSet attr = new SimpleAttributeSet();
                                                         StyleConstants.setForeground(attr, color);
                                                         page.setCharacterAttributes(attr, false);
                                                 }
                                        }
                                        // We are done with the preview, so we reset the state. This prevents
                                        // onColorPreviewCanceled from reverting the selected color.
                                        isPreviewing = false;
                                        originalColor = null;
                        };

            ColorSelectorPopupMenuContentModel.ColorPreviewListener
                fontColorPreviewListener = new ColorPreviewListener() {

                        @Override
                        public void onColorPreviewActivated(Color color) {
                               System.out.println("Previewing : "+color);
                               JTextPane page = getFocusedPage();
                               if (page != null) {
                                    if (!isPreviewing) {
                                        isPreviewing = true;
                                        int start = page.getSelectionStart();
                                        AttributeSet attrs;
                                        if (start == page.getSelectionEnd()) {
                                            // No selection, get color from input attributes
                                            attrs = page.getInputAttributes();
                                        } else {
                                            // Selection, get color of first character
                                            StyledDocument doc = page.getStyledDocument();
                                            attrs = doc.getCharacterElement(start).getAttributes();
                                        }
                                        originalColor = StyleConstants.getForeground(attrs);
                                    }

                                    // Apply preview color
                                    int start = page.getSelectionStart();
                                    int end = page.getSelectionEnd();
                                    SimpleAttributeSet previewAttr = new SimpleAttributeSet();
                                    StyleConstants.setForeground(previewAttr, color);
                                    if (start != end) {
                                        StyledDocument doc = page.getStyledDocument();
                                        doc.setCharacterAttributes(start, end - start, previewAttr, false);
                                    } else {
                                        page.setCharacterAttributes(previewAttr, false);
                                    }
                                }
                        }


                        @Override
                        public void onColorPreviewCanceled() {
                                System.out.println("Preview canceled");
                                // This is still needed for when the user moves the mouse away
                                JTextPane page = getFocusedPage();
                                // from a color swatch without selecting it.
                                if (page != null && isPreviewing) {
                                    // Restore original color
                                    int start = page.getSelectionStart();
                                    int end = page.getSelectionEnd();
                                    SimpleAttributeSet originalAttr = new SimpleAttributeSet();
                                    StyleConstants.setForeground(originalAttr, originalColor);

                                    if (start != end) {
                                        StyledDocument doc = page.getStyledDocument();
                                        doc.setCharacterAttributes(start, end - start, originalAttr, false);
                                    } else {
                                        page.setCharacterAttributes(originalAttr, false);
                                    }
                                    isPreviewing = false;
                                    originalColor = null;
                                }

                        }
                        
                };

             ColorSelectorPopupMenuGroupModel.Builder popupBuilder =
                        ColorSelectorPopupMenuGroupModel.builder();

        //////Automatic color command
             popupBuilder.addCommand(
                        Command.builder()
                        .setText(bundle.getString("cmd.colorSelector.automatic"))
                        .setIconFactory(ColorRadianceIcon.factory(Color.WHITE))
                        .setAction(CommandActionEvent -> {
                           fontColorActivationListener.onColorActivated(defaultColor);
                           JColorSelectorPopupMenuPanel.addColorToRecentlyUsed(defaultColor);
                        })
                        .setActionPreview(
                                new Command.CommandActionPreview(){

                                        @Override
                                        public void onCommandPreviewActivated(BaseCommand command) {
                                               fontColorPreviewListener.onColorPreviewActivated(defaultColor);
                                               
                                        }

                                        @Override
                                        public void onCommandPreviewCanceled(BaseCommand command) {
                                               fontColorPreviewListener.onColorPreviewCanceled();
                                        }}
                        )
                        .build()
                        
             );

             popupBuilder.addColorSectionWithDerived(
                new ColorSelectorPopupMenuGroupModel.ColorSectionModelWithDerived(
                        bundle.getString("cmd.colorSelector.themeColors"),
                        myColors,5
                    )
             );

             popupBuilder.addColorSection(
                new ColorSelectorPopupMenuGroupModel
                        .ColorSectionModel(
                                bundle.getString("cmd.colorSelector.standardColors"),
                                myColors
                        )
             );

             popupBuilder.addRecentsSection(
                new ColorSelectorPopupMenuGroupModel
                        .ColorSectionModel(bundle.getString("cmd.colorSelector.recentColors"))
             );

             ColorSelectorPopupMenuContentModel colorPopupModel =
                 new ColorSelectorPopupMenuContentModel(
                        Collections.singletonList(popupBuilder.build())
                 );

             colorPopupModel.setColorActivationListener(fontColorActivationListener);
             colorPopupModel.setColorPreviewListener(fontColorPreviewListener);

            // --- Listeners and Model for Text Highlight Color ---
            ColorSelectorPopupMenuContentModel.ColorActivationListener highlightColorActivationListener = (Color color) -> {
                JTextPane page = getFocusedPage();
                if (page != null) {
                    int start = page.getSelectionStart();
                    int end = page.getSelectionEnd();
                    SimpleAttributeSet attr = new SimpleAttributeSet();
                    StyleConstants.setBackground(attr, color);
                    if (start != end) {
                        StyledDocument doc = page.getStyledDocument();
                        doc.setCharacterAttributes(start, end - start, attr, false);
                    } else {
                        // For highlighting, it doesn't make sense to change input attributes
                        // as it's a background property. We'll just do nothing if no text is selected.
                    }
                }
                isFillPreviewing = false;
                originalHighlightColor = null;
            };

            ColorSelectorPopupMenuContentModel.ColorPreviewListener highlightColorPreviewListener = new ColorPreviewListener() {
                @Override
                public void onColorPreviewActivated(Color color) {
                    JTextPane page = getFocusedPage();
                    if (page != null) {
                        if (!isFillPreviewing) {
                            isFillPreviewing = true;
                            int start = page.getSelectionStart();
                            if (start != page.getSelectionEnd()) {
                                StyledDocument doc = page.getStyledDocument();
                                AttributeSet attrs = doc.getCharacterElement(start).getAttributes();
                                originalHighlightColor = StyleConstants.getBackground(attrs);
                            } else {
                                originalHighlightColor = page.getBackground(); // or a default
                            }
                        }

                        int start = page.getSelectionStart();
                        int end = page.getSelectionEnd();
                        if (start != end) {
                            SimpleAttributeSet previewAttr = new SimpleAttributeSet();
                            StyleConstants.setBackground(previewAttr, color);
                            StyledDocument doc = page.getStyledDocument();
                            doc.setCharacterAttributes(start, end - start, previewAttr, false);
                        }
                    }
                }

                @Override
                public void onColorPreviewCanceled() {
                    JTextPane page = getFocusedPage();
                    if (page != null && isFillPreviewing) {
                        int start = page.getSelectionStart();
                        int end = page.getSelectionEnd();
                        if (start != end) {
                            SimpleAttributeSet originalAttr = new SimpleAttributeSet();
                            StyleConstants.setBackground(originalAttr, originalHighlightColor);
                            StyledDocument doc = page.getStyledDocument();
                            doc.setCharacterAttributes(start, end - start, originalAttr, false);
                        }
                        isFillPreviewing = false;
                        originalHighlightColor = null;
                    }
                }
            };

            ColorSelectorPopupMenuContentModel highlightColorPopupModel = new ColorSelectorPopupMenuContentModel(
                Collections.singletonList(popupBuilder.build())
            );
            highlightColorPopupModel.setColorActivationListener(highlightColorActivationListener);
            highlightColorPopupModel.setColorPreviewListener(highlightColorPreviewListener);

            shadingCommand = ColorSelectorCommand.builder()
                    .setSecondaryContentModel(colorPopupModel)
                    .setIconFactory(icons8_fill_color_48.factory())
                    .build();
            shadingCommand.setAction(e->comingSoonDialog(mainFrame));
            // The shading command is disabled for now.
            // To implement it, you would need a custom EditorKit that can render
            // paragraph-level background colors, which is different from character-level
            // highlighting.
            shadingCommand.setActionEnabled(false);
            shadingCommand.setSecondaryEnabled(false);
            shadingCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.shading"))
                .addDescriptionSection(bundle.getString("cmd.shading.description"))
                .build()
            );

            fontColorCommand = ColorSelectorCommand.builder()
                    .setSecondaryContentModel(colorPopupModel)
                    .setIconFactory(icons8_text_color_48.factory())
                    .build();
            fontColorCommand.setAction(e -> {
                // Default action when the main part of the button is clicked
                // Could apply the last used color, or a default color.
                // For now, we can just have it apply the default (black).
                fontColorActivationListener.onColorActivated(Color.BLACK);
            });

            fontColorCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.fontColor"))
                .addDescriptionSection(bundle.getString("cmd.fontColor.description"))
                .build()
            );

            textHighlightCommand = ColorSelectorCommand.builder()
                    .setSecondaryContentModel(highlightColorPopupModel)
                    .setIconFactory(icons8_highlight_50_5.factory())
                    .build();
            textHighlightCommand.setAction(e -> {
                // Default action: apply a default highlight color like yellow
                highlightColorActivationListener.onColorActivated(Color.YELLOW);
            });

            textHighlightCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.textHighlight"))
                .addDescriptionSection(bundle.getString("cmd.textHighlight.description"))
                .build()
            );

            JRibbonBand stylesBand = new JRibbonBand(bundle.getString("band.textStyles"), null);
            stylesBand.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(stylesBand));

            stylesBand.addRibbonGallery(galleryProjection,
                JRibbonBand.PresentationPriority.TOP);

            stylesBand.startGroup();

            stylesBand.addRibbonCommand(
                new ColorSelectorCommandButtonProjection(
                        shadingCommand, ColorSelectorCommandButtonPresentationModel.builder()
                                .setActionKeyTip("H")
                                .build()
                ),
                JRibbonBand.PresentationPriority.TOP
            );

            stylesBand.addRibbonCommand(
                new ColorSelectorCommandButtonProjection(
                        fontColorCommand, ColorSelectorCommandButtonPresentationModel.builder()
                                .setActionKeyTip("FC")
                                .build()
                ),
                JRibbonBand.PresentationPriority.MEDIUM
            );

            stylesBand.addRibbonCommand(
                new ColorSelectorCommandButtonProjection(
                        textHighlightCommand, ColorSelectorCommandButtonPresentationModel.builder()
                                .setActionKeyTip("M")
                                .build()
                ),
                JRibbonBand.PresentationPriority.MEDIUM
            );
        //---------------------------- Text Styles Band ends here   -----------------------------------------//

        //---------------------------- Navigation Band starts here ------------------------------------------//
           findCommand = Command.builder()
                .setIconFactory(doc_text_search_svgrepo_com.factory())
                .setText(bundle.getString("cmd.find"))
                .setAction(e -> showFindDialog(mainFrame))
                .build();

            findCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.find"))
                .addDescriptionSection(bundle.getString("cmd.find.description"))
                .build()
            );

            replaceCommand = Command.builder()
                .setIconFactory(icons8_replace_48.factory())
                .setText(bundle.getString("cmd.replace"))
                .setAction(e -> showReplaceDialog(mainFrame))
                .build();

            replaceCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.replace"))
                .addDescriptionSection(bundle.getString("cmd.replace.description"))
                .build()
            );

            gotoCommand = Command.builder()
                .setIconFactory(icons8_linking_48.factory())
                .setText(bundle.getString("cmd.goto"))
                .build();
            gotoCommand.setAction(e -> showGoToDialog(mainFrame));

            gotoCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.goto"))
                .addDescriptionSection(bundle.getString("cmd.goto.description"))
                .build()
            );

            JRibbonBand editBand = new JRibbonBand(bundle.getString("band.Editing"), null);
            editBand.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(editBand));

            editBand.addRibbonCommand(
                    findCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("FD")
                                    .build()
                    ),
                    JRibbonBand.PresentationPriority.MEDIUM
            );

            editBand.addRibbonCommand(
                    replaceCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("R")
                                    .build()
                    ),
                    JRibbonBand.PresentationPriority.MEDIUM
            );

            editBand.addRibbonCommand(
                    gotoCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("G")
                                    .build()
                    ),
                    JRibbonBand.PresentationPriority.MEDIUM
            );

        //---------------------------- Navigation Band ends here --------------------------------------------//

            RibbonTask homeTask = new RibbonTask(bundle.getString("task.home"), clipBoardBand, fontBand, paragraphBand, stylesBand, editBand);
            homeTask.setKeyTip("H");
            mainFrame.getRibbon().addTask(homeTask);
        //--------------------------------------------- HOME RIBBON TASK ends here ------------------------------------------------//
            
        //------------------------------ INSERT RIBBON TASKS starts from here----------------------------------//
            //---------------------- Page band-----------------------------------------------//
            newPageCommand = Command.builder()
                    .setText(bundle.getString("cmd.newPage"))
                    .setIconFactory(icons8_page_40.factory())
                    .build();
            newPageCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.newPage"))
                .addDescriptionSection(bundle.getString("cmd.newPage.description"))
                .build()
            );
            newPageCommand.setAction(e -> addNewPage());
            
           JRibbonBand pageBand = new JRibbonBand(bundle.getString("band.page"), null);
            pageBand.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(pageBand));
            pageBand.addRibbonCommand(
                    newPageCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("PG")
                                    .build()),
                    JRibbonBand.PresentationPriority.TOP
            );
            //----------------------- Common Objects Band --------------------------//
            tableCommand = Command.builder()
                    .setText(bundle.getString("cmd.table"))
                    .setIconFactory(icons8_table_94.factory())
                    .build();
            tableCommand.setAction(e->comingSoonDialog(mainFrame));

            tableCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.table"))
                .addDescriptionSection(bundle.getString("cmd.table.description"))
                .build()
            );

            pictureCommand = Command.builder()
                    .setText(bundle.getString("cmd.picture"))
                    .setIconFactory(icons8_picture_80.factory())
                    .build();
            pictureCommand.setAction(e->comingSoonDialog(mainFrame));

            pictureCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.picture"))
                .addDescriptionSection(bundle.getString("cmd.picture.description"))
                .build()
            );

            shapesCommand = Command.builder()
                    .setText(bundle.getString("cmd.shapes"))
                    .setIconFactory(icons8_shapes_64.factory())
                    .build();
            shapesCommand.setAction(e->comingSoonDialog(mainFrame));

            shapesCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.shapes"))
                .addDescriptionSection(bundle.getString("cmd.shapes.description"))
                .build()
            );
            
            JRibbonBand commonObjectsBand = new JRibbonBand(bundle.getString("band.commonObjects"), null);
            commonObjectsBand.setResizePolicies(CoreRibbonResizePolicies.getCorePoliciesNone(commonObjectsBand));

            commonObjectsBand.addRibbonCommand(
                    tableCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("T")
                                    .build()),
                    JRibbonBand.PresentationPriority.TOP
            );
            
            commonObjectsBand.addRibbonCommand(
                    pictureCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("P")
                                    .build()),
                    JRibbonBand.PresentationPriority.TOP
            );

            commonObjectsBand.addRibbonCommand(
                    shapesCommand.project(
                            new CommandButtonPresentationModel.Builder()
                                    .setActionKeyTip("SH")
                                    .build()),
                    JRibbonBand.PresentationPriority.TOP
            );
            RibbonTask insertTask = new RibbonTask(bundle.getString("task.insert"), pageBand, commonObjectsBand);
            insertTask.setKeyTip("I");
            mainFrame.getRibbon().addTask(insertTask);



            // Pages Panel
            pagesPanel = new JPanel();
            pagesPanel.setLayout(new BoxLayout(pagesPanel, BoxLayout.Y_AXIS));
            pagesPanel.setBackground(Color.DARK_GRAY);

            JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20));
            centerPanel.setBackground(Color.DARK_GRAY);
            centerPanel.add(pagesPanel);

            scrollPane = new JScrollPane(centerPanel);
            scrollPane.getVerticalScrollBar().setUnitIncrement(16);

            // Status Bar

            spellCheckCommand = Command.builder()
                .setText(bundle.getString("cmd.spellCheck"))
                .setIconFactory(icons8_spellcheck_48.factory())
                .setToggle()
                .build();

            spellCheckCommand.setActionRichTooltip(
                RichTooltip.builder()
                .setTitle(bundle.getString("cmd.spellCheck"))
                .addDescriptionSection(bundle.getString("cmd.spellCheck.description"))
                .build()
            );

            JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
            statusLabel = new JLabel("1/1 | Words: 0");
            statusBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
            statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
            statusBar.add(statusLabel);

            statusBar.add(
                spellCheckCommand.project(CommandButtonPresentationModel.builder()
                .setPresentationState(CommandButtonPresentationState.SMALL)
                .build())
                .buildComponent()
            );

            mainFrame.add(scrollPane, BorderLayout.CENTER);
            mainFrame.add(statusBar, BorderLayout.SOUTH);
            mainFrame.setSize(1000, 700);
            mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            addNewPage();
            mainFrame.setVisible(true);
        });
    }

    private static void addNewPage() {
        addNewPageAfter(getFocusedPage());
    }

    private static void openBlankDocument() {
        pagesPanel.removeAll();
        pages.clear();
        lastFocusedPage = null;
        addNewPage();
    }

    private static JTextPane addNewPageAfter(JTextPane afterPage) {
        JTextPane page = createPageWithText(null);
        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setBackground(Color.DARK_GRAY);
        wrapper.add(page, BorderLayout.CENTER);
        wrapper.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        int insertIndex = pages.size();
        if (afterPage != null) {
            int idx = pages.indexOf(afterPage);
            if (idx != -1)
                insertIndex = idx + 1;
        }

        pages.add(insertIndex, page);
        pagesPanel.add(wrapper, insertIndex);
        pagesPanel.revalidate();
        pagesPanel.repaint();

        SwingUtilities.invokeLater(() -> {
            page.requestFocusInWindow();
            if (pages.size() > 1) {
                scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());
            } else {
                scrollPane.getVerticalScrollBar().setValue(0);
            }
        });

        updateStatus();
        return page;
    }

    private static void updateStatus() {
        int currentPage = pages.indexOf(getFocusedPage()) + 1;
        if (currentPage == 0)
            currentPage = 1;
        int totalPages = pages.size();
        int totalWords = getWordCount();
    statusLabel.setText("   " + bundle.getString("statusBar.pages") + ": " + currentPage + "/" + totalPages + " | " + bundle.getString("status.words") + ": " + totalWords + " | " + bundle.getString("statusBar.mistakes") + ": 0 " + "|");
    }

    private static int getWordCount() {
        int count = 0;
        for (JTextPane page : pages) {
            String text = page.getText().trim();
            if (!text.isEmpty())
                count += text.split("\\s+").length;
        }
        return count;
    }

    private static JTextPane getFocusedPage() {
        return lastFocusedPage != null ? lastFocusedPage : (pages.isEmpty() ? null : pages.get(0));
    }

    private static void checkPageOverflow(JTextPane page) {
        if (bulkEditDepth > 0)
            return;
        SwingUtilities.invokeLater(() -> {
            int pageHeight = PAGE_SIZE.height - (2 * MARGIN);
            View rootView = page.getUI().getRootView(page);
            int textHeight = (int) rootView.getPreferredSpan(View.Y_AXIS);

            if (textHeight > pageHeight) {
                try {
                    int overflowPos = page.viewToModel2D(new Point(0, pageHeight));
                    if (overflowPos <= 0)
                        return;

                    final int caretPos = page.getCaretPosition();
                    StyledDocument sourceDoc = page.getStyledDocument();
                    int moveLen = sourceDoc.getLength() - overflowPos;
                    if (moveLen <= 0)
                        return;

                    List<StyledTextSegment> segmentsToMove = new ArrayList<>();
                    int currentPos = overflowPos;
                    while (currentPos < sourceDoc.getLength()) {
                        Element element = sourceDoc.getCharacterElement(currentPos);
                        int runEnd = element.getEndOffset();
                        int effectiveEnd = Math.min(runEnd, sourceDoc.getLength());
                        String runText = sourceDoc.getText(currentPos, effectiveEnd - currentPos);
                        segmentsToMove.add(new StyledTextSegment(runText, element.getAttributes()));
                        currentPos = effectiveEnd;
                    }

                    bulkEditDepth++;
                    try {
                        sourceDoc.remove(overflowPos, moveLen);
                    } finally {
                        bulkEditDepth--;
                    }

                    int pageIndex = pages.indexOf(page);
                    JTextPane nextPage = (pageIndex + 1 < pages.size()) ? pages.get(pageIndex + 1)
                            : addNewPageAfter(page);

                    StyledDocument destDoc = nextPage.getStyledDocument();
                    bulkEditDepth++;
                    try {
                        for (int i = segmentsToMove.size() - 1; i >= 0; i--) {
                            StyledTextSegment seg = segmentsToMove.get(i);
                            destDoc.insertString(0, seg.text, seg.attrs);
                        }
                    } finally {
                        bulkEditDepth--;
                    }

                    if (!isBackspaceMergeInProgress && caretPos >= overflowPos) {
                        final int newCaretPos = caretPos - overflowPos;
                        SwingUtilities.invokeLater(() -> {
                            nextPage.requestFocusInWindow();
                            nextPage.setCaretPosition(Math.max(0, Math.min(newCaretPos, destDoc.getLength())));
                        });
                    }

                    checkPageOverflow(nextPage);

                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private static JTextPane createPageWithText(String text) {
        JTextPane page = new JTextPane();
        page.setEditorKit(new WrapEditorKit());
        page.setPreferredSize(PAGE_SIZE);
        page.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 1),
                new EmptyBorder(MARGIN, MARGIN, MARGIN, MARGIN)));
        page.setBackground(Color.WHITE);

        if (text != null && !text.isEmpty())
            page.setText(text);

        page.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                lastFocusedPage = page;
                updateStatus();
            }
        });

        page.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                if (bulkEditDepth == 0) {
                    updateStatus();
                    checkPageOverflow(page);
                }
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                if (bulkEditDepth == 0)
                    updateStatus();
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                if (bulkEditDepth == 0)
                    updateStatus();
            }
        });

        page.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                if (formatPainterCommand.isToggleSelected() && copiedAttributes != null) {
                    int start = page.getSelectionStart();
                    int end = page.getSelectionEnd();
                    if (start != end) {
                        StyledDocument doc = page.getStyledDocument();
                        doc.setCharacterAttributes(start, end - start, copiedAttributes, true);

                        // Deactivate after applying
                        formatPainterCommand.setToggleSelected(false);
                        copiedAttributes = null;
                        setFormatPainterCursor(false);
                    }
                }
            }
        });

        page.addCaretListener(e -> {
            // When the caret moves or selection changes, update the toggle state of our buttons
            // to reflect the style of the text.

            int selectionStart = page.getSelectionStart();
            int selectionEnd = page.getSelectionEnd();
            StyledDocument doc = page.getStyledDocument();

            // Capture the state to be applied
            boolean newBold = false;
            boolean newItalic = false;
            boolean newUnderline = false;
            boolean newStrikethrough = false;
            boolean newSuperscript = false;
            boolean newSubscript = false;
            String newFontSize = null;
            String newFontFamily = null;

            if (selectionStart == selectionEnd) {
                // NO SELECTION: The caret has moved.
                // The attributes for typing are based on the character before the caret.
                // Using getCharacterElement is more reliable than getInputAttributes()
                // in a CaretListener, as it avoids potential timing issues where the
                // input attributes haven't been updated yet.
                int pos = page.getCaretPosition();
                AttributeSet attrs;
                if (doc.getLength() == 0) {
                    // Document is empty, use the initial input attributes
                    attrs = page.getInputAttributes();
                } else {
                    // Position the check at the character before the caret, or at the start.
                    int checkPos = (pos > 0) ? pos - 1 : 0;
                    attrs = doc.getCharacterElement(checkPos).getAttributes();
                }

                newBold = StyleConstants.isBold(attrs);
                newItalic = StyleConstants.isItalic(attrs);
                newUnderline = StyleConstants.isUnderline(attrs);
                newStrikethrough = StyleConstants.isStrikeThrough(attrs);
                newSuperscript = StyleConstants.isSuperscript(attrs);
                newSubscript = StyleConstants.isSubscript(attrs);

                newFontSize = String.valueOf(StyleConstants.getFontSize(attrs));
                newFontFamily = String.valueOf(StyleConstants.getFontFamily(attrs));

                try {
                    Element root = doc.getDefaultRootElement();
                    int lineIndex = root.getElementIndex(page.getCaretPosition());
                    Element line = root.getElement(lineIndex);
                    String lineText = doc.getText(line.getStartOffset(), line.getEndOffset() - line.getStartOffset());
                
                    numberedListCommand.setToggleSelected(lineText.trim().matches("\\d+\\.\\s?.*"));
                    bulletedListCommand.setToggleSelected(lineText.trim().startsWith("\u2022"));
                    tickedListCommand.setToggleSelected(lineText.trim().startsWith("\u2713"));

                } catch (BadLocationException e2) {
                    e2.printStackTrace();
                }    
                
                int alignment = StyleConstants.getAlignment(doc.getParagraphElement(selectionStart).getAttributes());
                                switch (alignment) {
                                    case StyleConstants.ALIGN_LEFT:
                                        alignmentToggleGroupModel.setSelected(leftAlignCommand, true);
                                        break;
                                    case StyleConstants.ALIGN_RIGHT:
                                        alignmentToggleGroupModel.setSelected(rightAlignCommand, true);
                                        break;
                                    case StyleConstants.ALIGN_CENTER:
                                        alignmentToggleGroupModel.setSelected(centerAlignCommand, true);
                                        break;
                                    case StyleConstants.ALIGN_JUSTIFIED:
                                        alignmentToggleGroupModel.setSelected(justifyAlignCommand, true);
                                        break;
                                }

                                float lineSpacing = StyleConstants.getLineSpacing(
                                        doc.getParagraphElement(selectionStart).getAttributes());
                                if (lineSpacing == 0.0f) {
                                    lineSpacingToggleGroup.setSelected(singleLineSpacingCommand, true);
                                } else if (lineSpacing == 0.5f) {
                                    lineSpacingToggleGroup.setSelected(oneAndHalfLineSpacingCommand, true);
                                } else if (lineSpacing == 1.0f) {
                                    lineSpacingToggleGroup.setSelected(doubleLineSpacingCommand, true);
                                } else {
                                    lineSpacingToggleGroup.clearSelection();
                                }
            } else {
                // TEXT IS SELECTED: Check every character in the selection

                // Start by assuming all characters in the selection share the same style
                boolean isConsistentlyBold = true;
                boolean isConsistentlyItalic = true;
                boolean isConsistentlyUnderline = true;
                boolean isConsistentlyStrikethrough = true;
                boolean isConsistentlySuperscript = true;
                boolean isConsistentlySubscript = true;

                AttributeSet firstAttrs = doc.getCharacterElement(selectionStart).getAttributes();
                int firstSize = StyleConstants.getFontSize(firstAttrs);
                boolean isConsistentlySized = true;

                String firstFamily = StyleConstants.getFontFamily(firstAttrs);
                boolean isConsistentlyFontFamily = true;

                for (int i = selectionStart; i < selectionEnd; i++) {
                    AttributeSet attrs = doc.getCharacterElement(i).getAttributes();

                    if (!StyleConstants.isBold(attrs)) isConsistentlyBold = false;
                    if (!StyleConstants.isItalic(attrs)) isConsistentlyItalic = false;
                    if (!StyleConstants.isUnderline(attrs)) isConsistentlyUnderline = false;
                    if (!StyleConstants.isStrikeThrough(attrs)) isConsistentlyStrikethrough = false;
                    if (!StyleConstants.isSuperscript(attrs)) isConsistentlySuperscript = false;
                    if (!StyleConstants.isSubscript(attrs)) isConsistentlySubscript = false;
                    if (StyleConstants.getFontSize(attrs) != firstSize) isConsistentlySized = false;
                    if (!Objects.equals(StyleConstants.getFontFamily(attrs), firstFamily))
                        isConsistentlyFontFamily = false;

                    // Optimization: stop early if all are already false
                    if (!isConsistentlyBold && !isConsistentlyItalic && !isConsistentlyUnderline &&
                        !isConsistentlyStrikethrough && !isConsistentlySuperscript && !isConsistentlySubscript &&
                        !isConsistentlySized && !isConsistentlyFontFamily) {
                        break;
                    }
                }
                newBold = isConsistentlyBold;
                newItalic = isConsistentlyItalic;
                newUnderline = isConsistentlyUnderline;
                newStrikethrough = isConsistentlyStrikethrough;
                newSuperscript = isConsistentlySuperscript;
                newSubscript = isConsistentlySubscript;

                newFontSize = isConsistentlySized ? String.valueOf(firstSize) : null;
                newFontFamily = isConsistentlyFontFamily ? firstFamily : null;
            }

            // Apply the results to the UI controls on the EDT
            final boolean finalNewBold = newBold;
            final boolean finalNewItalic = newItalic;
            final boolean finalNewUnderline = newUnderline;
            final boolean finalNewStrikethrough = newStrikethrough;
            final boolean finalNewSuperscript = newSuperscript;
            final boolean finalNewSubscript = newSubscript;
            final String finalNewFontSize = newFontSize;
            final boolean textIsSelected = selectionStart != selectionEnd;
            final String finalNewFontFamily = newFontFamily;

            SwingUtilities.invokeLater(() -> {
                isUpdatingFontSizeUI = true;
                try {
                boldCommand.setToggleSelected(finalNewBold);
                italicCommand.setToggleSelected(finalNewItalic);
                underlineCommand.setToggleSelected(finalNewUnderline);
                strikethroughCommand.setToggleSelected(finalNewStrikethrough);
                superscriptCommand.setToggleSelected(finalNewSuperscript);
                subscriptCommand.setToggleSelected(finalNewSubscript);
                changeCaseCommand.setActionEnabled(textIsSelected);

                if (!Objects.equals(fontSizeModel.getSelectedItem(), finalNewFontSize)) {
                    fontSizeModel.setSelectedItem(finalNewFontSize);
                }
                if (!Objects.equals(fontBoxContentModel.getSelectedItem(), finalNewFontFamily)) {
                    fontBoxContentModel.setSelectedItem(finalNewFontFamily);
                }
                } finally {
                    isUpdatingFontSizeUI = false;
                }
            });
        });

        // --- Fixed Backspace Merge ---
        page.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && page.getCaretPosition() == 0) {
                    int currentIndex = pages.indexOf(page);
                    if (currentIndex > 0) {
                        JTextPane prevPage = pages.get(currentIndex - 1);
                        StyledDocument prevDoc = prevPage.getStyledDocument();
                        StyledDocument thisDoc = page.getStyledDocument();
                        Position caretAnchor = null;

                        try {
                            isBackspaceMergeInProgress = true;
                            bulkEditDepth++;

                            int prevLenBefore = prevDoc.getLength();
                            int caretTarget = Math.max(0, prevLenBefore - 1);
                            if (prevLenBefore > 0)
                                prevDoc.remove(prevLenBefore - 1, 1);
                            caretAnchor = prevDoc.createPosition(caretTarget);

                            int moveLen = thisDoc.getLength();
                            if (moveLen > 0) {
                                List<StyledTextSegment> runs = new ArrayList<>();
                                int pos = 0;
                                while (pos < moveLen) {
                                    Element el = thisDoc.getCharacterElement(pos);
                                    int runEnd = Math.min(el.getEndOffset(), moveLen);
                                    String txt = thisDoc.getText(pos, runEnd - pos);
                                    runs.add(new StyledTextSegment(txt, el.getAttributes()));
                                    pos = runEnd;
                                }

                                int insertPos = caretAnchor.getOffset(); // <-- FIXED
                                for (StyledTextSegment seg : runs) {
                                    prevDoc.insertString(insertPos, seg.text, seg.attrs);
                                    insertPos += seg.text.length();
                                }

                                thisDoc.remove(0, moveLen);
                            }

                        } catch (BadLocationException ex) {
                            ex.printStackTrace();
                        } finally {
                            bulkEditDepth--;
                        }

                        checkPageOverflow(prevPage);

                        final Position finalCaretAnchor = caretAnchor;
                        SwingUtilities.invokeLater(() -> {
                            try {
                                prevPage.requestFocusInWindow();
                                if (finalCaretAnchor != null)
                                    prevPage.setCaretPosition(
                                            Math.min(finalCaretAnchor.getOffset(), prevPage.getDocument().getLength()));
                            } finally {
                                isBackspaceMergeInProgress = false;
                            }
                        });

                        e.consume();
                    }
                }
            }
        });

        // Override default Ctrl+A behavior to select text across all pages
        Action globalSelectAllAction = new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                selectAllText();
            }
        };
        page.getInputMap().put(KeyStroke.getKeyStroke("control A"), "selectAllAcrossPages");
        page.getActionMap().put("selectAllAcrossPages", globalSelectAllAction);
        return page;
    }

    private static void selectAllText() {
        if (pages.isEmpty()) {
            return;
        }
        JTextPane focusedPage = getFocusedPage();
        if (focusedPage != null) {
            focusedPage.selectAll();
            focusedPage.requestFocusInWindow();
        }
    }
    private static class StyledTextSegment {
        String text;
        AttributeSet attrs;

        StyledTextSegment(String text, AttributeSet attrs) {
            this.text = text;
            this.attrs = attrs;
        }
    }

    private static void saveToDocx(String filePath) {
        try (XWPFDocument docx = new XWPFDocument()) {
            for (int pageIndex = 0; pageIndex < pages.size(); pageIndex++) {
                JTextPane page = pages.get(pageIndex);
                StyledDocument sdoc = page.getStyledDocument();
                Element root = sdoc.getDefaultRootElement();

                for (int i = 0; i < root.getElementCount(); i++) {
                    Element paraElement = root.getElement(i);
                    XWPFParagraph docxParagraph = docx.createParagraph();

                    AttributeSet paraAttrs = paraElement.getAttributes();

                    // Handle paragraph spacing to avoid default spacing in Word/WPS.
                    // JTextPane uses points for space above/below. POI uses twips (20 twips/point).
                    docxParagraph.setSpacingBefore((int) (StyleConstants.getSpaceAbove(paraAttrs) * 20));
                    docxParagraph.setSpacingAfter((int) (StyleConstants.getSpaceBelow(paraAttrs) * 20));

                    // JTextPane's line spacing is a multiplier. A value of 0 means default (single).
                    // POI's setSpacingBetween(double) takes a multiplier.
                    float lineSpacing = StyleConstants.getLineSpacing(paraAttrs);
                    if (lineSpacing > 0) {
                        docxParagraph.setSpacingBetween(lineSpacing);
                    }


                    int alignment = StyleConstants.getAlignment(paraAttrs);
                    switch (alignment) {
                        case StyleConstants.ALIGN_CENTER:
                            docxParagraph.setAlignment(ParagraphAlignment.CENTER);
                            break;
                        case StyleConstants.ALIGN_RIGHT:
                            docxParagraph.setAlignment(ParagraphAlignment.RIGHT);
                            break;
                        case StyleConstants.ALIGN_JUSTIFIED:
                            docxParagraph.setAlignment(ParagraphAlignment.BOTH);
                            break;
                        default:
                            docxParagraph.setAlignment(ParagraphAlignment.LEFT);
                            break;
                    }

                    for (int j = 0; j < paraElement.getElementCount(); j++) {
                        Element runElement = paraElement.getElement(j);
                        AttributeSet attrs = runElement.getAttributes();
                        String text = sdoc.getText(runElement.getStartOffset(), runElement.getEndOffset() - runElement.getStartOffset());

                        // The last character of a paragraph element in a JTextPane is a newline.
                        // We don't want to write this newline, because when we load the document,
                        // we add a newline for each paragraph. This prevents creating extra blank lines.
                        if (j == paraElement.getElementCount() - 1 && text.endsWith("\n")) {
                            text = text.substring(0, text.length() - 1);
                        }

                        if (text.isEmpty()) {
                            continue;
                        }

                        XWPFRun docxRun = docxParagraph.createRun();
                        docxRun.setText(text);

                        if (StyleConstants.isBold(attrs)) docxRun.setBold(true);
                        if (StyleConstants.isItalic(attrs)) docxRun.setItalic(true);
                        if (StyleConstants.isUnderline(attrs)) docxRun.setUnderline(UnderlinePatterns.SINGLE);
                        if (StyleConstants.isStrikeThrough(attrs)) docxRun.setStrikeThrough(true);
                        if (StyleConstants.isSubscript(attrs)) docxRun.setSubscript(org.apache.poi.xwpf.usermodel.VerticalAlign.SUBSCRIPT);
                        if (StyleConstants.isSuperscript(attrs)) docxRun.setSubscript(org.apache.poi.xwpf.usermodel.VerticalAlign.SUPERSCRIPT);

                        String fontFamily = StyleConstants.getFontFamily(attrs);
                        if (fontFamily != null) {
                            docxRun.setFontFamily(fontFamily);
                        }
                        docxRun.setFontSize(StyleConstants.getFontSize(attrs));
                        Color fg = StyleConstants.getForeground(attrs);
                        if (fg != null) {
                            docxRun.setColor(String.format("%02X%02X%02X", fg.getRed(), fg.getGreen(), fg.getBlue()));
                        }
                    }
                }

                if (pageIndex < pages.size() - 1) {
                    docx.createParagraph().createRun().addBreak(org.apache.poi.xwpf.usermodel.BreakType.PAGE);
                }
            }

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                docx.write(out);
                statusLabel.setText(bundle.getString("status.saved") + " " + filePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
            statusLabel.setText(bundle.getString("status.errorSaving") + e.getMessage());
        }
    }

    private static boolean saveAs(Component parent) {
        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle(bundle.getString("dialog.saveAs.title"));
    fileChooser.setFileFilter(new FileNameExtensionFilter(bundle.getString("dialog.saveAs.filter"), "docx"));

        int userSelection = fileChooser.showSaveDialog(parent);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".docx")) {
                filePath += ".docx";
            }
            saveToDocx(filePath);
            return true;
        }
        return false;
    }

    private static void loadFromDocx(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             XWPFDocument document = new XWPFDocument(fis)) {

            // 1. Clear existing content
            pages.clear();
            pagesPanel.removeAll();
            lastFocusedPage = null;

            // 2. Create the first new page
            JTextPane firstPage = addNewPageAfter(null);
            StyledDocument sdoc = firstPage.getStyledDocument();
            
            // Remove any default content to start fresh
            if (sdoc.getLength() > 0) {
                sdoc.remove(0, sdoc.getLength());
            }

            bulkEditDepth++;
            try {
                // 3. Iterate through paragraphs and runs, appending to the single document
                for (IBodyElement bodyElement : document.getBodyElements()) {
                    if (bodyElement instanceof XWPFParagraph) {
                        XWPFParagraph p = (XWPFParagraph) bodyElement;
                        int paraStartOffset = sdoc.getLength();

                        for (XWPFRun r : p.getRuns()) {
                            String text = r.getText(0);
                            if (text == null) continue;

                            SimpleAttributeSet runAttrs = new SimpleAttributeSet();
                            if (r.isBold()) StyleConstants.setBold(runAttrs, true);
                            if (r.isItalic()) StyleConstants.setItalic(runAttrs, true);
                            if (r.getUnderline() != UnderlinePatterns.NONE) StyleConstants.setUnderline(runAttrs, true);
                            if (r.isStrikeThrough()) StyleConstants.setStrikeThrough(runAttrs, true);
                            // if (r.getVerticalAlignment() == org.apache.poi.xwpf.usermodel.VerticalAlign.SUBSCRIPT) StyleConstants.setSubscript(runAttrs, true);
                            // if (r.getVerticalAlignment() == org.apache.poi.xwpf.usermodel.VerticalAlign.SUPERSCRIPT) StyleConstants.setSuperscript(runAttrs, true);

                            
                            if (r.getFontFamily() != null) {
                                StyleConstants.setFontFamily(runAttrs, r.getFontFamily());
                            }
                            if (r.getFontSize() > 0) {
                                StyleConstants.setFontSize(runAttrs, r.getFontSize());
                            }
                            if (r.getColor() != null) {
                                try {
                                    StyleConstants.setForeground(runAttrs, Color.decode("#" + r.getColor()));
                                } catch (NumberFormatException nfe) {
                                    // Ignore color if format is invalid
                                }
                            }

                            sdoc.insertString(sdoc.getLength(), text, runAttrs);
                        }

                        // Add a newline for the paragraph break
                        sdoc.insertString(sdoc.getLength(), "\n", null);

                        // Apply paragraph attributes
                        SimpleAttributeSet paraAttrs = new SimpleAttributeSet();
                        ParagraphAlignment alignment;
                        try {
                            alignment = p.getAlignment();
                        } catch (Exception e1) {
                            // Default to LEFT alignment if the value from the document is invalid (e.g., "start" from LibreOffice)
                            alignment = ParagraphAlignment.LEFT;
                        }
                        switch (alignment) {
                            case CENTER: StyleConstants.setAlignment(paraAttrs, StyleConstants.ALIGN_CENTER); break;
                            case RIGHT: StyleConstants.setAlignment(paraAttrs, StyleConstants.ALIGN_RIGHT); break;
                            case BOTH: StyleConstants.setAlignment(paraAttrs, StyleConstants.ALIGN_JUSTIFIED); break;
                            default: StyleConstants.setAlignment(paraAttrs, StyleConstants.ALIGN_LEFT); break;
                        }

                        // Handle paragraph spacing. POI uses twips (20 per point).
                        int spacingBefore = p.getSpacingBefore();
                        if (spacingBefore != -1) {
                            StyleConstants.setSpaceAbove(paraAttrs, spacingBefore / 20.0f);
                        }
                        int spacingAfter = p.getSpacingAfter();
                        if (spacingAfter != -1) {
                            StyleConstants.setSpaceBelow(paraAttrs, spacingAfter / 20.0f);
                        }
                        
                        // Handle line spacing (multiplier).
                        double lineSpacing = p.getSpacingBetween();
                        if (lineSpacing > 0) {
                            StyleConstants.setLineSpacing(paraAttrs, (float) lineSpacing);
                        }

                        sdoc.setParagraphAttributes(paraStartOffset, sdoc.getLength() - paraStartOffset, paraAttrs, false);
                    }
                }
            } finally {
                bulkEditDepth--;
            }

            // 4. Manually trigger overflow check to paginate the loaded content
            SwingUtilities.invokeLater(() -> {
                checkPageOverflow(pages.get(0));
                updateStatus();
                pages.get(0).requestFocusInWindow();
                scrollPane.getVerticalScrollBar().setValue(0); // Scroll to top
                statusLabel.setText(bundle.getString("status.opened") + " " + filePath);
                pagesPanel.revalidate();
                pagesPanel.repaint();
            });

        } catch (Exception e) {
            e.printStackTrace();
            statusLabel.setText(bundle.getString("status.errorOpening") + e.getMessage());
        }
    }

    private static class DocumentPrintable implements Printable {
        private List<JTextPane> pagesToPrint;

        public DocumentPrintable(List<JTextPane> pages) {
            this.pagesToPrint = new ArrayList<>(pages); // Create a copy to avoid concurrency issues
        }

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex >= pagesToPrint.size()) {
                return NO_SUCH_PAGE;
            }

            JTextPane page = pagesToPrint.get(pageIndex);
            Graphics2D g2d = (Graphics2D) graphics;

            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            Dimension pageSize = page.getSize();
            double printableWidth = pageFormat.getImageableWidth();
            double printableHeight = pageFormat.getImageableHeight();

            double scaleX = printableWidth / pageSize.width;
            double scaleY = printableHeight / pageSize.height;
            double scale = Math.min(scaleX, scaleY);

            if (scale < 1.0) {
                g2d.scale(scale, scale);
            }

            boolean wasDoubleBuffered = page.isDoubleBuffered();
            page.setDoubleBuffered(false);
            page.print(g2d);
            page.setDoubleBuffered(wasDoubleBuffered);

            return PAGE_EXISTS;
        }
    }

    private static void onFocusedPage(Consumer<JTextPane> action) {
        JTextPane page = getFocusedPage();
        if (page != null) {
            action.accept(page);
        }
    }

    public static void comingSoonDialog(JRibbonFrame frame) {
        JOptionPane.showMessageDialog(frame,
                bundle.getString("dialog.comingsoon.message"),
                bundle.getString("dialog.comingsoon.title"),
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void setLineSpacing(float spacing) {
        JTextPane page = getFocusedPage();
        if (page != null) {
            StyledDocument doc = page.getStyledDocument();
            SimpleAttributeSet sas = new SimpleAttributeSet();
            StyleConstants.setLineSpacing(sas, spacing);
            doc.setParagraphAttributes(page.getSelectionStart(),
                    page.getSelectionEnd() - page.getSelectionStart(),
                sas, false);
        }      
    }

    private static void setParagraphAlignment(int alignment) {
        JTextPane page = getFocusedPage();
        if (page != null) {
            StyledDocument doc = page.getStyledDocument();
            SimpleAttributeSet sas = new SimpleAttributeSet();
            StyleConstants.setAlignment(sas, alignment);
            doc.setParagraphAttributes(page.getSelectionStart(),
                    page.getSelectionEnd() - page.getSelectionStart(),
                sas, false);
        }
    }

    public static boolean isTextSelected(){
        JTextPane page = getFocusedPage();
        if(page != null){
           // If there's a page, the result is true only if selection start and end are different.
           return page.getSelectionStart() != page.getSelectionEnd();
        }
        // If there's no page, there's no selection.
        return false;
    }
    /**
 * Applies text styles to the selected text or sets input attributes for new text.
 *
 * @param page         The JTextPane to operate on.
 * @param fontFamily   The font family to apply (null to ignore).
 * @param fontSize     The font size to apply (<=0 to ignore).
 * @param alignment    The paragraph alignment (StyleConstants.ALIGN_LEFT, etc., or -1 to ignore).
 * @param bold         Whether to apply bold (null to ignore).
 * @param italic       Whether to apply italic (null to ignore).
 * @param fontColor    The font color to apply (null to ignore).
 * @param spaceAbove   Space above paragraph (Float.NaN to ignore).
 * @param spaceBelow   Space below paragraph (Float.NaN to ignore).
 */
public static void applyTextStyle(
        JTextPane page,
        String fontFamily,
        int fontSize,
        int alignment,
        Boolean bold,
        Boolean italic,
        Color fontColor,
        float spaceAbove,
        float spaceBelow
) {
    page = getFocusedPage();

    if(page!=null){
    StyledDocument doc = page.getStyledDocument();
    int start = page.getSelectionStart();
    int end = page.getSelectionEnd();

    SimpleAttributeSet attr = new SimpleAttributeSet();

    if (fontFamily != null) StyleConstants.setFontFamily(attr, fontFamily);
    if (fontSize > 0) StyleConstants.setFontSize(attr, fontSize);
    if (bold != null) StyleConstants.setBold(attr, bold);
    if (italic != null) StyleConstants.setItalic(attr, italic);
    if (fontColor != null) StyleConstants.setForeground(attr, fontColor);

    // For paragraph attributes
    SimpleAttributeSet paraAttr = new SimpleAttributeSet();
    boolean hasParaAttr = false;
    if (alignment != -1) {
        StyleConstants.setAlignment(paraAttr, alignment);
        hasParaAttr = true;
    }
    if (!Float.isNaN(spaceAbove)) {
        StyleConstants.setSpaceAbove(paraAttr, spaceAbove);
        hasParaAttr = true;
    }
    if (!Float.isNaN(spaceBelow)) {
        StyleConstants.setSpaceBelow(paraAttr, spaceBelow);
        hasParaAttr = true;
    }

    if (start != end) {
        // Apply to selected text
        doc.setCharacterAttributes(start, end - start, attr, false);
        if (hasParaAttr) {
            int paraStart = doc.getParagraphElement(start).getStartOffset();
            int paraEnd = doc.getParagraphElement(end - 1).getEndOffset();
            doc.setParagraphAttributes(paraStart, paraEnd - paraStart, paraAttr, false);
        }
    } else {
        // No selection: set input attributes for new text
        MutableAttributeSet inputAttrs = page.getInputAttributes();
        inputAttrs.addAttributes(attr);
        if (hasParaAttr) {
            // Apply paragraph attributes to current paragraph
            int caret = page.getCaretPosition();
            Element para = doc.getParagraphElement(caret);
            doc.setParagraphAttributes(para.getStartOffset(), para.getEndOffset() - para.getStartOffset(), paraAttr, false);
        }
    }}
}

/**
 * Displays a dialog to change the case of the selected text.
 *
 * @param parent The parent frame for the dialog.
 */
private static void showChangeCaseDialog(JRibbonFrame parent) {
    onFocusedPage(page -> {
        int start = page.getSelectionStart();
        int end = page.getSelectionEnd();

        // This should not happen since the button is disabled, but it's a good safeguard.
        if (start == end) {
            return;
        }

        // 1. Create the dialog and its main panel
    JDialog dialog = new JDialog(parent, bundle.getString("dialog.changeCase.title"), true);
        JPanel mainPanel = new JPanel(new BorderLayout(0, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));

        // 2. Create radio buttons for case options
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));

        JRadioButton upperRadio = new JRadioButton(bundle.getString("cmd.changeCase.uppercase"));
        JRadioButton lowerRadio = new JRadioButton(bundle.getString("cmd.changeCase.lowercase"));
        JRadioButton sentenceRadio = new JRadioButton(bundle.getString("cmd.changeCase.sentenceCase"));
        sentenceRadio.setSelected(true); // Default selection

        ButtonGroup group = new ButtonGroup();
        group.add(sentenceRadio);
        group.add(lowerRadio);
        group.add(upperRadio);

        radioPanel.add(sentenceRadio);
        radioPanel.add(Box.createVerticalStrut(5));
        radioPanel.add(lowerRadio);
        radioPanel.add(Box.createVerticalStrut(5));
        radioPanel.add(upperRadio);

        // 3. Create OK and Cancel buttons
    JButton okButton = new JButton(bundle.getString("dialog.ok"));
    JButton cancelButton = new JButton(bundle.getString("dialog.cancel"));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        // 4. Define button actions
        okButton.addActionListener(e -> {
            try {
                StyledDocument doc = page.getStyledDocument();
                String selectedText = doc.getText(start, end - start);
                String newText;

                if (upperRadio.isSelected()) {
                    newText = selectedText.toUpperCase();
                } else if (lowerRadio.isSelected()) {
                    newText = selectedText.toLowerCase();
                } else { // Sentence case
                    if (selectedText.isEmpty()) {
                        newText = "";
                    } else {
                        String lower = selectedText.toLowerCase();
                        newText = Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
                    }
                }

                // Replace the text in the document
                doc.remove(start, end - start);
                doc.insertString(start, newText, page.getCharacterAttributes());

            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
            dialog.dispose();
        });

        cancelButton.addActionListener(e -> dialog.dispose());

        // 5. Assemble and show the dialog
        mainPanel.add(radioPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        dialog.add(mainPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    });
}

/**
 * Displays a dialog that allows the user to jump to a specific page number.
 *
 * @param parent The parent frame for the dialog.
 */
private static void showGoToDialog(JRibbonFrame parent) {
    String input = JOptionPane.showInputDialog(
            parent,
            bundle.getString("cmd.goto.dialog.label"),
            bundle.getString("cmd.goto.dialog.title"),
            JOptionPane.PLAIN_MESSAGE
    );

    if (input == null || input.trim().isEmpty()) {
        return; // User cancelled or entered nothing
    }

    try {
        int pageNumber = Integer.parseInt(input.trim());
        if (pageNumber >= 1 && pageNumber <= pages.size()) {
            JTextPane targetPage = pages.get(pageNumber - 1); // List is 0-indexed
            // Use selectAndShow to focus, scroll, and place the caret at the beginning
            selectAndShow(targetPage, 0, 0);
        } else {
            String message = java.text.MessageFormat.format(bundle.getString("cmd.goto.dialog.error.outOfRange"), pages.size());
            JOptionPane.showMessageDialog(parent, message, bundle.getString("cmd.goto.dialog.title"), JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(parent, bundle.getString("cmd.goto.dialog.error.invalidInput"),
                bundle.getString("cmd.goto.dialog.title"), JOptionPane.ERROR_MESSAGE);
    }
}

/**
 * Dialog instance for the Find functionality.
 */
private static JDialog findDialog; // Remains shared
/**
 * Dialog instance for the Find and Replace functionality.
 */
private static JDialog replaceDialog; // Remains shared

// --- Find Dialog Components ---
/**
 * Text field for entering the search term in the Find dialog.
 */
private static JTextField findDialogTextField;
/**
 * Checkbox to toggle case sensitivity in the Find dialog.
 */
private static JCheckBox findDialogMatchCaseCheckBox;

// --- Replace Dialog Components ---
/**
 * Text field for entering the replacement text.
 */
private static JTextField replaceDialogFindTextField;
private static JTextField replaceDialogReplaceTextField;
private static JCheckBox replaceDialogMatchCaseCheckBox;
/**
 * Button to find the next occurrence of the search term.
 */
private static JButton findNextButton;
/** 
 * Button to replace the current selection and find the next one.
 */
private static JButton replaceButton;
/**
 * Button to replace all occurrences in the document.
 */
private static JButton replaceAllButton;
/**
 * Button to find the previous occurrence of the search term.
 */
private static JButton findPreviousButton;

/**
 * Displays the Find dialog, allowing users to search for text within the document.
 * The dialog is non-modal, allowing interaction with the main document while open.
 *
 * @param parent The parent frame for the dialog.
 */
private static void showFindDialog(JRibbonFrame parent) {
    // Initialize the find-only dialog only once
    if (findDialog == null) {
        findDialog = new JDialog(parent, bundle.getString("cmd.find"), false); // Non-modal
        findDialog.setResizable(false);
        JPanel contentPanel = new JPanel(new BorderLayout(10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // --- Search input panel ---
        JPanel searchPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        searchPanel.add(new JLabel(bundle.getString("cmd.find.dialog.findWhat")), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        findDialogTextField = new JTextField(20);
        searchPanel.add(findDialogTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        findDialogMatchCaseCheckBox = new JCheckBox(bundle.getString("cmd.find.dialog.matchCase"));
        searchPanel.add(findDialogMatchCaseCheckBox, gbc);

        contentPanel.add(searchPanel, BorderLayout.CENTER);

        // --- Button panel ---
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton findNextButton = new JButton(bundle.getString("cmd.find.dialog.findNext"));
        JButton findPreviousButton = new JButton(bundle.getString("cmd.find.dialog.findPrevious"));
        JButton closeButton = new JButton(bundle.getString("cmd.find.dialog.close"));

        buttonPanel.add(findNextButton);
        buttonPanel.add(findPreviousButton);
        buttonPanel.add(closeButton);

        contentPanel.add(buttonPanel, BorderLayout.SOUTH);
        findDialog.setContentPane(contentPanel);
        findDialog.pack();
        findDialog.setLocationRelativeTo(parent);

        // --- Action Listeners ---
        findNextButton.addActionListener(e -> findText(true, findDialogTextField, findDialogMatchCaseCheckBox));
        findPreviousButton.addActionListener(e -> findText(false, findDialogTextField, findDialogMatchCaseCheckBox));
        closeButton.addActionListener(e -> {
            findDialog.setVisible(false);
            clearHighlighting();
        });

        // Add a DocumentListener to the shared text field
        findDialogTextField.getDocument().addDocumentListener(createFindDocumentListener(findDialogTextField, findNextButton, findPreviousButton, null, null));
        findDialog.addWindowListener(createDialogWindowListener()); // Reusable

        // Initial state of buttons
    }

    // When the dialog is shown, reset the search starting position
    onFocusedPage(page -> page.setSelectionStart(page.getSelectionEnd()));
    findDialog.setVisible(true);
}

/**
 * Displays the Find and Replace dialog.
 *
 * @param parent The parent frame for the dialog.
 */
private static void showReplaceDialog(JRibbonFrame parent) {
    // Initialize the replace dialog only once
    if (replaceDialog == null) {
        replaceDialog = new JDialog(parent, bundle.getString("cmd.replace"), false); // Non-modal
        replaceDialog.setResizable(false);
        JPanel contentPanel = new JPanel(new BorderLayout(10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Search input panel
        JPanel searchPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        searchPanel.add(new JLabel(bundle.getString("cmd.find.dialog.findWhat")), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        replaceDialogFindTextField = new JTextField(20);
        searchPanel.add(replaceDialogFindTextField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        searchPanel.add(new JLabel(bundle.getString("cmd.find.dialog.replaceWith")), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        replaceDialogReplaceTextField = new JTextField(20);
        searchPanel.add(replaceDialogReplaceTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        replaceDialogMatchCaseCheckBox = new JCheckBox(bundle.getString("cmd.find.dialog.matchCase"));
        searchPanel.add(replaceDialogMatchCaseCheckBox, gbc);

        contentPanel.add(searchPanel, BorderLayout.CENTER);

        // --- Button panel ---
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        findNextButton = new JButton(bundle.getString("cmd.find.dialog.findNext"));
        findPreviousButton = new JButton(bundle.getString("cmd.find.dialog.findPrevious"));
        replaceButton = new JButton(bundle.getString("cmd.find.dialog.replace"));
        replaceAllButton = new JButton(bundle.getString("cmd.find.dialog.replaceAll"));
        JButton closeButton = new JButton(bundle.getString("cmd.find.dialog.close"));

        buttonPanel.add(findNextButton);
        buttonPanel.add(findPreviousButton);
        buttonPanel.add(replaceButton);
        buttonPanel.add(replaceAllButton);
        buttonPanel.add(closeButton);

        contentPanel.add(buttonPanel, BorderLayout.SOUTH);
        replaceDialog.setContentPane(contentPanel);
        replaceDialog.pack();
        replaceDialog.setLocationRelativeTo(parent);

        // --- Action Listeners ---
        findNextButton.addActionListener(e -> findText(true, replaceDialogFindTextField, replaceDialogMatchCaseCheckBox));
        findPreviousButton.addActionListener(e -> findText(false, replaceDialogFindTextField, replaceDialogMatchCaseCheckBox));
        replaceButton.addActionListener(e -> replaceText());
        replaceAllButton.addActionListener(e -> replaceAllText());
        closeButton.addActionListener(e -> {
            replaceDialog.setVisible(false);
            clearHighlighting(); // Clear highlighting when dialog closes
        });

        // Add a DocumentListener to the text field to enable/disable buttons
        replaceDialogFindTextField.getDocument().addDocumentListener(createFindDocumentListener(replaceDialogFindTextField, findNextButton, findPreviousButton, replaceButton, replaceAllButton));
        replaceDialog.addWindowListener(createDialogWindowListener());

        // Initial state of buttons
    }

    // When the dialog is shown, reset the search starting position
    onFocusedPage(page -> {
        // Start search from the end of the current selection (or caret position if no selection)
        // This ensures that "Find Next" starts searching *after* the current selection.
        page.setSelectionStart(page.getSelectionEnd());
    });

    replaceDialog.setVisible(true);
}

/**
 * Creates a reusable DocumentListener for the find text field.
 */
private static javax.swing.event.DocumentListener createFindDocumentListener(JTextField findField, JButton findNext, JButton findPrev, JButton replace, JButton replaceAll) {
    Runnable updater = () -> {
        boolean enable = !findField.getText().isEmpty();
        findNext.setEnabled(enable);
        findPrev.setEnabled(enable);
        if (replace != null) replace.setEnabled(enable);
        if (replaceAll != null) replaceAll.setEnabled(enable);
    };

    // Set initial state
    updater.run();

    return new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) { updater.run(); }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) { updater.run(); }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) { updater.run(); }
    };
}

/**
 * Creates a reusable WindowListener for the find/replace dialogs.
 */
private static java.awt.event.WindowListener createDialogWindowListener() {
    return new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            clearHighlighting();
        }
    };
}

/**
 * Updates the enabled state of the "Find Next" and "Find Previous" buttons
 * based on whether the search text field is empty.
 */
private static void updateFindButtons() {
    // This method is no longer needed as its logic is handled by the DocumentListener.
}

/**
 * Performs the text search operation within the currently focused JTextPane.
 *
 * @param forward True to search forward, false to search backward.
 * @param findField The text field containing the search term.
 * @param matchCaseCheck The checkbox for case sensitivity.
 */
private static void findText(boolean forward, JTextField findField, JCheckBox matchCaseCheck) {
        String searchText = findField.getText();
        if (searchText.isEmpty() || pages.isEmpty()) {
            return;
        }

        JTextPane startPage = getFocusedPage();
        int startPageIndex = pages.indexOf(startPage);
        int startPos = forward ? startPage.getSelectionEnd() : startPage.getSelectionStart();

        // --- Phase 1: Search from current position to the end/beginning of the document ---
        if (forward) {
            for (int i = startPageIndex; i < pages.size(); i++) {
                JTextPane currentPage = pages.get(i);
                int searchFrom = (i == startPageIndex) ? startPos : 0;
                int foundPos = findInPage(currentPage, searchText, searchFrom, true, matchCaseCheck.isSelected());
                if (foundPos != -1) {
                    selectAndShow(currentPage, foundPos, searchText.length());
                    return;
                }
            }
        } else { // Backward
            for (int i = startPageIndex; i >= 0; i--) {
                JTextPane currentPage = pages.get(i);
                int searchFrom = (i == startPageIndex) ? startPos : -1; // -1 means search from end
                int foundPos = findInPage(currentPage, searchText, searchFrom, false, matchCaseCheck.isSelected());
                if (foundPos != -1) {
                    selectAndShow(currentPage, foundPos, searchText.length());
                    return;
                }
            }
        }

        // --- Phase 2: Nothing found yet, ask user to wrap around ---
        String wrapMessage = forward ? bundle.getString("cmd.find.dialog.wrapAroundStart")
                                     : bundle.getString("cmd.find.dialog.wrapAroundEnd");

        int result = JOptionPane.showConfirmDialog(findDialog != null && findDialog.isVisible() ? findDialog : replaceDialog, wrapMessage, bundle.getString("cmd.find"),
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.NO_OPTION) {
            return; // User chose not to continue
        }

        // --- Phase 3: User agreed, search from the other end of the document ---
        if (forward) {
            for (int i = 0; i < startPageIndex; i++) {
                JTextPane currentPage = pages.get(i);
                int foundPos = findInPage(currentPage, searchText, 0, true, matchCaseCheck.isSelected());
                if (foundPos != -1) {
                    selectAndShow(currentPage, foundPos, searchText.length());
                    return;
                }
            }
            // Also search the starting page from its beginning up to the original caret position
            int foundInStartPage = findInPage(startPage, searchText, 0, true, startPos, matchCaseCheck.isSelected());
            if (foundInStartPage != -1) {
                selectAndShow(startPage, foundInStartPage, searchText.length());
                return;
            }
        } else { // Backward
            for (int i = pages.size() - 1; i > startPageIndex; i--) {
                JTextPane currentPage = pages.get(i);
                int foundPos = findInPage(currentPage, searchText, -1, false, matchCaseCheck.isSelected());
                if (foundPos != -1) {
                    selectAndShow(currentPage, foundPos, searchText.length());
                    return;
                }
            }
            // Also search the starting page from its end down to the original caret position
            int foundInStartPage = findInPage(startPage, searchText, -1, false, startPos, matchCaseCheck.isSelected());
            if (foundInStartPage != -1) {
                selectAndShow(startPage, foundInStartPage, searchText.length());
                return;
            }
        }

        // If we reach here, no occurrences were found anywhere.
        String message = java.text.MessageFormat.format(bundle.getString("cmd.find.dialog.noMoreOccurrences"), findField.getText());
        JOptionPane.showMessageDialog(findDialog != null && findDialog.isVisible() ? findDialog : replaceDialog, message, bundle.getString("cmd.find"), JOptionPane.INFORMATION_MESSAGE);
        clearHighlighting();
    }

private static void replaceText() {
    onFocusedPage(page -> {
        String findText = replaceDialogFindTextField.getText();
        String selectedText = page.getSelectedText();

        if (selectedText == null || findText.isEmpty()) {
            // If nothing is selected, just find the next occurrence
            findText(true, replaceDialogFindTextField, replaceDialogMatchCaseCheckBox);
            return;
        }

        // Check if the current selection matches the find text
        boolean matchCase = replaceDialogMatchCaseCheckBox.isSelected();
        boolean selectionMatches = matchCase ? selectedText.equals(findText) : selectedText.equalsIgnoreCase(findText);

        if (selectionMatches) {
            try {
                String replaceWith = replaceDialogReplaceTextField.getText();
                int start = page.getSelectionStart();
                StyledDocument doc = page.getStyledDocument();
                AttributeSet attrs = doc.getCharacterElement(start).getAttributes();
                
                // Replace the selection
                page.replaceSelection(replaceWith);
                
                // Re-apply attributes to the new text
                doc.setCharacterAttributes(start, replaceWith.length(), attrs, true);

                // Find the next occurrence
                findText(true, replaceDialogFindTextField, replaceDialogMatchCaseCheckBox);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            // The selection doesn't match, so just find the next one
            findText(true, replaceDialogFindTextField, replaceDialogMatchCaseCheckBox);
        }
    });
}

private static void replaceAllText() {
    String findText = replaceDialogFindTextField.getText();
    String replaceWith = replaceDialogReplaceTextField.getText();
    if (findText.isEmpty()) {
        return;
    }

    int replacementCount = 0;
    // Start search from the very beginning of the document
    if (!pages.isEmpty()) {
        pages.get(0).setCaretPosition(0);
    }

    // Loop through all pages and replace all occurrences
    for (JTextPane page : pages) {
        StyledDocument doc = page.getStyledDocument();
        int pos = 0;
        while (pos != -1) {
            pos = findInPage(page, findText, pos, true, replaceDialogMatchCaseCheckBox.isSelected());
            if (pos != -1) {
                try {
                    AttributeSet attrs = doc.getCharacterElement(pos).getAttributes();
                    doc.remove(pos, findText.length());
                    doc.insertString(pos, replaceWith, attrs);
                    replacementCount++;
                    pos += replaceWith.length(); // Move past the replaced text
                } catch (BadLocationException e) {
                    e.printStackTrace();
                    break; // Stop on error
                }
            }
        }
    }

    String message = java.text.MessageFormat.format(bundle.getString("cmd.find.dialog.replaceAllCount"), replacementCount);
    JOptionPane.showMessageDialog(replaceDialog, message, bundle.getString("cmd.find.dialog.replaceAll"), JOptionPane.INFORMATION_MESSAGE);
    clearHighlighting();
}


/**
 * Helper method to find text within a single JTextPane.
 *
 * @param page       The page to search in.
 * @param searchText The text to find.
 * @param fromIndex  The index to start searching from.
 * @param forward    True to search forward, false for backward.
 * @param limit      The boundary for the search (exclusive for forward, inclusive for backward).
 * @param matchCase  True if the search should be case-sensitive.
 * @return The position of the found text, or -1 if not found.
 */
private static int findInPage(JTextPane page, String searchText, int fromIndex, boolean forward, int limit, boolean matchCase) {
    try {
        String pageText = page.getDocument().getText(0, page.getDocument().getLength());
        if (!matchCase) {
            pageText = pageText.toLowerCase();
            searchText = searchText.toLowerCase();
        }

        if (forward) {
            int pos = pageText.indexOf(searchText, fromIndex);
            return (pos != -1 && pos < limit) ? pos : -1;
        } else { // backward
            int searchFrom = (fromIndex == -1) ? pageText.length() : fromIndex;
            int pos = pageText.lastIndexOf(searchText, searchFrom - 1);
            return (pos != -1 && pos >= limit) ? pos : -1;
        }
    } catch (BadLocationException e) {
        e.printStackTrace();
        return -1;
    }
}

/**
 * Overloaded helper method to find text within a single JTextPane without a limit.
 */
private static int findInPage(JTextPane page, String searchText, int fromIndex, boolean forward, boolean matchCase) {
    return findInPage(page, searchText, fromIndex, forward, forward ? Integer.MAX_VALUE : 0, matchCase);
}

/**
 * Selects the found text on the correct page and makes it visible.
 *
 * @param page     The page where the text was found.
 * @param position The starting position of the found text.
 * @param length   The length of the found text.
 */
private static void selectAndShow(JTextPane page, int position, int length) {
    // Clear selection on all other pages to ensure only the current match is highlighted.
    for (JTextPane otherPage : pages) {
        if (otherPage != page) {
            // Collapse the selection to its end point, effectively clearing it.
            otherPage.setSelectionStart(otherPage.getSelectionEnd());
        }
    }

    // If the found page is not the currently focused one, bring it to focus.
    if (page != lastFocusedPage) {
        lastFocusedPage = page;
        page.requestFocusInWindow();
    }

    // Select the found text.
    page.setSelectionStart(position);
    page.setSelectionEnd(position + length);
    page.getCaret().setSelectionVisible(true);

    // Scroll the main scroll pane to make the found page and text visible.
    try {
        Rectangle rect = page.modelToView(position);
        if (rect != null) {
            // The page is inside a wrapper panel, which is inside the pagesPanel.
            // We need to convert the rectangle's coordinates relative to the scroll pane's viewport.
            Container wrapper = page.getParent();
            Rectangle viewRect = SwingUtilities.convertRectangle(wrapper, rect, scrollPane.getViewport());
            scrollPane.getViewport().scrollRectToVisible(viewRect);
        }
    } catch (BadLocationException ex) {
        ex.printStackTrace();
    }

    // Update the status bar to reflect the current page.
    updateStatus();
}

/**
 * Clears any active text selection in the currently focused JTextPane.
 */
private static void clearHighlighting() {
    onFocusedPage(page -> {
        // Collapse selection to the caret position
        page.setSelectionStart(page.getSelectionEnd());
    });
}

/**
 * Sets the cursor for all pages to indicate if the Format Painter is active.
 * @param active True to show the painter cursor, false for the default text cursor.
 */
private static void setFormatPainterCursor(boolean active) {
    Cursor cursor = active
            ? Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) // A simple hand cursor for now
            : Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR);

    pages.forEach(p -> p.setCursor(cursor));
}
}
