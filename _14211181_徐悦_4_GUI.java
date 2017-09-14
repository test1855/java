import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import javax.swing.JTextField;

public class _14211181_����_4_GUI implements ActionListener{

	JFrame jf1,jf2,jf3,jf4,jf5;
	JButton EmployeeInfoInput,Search;
	JButton CommisionEmployee,BasePlusCommisionEmployee;//��ť
	JButton OK;
	JTextField fillFirstname,fillLastname,fillGrossSales,fillCommisionRate,fillSocialSecurityNumber;
	JLabel Firstname,Lastname,GrossSales,CommisionRate,SocialSecurityNumber; 
	_14211181_����_3_CommissionEmployee commissionTemp;
	JButton OK1;
	JTextField fillBaseSalary;
	JLabel BaseSalary; 
	_14211181_����_3_BasePlusCommissionEmployee basePlusCommissionTemp;	
	JButton OK2;
	Hashtable <String,_14211181_����_3_Employee> employees=new Hashtable<String,_14211181_����_3_Employee>();
	
	//jf1
	public _14211181_����_4_GUI()
	{
		jf1=new JFrame();jf1.setLayout(new GridLayout(2,1));			//����ʽ����	
		EmployeeInfoInput=new JButton("EmployeeInfoInput");
		Search=new JButton("Search");
		jf1.setTitle("First-Menu");			//�����ǩ  
		jf1.setSize(500,300);					//�����С  
		jf1.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
		jf1.setVisible(true);					//��ʾ����  
		
		
		jf1.add(EmployeeInfoInput);					//�������
		jf1.add(Search);	
		//this.add(jp1);
		EmployeeInfoInput.addActionListener(this);
		Search.addActionListener(this);
		
    //    this.setResizable(false);  				//��������  
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==EmployeeInfoInput){
//			jf1.setVisible(false);
			EmployeeInfoInput();
		}
		
		else if(e.getSource()==Search)
			Search();
		else if(e.getSource()==OK2){
			jf5.setVisible(false);
            jf5.dispose();
		}
			
		else if(e.getSource()==CommisionEmployee){
			jf2.setVisible(false);
			CommisionEmployeeInfoInput();
		}
		else if(e.getSource()==OK){
			if(fillFirstname.getText().isEmpty()||fillLastname.getText().isEmpty()||fillSocialSecurityNumber.getText().isEmpty()||fillGrossSales.getText().isEmpty()||fillCommisionRate.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null,"Ա����Ϣ¼��ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            commissionTemp=new _14211181_����_3_CommissionEmployee(fillFirstname.getText(),fillLastname.getText(),fillSocialSecurityNumber.getText(),Integer.parseInt(fillGrossSales.getText()),Double.parseDouble(fillCommisionRate.getText()));
	            System.out.println("CEI");
	            employees.put(commissionTemp.getsocialSecurityNumber(), commissionTemp);
	            clear();
	            jf3.setVisible(false);
	            jf3.dispose();
			}
		}
		
