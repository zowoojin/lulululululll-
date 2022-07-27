package com.peisia.board;

public class Post {
	String title;	//글 제목
	String content; //글 본문.내용
	String id;		//글 작성자id
	int no;		//글번호
	
	public Post(String title, String content, String id, int no) {
		super();
		this.title = title;
		this.content = content;
		this.id = id;
		this.no = no;
	}


}
	
