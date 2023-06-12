/**
 * 성적처리 프로그램 
 */

var htmlData="";


//81~100 랜덤함수를 이용해서 국어, 영어, 수학 점수를 입력받아 합계 평균을 추가해서 출력하시오.

for(var i=0;i<10;i++){
	
	var kor = Math.floor(Math.random()*20)+81; //81~100
	var eng = Math.floor(Math.random()*20)+81;
	var math = Math.floor(Math.random()*20)+81;
	var total = kor+eng+math;
	var avg = (total/3.0).toFixed(2);

	htmlData +="<tr>";
	htmlData +="<td>"+(i+1)+"</td>";
	htmlData +="<td>홍길동</td>";
	htmlData +="<td>"+kor+"</td>";
	htmlData +="<td>"+eng+"</td>";
	htmlData +="<td>"+math+"</td>";
	htmlData +="<td>"+total+"</td>";
	htmlData +="<td>"+avg+"</td>";
	htmlData +="<td>1</td>";
	htmlData +="<td>2023-06-12</td>";
	htmlData +="<td>관리자</td>";
	htmlData +="</tr>";
}


document.getElementById('tbody').innerHTML=htmlData;
	      
	      
	      
	      
	      
	      
	      
	      
	      
	    
	  