		else if(e.getSource()==BasePlusCommisionEmployee){
			jf2.setVisible(false);
			BasePlusCommisionEmployeeInfoInput();
		}
		else if(e.getSource()==OK1){
			if(fillFirstname.getText().isEmpty()||fillLastname.getText().isEmpty()||fillSocialSecurityNumber.getText().isEmpty()||fillGrossSales.getText().isEmpty()||fillCommisionRate.getText().isEmpty()||fillBaseSalary.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null,"Ա����Ϣ¼��ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            basePlusCommissionTemp=new _14211181_����_3_BasePlusCommissionEmployee(fillFirstname.getText(),fillLastname.getText(),fillSocialSecurityNumber.getText(),Integer.parseInt(fillGrossSales.getText()),Double.parseDouble(fillCommisionRate.getText()),Integer.parseInt(fillBaseSalary.getText()));
	            System.out.println("BPCEI");
	            employees.put(basePlusCommissionTemp.getsocialSecurityNumber(), basePlusCommissionTemp);
	            clear();
	            jf4.setVisible(false);
	            jf4.dispose();
			}
		}
	}	
	
	public void EmployeeInfoInput()
	{
		jf2=new JFrame();jf2.setLayout(new GridLayout(2,1));			//����ʽ����
		CommisionEmployee=new JButton("CommisionEmployee");
		BasePlusCommisionEmployee=new JButton("BasePlusCommisionEmployee");
		jf2.setTitle("EmployeeInfoInput");		//�����ǩ  
		jf2.setSize(500, 300);					//�����С  
		jf2.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
		jf2.setVisible(true);					//��ʾ����    
 //       this.setResizable(false);  				//��������  
        
		
		jf2.add(BasePlusCommisionEmployee);
		jf2.add(CommisionEmployee);
//		this.add(jp2);
		CommisionEmployee.addActionListener(this);
		BasePlusCommisionEmployee.addActionListener(this);		
		
		
	}
	
	public void CommisionEmployeeInfoInput()
	{
		jf3=new JFrame();jf3.setLayout(new GridLayout(5,2));	//����ʽ���� 
		OK=new JButton("OK");
		//	String fn,String ln,String ssn,int gs,double cr
		Firstname=new JLabel("Firstname:");
		Lastname=new JLabel("Lastname:");
		SocialSecurityNumber=new JLabel("SocialSecurityNumber:");
		GrossSales=new JLabel("GrossSales:");
		CommisionRate=new JLabel("CommisionRate:");
		fillFirstname=new JTextField(10);
		fillLastname=new JTextField(10);
		fillSocialSecurityNumber=new JTextField(10);
		fillGrossSales=new JTextField(10);
		fillCommisionRate=new JTextField(10);
		jf3.setTitle("Commission Employee Info Input");//�����ǩ  
		jf3.setSize(1000,800);					//�����С  
//		jf3.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
		jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
		jf3.setVisible(true);					//��ʾ����  
//	    this.setResizable(false);				//�������� 
    
		  
		jf3.add(Firstname);
		jf3.add(fillFirstname);
		jf3.add(Lastname);
		jf3.add(fillLastname);
		jf3.add(SocialSecurityNumber);
		jf3.add(fillSocialSecurityNumber);
		jf3.add(GrossSales);
		jf3.add(fillGrossSales);
		jf3.add(CommisionRate);
		jf3.add(fillCommisionRate);
		jf3.add(OK);
//			this.add(jp3);
		OK.addActionListener(this);
			}
	
	public void BasePlusCommisionEmployeeInfoInput()
	{
		jf4=new JFrame();jf4.setLayout(new GridLayout(6,2));	//����ʽ
		OK1=new JButton("OK");
		//	String fn,String ln,String ssn,int gs,double cr,int bs
		Firstname=new JLabel("Firstname:");
		Lastname=new JLabel("Lastname:");
		SocialSecurityNumber=new JLabel("SocialSecurityNumber:");
		GrossSales=new JLabel("GrossSales:");
		CommisionRate=new JLabel("CommisionRate:");
		BaseSalary=new JLabel("BaseSalary");
		fillFirstname=new JTextField(10);
		fillLastname=new JTextField(10);
		fillSocialSecurityNumber=new JTextField(10);
		fillGrossSales=new JTextField(10);
		fillCommisionRate=new JTextField(10);
		fillBaseSalary=new JTextField(10);
		
		jf4.setTitle("Commission Employee Info Input");//�����ǩ  
		jf4.setSize(1000, 800);					//�����С  
	//	jf4.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
		jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
		jf4.setVisible(true);					//��ʾ����  
//	    this.setResizable(false);				//�������� 
    
		jf4.add(Firstname);
		jf4.add(fillFirstname);
		jf4.add(Lastname);
		jf4.add(fillLastname);
		jf4.add(SocialSecurityNumber);
		jf4.add(fillSocialSecurityNumber);
		jf4.add(GrossSales);
		jf4.add(fillGrossSales);
		jf4.add(CommisionRate);
		jf4.add(fillCommisionRate);
		jf4.add(BaseSalary);
		jf4.add(fillBaseSalary);
		jf4.add(OK1);		
//		this.add(jp3);
		OK1.addActionListener(this);
	}
		
	public  void clear()
    {
        fillFirstname.setText("");  
        fillLastname.setText("");
        fillSocialSecurityNumber.setText("");
        fillGrossSales.setText("");  
        fillCommisionRate.setText("");
//        fillBaseSalary.setText("");
    }  	
	
	public String printEmployees()
	{
		String str="";
		if(employees!=null)
		{
	//		JOptionPane.showMessageDialog(null,"!!!!","����Ա����Ϣ",JOptionPane.WARNING_MESSAGE);
			Enumeration<_14211181_����_3_Employee>position=employees.elements();
			while(position.hasMoreElements())
				str=str+(position.nextElement()).toString();
			return str;
		}
		return null;
	}
	
	public void Search()
	{
		jf5=new JFrame();jf5.setLayout(new GridLayout());
		
		
		String str1="���\t����\t�籣��\t����\n";
		String str=printEmployees();
		if(str=="")
			JOptionPane.showMessageDialog(null,"���κ�����ӵ�Ա����Ϣ","warning!",JOptionPane.WARNING_MESSAGE);
		else
		{
			str1=str1+str;
			jf5.setTitle("All Employee Infomation");//�����ǩ  
			jf5.setSize(1000, 800);					//�����С  
		//	jf5.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
			jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
			jf5.setVisible(true);					//��ʾ����  
//	    	this.setResizable(false);				//�������� 
			
			OK2=new JButton("OK");
			JLabel output=new JLabel(str1);
			jf5.add(output);
			jf5.add(OK2);
			OK2.addActionListener(this);
		}
	}
	
		
	public static void main(String[] args) {  
		new _14211181_����_4_GUI();  
    }  
}
