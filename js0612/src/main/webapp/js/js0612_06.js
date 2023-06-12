/**
 * 랜덤함수
 */

// 변수 선언 방식(세가지): let(권장상 추천),var,const(상수)

var random = Math.floor(Math.random()*100)+1; //1-100

var input = Number(prompt("1-100까지 숫자를 입력하세요."),"예시:0"); // ,"예시:0" ≈ placeholder


if(input==random){  //1=="1" : 같음 ,1==="1": 다름 (타입까지 같아야 함.)
	document.write("정답입니다. 정답 : ",random);
}else{
	alert("오답입니다. 정답 : "+random);
	//document.write("오답입니다. 정답 : ",random);
	location.reload() //브라우저 새로고침 ≈ F5
}