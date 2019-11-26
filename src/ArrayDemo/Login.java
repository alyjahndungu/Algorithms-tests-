package ArrayDemo;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import javax.swing.UIManager;

//import org.jvnet.substance.skin.SubstanceMangoLookAndFeel;
//import org.jvnet.substance.skin.SubstanceSaharaLookAndFeel;


import javax.swing.JButton;
import javax.swing.JDialog;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends JDialog implements ActionListener {
	String database="macohi";
	//ds73bc
	/**   used as a max indicator for the allowable login attempts    */
	int maxAttempts=5;
	  String host="192.168.5.5";
	JButton butLogin,butCancel;
	JTextField txtUserName;
	JPasswordField txtPwd;
	Connection conn;
	/**   used as a counter indicator of current attempt based on MaxAttempts    */
		static int countAttempts=1;
	public Login(){
		setTitle("Login");
	//	sahara();
		butLogin=new JButton("Login");
		butLogin.addActionListener(this);
		butCancel=new JButton("Cancel");
		butCancel.addActionListener(this);
		txtUserName=new JTextField();
		txtPwd=new JPasswordField();
		setLayout(new GridLayout(3,2,30,20));
		add(new JLabel("Username "));
		add(txtUserName);
		add(new JLabel("Password "));
		add(txtPwd);
		add(butLogin);
		add(butCancel);

		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
	  int _width=300;
	  int _height=150;
	  int x=(dim.width/2-_width/2);
	  int y=(dim.height/2-_height/2);
	setBounds(x, y,_width,_height);

		setVisible(true);

	}

	public static void main(String args[]){

		new Login();
	}
  public void MyConfirmition( String msg, String[] buts_options){
	  int opt=JOptionPane.showOptionDialog(this, msg, "Error",JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buts_options, buts_options[0]);

	  if(opt==JOptionPane.YES_OPTION){

		}else{
			System.exit(1);
		}

  }

  /**
   * Function for login authentication/connection to server
   * @param username  the login user id
   * @param password  the login user password
   * @return  a boolean status , true if connection is success, false if not
   */

  //     String  authentication(String username, String password){
    boolean  authentication(String username, String password){

    	  // String  status="";
    	 boolean  status=false;
    	   try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Connecting, Please Wait...");
				conn = DriverManager.getConnection("jdbc:mysql://"+host+":3306/"+database, username,password);
				System.out.println("Connected...");
				//JOptionPane.showMessageDialog(this,"Connected Successfully");
			//status="ok";
			status=true;
    	   } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				int error=e.getErrorCode();
				//status="error";
				status=false;
				switch(error){
				case 0:
					JOptionPane.showMessageDialog(this, "Unable to locate the Server ", "Error",JOptionPane.ERROR_MESSAGE);
					break;
					case 1045:

						String attemptsMsg="";

						if(countAttempts!=maxAttempts){
							attemptsMsg="\n\nNOTE:\t"+(maxAttempts-countAttempts)+" Attempts Remaining";
						}else{
							JOptionPane.showMessageDialog(this," Attempts Exhausted!\n Exiting...");
							System.exit(1);
						}


						++countAttempts;

						MyConfirmition("incorrect  password/username supplied "+attemptsMsg+"\n\nDo you want to try again?", new String[]{"Retry","Forgotten! Exit"});
						//txtUserName.setText("");
						txtPwd.setText("");
						//txtUserName.setCaretPosition(0);
						txtUserName.selectAll();
						//status="wait";

						status=false;
					break;
					case 1049:
						//MyConfirmition("Unable to access Database \nDo want to try again?", new String[]{"Retry","Forgotten! Exit"});
						JOptionPane.showMessageDialog(this, "Unable to access Database", "Error",JOptionPane.ERROR_MESSAGE);
						break;
					default:

						break;
				}

				//e.printStackTrace();
			}

			return status;
       }


    /*   String getMyPwd(){
    	   char ch[]=txtPwd.getPassword();
    	   StringBuffer buf=new StringBuffer();
    	   //String str="";
    	   for(int i=0;i<ch.length;i++){
    		   //str+=ch[i];
    		   buf.append(ch[i]);
    	   }

    	   return buf.toString();

       }
       */
	@Override
	public void actionPerformed(ActionEvent event) {
		Object source=	event.getSource();

		if(source==butLogin){

			 String user=txtUserName.getText();
			 // String pass=getMyPwd();
			  String pass=String.valueOf(txtPwd.getPassword());

			if(!user.equals("")&& !pass.equals("")){
				//String response=authentication(user,pass);

				boolean response=authentication(user,pass);

				//if(response.equals("ok")){
				if(response==true){
					dispose();

					//new ViewEmployees(conn);
				//	new NewEmployee(conn);

				}
			}else{

				JOptionPane.showMessageDialog(this, "Username or password cannot be blank!");
			}
		}else if(source==butCancel){
			System.exit(1);
		}

	}


	//public void sahara(){
    //    try {
  // UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
////UIManager.setLookAndFeel(new SubstanceMangoLookAndFeel());
//        } catch (UnsupportedLookAndFeelException e) {
//                JOptionPane.showMessageDialog(null, "Unsupported Look and Feel", "Error!",
//                                JOptionPane.INFORMATION_MESSAGE);
//                e.printStackTrace();
//        }catch (NullPointerException npe){
//                JOptionPane.showMessageDialog(null, "Cannot find Look and Feel", "Error!",
//                                JOptionPane.INFORMATION_MESSAGE);
//                npe.printStackTrace();
//
     //  }
 //  }


}
