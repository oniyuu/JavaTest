package kr.co.job.jacom;

import java.util.Scanner;

public class DatabaseMain {

	public static void main(String[] args) {
		JacomControl run = new JacomControl(); 
		JacomDAO dao = new JacomDAO();
		
		run.start();
		//dao.input();
		

	}

}
