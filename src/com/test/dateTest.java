package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {
	public static void main(String[] args) throws ParseException{		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 使用format()方法将日期转换为指定格式的文本
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 创建Date对象，表示当前时间      
		Date time= new Date();
		// 调用format()方法，将日期转换为字符串并输出
		System.out.println(sdf1.format(time));
		System.out.println(sdf2.format(time));
		System.out.println(sdf3.format(time));
		// 使用parse()方法将文本转换为日期
		String d="2019-08-12 15:29:53";
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 调用parse()方法，将字符串转换为日期
		Date date =sdf.parse(d);  
		System.out.println(date);			
	}
}
