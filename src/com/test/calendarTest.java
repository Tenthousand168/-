package com.test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class calendarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Calendar����
		Calendar c = Calendar.getInstance();		        
		// ��Calendar����ת��ΪDate����
		Date date = c.getTime();		     
		// ����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		        
		// ������ת��Ϊָ����ʽ���ַ���
		String now = sdf.format(date);
		System.out.println("��ǰʱ�䣺" + now);
		//ֱ�������ǰʱ��
		System.out.println(date);
		}
}
