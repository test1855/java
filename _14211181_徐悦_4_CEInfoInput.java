import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class _14211181_����_4_CEInfoInput extends JFrame implements ActionListener {
//	JPanel jp3;
	JButton OK;
	JTextField Firstname,Lastname,GrossSales,CommisionRate,SocialSecurityNumber; 
	JLabel jlb1,jlb2,jlb3,jlb4,jlb5;  
	_14211181_����_3_CommissionEmployee newtemp;
	
	public _14211181_����_4_CEInfoInput()
	{
//		jp3=new JPanel();
		OK=new JButton("OK");
	//	String fn,String ln,String ssn,int gs,double cr
		  
	//    ButtonGroup bg=null;		
	    jlb1=new JLabel("Firstname:");
	    jlb2=new JLabel("Lastname:");
	    jlb3=new JLabel("SocialSecurityNumber:");
	    jlb4=new JLabel("GrossSales:");
	    jlb5=new JLabel("CommisionRate:");
	    Firstname=new JTextField(10);
	    Lastname=new JTextField(10);
	    SocialSecurityNumber=new JTextField(10);
	    GrossSales=new JTextField(10);
	    CommisionRate=new JTextField(10);
	    
	    this.setLayout(new GridLayout(5,2));	//����ʽ����  
	    
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
		add(OK);
		
//		this.add(jp3);
		OK.addActionListener(this);
		this.setTitle("Commission Employee Info Input");//�����ǩ  
        this.setSize(500, 300);					//�����С  
        this.setLocationRelativeTo(null);		//����Ļ�м���ʾ(������ʾ)  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�˳��ر�JFrame  
        this.setVisible(true);					//��ʾ����  

        this.setResizable(false);				//�������� 
	}
	
	public void actionPerformed(ActionEvent e)
	{		
//		String password;
		if(e.getSource()==OK)
		{
//			password = String.valueOf(SocialSecurityNumber.getPassword());
			if(Firstname.getText().isEmpty()||Lastname.getText().isEmpty()||SocialSecurityNumber.getText().isEmpty()||GrossSales.getText().isEmpty()||CommisionRate.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null,"Ա����Ϣ¼��ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            newtemp=new _14211181_����_3_CommissionEmployee(Firstname.getText(),Lastname.getText(),SocialSecurityNumber.getText(),Integer.parseInt(GrossSales.getText()),Double.parseDouble(CommisionRate.getText()));
	            System.out.println("CEI");
	            clear();
	            this.setVisible(false);
	           // this.dispose();
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
