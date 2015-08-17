<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

							<div data-scrollbar="true" data-height="100%" class="m-l-15 m-r-15">
								<div class="row">
									<div class="col-md-12" data-spy="scroll" data-target="resume-menu">
										<!-- begin panel -->
										<form class="form-horizontal"> 
										<div id="resume-profile" class="panel panel-inverse " data-sortable-id="ui-widget-1">
											<div class="panel-heading">
					                           <div class="panel-heading-btn">
					                               	<a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
					                               	<a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
					                               	<a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
					                               	<a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
					                           </div>
					                           <h4 class="panel-title">기본인적사항</h4>
					                       </div>
					                       <div class="panel-body p-b-0">					
												<div class="table-responsive">
													<table id="resume-profile-table" class="table table-bordered table-condensed table-valign-middle text-center">															
														<tbody>
															<tr>
																<td class="warning ">이름</td>
																<td class="text-left"> <strong>%NAME%</strong></td>
																<td class="warning text-center ">한문</td>
																<td> 																		
																	<input type="text" class="form-control input-sm" placeholder="洪吉動" value="洪吉動" />
																</td>
																<td class="warning text-center ">영문</td>
																<td> 																		
																	<input type="text" class="form-control input-sm" placeholder="Gil Dong Hong" value="Gil Dong Hong" />
																</td>
															</tr>
															<tr>
																<td scope="row" class="warning ">주민등록번호</td>
																<td colspan="2"> 																		
																	<div class="row">
																		<div class="col-xs-5  p-r-0"><input type="text" class="form-control input-sm" maxlength="6"/></div>
																		<div class="col-xs-1  p-0 text-center">-</div>																		
																		<div class="col-xs-6  p-l-0"><input type="password" class="form-control input-sm" maxlength="7" /></div>
																	</div>																		
																</td>
																<td colspan="3" class="text-left">
																	<div class="alert alert-warning fade in m-1">
															            <i class="fa fa-info-circle fa-lg m-r-10 pull-left m-t-2"></i> 개인 정보는 저장목적 이외에 어떠한 용도로도 사용 및 제3자에게 제공되지 않습니다.
															        </div>																		
																</td>
																																	
															</tr>
															<tr>
																<td class="warning ">휴대폰</td>
																<td>																			
																	<input type="text" class="form-control input-sm masked-input-phone"/>
																</td>
																<td class="warning ">이메일</td>
																<td> 																		
																	<input type="email" class="form-control input-sm"/>
																</td>
																<td class="warning ">홈페이지 및 활동 SNS</td>	
																<td>
																	<a data-toggle="collapse" href="#sns-table" class="btn btn-danger btn-block btn-xs">보이기/감추기</a>
																</td>																		
															</tr>
															<tr>
																<td class="warning ">주소</td>
																<td colspan="5"> 																		
																	<input type="text" class="form-control input-sm"/>
																</td>
																
															</tr>
															<tr>
																<td class="warning ">취미</td>
																<td>
																	<input type="text" class="form-control input-sm"/>	
																</td>
																<td class="warning ">특기</td>
																<td> 																		
																	<input type="text" class="form-control input-sm"/>	
																</td>
																<td class="warning ">종교</td>
																<td>					
																	<select class="form-control input-sm">
																		<option value="NIL" selected>--선택하세요--</option>
																		<option value="AF">기독교</option>	
																		<option value="AF">불교</option>	
																		<option value="AF">천주교</option>
																		<option value="AF">기타 종교</option>																																						
																	</select>																		
																</td>
															</tr>
														
															<tr>
																<td class="warning ">혼인여부</td>
																<td>					
																	<select class="form-control input-sm">
																		<option value="NIL" selected>--선택하세요--</option>
																		<option value="AF">미혼</option>	
																		<option value="AF">혼인</option>																																																							
																	</select>																		
																</td>
																<td class="warning ">보훈여부</td>
																<td>					
																	<select class="form-control input-sm">
																		<option value="NIL" selected>--선택하세요--</option>
																		<option value="AF">대상</option>	
																		<option value="AF">비대상</option>																																																							
																	</select>																	
																</td>
																<td class="warning ">장애여부</td>
																<td>					
																	<select class="form-control input-sm">
																		<option value="NIL" selected>--선택하세요--</option>
																		<option value="AF">장애</option>	
																		<option value="AF">비장애</option>																																																							
																	</select>																		
																</td>
															</tr>
														</tbody>
													</table>													
												</div>
												<div id="sns-table" class="table-responsive collapse">
													<table id="resume-profile-table" class="table table-bordered table-condensed table-valign-middle text-center">															
														<tbody>
															<tr>
																<td colspan="2" class="warning">개인웹사이트</td>
																<td colspan="2" class="warning">네이버블로그</td>
																<td colspan="2" class="warning">네이버블로그</td>																	
															</tr>
															<tr>
																<td colspan="2"><input type="text" class="form-control input-sm" value="http://"/></td>
																<td colspan="2"><input type="text" class="form-control input-sm" value="http://"/></td>
																<td colspan="2"><input type="text" class="form-control input-sm" value="http://"/></td>
															</tr>
															<tr>
																<td class="warning">페이스북</td>
																<td class="warning">트위터</td>
																<td class="warning">인스타그램</td>
																<td class="warning">텀블러</td>
																<td class="warning">핀터레스트</td>
																<td class="warning">유투브</td>
															</tr>
															<tr>
																<td><input type="text" class="form-control input-sm" value="@아이디"/></td>
																<td><input type="text" class="form-control input-sm" value="@아이디"/></td>
																<td><input type="text" class="form-control input-sm" value="@아이디"/></td>
																<td><input type="text" class="form-control input-sm" value="@아이디"/></td>
																<td><input type="text" class="form-control input-sm" value="@아이디"/></td>
																<td><input type="text" class="form-control input-sm" value="@아이디"/></td>
															</tr>
														</tbody>
													</table>													
												</div>
												<div class="m-t-0 m-b-10 text-right">
					                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
					                      		</div>
					                       </div>					                       					                  
					                	</div>
					                	</form>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-add-profile" class="panel panel-inverse" data-sortable-id="ui-widget-2">
					                       <div class="panel-heading">
					                           <div class="panel-heading-btn">
					                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
					                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
					                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
					                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
					                           </div>
							                    <h4 class="panel-title">추가인적사항</h4>
							                </div>
						               		<div class="panel-body">
						               			<form class="form-horizontal" action="/" method="POST">						               			
													<h5>가족관계</h5>
													<div class="table-responsive">
														<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
															<tbody>
																<tr>
																	<td colspan="2" class="warning">형제관계</td>
																	<td colspan="4" class="text-left">
																		<table>
																			<tr>
																				<td class="p-l-10"><input type="text" class="form-control"/></td>
																				<td class="p-l-10">남 </td>
																				<td class="p-l-10"><input type="text" class="form-control"/></td>
																				<td class="p-l-10">녀 중 </td>
																				<td class="p-l-10"><input type="text" class="form-control"/></td>
																				<td class="p-l-10">째</td>																				
																			</tr>
																		</table>
																	</td>
																	
																</tr>
																<tr class="warning">
																	<td><a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a></td>
																	<td>관계</td>
																	<td>성명</td>
																	<td>연령</td>
																	<td>현재직업</td>
																	<td>동거여부</td>														
																</tr>
																<tr>
																	<td><a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a></td>
																	<td>
																		<select class="form-control input-sm">
																			<option value="NIL" selected>--관계 선택--</option>
																			<option value="AF">친할아버지</option>	
																			<option value="AF">친할머니</option>
																			<option value="AF">외할아버지</option>	
																			<option value="AF">외할머니</option>
																			<option value="AF">아버지</option>	
																			<option value="AF">어머니</option>
																			<option value="AF">손위 형제</option>
																			<option value="AF">손위 자매</option>
																			<option value="AF">손아래 형제</option>
																			<option value="AF">손아래 자매</option>																																																							
																		</select>	
																	</td>
																	<td><input type="text" class="form-control input-sm"/></td>
																	<td>
																		<input type="text" class="form-control input-sm"/>									                               
																	</td>
																	<td><input type="text" class="form-control input-sm"/></td>
																	<td>
																		<select class="form-control input-sm">
																			<option value="NIL" selected>--선택하세요--</option>
																			<option value="AF">동거</option>	
																			<option value="AF">비동거</option>																																																							
																		</select>	
																	</td>
																</tr>
															</tbody>
														</table>													
													</div>
													
													<h5>병역사항</h5>
													<div class="table-responsive">
														<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
															<tbody>																
																<tr class="warning">
																	<td>군필여부</td>
																	<td>복무기간</td>
																	<td>군별</td>
																	<td>계급</td>
																	<td>병과</td>														
																</tr>
																<tr>
																	<td>
																		<select class="form-control input-sm">
																			<option value="NIL" selected>--군필여부선택--</option>
																			<option value="AF">필</option>	
																			<option value="AF">미필</option>
																			<option value="AF">면제</option>	
																			<option value="AF">여성(비대상)</option>																																																																									
																		</select>	
																	</td>
																	<td>
																		<input type="text" class="form-control input-sm masked-input-period" />
																	</td>
																	<td>
																		<select class="form-control input-sm">
																			<option value="NIL" selected>--군별선택--</option>
																			<option value="AF">육군</option>	
																			<option value="AF">해군</option>
																			<option value="AF">공군</option>	
																			<option value="AF">해병</option>	
																			<option value="AF">전경</option>	
																			<option value="AF">해경</option>	
																			<option value="AF">카투사</option>	
																			<option value="AF">교도</option>
																			<option value="AF">상근</option>	
																			<option value="AF">의경</option>	
																			<option value="AF">공익</option>																																																																										
																		</select>	
																	</td>																	
																	<td>
																		<select class="form-control input-sm">
																			<option value="NIL" selected>--계급선택--</option>
																			<option value="AF">이병</option>	
																			<option value="AF">일병</option>	
																			<option value="AF">상병</option>	
																			<option value="AF">병장</option>	
																			<option value="AF">하사</option>	
																			<option value="AF">중사</option>	
																			<option value="AF">상사</option>	
																			<option value="AF">원사</option>	
																			<option value="AF">준위</option>	
																			<option value="AF">소위</option>	
																			<option value="AF">중위</option>	
																			<option value="AF">대위</option>	
																			<option value="AF">소령</option>
																			<option value="AF">중령</option>	
																			<option value="AF">대령</option>	
																			<option value="AF">준장</option>	
																			<option value="AF">소장</option>	
																			<option value="AF">중장</option>	
																			<option value="AF">대장</option>	
																			<option value="AF">기타</option>																																																																										
																		</select>	
																	</td>
																	<td>
																		<input type="text" class="form-control input-sm" maxlength=""/>
																	</td>
																</tr>
																<tr>
																	<td class="warning">면제사유</td>
																	<td colspan="5"><input type="text" class="form-control input-sm" placeholder="면제 대상이 아니신 분들은 공란으로 남겨주세요."/></td>
															
																</tr>															</tbody>
														</table>													
													</div>
													<div class="m-t-0 m-b-10 text-right">
						                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
						                      		</div>
												</form>
						                 	</div>
						    			</div>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-academic" class="panel panel-inverse" data-sortable-id="ui-widget-3">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">학력사항</h4>
						                       </div>
						                       <div class="panel-body">
						                   			<form class="form-horizontal" action="/" method="POST">						               			
														<h5>고등학교</h5>
														<div class="table-responsive">
															<table id="resume-academic-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>재학기간</td>
																		<td>소재지</td>
																		<td>학교명</td>
																		<td>전공</td>
																		<td>졸업구분</td>
																	</tr>
																	<tr>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-period"/>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-소재지선택-</option>
																				<option value="AF">서울특별시</option>	
																				<option value="AF">경기도</option>
																				<option value="AF">강원도</option>	
																				<option value="AF">충청북도</option>
																				<option value="AF">충청남도</option>	
																				<option value="AF">전라남도</option>
																				<option value="AF">전라북도</option>
																				<option value="AF">경상남도</option>
																				<option value="AF">경상북도</option>
																				<option value="AF">제주도</option>	
																				<option value="AF">울산광역시</option>	
																				<option value="AF">대전광역시</option>		
																				<option value="AF">인천광역시</option>		
																				<option value="AF">광주광역시</option>	
																				<option value="AF">대구광역시</option>			
																				<option value="AF">부산광역시</option>	
																				<option value="AF">아시아</option>	
																				<option value="AF">유럽</option>	
																				<option value="AF">아메리카</option>
																				<option value="AF">아프리카</option>
																				<option value="AF">오세아니아</option>																																																									
																			</select>	
																		</td>
																		<td><input type="text" class="form-control input-sm"/></td>
																	
																		<td><input type="text" class="form-control input-sm"/></td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>--선택하세요--</option>
																				<option value="AF">졸업</option>	
																				<option value="AF">중퇴</option>																																																							
																			</select>	
																		</td>
																	</tr>
																</tbody>
															</table>													
														</div>
														
														<table class="width-full">
															<tr>
																<td><h5>대학교</h5></td>
																<td class="text-right p-r-15"><a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a></td>
															</tr>
														</table>
													
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																
																	<tr>
																		<td rowspan="3" class="width-60 warning"><a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a></td>
																		<td class="warning">재학기간</td>
																		<td colspan="3">
																			<div class="row m-0 p-0">
																				<div class="col-xs-4">
																					<div class="row">
																						<div class="col-xs-7 m-0 p-1"><input type="text" class="form-control input-sm masked-input-yyyy-mm"/></div>
																						<div class="col-xs-5 m-0 p-1">
																							<select class="form-control input-sm">
																								<option value="NIL" selected>--선택하세요--</option>
																								<option value="AF">입학</option>	
																								<option value="AF">편입</option>																																																																																																																					
																							</select>
																						</div>																					
																					</div>	
																				</div>
																				<div class="col-xs-1 p-t-5">~</div>																				
																				<div class="col-xs-4">
																					<div class="row">
																						<div class="col-xs-7 m-0 p-1"><input type="text" class="form-control input-sm masked-input-yyyy-mm"/></div>
																						<div class="col-xs-5 m-0 p-1">
																							<select class="form-control input-sm">
																								<option value="NIL" selected>--선택하세요--</option>
																								<option value="AF">졸업</option>	
																								<option value="AF">재학중</option>
																								<option value="AF">휴학중</option>
																								<option value="AF">졸업예정</option>
																								<option value="AF">중퇴</option>
																								<option value="AF">자퇴</option>
																								<option value="AF">수료</option>																																																																																																																					
																							</select>
																						</div>																						
																					</div>	
																				</div>
																				<div class="col-xs-3">
																					<select class="form-control input-sm">
																						<option value="NIL" selected>--선택하세요--</option>															
																						<option value="AF">전문학사</option>	
																						<option value="AF">학사</option>	
																						<option value="AF">석사</option>	
																						<option value="AF">박사</option>																																																																																														
																					</select>	
																				</div>																				
																			</div>
																		</td>																																
																	</tr>
																	<tr>
																		<td class="warning">학교명</td>																		
																		<td class="warning">전공</td>																	
																		<td class="warning">학점</td>
																		<td class="warning">부/복수전공</td>
																	</tr>
																	<tr>
																		<td><input type="text" class="form-control input-sm"/></td>
																		<td><input type="text" class="form-control input-sm"/></td>
																		<td>
																			<div class="row">
																				<div class="col-xs-6">
																					<input type="text" class="form-control input-sm"/>
																				</div>
																				<div class="col-xs-6">
																					<select class="form-control input-sm">
																						<option value="NIL" selected>--선택하세요--</option>
																						<option value="AF">4.0</option>	
																						<option value="AF">4.3</option>
																						<option value="AF">4.5</option>	
																						<option value="AF">7.0</option>	
																						<option value="AF">100</option>																																																																																														
																					</select>
																				</div>
																			</div>
																		</td>
																		<td>
																			<div class="row">
																				<div class="col-xs-4">
																					<select class="form-control input-sm">
																						<option value="NIL" selected>--선택--</option>
																						<option value="AF">해당없음</option>	
																						<option value="AF">부전공</option>
																						<option value="AF">복수전공</option>	
																						<option value="AF">이중전공</option>																																																																																																																			
																					</select>
																				</div>
																				<div class="col-xs-8">
																					<input type="text" class="form-control input-sm" placeholder="(부/복수/이중) 전공명"/>
																				</div>
																			</div>	
																		</td>
																	</tr>															

																</tbody>
															</table>													
														</div>
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel --> 
										<!-- begin panel -->
								        <div id="resume-oa" class="panel panel-inverse" data-sortable-id="ui-widget-4">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">OA 활용능력</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>문서작성<br>(한글 / MS-Word)</td>
																		<td>스프레드시트<br>(EXCEL)</td>
																		<td>프리젠테이션(Power Point)<br>(Power Point)</td>
																		<td>인터넷활용<br>(정보검색 / 블로깅)</td>
																		<td>그래픽<br>(Photoshop / Illustrator)</td>
																	</tr>
																	<tr>																	
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 선택하세요 --</option>
																				<option value="AF">상</option>	
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 선택하세요 --</option>
																				<option value="AF">상</option>	
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 선택하세요 --</option>
																				<option value="AF">상</option>	
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 선택하세요 --</option>
																				<option value="AF">상</option>	
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 선택하세요 --</option>
																				<option value="AF">상</option>	
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-strength" class="panel panel-inverse" data-sortable-id="ui-widget-5">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">강점/성격</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>강점 선택 </td>
																	</tr>
																	<tr>																	
																		<td>
																			<div class="row">
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																			</div>
																		</td>																		
																	</tr>
																</tbody>
															</table>													
														</div>
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>성격 선택 </td>
																	</tr>
																	<tr>																	
																		<td>
																			<div class="row">
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																				<div class="col-xs-4 col-sm-3 col-md-2"><label><input type="checkbox" value="" />책임감이 강함</label></div>
																			</div>
																		</td>																		
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-license" class="panel panel-inverse" data-sortable-id="ui-widget-6">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">자격증/면허증</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td>취득일자</td>
																		<td>자격/면허명</td>
																		<td>발급기관</td>
																		<td>합격구분</td>																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-yyyy-mm-dd"/>	
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>	
																		</td>
																		<td> 
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 합격구분 --</option>
																				<option value="AF">1차합격</option>	
																				<option value="AF">2차합격</option>
																				<option value="AF">필기합격</option>
																				<option value="AF">실기합격</option>
																				<option value="AF">최종합격</option>
																			</select>	
																		</td>																	
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-lang-ability" class="panel panel-inverse" data-sortable-id="ui-widget-7">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">어학능력</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td>언어</td>
																		<td>회화능력</td>
																		<td>작문능력</td>
																		<td>독해능력</td>																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 언어선택 --</option>
																				<option id="r-lang-00">한국어</option>	
																				<option id="r-lang-01">영어</option>	
																				<option id="r-lang-02">일본어</option>	
																				<option id="r-lang-03">중국어</option>	
																				<option id="r-lang-04">불어</option>	
																				<option id="r-lang-05">스페인어</option>	
																				<option id="r-lang-06">러시아어</option>	
																				<option id="r-lang-07">광동어</option>	
																				<option id="r-lang-08">네덜란드어</option>	
																				<option id="r-lang-09">네팔어</option>	
																				<option id="r-lang-10">노르웨이어</option>	
																				<option id="r-lang-11">따갈로그어</option>	
																				<option id="r-lang-12">라오스어</option>	
																				<option id="r-lang-13">라오어</option>	
																				<option id="r-lang-14">루마니아어</option>	
																				<option id="r-lang-15">말레이인니어</option>	
																				<option id="r-lang-16">몽골어</option>	
																				<option id="r-lang-17">미얀마어</option>	
																				<option id="r-lang-18">베트남어</option>	
																				<option id="r-lang-19">벵갈어</option>	
																				<option id="r-lang-20">세르비아어</option>	
																				<option id="r-lang-21">스와힐리어</option>	
																				<option id="r-lang-22">스웨덴어</option>	
																				<option id="r-lang-23">슬로바키아어</option>	
																				<option id="r-lang-24">슬로베니아어</option>	
																				<option id="r-lang-25">아랍어</option>	
																				<option id="r-lang-26">우루두어</option>	
																				<option id="r-lang-27">우즈벡어</option>	
																				<option id="r-lang-28">이란어</option>	
																				<option id="r-lang-29">이탈리아어</option>	
																				<option id="r-lang-30">인니어</option>	
																				<option id="r-lang-31">인도네시아어</option>	
																				<option id="r-lang-32">인도어</option>	
																				<option id="r-lang-33">체코어</option>	
																				<option id="r-lang-34">카자흐어</option>	
																				<option id="r-lang-35">캄보디아어</option>	
																				<option id="r-lang-36">크로아티아어</option>	
																				<option id="r-lang-37">타갈로그어</option>	
																				<option id="r-lang-38">태국어</option>	
																				<option id="r-lang-39">터키어</option>	
																				<option id="r-lang-40">페르시아어</option>	
																				<option id="r-lang-41">포르투갈어</option>	
																				<option id="r-lang-42">폴란드어</option>	
																				<option id="r-lang-43">필리핀어</option>	
																				<option id="r-lang-44">헝가리어</option>	
																				<option id="r-lang-45">희랍어</option>	
																				<option id="r-lang-46">힌디어</option>	
																				<option id="r-lang-47">기타</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 회화능력 --</option>
																				<option value="AF">상</option>
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 작문능력 --</option>
																				<option value="AF">상</option>
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>
																		<td>
																			<select class="form-control input-sm">
																				<option value="NIL" selected>-- 독해능력 --</option>
																				<option value="AF">상</option>
																				<option value="AF">중</option>
																				<option value="AF">하</option>
																			</select>	
																		</td>																	
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-lang-exam" class="panel panel-inverse" data-sortable-id="ui-widget-8">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">어학시험</h4>
						                       </div>
						                       <div class="panel-body">
						                       		<form name="langExamForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td>
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td>언어</td>
																		<td>어학시험</td>
																		<td>점수(등급)</td>
																		<td>증빙기관</td>																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<SELECT class="form-control input-sm" name="langName" onChange="BuildLangExamOp(this.selectedIndex);">
																				<OPTION Value="">-- 선택 --
																				<OPTION Value="영어">영어
																				<OPTION Value="일어">일어
																				<OPTION Value="중국어">중국어
																				<OPTION Value="독일어">독일어
																				<OPTION Value="불어">불어
																				<OPTION Value="스페인어">스페인어
																				<OPTION Value="러시아어">러시아어
																				<OPTION Value="이탈리아어">이탈리아어
																				<OPTION Value="한국어">한국어
																				<OPTION Value="한자">한자
																			</Select>																			
																		</td>
																		<td>
																			<SELECT class="form-control input-sm" name="langExamName">
																				<OPTION Value="">-- 선택 --
																			</Select>	
																		</td>
																		<td>
																			<div class="row">
																				<div class="col-xs-6">
																					<input type="text" class="form-control input-sm"/>		
																				</div>
																				<div class="col-xs-6">
																					<select class="form-control input-sm">
																						<option value="NIL" selected>-- 선택 --</option>
																						<option value="AF">점</option>
																						<option value="AF">급</option>
																						<option value="AF">Pass</option>
																					</select>
																				</div>
																			</div>																				
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>		
																		</td>																	
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel --> 
										<!-- begin panel -->
								        <div id="resume-award" class="panel panel-inverse" data-sortable-id="ui-widget-9">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">수상내역 / 공모전 </h4>
						                       </div>
						                       <div class="panel-body">
						                      		<form name="awardForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-100">수상일</td>
																		<td>수상명</td>
																		<td>수상기관</td>
																		<td class="width-150">작업구분</td>																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-yyyy-mm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																						<option value="NIL" selected>-- 선택 --</option>
																						<option value="AF">공동</option>
																						<option value="AF">개인</option>
																			</select>		
																		</td>																	
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
										<!-- begin panel -->
								        <div id="resume-career" class="panel panel-inverse" data-sortable-id="ui-widget-10">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">경력 및 실습사항 </h4>
						                       </div>
						                       <div class="panel-body">
						                           <form name="careerForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-150">기간</td>
																		<td>회사명</td>
																		<td>부서</td>
																		<td>직위</td>	
																		<td>담당업무</td>																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-period"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>		
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>		
																		</td>																		
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
								        <!-- begin panel -->
								        <div id="resume-voluntary" class="panel panel-inverse" data-sortable-id="ui-widget-11">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">봉사활동 / 대외활동</h4>
						                       </div>
						                       <div class="panel-body">
						                       		<form name="voluntaryForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-150">기간</td>
																		<td>봉사기관</td>
																		<td>활동내용</td>																																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-period"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>																																				
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
								        <!-- begin panel -->
								        <div id="resume-education" class="panel panel-inverse" data-sortable-id="ui-widget-12">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">교육이수내역</h4>
						                       </div>
						                       <div class="panel-body">
						                     		<form name="educationForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-150">기간</td>
																		<td>과정명</td>
																		<td class="width-250">교육기관</td>																																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-period"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>																																				
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
								        <!-- begin panel -->
								        <div id="resume-project" class="panel panel-inverse" data-sortable-id="ui-widget-13">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">참여 프로젝트</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form name="projectForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-150">프로젝트 기간</td>
																		<td class="width-150">구분</td>
																		<td>프로젝트명</td>																																	
																	</tr>
																	<tr>	
																		<td rowspan="2">
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-period"/>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																					<option value="NIL" selected>-- 선택 --</option>
																					<option value="AF">공동</option>
																					<option value="AF">개인</option>
																			</select>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>																																																						
																	</tr>
																	<tr>
																		<td class="warning">상세 내용</td>
																		<td colspan="2">
																			<textarea class="textarea form-control noresize" rows="9">
