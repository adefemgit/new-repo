package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Eamil created successfully: " + firstName + "" + lastName);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = randomPassword(10);
        System.out.println("Your Password: " + this.password);
    }

    private String setDepartment(){
       System.out.println("Enter the department: \n1 for sale\n2 for Development\n3 for Accounting\n0 for none");
       Scanner scanner = new Scanner(System.in);

       int depChoice = scanner.nextInt();
       if(depChoice == 1){
           return "Sales department";
       }
       else if(depChoice == 2){
           return "Development department";

       }
       else if(depChoice == 3){
           return "Accounting department";
       }
       else{
           return "None department";
       }

    }

    private String randomPassword(int length){
         String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*()-_=+\\/~?";
         char [] password = new char[length];
         for(int i = 0; i < length; i++){
           int random =  (int) (Math.random() * PasswordSet.length());
           password[i] = PasswordSet.charAt(random);

         }
         return new String(password);



    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public void emailInfo(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Mailbox Capacity: " + mailboxCapacity);
        System.out.println("Alternate Email: " + alternateEmail);

    }
}

