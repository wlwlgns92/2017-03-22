/**
 * 
 */

		var price = 5;
		var num1 = 14;
		var total = price * num1;
		// 현재 문서의 html 태그 id 가져오기 [ span을 객체로 가져오기 ]
		var elem = document.getElementById("number");
		elem.textContent = total;
		
		var minus = price - num1;
		var plus = price + num1;
		var elem1 = document.getElementById("number1");
		if( price == num1 ) {
			elem1.textContent = minus;
		}else { 
			elem1.textContent = plus;
		}
		
		function start() { // 함수 선언 [ function 메소드명() { 실행문 }]
		//배열 : var 변수명 = [ 요소1, 요소2, 요소3 ~~]
		
		var color = ['red', 'white', 'black'];
		var colorname = document.getElementById("color");
		colorname.textContent = color[0];
		colorname.style.color = color[0]; // 태그명.style.속성명
		 
		
		var colors = color.length;
		var colorlength = document.getElementById("colors");
		colorlength.textContent = colors;
		
		document.body.style.backgroundColor = "blue";
		}
		
		function start2() {
			var text = ""; // 변수선언 [ 자료형 없음 ]
			var count = 1;
			// while문
			while(count < 10) { // 반복문
				text+= "<li> 여기는 숫자" + count+ "</li>";
				// 변수는 "" 처리 불가
				// html 태그는 문자 처리
				count++; 	
			}
			document.getElementById("list").innerHTML = text;

			// for문
			var text1 = "";
			for( var i = 1; i < 6; i++) {
				text1 +="<li> 여기는 숫자 : " + i + "</li>";
			}
			document.getElementById("list1").innerHTML = text1;
			
			//배열
			var text2 = "";
			var phone = ["아이폰" , "갤럭시", "엘지폰"];
			for( var i = 0; i < phone.length; i++) {
				
				text2 += "<li>"+phone[i]+"</li>"
			}
			document.getElementById("list2").innerHTML = text2;
			
		}
		
		function cancel() {

			document.getElementById("list").innerHTML = "";
			document.getElementById("list1").innerHTML = "";
			document.getElementById("list2").innerHTML = "";
		}
		
		function start3(){
			// 기존 리스트 가져오기
			var text = document.getElementById("list").innerHTML;
			var product = "콜라"; // 변수
			text += "<li>"+product +"</li>" // 콜라변수 추가
			document.getElementById("list").innerHTML = text;
		}
		
		function start4(num1, num2){ // 변수를 인수로 받음 [자료형은 없다.]
			
			var total = num1 * num2; // 인수를 가져와 연산 
			document.getElementById("result").textContent =total;
			
		}
		