/**
 * setInterval : 자동으로 추가
 */
var count=0;
var interval;

//setInterval 추가
function setIn(){
	var htmlData = "";
	htmlData += "<tr>";
	htmlData += "<td>";
	htmlData += "1";
	htmlData += "</td>";
	htmlData += "</tr>";
	
	//var data =  document.getElementById("t01").innerHTML = htmlData;
	//var data =  document.getElementById("t01").innerText = htmlData;
	$("#t01").append(htmlData); //$:제이쿼리 구문, #:id
	
	
    interval = setInterval(function(){
		count += 1;
		console.log("숫자 : ",count);
	},1000); //1/1000초 밀리세컨드 1000=1초
}

//setInterval 삭제
function setOut(){
	console.log("멈춤");
	clearInterval(interval);
}