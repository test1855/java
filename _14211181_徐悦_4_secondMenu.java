import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Hashtable;
public class _14211181_����_4_secondMenu extends JFrame implements ActionListener{
//	JPanel jp2;
	JButton CommisionEmployee,BasePlusCommisionEmployee;
	/*_14211181_����_3_CommissionEmployee array[]=new _14211181_����_3_CommissionEmployee[100];
	_14211181_����_3_CommissionEmployee array1[]=new _14211181_����_3_CommissionEmployee[100];
	static int index=0; 
	static int index1=0;*/
	Hashtable <String,_14211181_����_3_Employee> employees=new Hashtable<String,_14211181_����_3_Employee>();
	_14211181_����_4_CEInfoInput win1;
	_14211181_����_4_BPCEInfoInput win2;
	
	public _14211181_����_4_secondMenu ()
	{
//		jp2=new JPanel();
		CommisionEmployee=new JButton("CommisionEmployee");
		BasePlusCommisionEmployee=new JButton("BasePlusCommisionEmployee");
		
		this.setLayout(new GridLayout(2, 1));	//����ʽ����
		
		add(BasePlusCommisionEmployee);
		add(CommisionEmployee);
//		this.add(jp2);
		CommisionEmployee.addActionListener(this);
		BasePlusCommisionEmployee.addActionListener(this);
		this.setTitle("Second-Menu");			//�����ǩ  
        this.setSize(500, 300);					//�����С  
        this.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
        this.setVisible(true);					//��ʾ����  
  
        
        this.setResizable(false); 			//��������  
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==CommisionEmployee)
		{
			//_14211181_����_4_CEInfoInput 
			win1=new _14211181_����_4_CEInfoInput();
			while(win1.newtemp!=null);
				/*array[index]=new _14211181_����_3_CommissionEmployee();
				array[index]=win1.newtemp;
				index++;*/
				System.out.println("+hashcomm");
				employees.put(win1.newtemp.getsocialSecurityNumber(), win1.newtemp);
			
		}
		else if(e.getSource()==BasePlusCommisionEmployee)
		{
			//_14211181_����_4_BPCEInfoInput 
			win2=new _14211181_����_4_BPCEInfoInput();
			while(win2.newtemp!=null);/*
				array1[index1]=new _14211181_����_3_CommissionEmployee();
				array1[index1]=win1.newtemp;
				index1++;*/
				System.out.println("+hashbase");
				employees.put(win2.newtemp.getsocialSecurityNumber(), win2.newtemp);
			
		}
//		this.setVisible(false);
		searchAllEmployees();
		//this.dispose();
		this.setVisible(false);
	}
	
	public String searchAllEmployees()
	{
		Enumeration<_14211181_����_3_Employee>position=employees.elements();
		int fees=0;
		String str="";
		System.out.println("����Ա����Ϣ���£�");
		while(position.hasMoreElements()){
		//	str=str+position.nextElement().toString()+'\n';
		//	fees+=(position.nextElement()).earning();
			System.out.println("position.nextElement().toString()");
		}
		return str;
	}
	
}
