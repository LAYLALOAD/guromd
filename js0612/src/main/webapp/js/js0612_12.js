/**
 * 배열
 */

var arr1 = ["홍길동","유관순","이순신"];
var arr2 = ["강감찬","김구"];

var result = arr1.push("김유신");

//기본 for문 (일련번호를 붙일 수 있다)
for(var i=0;i<arr1.length;i++){ //초기식;조건식;증감식
	document.write(arr1[i],"<br>")
}


//단순 for문 (일련번호를 붙일 수 없다)
for(var i of arr1){ //배열을 받는 변수 of 배열
	document.write("배열 : ",i);
	document.write("<br>")
}


document.write(result); //result: data 입력된 갯수
console.log(arr1); 






/*
//js배열에는 다른 타입도 같이 쓸 수 있다.
var arr = [30,"홍길동",true,31.25]; //정수형,문자열,불린,실수형, 함수 등등 -> js배열은 다른 타입도 같이 쓸 수 있음 

for(var i=0;i<arr.length;i++){
	document.write(arr[i],"<br>");
}
*/