&#8734; 자유롭게 기술하세요. 아래는 예시 입니다.
&#8734; IT 프로젝트였다면 사용 언어,기술, DBMS, OS 등을 언급 해 주시는 것이 좋습니다.
1) 소속업체 : 
2) 의뢰업체 : 
3) 목표 : 
4) 구성원 : 
5) 참여도 : 
6) 담당업무 : 
7) 주요실적 : </textarea>
																		</td>
																	</tr>																	
																	
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
								        <!-- begin panel -->
								        <div id="resume-write" class="panel panel-inverse" data-sortable-id="ui-widget-14">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">저술내역</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form name="educationForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-100">발행(게재)일</td>
																		<td class="width-130">분류</td>
																		<td>저술명</td>
																		<td class="width-250">발행(게재)처</td>																																	
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-yyyy-mm"/>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																					<option value="NIL" selected>-- 선택 --</option>
																					<option value="AF">도서</option>
																					<option value="AF">논문</option>
																					<option value="AF">투고</option>
																					<option value="AF">보도자료</option>
																					<option value="AF">발표문서</option>
																			</select>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>																																				
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
								        <!-- begin panel -->
								        <div id="resume-global" class="panel panel-inverse" data-sortable-id="ui-widget-15">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">글로벌 경험</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form name="globalForm" class="form-horizontal" action="/" method="POST">					               			
														<div class="table-responsive">
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">
																		<td class="width-50">
																			<a href="javascript:" class="" data-click="resume-add"><i class="ion-plus-round fa fa-lg text-success"></i></a>
																		</td>
																		<td class="width-160">기간</td>
																		<td class="width-170">국가</td>																		
																		<td class="width-130">사유(목적)</td>	
																		<td>활동내용</td>																																
																	</tr>
																	<tr>	
																		<td>
																			<a href="javascript:" class="btn btn-danger btn-icon btn-xs btn-circle" data-click="resume-delete"><i class="ion-minus-round fa fa-lg text-white"></i></a>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm masked-input-period"/>
																		</td>
																		<td>
																			<select class="form-control input-sm" id="global-nation-select">
																					<option value="NIL" selected>-- 선택 --</option>																					
																			</select>
																		</td>
																		<td>
																			<select class="form-control input-sm">
																					<option value="NIL" selected>-- 선택 --</option>
																					<option value="NIL" selected>어학연수</option>
																					<option value="NIL" selected>교환학생</option>
																					<option value="NIL" selected>여행</option>
																					<option value="NIL" selected>거주</option>
																					<option value="NIL" selected>기타</option>																					
																			</select>
																		</td>
																		<td>
																			<input type="text" class="form-control input-sm"/>
																		</td>																																																						
																	</tr>
																</tbody>
															</table>													
														</div>													
														
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
								        <!-- begin panel -->
								        <div id="resume-swot" class="panel panel-inverse" data-sortable-id="ui-widget-16">
						                       <div class="panel-heading">
						                           <div class="panel-heading-btn">
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
						                               <a href="javascript:" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
						                           </div>
						                           <h4 class="panel-title">SWOT 자기분석</h4>
						                       </div>
						                       <div class="panel-body">
						                           <form name="swotForm" class="form-horizontal" action="/" method="POST">						                           						               			
														<div class="table-responsive">														
															<table id="resume-family-table" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																	
																	<tr class="warning">																		
																		<td>강점(Strength)</td>
																		<td>약점(Weakness)</td>	
																	</tr>
																	<tr>																		
																		<td>
																			<textarea class="textarea form-control noresize" style="resize:none" rows="4"></textarea>																
																		</td>																		
																		<td>
																			<textarea class="textarea form-control noresize" rows="4"></textarea>																
																		</td>																																																						
																	</tr>
																	<tr class="warning">																		
																		<td>기회(Opportunities)</td>
																		<td>위협(Threats)</td>	
																	</tr>
																	<tr>																		
																		<td>
																			<textarea class="textarea form-control noresize" rows="4"></textarea>																
																		</td>
																		<td>
																			<textarea class="textarea form-control noresize" rows="4"></textarea>																
																		</td>																																																						
																	</tr>
																</tbody>
															</table>																	
															<table id="resume-swot-table2" class="table table-bordered table-condensed table-valign-middle text-center">															
																<tbody>																																		
																	<tr>																		
																		<td class="warning">SO전략 (강점-기회)</td>
																		<td><input type="text" class="form-control input-sm"/></td>	
																	</tr>
																	<tr>																		
																		<td class="warning">ST전략 (강점-위협)</td>
																		<td><input type="text" class="form-control input-sm"/></td>	
																	</tr>
																	<tr>																		
																		<td class="warning">WO전략 (약점-기회)</td>
																		<td><input type="text" class="form-control input-sm"/></td>	
																	</tr>
																	<tr>																		
																		<td class="warning">WT전략 (약점-위협)</td>
																		<td><input type="text" class="form-control input-sm"/></td>	
																	</tr>
																</tbody>
															</table>																												
														</div>                    													
													
														<div class="m-t-0 m-b-10 text-right">
							                            	<a href="javascript:" class="btn btn-warning btn-sm">&nbsp; 저장 &nbsp;</a>
							                      		</div>
													</form>
						                       </div>
						                   </div>
								        <!-- end panel -->
										</div>
									</div>	
							</div>


							<jsp:include page="./config/resume_footer.jsp" flush="false" />