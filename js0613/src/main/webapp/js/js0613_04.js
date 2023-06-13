/**
 * 부모창 자식창 값 전달
 */
var openWin; //전역변수

function popupSend(){
	alert("부모창으로 값을 전달합니다.")
	opener.document.getElementById("receive").value = document.getElementById("send").value; 
}


function sandValue(){
	alert("자식창으로 값을 전달합니다.");
	openWin.document.getElementById("reValue").value = document.getElementById("textInput").value;
}

 function popupOpen(){
	 openWin = window.open("h0613_04_popup.html", "popupForm", "width=400px, height=550px, resizable=no, scrollbars=no");/*이름(, "popupForm")이 주어주면 팝업이 여러개 뜨지 않는다.*/
 }