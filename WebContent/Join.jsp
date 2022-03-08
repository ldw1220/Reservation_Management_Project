<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>

<!DOCTYPE html>
<html>
	<head>
		<!-- BootStrap & Popper CDN -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

		<!-- jQuery CDN -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

		<!-- 커스텀 CSS -->
		<link rel="stylesheet" href="./css/custom.css">
		<meta charset="UTF-8">
		<title>회원가입 화면입니다.</title>
	</head>
	<body>
		<div class="col-lg-4" style="float: none; margin:0 auto;">
				<!-- 영역 크기 -->
				<!-- 점보트론은 특정 컨텐츠, 정보를 두드러지게 하기 위한 큰 박스 -->
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="CheckID.jsp">
					<h3 style="text-align: center;">회원 가입</h3>
					<div class="form-group">
						<label>아이디</label>
						<div class="col-gl-4">
							<div class="row">
								<div class="col">
									<input type="text" class="form-control" id="ID" placeholder="아이디를 입력하세요.">
                  				</div>
                				<div class="col col-lg-4">
                 					<input type="submit" class="btn btn-primary form-control" value="중복확인">
								</div>
							</div>
						</div>
					</div>
				</form>
				&nbsp;
				<form method="post" action="JoinSuccess.jsp">
					<div class="form-group">
						<label>비밀번호</label>
						<input type="Password" class="form-control" id="Password" placeholder="*********">
					</div>
					&nbsp;
					<div class="form-group">
						<label>비밀번호 중복확인</label>
						<input type="Password" class="form-control" id="CheckPW" placeholder="*********">
					</div>
					&nbsp;
				
					<div class="form-group">
						<label>휴대폰 번호</label>
						<input type="text" class="form-control" id="Phone" placeholder="'-'를 제외하고 입력하세요.">
					</div>
					&nbsp;
                  
					<input type="submit" class="btn btn-primary form-control" value="가입하기">
				</form>
			</div>
		</div>
	</body>
</html>