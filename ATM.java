import java.util.Scanner;

//CREATING AN CLASS IN NAME ATM
class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //GETTING ACCOUNT NUMBER AS A INPUT FROM THE USER
        System.out.println("ENTER YOUR ACCOUNT NUMBER:");
        //ASSIGNING THE INPUT TO ACC_NO
        int acc_no=sc.nextInt();

        //ASKING THE USER TO ENTER THEIR PIN FOR ACCOUNT
        System.out.println("ENTER YOUR PIN:");
        int password = sc.nextInt();

        //ASSIGNING PIN VALUE AS 0
        int pin=0;

        //CREATING AN OBJECT FOR PASSWORD
        int pwd;

        //IN DEFAULT ASSIGNING BALANCE AS 0
        int balance= 0;

        //CREATING A NEW OBJECT OLD PASSWORD AND ASSIGNING ORGINAL PIN TO IT 
        int old_password=pin;

        //CREATING FEW ACCOUNT NUMBER IN DATABASE FOR TESTING THE CASE USING IF LOOP
        //FOR EG CREATING ACC NUMBER 12345
        if(acc_no==12345){
            //PRINTING THE ACCOUNT NUMBER IF ITS TRUE
            System.out.println("YOUR ACC NUMBER IS:"+acc_no);

            //ASSIGNING THE PASSWORD FOR THIS PARTICULAR ACCOUNT NUMBER
            pwd=1234;

            //NOW ASSIGNING THE PASSWORD TO THE OBJECT PIN
            pin+=pwd;

            //ASSIGNING THE BALANCE THIS PARTICULAR ACCOUNT NUMBER
            balance+=10000;
        }

        //CREATING FEW MORE ACCOUNTS SAME AS THE ABOVE
        else if(acc_no==67890){
            System.out.println("YOUR ACC NUMBER IS:"+acc_no);
            pwd=5678;
            pin+=pwd;
            balance+=15400;
        }

        else if(acc_no==98765){
            System.out.println("YOUR ACC NUMBER IS:"+acc_no);
            pwd=8765;
            pin+=pwd;
            balance+= 584980;
        }

        else if(acc_no==54321){
            System.out.println("YOUR ACC NUMBER IS:"+acc_no);
            pwd=4321;
            pin+=pwd;
            balance+= 64900;
        }

        //IF THE ENTERED ACCOUNT NUMBER IS NOT FOUND IN THE DATABASE IT SHOWS ERROR STATEMENT
        else{
            System.out.println("THE ENTERED ACCOUNT NUMBER IS WRONG ,RECHECK AND ENTER AGAIN...");

        }

        //NEW OBJECT IS CREATED WHEN THE USER PRESSES ADD AMOUNT OR CREDIT
        int addamount= 0;

        //NEW OBJECT IS CREATED WHEN THE USER PRESSES TO DEBIT OR TAKE AMOUNT
        int takeamount=0;

        //NEW OBJECT NAME IS CREATED FOR GETTING THE USER NAME 
        String name;

        //IF LOOP IS USED TO CHECK IF THE PASSWORD MATCHES FOR THE PARTICULAR ACCOUNT 
        if(password==pin)
        {
            //WHEN PASSWORD IS TRUE IT PRINTS WELCOME WITH THE USER NAME
            System.out.println("ENTER YOUR NAME:");
            name=sc.next();
            System.out.println("WELCOME "+name);

            while (true)
            {

                //HERE ARE THE VARIOUS STATEMENTS TAKES PLACE FOR ATM MANAGEMENT
                //WHEN THE USER ENTER 1 IT PRINTS THE BALANCE
                System.out.println("\nPRESS 1 TO CHECK YOUR BALANCE");

                //PRESSING 2 TO ADD AMOUNT
                System.out.println("PRESS 2 TO ADD AMOUNT");

                //PRESSING 3 TO DEBIT AMOUNT
                System.out.println("PRESS 3 TO TAKE AMOUNT");

                //PRESSING 4 TO PRINT THE RECIPT
                System.out.println("PRINT 4 TO TAKE RECIPT");

                //PRESSING 5 TO CHANGE PASSWORD
                System.out.println("PRESS 5 TO CHANGE PASSWORD");

                //PRESSING 6 TO EXIT
                System.out.println("PRESS 6 TO EXIT");

                int opt= sc.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println("YOUR BALANCE IS:"+balance);
                        break;
                        
                    case 2:
                        System.out.println("HOW MUCH AMOUNT TO BE CREDITED IN YOUR ACCOUNT:");
                        addamount=sc.nextInt();
                        System.out.println("SUCCESSFULLY ADDED!");
                        balance=balance+addamount;
                        break;
                    
                    case 3:

                        System.out.println("HOW MUCH AMOUNT DO YOU WANT TO DEBIT?");
                        takeamount=sc.nextInt();
                        
                        if(takeamount>balance)
                        {
                            System.out.println("YOUR BALANCE IS INSUFFICIENT");
                            System.out.println("TRY LESS THAN YOUR BALANCE");

                        }
                        else{
                            System.out.println("SUCEESSFULLY DEBITED!");
                            balance=balance-takeamount;
                        }
                        break;
                    case 4:
                    
                        System.out.println("WELCOME EVERYONE TO ABC BANK!!");
                        System.out.println("AVAILABLE BALANCE IS:"+balance);
                        System.out.println("AMOUNT CREDITED:"+addamount);
                        System.out.println("AMOUNT DEBITED:"+takeamount);
                        System.out.println("THANKS FOR VISITING...VISIT AGAIN!");
                    break;
                        default:
                        System.out.println("PRESS THE NUMBER BELOW 5");
                        break;
                    case 5:
                        System.out.println("ENTER OLD PIN FOR CONFIRMATION:");
                        old_password=sc.nextInt();
                        if(old_password==pin){
                            System.out.println("ENTER YOUR NEW PASSWORD:");
                            int new_password=sc.nextInt();
                            System.out.println("ENTER YOUR NEW PASSWORD ONCE AGAIN");
                            int recheck_pwd=sc.nextInt();
                            if(recheck_pwd==new_password){
                                pin=new_password;
                                System.out.println("PASSWORD SUCCESSFULLY CHANGED");
                            }
                            else{
                                System.out.println("THE PASSWORD DOESN'T MATCH CHECK ONCE AGAIN!");
                            }
                        }
                        else{
                            System.out.println("THE OLD PASSWORD IS WRONG CHECK ONCE AGAIN!");
                            break;
                        }
                    
                }
                if(opt==6)
                {
                    System.out.println("THANK YOU!...FOR ANY QUERIES CONTACT AUTHORITIES");
                    break;
                }
            }
        }
        else
        {
            System.out.println("WRONG PASSWORD CHECK AGAIN");

        }
    }
}