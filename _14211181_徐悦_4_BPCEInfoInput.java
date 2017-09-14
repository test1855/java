import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class _14211181_徐悦_4_BPCEInfoInput extends JFrame implements ActionListener{
//	JPanel jp4;
	JButton OK;
	JTextField Firstname,Lastname,GrossSales,CommisionRate,BaseSalary,SocialSecurityNumber; 
	JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6;
//	JPasswordField 
	_14211181_徐悦_3_BasePlusCommissionEmployee newtemp;
	
	public _14211181_徐悦_4_BPCEInfoInput()
	{
		new JPanel();
		OK=new JButton("OK");
	//	String fn,String ln,String ssn,int gs,double cr,int bs
		  
	//    ButtonGroup bg=null;  
		
	    jlb1=new JLabel("Firstname:");
	    jlb2=new JLabel("Lastname:");
	    jlb3=new JLabel("SocialSecurityNumber:");
	    jlb4=new JLabel("GrossSales:");
	    jlb5=new JLabel("CommisionRate:");
	    jlb6=new JLabel("BaseSalary:");
	    Firstname=new JTextField(10);
	    Lastname=new JTextField(10);
	    SocialSecurityNumber=new JTextField(10);
	    GrossSales=new JTextField(10);
	    CommisionRate=new JTextField(10);
	    BaseSalary=new JTextField(10);
	    
	    this.setLayout(new GridLayout(6,2));	//网格式布局  
	    
	    add(jlb1);
	    add(Firstname);
	    add(jlb2);
	    add(Lastname);
	    add(jlb3);
	    add(SocialSecurityNumber);
	    add(jlb4);
	    add(GrossSales);
	    add(jlb5);
	    add(CommisionRate);
	    add(jlb6);
	    add(BaseSalary);
		add(OK);
		
//		this.add(jp4);
		OK.addActionListener(this);
		this.setTitle("BasePlusCommission Employee Info Input");//窗体标签  
        this.setSize(500, 300);					//窗体大小  
        this.setLocationRelativeTo(null);		//在屏幕中间显示(居中显示)  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出关闭JFrame  
        this.setVisible(true);					//显示窗体  
          
        //锁定窗体  
        this.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
//		String password;
		if(e.getActionCommand()=="OK")
		{
		//	password = String.valueOf(SocialSecurityNumber.getPassword());
			if(Firstname.getText().isEmpty()||Lastname.getText().isEmpty()||SocialSecurityNumber.getText().isEmpty()||GrossSales.getText().isEmpty()||CommisionRate.getText().isEmpty()||BaseSalary.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"输入不能为空！","提示消息",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null,"员工信息录入成功！","提示消息",JOptionPane.WARNING_MESSAGE);  
	            newtemp=new _14211181_徐悦_3_BasePlusCommissionEmployee(Firstname.getText(),Lastname.getText(),SocialSecurityNumber.getText(),Integer.parseInt(GrossSales.getText()),Double.parseDouble(CommisionRate.getText()),Integer.parseInt(BaseSalary.getText()));
	            clear();
	            System.out.println("BPCEI");
	            this.setVisible(false);
	          //  this.dispose();
			}		
		}
	}
	public  void clear()
    {
        Firstname.setText("");  
        Lastname.setText("");
        SocialSecurityNumber.setText("");
        GrossSales.setText("");  
        CommisionRate.setText("");
    }  
}
