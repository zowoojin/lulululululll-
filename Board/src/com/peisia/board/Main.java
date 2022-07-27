package com.peisia.board;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Post> posts = new ArrayList<>();
		
		
		posts.add(new Post("테스트1", "테스트입니다~1", "nyang", 1));
		posts.add(new Post("테스트2", "테스트입니다~2", "nyang", 2));
		posts.add(new Post("테스트3", "테스트입니다~3", "nyang", 3));
		Scanner sc = new Scanner(System.in);
		
		loop:
		while(true) {
		System.out.println("명령을 입력해주세요. [1:글 쓰기, 2:글 리스트, 3:글 읽기, 4:글 삭제, e:끝내기]");
		String cmd = sc.next();
		
		switch(cmd) {
		case "1":	//글 쓰기. todo
			System.out.println("-------------글 쓰기---------------");
			System.out.println("제목을 입력해주세요:");
			String title = sc.next();
			System.out.println("내용을 입력해주세요:");
			String content = sc.next();
			System.out.println("id을 입력해주세요:");
			String id = sc.next();
			System.out.println("no을 입력해주세요:");
			int no = sc.nextInt();
			posts.add(new Post(title, content, id, no));			
			break;
	
		case "2":
			System.out.println("-------------글 리스트--------------");
			//todo
			//글리스트
			
			for(int i=0;i<posts.size();i++) {
				System.out.println(posts.get(i).no);
				System.out.println("");
				System.out.println(posts.get(i).title);
				System.out.println("");
				System.out.println(posts.get(i).content);
				System.out.println("");
				System.out.println(posts.get(i).id);
				System.out.println("");
				System.out.println("---------------------------");
			}
			break;
			
		case "3":
			System.out.println("--------------글읽기--------------");
			System.out.println("읽을 글 번호 입력:");
			int readNo = sc.nextInt();
			

			for(int i = 0; i<posts.size();i++ ) {
				if(posts.get(i).no == readNo) {
			
					System.out.println("-----------------------------");
					System.out.println("작성자id:" +posts.get(i).id);
					System.out.println("-----------------------------");
					System.out.println("글 제목:" +posts.get(i).title);
					System.out.println("-----------------------------");
					System.out.println("글 내용:" +posts.get(i).content);
					System.out.println("-----------------------------");
					
				}
			}
			break;
	
		case "4":		//글 삭제
			System.out.println("--------------글 삭제--------------");
			System.out.println("삭제할 글 번호 입력: ");
			int delNo = sc.nextInt();
			
			
			for(int i = 0; i<posts.size();i++ ) {
				if(posts.get(i).no == delNo) {
					
					System.out.println(posts.get(i).no + "글이 삭제 되었습니다.");
					posts.remove(i);
					break;				
				}
			}
			break;
		case"e":
			System.out.println("--------------종료------------");
			break loop;
			
		}

	}
	}
}
