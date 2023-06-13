/**
 * 입력하여 콘솔창에 답출력하기
 */
function stuScore(){
	var kor = Number(prompt("국어점수를 입력하세요."));	//Number 정수형, 실수형 모두 가능
	var eng = Number(prompt("영어점수를 입력하세요."));	
	var math = Number(prompt("수학점수를 입력하세요."));	
	console.log("점수 합계 : ",(kor+eng+math));
	console.log("점수 평균 : ",((kor+eng+math)/3.0));
}

