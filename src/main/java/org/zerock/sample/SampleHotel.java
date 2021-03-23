package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.ToString;


//필드주입 세터주입 생성자주입
@Component
@ToString   //3.lombok을 쓰면 편한이유다
public class SampleHotel {
	
	private Chef chef; //1.Chef필요하니깐 일단 선언한다. 그다음 무슨 주입을 할껀지 판단

	//2.Source >  Generate Constructor using field 추가
	public SampleHotel(Chef chef) {
		super();
		this.chef = chef;
	}
	//4.주입됐는지 확인 > test 코드로 확인한다
	
	
}
