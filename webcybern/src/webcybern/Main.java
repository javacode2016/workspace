package webcybern;
import java.util.Scanner;
import javax.swing.*;

public class Main {
	public static void print(String str) {System.out.println(str);}
	
public static void main(String args[]) {
	
	
	// prog � ����� ��������� ����������
    // user � ����� �������� �������������
    int prog, user, tries;
    tries = 1;
    // ���������� ��������� ����� ����� �� 1 �� 10
    prog = (int)(Math.random() * -10) + 10;
    System.out.println("� �������� ����� �� -10 �� 10, ��������� ���.");
    System.out.print("������� ���� �����: ");
    Scanner input = new Scanner(System.in);  
    // ���������, ���� �� � ������ ����� ����� �����
    if( input.hasNextInt() ) {
        do {
            // ������ � ������ ����� ����� �����
            user = input.nextInt();
            if(user == prog) {
            	tries++;
                System.out.println("�� �������!");
            } else {
                // ���������, ������ �� ����� � ������� [1;10]
                if (user > -10 && user <= 10) {
                    System.out.print("�� �� �������! " + prog);
                    // ���� ����� ���������� ���������� ������...
                    if( prog < user ) {
                        System.out.println(" �� ����� ������.");
                    } else {
                        System.out.println(" �� ����� ������.");
                    }
                } else {
                    System.out.println("���� ����� ������ �� �� ������� �������!");
                    
                }
            }
        } while( user != prog );
    } else {
    	tries++;
        System.out.println("������. �� �� ����� ����� �����!");
    }
    System.out.println("�� ��������! ������� ���� "+ tries);

	
	
	
	
	
	
	
	
	
	
}}
