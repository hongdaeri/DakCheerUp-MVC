<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<link href="/resources/plugins/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
	<!-- =================== ETC ======================================= -->
</head>
<body>
<div class="wrapper bg-white">
	<div class="vertical-box">
		<div id="calendar" class="vertical-box-column p-15 calendar"></div>
		<div class="vertical-box-column p-15 bg-silver width-sm">
			<div id="external-events" class="calendar-event">
				<h4 class=" m-b-20">Draggable Events</h4>
				<div class="external-event bg-purple" data-bg="bg-purple" data-title="Discussion" data-media="<i class='fa fa-comments'></i>" data-desc="Lorem ipsum dolor sit amet, consectetur adipiscing elit.">
					<h5>
						<i class="fa fa-comments fa-lg fa-fw"></i> Discussion
					</h5>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
				</div>
				<div class="external-event bg-blue" data-bg="bg-blue" data-title="Dinner" data-media="<i class='fa fa-cutlery'></i>" data-desc="Cum sociis natoque penatibus et magnis dis parturient montes.">
					<h5>
						<i class="fa fa-cutlery fa-lg fa-fw"></i> Dinner
					</h5>
					<p>Cum sociis natoque penatibus et magnis dis parturient montes.</p>
				</div>
				<div class="external-event bg-green" data-bg="bg-green" data-title="Brainstorming" data-media="<i class='fa fa-lightbulb-o'></i>" data-desc="Mauris tristique massa eu venenatis semper. Phasellus a nibh nisi.">
					<h5>
						<i class="fa fa-lightbulb-o fa-lg fa-fw"></i> Brainstorming
					</h5>
					<p>Mauris tristique massa eu venenatis semper. Phasellus a nibh nisi.</p>
				</div>
				<div class="external-event bg-orange" data-bg="bg-orange" data-title="Performance Rating" data-media="<i class='fa fa-tasks'></i>" data-desc="Class aptent taciti sociosqu ad litora torquent per conubia nostra.">
					<h5>
						<i class="fa fa-tasks fa-lg fa-fw"></i> Performance Rating
					</h5>
					<p>Class aptent taciti sociosqu ad litora torquent per conubia nostra.</p>
				</div>
				<div class="external-event bg-red" data-bg="bg-red"	data-title="Video Shooting" data-media="<i class='fa fa-video-camera'></i>" data-desc="Donec ligula nisi, tempus eu egestas id, auctor sit amet velit.">
					<h5>
						<i class="fa fa-video-camera fa-lg fa-fw"></i> Video Shooting
					</h5>
					<p>Donec ligula nisi, tempus eu egestas id, auctor sit amet	velit.</p>
				</div>
				<div class="checkbox">
					<label> <input type="checkbox" id="drop-remove" /> remove after drop </label>
				</div>
				
			</div>
		</div>
	</div>
</div>	

	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
	<div id="siteMeshJavaScript">
		<script src="/resources/plugins/fullcalendar/fullcalendar/fullcalendar.js"></script>
		<script src="/resources/js/calendar.demo.min.js"></script>
			
		<script>		
			$(document).ready(function() {
				App.init();
				Calendar.init();
				document.getElementById("m_calendar").className = "active";	
				
			});
				
			
		</script>		
	</div>
	<!-- ================== END PAGE LEVEL JS ================== -->
 	
</body>
</html>

