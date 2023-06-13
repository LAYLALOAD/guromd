/**
 * 함수 (1.입력하여 리턴해서 콘솔에 출력 2. 입력하여 함수를 불러와 콘솔에 출력)
 */
function input(){
	var num = Number(prompt("1번째 숫자를 입력하세요."));
	var num2 = Number(prompt("2번째 숫자를 입력하세요."));
	console.log(num);
	console.log(num2);
	var result = add(num,num2);
	console.log("더하기 결과값 : ",result);
	sub(num,num2);
}


function add(num,num2){
	return num+num2;
}


function sub(num,num2){
	console.log("빼기 결과값 : ",(num-num2))
}