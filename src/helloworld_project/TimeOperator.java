package helloworld_project;

import java.util.*;

public class TimeOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scann = new Scanner(System.in);//Scanner ��ü�� ����
        System.out.println("�ð�(second)�� �Է��ϼ���:");
        int time = scann.nextInt();
        
        int second = time % 60;//60���� ���� �������� �ʿ� ����
        int minute = (time/60) % 60;//�Էµ� �ʸ� 60���� ���� ���� 60���� ����������
        int hour = (time/60) / 60;//60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
        
        System.out.print(time + "�ʴ�");
        System.out.print(hour + "�ð� /");
        System.out.print(minute + "�� /");
        System.out.print(second + "�� �Դϴ�.");
        
        scann.close();
        
	}

}