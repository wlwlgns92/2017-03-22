/**
 *  다음주소 api
 */
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
 
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();


}
	/* 다음 api 종료 */
	
	/* 회원탈퇴 [ ajax : jquery  ] */ 

	// $( function(){ 실행문 });	: js함수 정의하기
	$( function(){ 
		// 버튼을 클릭했을때 이벤트 걸기 
		$("#delete").click( function(){ 
			// ajax : 비동기식 통신 [ 페이지전환없이 통신 ]
				//$.ajax({ 속성명:값 , 속성명:값 , 속성명:값  });
			$.ajax({
				url : "../../controller/memberdeletecontroller.jsp" ,
				/* url : 통신 경로 */
				data : {password:document.getElementById("deleteform").password.value} ,
				/* data : { 변수명 : 값 } */ 
				success : function( result  ){
					if( result == 1 ){
						alert('회원탈퇴 되었습니다');
						location.href='../../controller/logoutcontroller.jsp';
					}else{
						document.getElementById("deleteresult").innerHTML = "회원정보가 다릅니다.";
					}
				
				}
			});
		} ); // 버튼 클릭했을때 함수 끝
	 }); // 전체 함수 끝 

	

	/* 회원탈퇴 */

	/* 아이디 중복체크 [ajax]*/
	$(function(){
		// $("아이디명").이벤트명(함수명(){실행코드;} );
		$("#id").change(function() {  
			// 비동기식 : $.ajax({속성명:"값", 속성명:"값",속성명:"값"});
			$.ajax({
				url : "idcheck.jsp",  				// 통신할 경로 페이지
				data : {userid:document.getElementById("signupform").id.value } ,	// 이동할 데이터
				success : function( result ) { // 성공했을때
					if(result == 1) {
						document.getElementById("idresult").innerHTML ="사용중인 아이디입니다.";
					 }
					else {
						document.getElementById("idresult").innerHTML ="사용 가능한 아이디입니다.";
					 }
				 }
			 });
		});
	});

	function namechange(){ 
		
		// 1. 클릭했을때 html 수정
		document.getElementById("tdname").innerHTML = "<input type='text' id='name' class='form-control'> <button id='namechangebtn' class='form-control'>확인</button>";
	
		$( function(){
			// $("id명").이벤트명( 함수명(){ 실행코드; } );
			$("#namechangebtn").click( function() { 
				$.ajax({ 
					url : "../../controller/memberupdate.jsp" ,	
					/* url : 통신할 경로 페이지 */ 
					data :{ newname:document.getElementById("name").value} , 	
					/* 이동할 데이터 */
					success : function( result ){ 
					/* 통신이 성공했을때*/
						if( result == 1 ){ 	// js 변수는 자료형 없다
							document.getElementById("tdname").innerHTML =  document.getElementById("name").value;
						}else{
							alert("[ 수정 오류 : 관리자에게문의]");
						}
					}
				});
			});
		});
		
	}

	/* 회원가입 유효성 검사 */
	
	function signupcheck() {
		
		// 1. 폼 가져오기 [ 폼에 id 존재 ]
		// document.getElementById("signupform");
		// 2. 폼내 아이디 입력 input 가져오기
		var id = document.getElementById("signupform").id.value;
		var password = document.getElementById("signupform").password.value;
		var passwordconfirm = document.getElementById("signupform").passwordconfirm.value;
		var phone = document.getElementById("signupform").phone.value;
		var name = document.getElementById("signupform").name.value;
		var birth = document.getElementById("signupform").birth.value;
		var sex1 = document.getElementById("signupform").sex1.checked; // 체크 유무 가져오기 false : 미입력
		var sex2 = document.getElementById("signupform").sex2.checked;

		//alert(id);
		// 3. 유효성검사 [ 정규표현식 ]
			// 정규표현식 
			var idj = /^[a-z0-9]{5,15}$/;
			var pwj = /^[A-Za-z0-9]{5,15}$/;
			var phonej = /^01([0|1|6|7|8|9]?)?([0-9]{3,4})?([0-9]{4})$/;
			var namej = /^[A-Za-z0-9가-힣]{1,15}$/; // 이름 정규표현식
							//([0|1|6|7|8|9]?) 중 하나 ?는 문자가 있거나 혹은 하나 있음(와일드카드 개념)
							// 와일드 카드
								// * : 문자가 없거나 혹은 여러개 존재
								// ? : 문자 있거나 혹은 하나 있음[ ?당 문자 1개 ] 
			if(!idj.test(id)) {
				//alert("가능");
				document.getElementById("idresult").innerHTML = "아이디는 소문자와 숫자조합 5 ~ 15 글자 사이만 가능합니다.";
				document.getElementById("idresult").style.color= "red";	
				return false; // form submit 불가			
			}else {
				document.getElementById("idresult").innerHTML = "사용가능한 아이디입니다.";
				document.getElementById("idresult").style.color= "skyblue";
			}
			
			// 패스워드 [ 두 패스워드 동일한지 검사 ]
			
			if(!pwj.test(password) || !pwj.test(passwordconfirm)) {
				document.getElementById("pwresult").innerHTML = "대소문자 조합 5~15 사이만 가능합니다.";
				document.getElementById("pwresult").style.color= "red";	
				return false;
			} 
			else if(password != passwordconfirm) {
				document.getElementById("pwresult").innerHTML = "비밀번호가 일치하지 않습니다.";
				document.getElementById("pwresult").style.color= "red";
				return false;
			}else {
				document.getElementById("pwresult").innerHTML = "사용가능";
				document.getElementById("pwresult").style.color= "purple";
			}
			
			// 전화번호
			if(phone == "") {
				document.getElementById("phoneresult").innerHTML = "연락처를 입력해 주세요 "; return false;
			}
			else if(phonej.test(phone)) {
				document.getElementById("phoneresult").innerHTML = "연락처가 입력형식에 맞지 않습니다.";
				document.getElementById("phoneresult").style.color= "purple";
				return false;
			}else {
				document.getElementById("phoneresult").innerHTML = "";
			}
			
			// 이름 
			if(name == "") {
				document.getElementById("nameresult").innerHTML = "성명을 입력해 주세요"; return false;
			}else if (!namej.test(name)) {
				document.getElementById("nameresult").innerHTML = "특수문자는 사용불가합니다"; return false;
			}else {
				document.getElementById("nameresult").innerHTML = "";
			}
			
			// 생년월일
			if(birth == "") {
				document.getElementById("birthresult").innerHTML = "생년월일을 입력해 주세요"; return false;	
			}else {
				document.getElementById("birthresult").innerHTML = "";
			}
		
			// 성별
			if(!sex1 && !sex2) { // 둘다 false이면 : 둘다 체크 안했으면
				document.getElementById("sexresult").innerHTML = "성별을 선택해주세요"; return false;	
			}
			else {
				document.getElementById("birthresult").innerHTML = "";
			}
	} 
	
	
	/* 회원가입 유효성 검사  end*/
	
	function activeupdate(p_num){
		
		if(confirm("상태변경하시겠습니까?") == true){
			//동기식
			//location.href('../../controller/productactivecontroller.jsp?p_num='+p_num);
			
			// 비동기식
			$(function() {
				$.ajax({ 
					url : "../../controller/productactivecontroller.jsp",
					data : {p_num : p_num},
					success : function(result) {
						if(result == 1) { // js 자료형이 없음 
							// 현재 페이지 초기화
							location.reload();  // jquery 메소드
						}else {
							alert("변경실패");
						}
					}
					
					
				})
				
			});
		} 
		
	}
	
	/*제품 수량 변경 */
	
	function pchange(type , stock, price){ // 버튼 타입과 재고 인수로 받음
		var p_count = document.getElementById("p_count").value*1;
		
		
					// 현재수량 가져오기 // 문자열-> 숫자열 : *1
		if( type =='m') { // - 버튼을 눌렀을때
			p_count -= 1; // 현재수량 -1 
			if(p_count < 1){ // 만약에 1보다 작아지면
				alert("1개 이상 주문 가능합니다."); // 메시지 출력 
				p_count = 1;
			}
		}else if(type=="p") { // + 버튼을 눌렀을때
			p_count += 1; // 1증가
			if(p_count > stock) { // 만약에 현재 수량이 재고보다 작다면
				alert("재고가 부족합니다."); // 메시지 출력
				p_count = stock;
			}
		}else { // 만약에 직접 수량을 변경 입력했을때
			if(p_count > stock) { // 만약에 현재 수량이 재고보다 작다면
				alert("재고가 부족합니다."); // 메시지 출력
				p_count =1;
			}
			if(p_count < 1){ // 만약에 1보다 작아지면
				alert("1개 이상 주문 가능합니다."); // 메시지 출력 
				p_count = 1;
			}
		}
		//현재 수량을 현재 수량 입력상자에 대입
		document.getElementById("p_count").value = p_count;
							// .value 속성태그 [ 입력상자 input ]
		var totalprice = p_count*price; // 총가격 = 제품수량 * 가격
		document.getElementById("total").innerHTML = totalprice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
							// .innerHTML 속성태그 [ div는 값이 없기때문에 바로 HTML로 들어간다. ]
							 // replace(기존문자, 새로운문자);
								// 정규표현식 : /\B(?=(\d{3})+(?!\d))/g
									// 1. / : 시작
									// 2. \B : 시작 끝 [ 예: 1234일경우 1, 4 ]
									// 3. \ㅇ{3} : 숫자 길이 [ 예 : {3} : 숫자길이 123 ]
									// 4. !\d : 뒤에 숫자 
									// 5. /g : 전역 검색
	}
	/*제품 수량 변경 end*/
	
	/* 찜하기 */
	function p_like(p_num, m_num) {
		// 비동기식 통신 함수 ajax
		if(m_num == 0) {alert("로그인 후 사용 가능합니다."); return; }
		$(function() {
			
			$.ajax({
				url: "../../controller/productlikecontroller.jsp",
				data : {p_num : p_num, m_num : m_num },
				success : function(result) {
					if(result == 1) {
						document.getElementById("btnplike").innerHTML = "찜하기♡";
					}else if(result == 2){
						document.getElementById("btnplike").innerHTML = "찜하기♥";
					}
					
					alert(result);
				}
			});
			
		});
	}
	/* 찜하기 end*/
	
	/* 장바구니 */
	function cartadd(){
		// 제이쿼리를 이용한 값 가져오기
		// 1. id속성 이용
	/*	var p_num2 = $("#p_num").val(); 
		// 2. name속성 이용
		var p_num3 = $("input[name=p_num]").val(); 
		// 3. class 속성 이용
		var p_num4 = $(".p_num").val(); 
		
		// 자바스크립트를 이용한 값 가져오기
			// 1. id 속성 이용
		var p_num = document.getElementById("p_num").value;
			// 2. class= 속성 // class는 중복 허용하기 때문에 배열을 이용
		var p_num5 = document.getElementsByClassName("p_num")[0].value;
			// 3. name 속성 // name도 중복을 허용하기 때문에 배열을 이용
		var p_num6 = document.getElementsByName("p_num")[0].value;
	*/
		var p_num = document.getElementById("p_num").value;   
		var p_size = document.getElementById("p_size").value;
		if(p_size == 0) {
			alert("옵션을 선택하세요 ");	return; 
		}
		var p_count = document.getElementById("p_count").value;
		
		// controller 페이지로 이동 
			// 1. 하이퍼링크를 쓴다
				/*
				html : <a href="#"> </a>
				js : location.href = "#"
				jsp : response.sendredirect(#)
				*/
			// 2. ajax
		//	location.href = "../../controller/productcartcontroller.jsp?p_num="+p_num+"&p_size="+p_size+"&p_count="+p_count;
		
		$.ajax({ // 페이지 전환 없음 [ 해당 페이지와 통신 ]
			
			url : "../../controller/productcartcontroller.jsp" ,
			data : {p_num : p_num, p_size : p_size, p_count : p_count} ,
			success : function(result) {
				if(confirm("장바구니에 담았습니다. [장바구니로 이동하시겠습니까 ?]") == true ) {
					location.href="productcart.jsp"
				}
			}
		});
	}
	
	/* 장바구니 end*/
	
	
	/* 장바구니 모두 삭제 */
	function cartdelete( type, p_num, p_size){
		
		
		$.ajax({ // 페이지 전환 없음 [ 해당 페이지와 통신 ]
			
			url : "../../controller/productcartdeletecontroller.jsp" ,
			data : {type : type, p_num : p_num, p_size : p_size, i : -1, p_count : -1} ,
			success : function(result) {
				location.reload();
				
			}
		});
	}
	
	
	
	
	
	
	/* 장바구니 모두 삭제 */
	
	
	/*장바구니 수량 변경 */
	
	function pchange2(i, type, stock, price) {
		
		var p_count = document.getElementById("p_count"+i).value*1;
		
		if( type =='m') { // - 버튼을 눌렀을때
			p_count -= 1; // 현재수량 -1 
			if(p_count < 1){ // 만약에 1보다 작아지면
				alert("1개 이상 주문 가능합니다."); // 메시지 출력 
				p_count = 1;
			}
		}else if(type=="p") { // + 버튼을 눌렀을때
			p_count += 1; // 1증가
			if(p_count > stock) { // 만약에 현재 수량이 재고보다 작다면
				alert("재고가 부족합니다."); // 메시지 출력
				p_count = stock;
			}
		}else { // 만약에 직접 수량을 변경 입력했을때
			if(p_count > stock) { // 만약에 현재 수량이 재고보다 작다면
				alert("재고가 부족합니다."); // 메시지 출력
				p_count =1;
			}
			if(p_count < 1){ // 만약에 1보다 작아지면
				alert("1개 이상 주문 가능합니다."); // 메시지 출력 
				p_count = 1;
			}
		}
		//현재 수량을 현재 수량 입력상자에 대입
		document.getElementById("p_count"+i).value = p_count;	
		var totalprice = p_count*price; // 총가격 = 제품수량 * 가격
		
		$.ajax({ // 페이지 전환 없음 [ 해당 페이지와 통신 ]
			
			url : "../../controller/productcartdeletecontroller.jsp" ,
			data : {type : type, p_num : -1, p_size : -1, i : i , p_count : p_count} ,
			success : function(result) {
				location.reload(); // 새로고침
			}
		});
	
	}
	/* 결제방식선택 */
	
	function paymentselect(payselect) {
		
		document.getElementById("payselect").innerHTML=payselect;
		
		
	}
	
	/* 결제방식선택 end*/
	
	/* 결제 API 아이엠포트 */
	function payment() {
		
		if( document.getElementById("payselect").innerHTML == "") {
			alert("결제방식을 선택해 주세요");
			retrun;
		}
		var IMP = window.IMP;
	    IMP.init("imp64853372"); // 관리자 식별코드
		
	// IMP.request_pay(param, callback) 결제창 호출
     	  IMP.request_pay({ // 결제 요청변수
          pg: "html5_inicis", // pg사 [ 아임포트 관리자페이지에서 선택한 pg사 ]
          pay_method: document.getElementById("payselect").innerHTML,	// 결제방식
          merchant_uid: "ORD20180131-0000011",
          name: "아무거나", // 결제창에 나오는 결제 이름
          amount: document.getElementById("totalpay").innerHTML, // 결창에 나오는 가격
          buyer_email: "gildong@gmail.com",
          buyer_name: $("#name").val(),
          buyer_tel: $("#phone").val(),
          buyer_addr: $("#sample4_roadAddress").val()+","+ $("#sample4_jibunAddress").val()+","+$("#sample4_detailAddress").val(),
          buyer_postcode: $("#sample4_postcode").val()

      }, function (rsp) { // callback
          if (rsp.success) {
			// 결제 성공시 -> 주문완료 페이지로 이동
          } else {
			// 결제 실패 했을때
				// 테스트 : 결제 성공
				$.ajax({
					url : "../../controller/productpaymentcontroller.jsp",
					data : {
						order_name : $("#name").val(),
						order_phone : $("#phone").val(),
						order_address : $("#sample4_roadAddress").val()+","+ $("#sample4_jibunAddress").val()+","+$("#sample4_detailAddress").val()+","+$("#sample4_postcode").val(),
						order_pay : document.getElementById("totalpay").innerHTML,
						order_payment : document.getElementById("payselect").innerHTML,
						delivery_pay : 3000,
						order_request : document.getElementById("prequest").value
					},
					success : function(result){
						if(result == 1) {location.href="productpaymentsuccess.jsp";} 
						else { alert("오류 관리자에게 문의"); }
					}
					
				});
				
				
          }
      });
	}
	/* 결제 API 아이엠포트 end*/
	
	/* 회원과 동일 체크 */
	
	// 체크 유무검사 [ jquery ]
	//$(document).ready(function(){실행문 }); // 문서내에서 대기상태 메소드
	$(document).ready(function(){ 
		
		$("#checkbox").change(function() {
			// 체크박스가 체크가 되었는지 확인 = true
				//.is 해당 태그에 속성 유무 확인 [":속성명""] 메소드
			if($("#checkbox").is(":checked")){
				$("#name").val( $("#mname").val() );
				$("#phone").val( $("#mphone").val());
			}else{
				$("#name").val("");
				$("#phone").val("");
			}
			
			
		});
		$("#checkbox2").change(function() {
			if($("#checkbox2").is(":checked")){
				$("#sample4_postcode").val( $("#address1").val());
				$("#sample4_roadAddress").val($("#address2").val());
				$("#sample4_jibunAddress").val($("#address3").val());
				$("#sample4_detailAddress").val($("#address4").val());
			}else{
				$("#sample4_postcode").val("");
				$("#sample4_roadAddress").val("");
				$("#sample4_jibunAddress").val("");
				$("#sample4_detailAddress").val("");
			}
			
			
		});
	}); 
	/* 회원과 동일 체크 end */
	
	/* 결제 정보 */
	
	function pointcheck(mpoint){
		
		var point= document.getElementById("point").value*1;
		if(mpoint < point) {
			alert("포인트가 부족합니다.");
			point = 0;
		}else {
			document.getElementById("usepoint").innerHTML = point;

		}
		
		
			var totalprice = document.getElementById("totalprice").innerHTML*1;
			var totaldeli = document.getElementById("totaldeli").innerHTML*1;
			document.getElementById("totalpay").innerHTML =totalprice+totaldeli-point;
			

	}
	/* 결제 정보 end*/
	
	
	
	
	