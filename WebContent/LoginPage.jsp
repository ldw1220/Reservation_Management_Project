<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레스토랑 매니지먼트 로그인 화면 입니다.</title>

<!-- BootStrap & Popper CDN -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- 커스텀 CSS -->
<link rel="stylesheet" href="./css/custom.css">
</head>

<body>
	
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light shadow-sm bg-light" id="mainNav">
		<div class="container px-5">
			<a class="navbar-brand fw-bold" href="LoginPage.jsp">Restaurant</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="bi-list"></i>
			</button>
			<div class="collapse navbar-collapse nav justify-content-end" id="navbarResponsive">
				<button class="btn btn-primary rounded-pill px-3 mb-2 mb-lg-0" data-bs-toggle="modal" data-bs-target="#feedbackModal">
					<span class="d-flex align-items-center"> <i class="bi-chat-text-fill me-2"></i> <span class="small">Send Feedback</span>
					</span>
				</button>
			</div>
		</div>
	</nav>
	<header class="masthead">
		<div class="container px-5">
			<div class="row gx-5 align-items-center">
				<div class="col-lg-6">
					<!-- Mashead text and app badges-->
					<div class="mb-5 mb-lg-3 text-center text-lg-start">
						&nbsp;
						<h3 class="display-1 lh-9 mb-3">안녕하세요</h3>
						<p class="lead fw-normal text-muted mb-5">Restaurant를 이용하시는 고객분들께 항상 감사합니다. 더욱 편리한 이용을 위하여 저희는 효율적인 예약 매니지먼트를 운영하고 있으며 고객분들의 원할한 식사 대접을 제공해드리기 위해 최선을 다 하겠습니다. 감사합니다.</p>
					</div>
					<p>
						<i class="far fa-calendar-check"></i> 편리한 예약 시스템
					</p>
					<p>
						<i class="fas fa-chalkboard-teacher"></i> 질의 응답 게시판 활성화
					</p>
					<p>
						<i class="fab fa-instagram"></i> 식당 이용객 후기 확인
					</p>
				</div>
				<div class="col-lg-6">
					<!-- 영역 크기 -->
					<!-- 점보트론은 특정 컨텐츠, 정보를 두드러지게 하기 위한 큰 박스 -->
					<div class="jumbotron" style="padding-top: 20px;">
						<form method="post" action="loginAction">
							<h3 style="text-align: center;">로그인 화면</h3>
							<div class="form-group">
								<label>아이디</label>
								<input type="text" class="form-control" name="m_ID">
								<small class="form-text text-muted">아이디는 어떠한 경우에도 공유되지 않습니다.</small>
							</div>
							&nbsp;
							<div class="form-group">
								<label>비밀번호</label>
								<input type="password" class="form-control" name="m_PWD" placeholder="***********">
							</div>
							&nbsp;
							<input type="submit" class="btn btn-primary form-control" value="로그인">
							&nbsp;
						</form>
						<small class="form-text text-muted">아직 회원이 아니십니까 ?</small>
						<form method="GET" action="join.jsp">
								<input class="btn btn-primary form-control" type="submit" value="회원가입">
						</form>
					</div>
				</div>
			</div>
		</div>
	</header>
	<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;"> Copyright ⓒ 2022 빠른굼벵이 All Rights Reserved. </footer>
</body>
</html>