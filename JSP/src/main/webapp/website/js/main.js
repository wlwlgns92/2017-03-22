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