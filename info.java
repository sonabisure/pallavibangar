package no1;

import java.util.Scanner;

public class info {
  
		  String name;
		  int age ;
		  String address;
		  String email;
		  String gender ;

		    public info(){}

		    public info(String name, int age, String address, String email,String gender){
		       this.name = name;
		       this.age = age;
		       this.address = address;
		       this.email = email;
		       this.gender =gender;
		    }

		    public void setName(String newName){
		       name = newName;
		    }
		    public void setAge(int newAge){
		       age = newAge;
		    }
		    public void setAddress(String newAddress){
		       address = newAddress;
		    }
		    public void setEmail(String newEmail){
		       email = newEmail;
		    }
		    public void setGender(String newGender){
			       gender = newGender;
		    }

		    public String getName(){
		      return name;
		    }
		    public int getAge(){
		      return age;
		    }
		    public String getAddress(){
		      return address;
		    }
		    public String getEmail(){
		      return email;
		    }
		    public String getGender(){
			      return gender;
			    }


		    public String toString() {
		        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email + ",Gender: "+ gender;
		    }

		    @SuppressWarnings("resource")
			public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
		        info[] s= new info[4];

		        for(int i = 0; i < 5; i++){
		            System.out.print("Name: ");
		            String name = sc.nextLine();
		            System.out.print("Age: ");
		            int age = sc.nextInt();
		            System.out.print("Address: ");
		            sc.nextLine();
		            String address = sc.nextLine();
		            System.out.print("Email: ");
		            String email = sc.nextLine();
		            System.out.print("Gender: ");
		            String gender = sc.nextLine();

		            s[i] = new info(name,age,address,email,gender);
		        }
		        
		    }
}

