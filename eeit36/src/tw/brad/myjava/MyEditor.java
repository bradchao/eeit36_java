package tw.brad.myjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton openBtn, saveBtn, saveAsBtn;
	private JTextArea textArea;
	private File openFile;
	
	public MyEditor() {
		super("我的編輯器");
	
		openBtn = new JButton("Open");
		saveBtn = new JButton("Save");
		saveAsBtn = new JButton("Save as");
		
		textArea = new JTextArea();
		
		layoutView();
		
		setEvent();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void layoutView() {
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(openBtn); top.add(saveBtn); top.add(saveAsBtn);
		
		add(top, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
	}
	
	private void setEvent() {
		openBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
	}
	
	private void openFile() {
		JFileChooser jFileChooser = new JFileChooser();
		if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			openFile = jFileChooser.getSelectedFile();
			
			try {
				FileInputStream fin = new FileInputStream(openFile);
				byte[] buf = new byte[(int)openFile.length()];
				fin.read(buf);
				fin.close();
				
				textArea.setText(new String(buf));
				
			}catch(Exception e){
				System.out.println("XXX");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
