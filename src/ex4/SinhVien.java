package ex4;

import java.util.Scanner;

public class SinhVien {
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStatus;
	
	public SinhVien() {}
	
	public SinhVien(String employeeId, String employeeName, int age, float rate, float salary, boolean employeeStatus) {
		super();
		this.employeeId  = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
		}
	public String getemployeeId() {
			return employeeId;
	}
	public void setemployeeId() {
		this.employeeId  = employeeId;
	}
	public String getemployeeName() {
		return employeeName;
	}
	public void setemployeeName() {
		this.employeeName = employeeName;
	}
	public int getage() {
		return age;
	}
	public void setage() {
		this.age = age;
	}
	public float getrate() {
		return rate;
	}
	public void setrate() {
		this.rate = rate;
	}
	public float getsalary() {
		return salary;
	}
	public void setsalary() {
		this.salary = salary;
	}
	public boolean getemployeeStatus() {
		return employeeStatus;
	}
	public void setemployeeStatus() {
		this.employeeStatus = employeeStatus;
	}
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap employeeId:");
		employeeId = sc.nextLine();
		System.out.println("Nhap employeeName:");
		employeeName = sc.nextLine();
		System.out.println("Nhap age:");
		age = sc.nextInt();
		System.out.println("Nhap rate:");
		rate = sc.nextFloat();
		System.out.println("Nhap salary:");
		salary = sc.nextFloat();
		System.out.println("Nhap employeeStatus:");
		employeeStatus = sc.nextBoolean();
		
	}
	public void displayData() {
		System.out.println("Nhan vien:");
		System.out.println("\temployeeId:" +employeeId);
		System.out.println("\temployeeName:" +employeeName);
		System.out.println("\tage:" +age);
		System.out.println("\trate:" +rate);
		System.out.println("\tsalary:" +salary);
		System.out.println("\temployeeStatus:" +employeeStatus);
	}
	public float salary(float rate) {
		return rate*1300000;
	}
}







