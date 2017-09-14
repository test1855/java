import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
public class _14211181_徐悦_4_firstMenu extends JFrame implements ActionListener{
	
	JButton EmployeeInfoInput,Search;			//按钮
	_14211181_徐悦_4_secondMenu win1;
	Hashtable <String,_14211181_徐悦_3_Employee> employeesCopy=new Hashtable<String,_14211181_徐悦_3_Employee>();
	
	public _14211181_徐悦_4_firstMenu()
	{
		new JPanel();
		EmployeeInfoInput=new JButton("EmployeeInfoInput");
		Search=new JButton("Search");
		
		this.setLayout(new GridLayout(2, 1));	//网格式布局  
		
		add(EmployeeInfoInput);					//加入组件
		add(Search);
		
		//this.add(jp1);
		EmployeeInfoInput.addActionListener(this);
		Search.addActionListener(this);
		
		this.setTitle("First-Menu");			//窗体标签  
        this.setSize(500, 300);					//窗体大小  
        this.setLocationRelativeTo(null);		//在屏幕中间显示(居中显示)  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出关闭JFrame  
        this.setVisible(true);					//显示窗体  
        
        this.setResizable(false);  				//锁定窗体  
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==EmployeeInfoInput)
		{
			//	this.setVisible(false);
				win1 = new _14211181_徐悦_4_secondMenu();
//				employeesCopy.put(win1.employees., value)
		}

		else if(e.getActionCommand()=="Search")
		{
			JOptionPane.showMessageDialog(null,win1.searchAllEmployees(),"所有员工信息",JOptionPane.WARNING_MESSAGE); 
		}
	}	
		
	public static void main(String[] args) {  
		_14211181_徐悦_4_firstMenu win=new _14211181_徐悦_4_firstMenu();  
    }  
}
