/**
 * for문
 */
// 입력한 숫자 사이 홀수값만의 합을 구하시오
var input = Number(prompt("처음 숫자를 입력하세요."));
var input2 = Number(prompt("마지막 숫자를 입력하세요."));
// 1,100 100,1
// Math.min(), Math.max()
// var num, var num2
var num = Math.min(input,input2); //js는 원하는 만큼의 수 비교가 가능 하다. (cf. java는 두개의 숫자만 비교 가능)
var num2 = Math.max(input,input2);

/* 
//삼항식 이용 (min,max 활용과 같은 내용)
num = (input<input2)? input:input2;
num2 = (input>input2)? input:input2;
*/ 

var sum=0;
for(var i=num;i<=num2;i++){
	if(i%2!=0){
	sum += i;
	}
}

document.write("1-입력값 까지 중 홀수값만의 합 : ", sum);





/*
// 입력한 숫자까지 합을 구하시오
// 50 1-50까지, 10 1-10 까지
var input = Number(prompt("숫자를 입력하세요."));

var sum=0;
for(var i=1;i<=input;i++){
	sum+= i;
}

document.write("1-입력값 까지의 숫자 합 : ", sum);
*/





/*
// 1-100까지의 합 구하기
var sum=0;
for(var i=1;i<=100;i++){
	sum+= i;
}

document.write("1-100까지의 숫자 합 : ", sum);
*/