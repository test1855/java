import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
public class _14211181_����_4_firstMenu extends JFrame implements ActionListener{
	
	JButton EmployeeInfoInput,Search;			//��ť
	_14211181_����_4_secondMenu win1;
	Hashtable <String,_14211181_����_3_Employee> employeesCopy=new Hashtable<String,_14211181_����_3_Employee>();
	
	public _14211181_����_4_firstMenu()
	{
		new JPanel();
		EmployeeInfoInput=new JButton("EmployeeInfoInput");
		Search=new JButton("Search");
		
		this.setLayout(new GridLayout(2, 1));	//����ʽ����  
		
		add(EmployeeInfoInput);					//�������
		add(Search);
		
		//this.add(jp1);
		EmployeeInfoInput.addActionListener(this);
		Search.addActionListener(this);
		
		this.setTitle("First-Menu");			//�����ǩ  
        this.setSize(500, 300);					//�����С  
        this.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
        this.setVisible(true);					//��ʾ����  
        
        this.setResizable(false);  				//��������  
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==EmployeeInfoInput)
		{
			//	this.setVisible(false);
				win1 = new _14211181_����_4_secondMenu();
//				employeesCopy.put(win1.employees., value)
		}

		else if(e.getActionCommand()=="Search")
		{
			JOptionPane.showMessageDialog(null,win1.searchAllEmployees(),"����Ա����Ϣ",JOptionPane.WARNING_MESSAGE); 
		}
	}	
		
	public static void main(String[] args) {  
		_14211181_����_4_firstMenu win=new _14211181_����_4_firstMenu();  
    }  
}
