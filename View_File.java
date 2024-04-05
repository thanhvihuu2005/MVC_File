package MVC_package;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class View_File implements ActionListener{
	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPane;
	JMenuBar menuBar;
	JMenu menuFile;
	JMenuItem iNew,iOpen,iSave,iSaveAs,iExit;
	Control_File file= new Control_File(this);
	public static void main(String[] args) {
		new View_File();
		
		
		List<String> names = new ArrayList<>();
        names.add("Thanh");
        names.add("Thang");
        names.add("Thu");
        names.add("Nhu");

        // Tạo Stream từ List
        Stream<String> stream = names.stream();

        // Thực hiện các thao tác trên Stream
        stream
            .filter(name -> name.startsWith("Th"))
            .forEach(System.out::println);
	
	}
//	public void StreamCollection() {
//	     List<String> names = new ArrayList<>();
//	        names.add("John");
//	        names.add("Jane");
//	        names.add("Alice");
//	        names.add("Bob");
//
//	        // Tạo Stream từ List
//	        Stream<String> stream = names.stream();
//
//	        // Thực hiện các thao tác trên Stream
//	        stream
//	            .filter(name -> name.startsWith("J"))
//	            .forEach(System.out::println);
//	}
	
	
	
	
	
	   public View_File() {
	        createWindow();
	        createTextArea();
	        createMenuBar();
	        createFileMenu();
	        window.setVisible(true);
	    }
	   
	   
	   public void createWindow() {
	        window = new JFrame("Notepad");
	        window.setSize(600, 400);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	   public void createTextArea() {
	        textArea = new JTextArea();
	        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
	                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setBorder(BorderFactory.createEmptyBorder());
	        window.add(scrollPane);
	    }
	   public void createMenuBar() {
	        menuBar = new JMenuBar();
	        window.setJMenuBar(menuBar);
	        menuFile = new JMenu("File");
	        menuBar.add(menuFile);
	    }
	public void createFileMenu() {
		
		   iOpen = new JMenuItem("Open");
	        iOpen.addActionListener(this);
	        iOpen.setActionCommand("Open");
	        menuFile.add(iOpen);
	        
		iNew = new JMenuItem("New");
		iNew.addActionListener(this);
		iNew.setActionCommand("New");
		menuFile.add(iNew); 
		
		iOpen = new JMenuItem("Open");
		iOpen.addActionListener(this);
		iOpen.setActionCommand("Open");
		menuFile.add(iOpen);
		
		
		
		iSave = new JMenuItem("Save");
		iSave.addActionListener(this);
		iSave.setActionCommand("Save");
		menuFile.add(iSave);
		
		
		iSaveAs = new JMenuItem("SaveAs");
		iSaveAs.addActionListener(this);
		iSaveAs.setActionCommand("SaveAs");
		menuFile.add(iSaveAs);
		
		
		iExit = new JMenuItem("Exit");
		iExit.addActionListener(this);
		iExit.setActionCommand("Exit");
		menuFile.add(iExit);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		switch(command){
		case "New":file.newFile();break ;
		case "Open":file.open();break ;
		case "Save":file.save();break ; 
		case "SaveAs":file.saveAs();break ; 
		case "Exit":file.exit();break ;
		}
		
		
	}
	 public void actionPerformed1(ActionEvent e) {
	        String command = e.getActionCommand();
	        switch (command) {
	            case "Open":
	                file.open();
	                break;

	            // Xử lý các lệnh menu khác
	            // ...
	        }
}
}




