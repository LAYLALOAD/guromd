/**
 * 시간가져오기
 */

var a = 0;		//변수선언 :변수가 같아도 오류가 나지 않는다. var의 단점
let aaa = 0;	//변수선언 :변수가 같으면 오류가 난다. let 사용 권고함
const bbb = 0;  //상수선언

var interval;

function start(){
	interval = setInterval(function(){
		var today = new Date();
		var hours = today.getHours();
		var minutes = today.getMinutes();
		var seconds = today.getSeconds();
		var seconds2;
		if(seconds<10) seconds2 = "0"+seconds;
		else seconds2 = seconds; 
		var milliseconds = today.getMilliseconds();
		document.getElementById("h01").innerText = hours+":"+minutes+":"+seconds2
	},1000);
}