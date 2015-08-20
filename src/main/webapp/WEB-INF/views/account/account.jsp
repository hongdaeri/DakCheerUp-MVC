<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	int randomBgImgNumber = (int)(Math.random() * 8 + 1) ;
%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="ko" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<html lang="ko">
<!--<![endif]-->
<head>
	<meta charset="utf-8" />
	<title>::닥취업::당신의 취업도우미</title>
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />

	<!-- ================== BEGIN BASE CSS STYLE ================== -->
	<link href="/resources/css/m_style.css" rel="stylesheet" />
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700"	rel="stylesheet">
	<link href="/resources/plugins/jquery-ui/themes/base/minified/jquery-ui.min.css" rel="stylesheet" />
	<link href="/resources/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
	<link href="/resources/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
	<link href="/resources/css/animate.min.css" rel="stylesheet" />
	<link href="/resources/css/style.min.css" rel="stylesheet" />
	<link href="/resources/css/style-responsive.min.css" rel="stylesheet" />
	<link href="/resources/css/theme/default.css" rel="stylesheet" id="theme" />
	<!-- ================== END BASE CSS STYLE ================== -->	
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="/resources/plugins/pace/pace.min.js"></script>
	<script src="/resources/js/account.js"></script>
	<!-- ================== END BASE JS ================== -->
</head>
<body class="pace-top">
	<!-- begin #page-loader -->
	<div id="page-loader" class="fade in">
		<span class="spinner"></span>
	</div>
	<!-- end #page-loader -->

	<div class="login-cover">
		<div class="login-cover-image">
			<img src="/resources/img/login-bg/bg-<%=randomBgImgNumber%>.jpg" data-id="login-cover-image" alt="" />
		</div>
		<div class="login-cover-bg"></div>
	</div>
	<!-- begin #page-container -->
	<div id="page-container" class="fade">
		<!-- begin login -->
		<div class="login login-v2" data-pageload-addclass="animated fadeIn">
			<!-- begin brand -->
			<div class="login-header">
				<div class="brand">
					<span class="logo"></span> 닥치고취업하자 <small>닥취업을 이용하기 위해 로그인이
						필요합니다.</small>
				</div>
				<div class="icon">
					<i class="fa fa-sign-in"></i>
				</div>
			</div>
			<!-- end brand -->
			<div class="login-content">
				<form action="/account/login" method="POST"	class="margin-bottom-0">
					<div class="form-group m-b-20">
						<input name="memberId" type="text" class="form-control input-lg" placeholder="ID" />
					</div>
					<div class="form-group m-b-20">
						<input name="memberPassword" type="password" class="form-control input-lg" placeholder="Password" />
					</div>
					<div class="checkbox m-b-20">
						<label> <input type="checkbox" id="autoLogin" name="autoLogin" value="true"/> 자동 로그인 </label>
						<label id="autoLogin-label" style="display:none">반드시 개인 PC에서만 사용하세요!</label>
					</div>
					<div class="login-buttons">
						<button type="submit" onClick="login_validate(this.form);" class="btn btn-success btn-block btn-lg">로그인</button>
					</div>
					<div id="sign_up" class="login-buttons m-t-10">
						<a href="#modal-dialog" data-toggle="modal"><button type="button" class="btn btn-warning btn-block btn-lg">회원가입</button></a>
					</div>
					<div class="m-t-20">
						아이디/패스워드를 잊어버리셨나요? <a href="#">여기</a>를 누르세요.
					</div>
				</form>
			</div>
			
		</div>
		<!-- end login -->
<!--
		<ul class="login-bg-list">
			<li class="active"><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-1.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-2.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-3.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-4.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-5.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-6.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-7.jpg" alt="" /></a></li>
			<li><a href="#" data-click="change-bg"><img src="/resources/img/login-bg/bg-8.jpg" alt="" /></a></li>
		</ul>
-->
	</div>
	<!-- end page container -->
	<!-- #modal-dialog -->
	<div class="modal fade" id="modal-dialog">
		<div class="modal-dialog ">
			<div class="modal-content ">
			<form action="/account/signUp" method="post" class="form-horizontal form-bordered" name="sign-up-form">
	           	<fieldset>
				<div class="modal-header bg-black text-center">
					<button type="button" class="close btn-danger" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title text-white">회원가입</h4>
				</div>
				<div class="modal-body">					
              		<div class="form-group">
						<label class="control-label col-md-4 col-sm-4" for="memberId">아이디 :</label>
						<div class=" col-md-6 col-sm-6">									
							<div class="input-group">                               
								<input class="form-control" type="text" id="memberId" name="memberId" placeholder="아이디를 력하세요." />
								<div class="input-group-btn">
									<button type="button" class="btn btn-success">중복체크</button>
								</div>
							</div>                           			
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-4 col-sm-4" for="memberName">이름 :</label>
						<div class="col-md-6 col-sm-6">
							<input class="form-control" type="text" id="memberName" name="memberName" placeholder="이름을 입력하세요(별명도 괜찮습니다.)" />
						</div>
					</div>	                      
					<div class="form-group">
						<label class="control-label col-md-4 col-sm-4" for="memberPassword">비밀번호 :</label>
						<div class="col-md-6 col-sm-6">
							<input class="form-control" type="password" id="memberPassword" name="memberPassword" placeholder="비밀번호를 입력하세요." />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-4 col-sm-4" for="memberPassword_Re">비밀번호 확인 :</label>
						<div class="col-md-6 col-sm-6">
							<input class="form-control" type="password" id="memberPassword_Re" name="memberPassword_Re" placeholder="비밀번호를 다시 한번 입력하세요." />
						</div>
					</div>                         
				</div>
				<div class="modal-footer bg-black">		
					<a href="javascript:" class="btn btn-danger" data-dismiss="modal">취소</a>
					<button type="button" onclick="signup_validate(this.form)" class="btn btn-success"><i class="fa fa-sign-in m-r-10"></i>회원가입 완료</button>
				</div>
				</fieldset>
 			</form>
			</div>
		</div>
	</div>
	

	<!-- ================== BEGIN BASE JS ================== -->
	<script src="/resources/plugins/jquery/jquery-1.9.1.min.js"></script>
	<script src="/resources/plugins/jquery/jquery-migrate-1.1.0.min.js"></script>
	<script src="/resources/plugins/jquery-ui/ui/minified/jquery-ui.min.js"></script>
	<script src="/resources/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!--[if lt IE 9]>
		<script src="/resources/crossbrowserjs/html5shiv.js"></script>
		<script src="/resources/crossbrowserjs/respond.min.js"></script>
		<script src="/resources/crossbrowserjs/excanvas.min.js"></script>
	<![endif]-->
	<script
		src="/resources/plugins/jquery-hashchange/jquery.hashchange.min.js"></script>
	<script src="/resources/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="/resources/plugins/jquery-cookie/jquery.cookie.js"></script>
	<!-- ================== END BASE JS ================== -->
	
	
	
	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
	<script src="/resources/js/ui-modal-notification.demo.min.js"></script>
	<script src="/resources/js/login-v2.demo.min.js"></script>
	<script src="/resources/js/apps.min.js"></script>
	<!-- ================== END PAGE LEVEL JS ================== -->

	<script>
		$(document).ready(function() {
			App.init();
			LoginV2.init();

			$("#autoLogin").click(function() {
				$("#autoLogin-label").toggle();
			})
		});
	</script>
</body>
</html>
