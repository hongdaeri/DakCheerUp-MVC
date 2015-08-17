<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

<div data-scrollbar="true" data-height="100%" class="m-l-15 m-r-15">
  <div class="row">
    <div class="col-md-12">
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
          <form name="academic" class="form-horizontal" action="/resume/academic" method="POST">
            <h5>고등학교</h5>
            <div class="table-responsive">
              <table  class="table table-bordered table-condensed table-valign-middle text-center">
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
    </div>
  </div>
</div>


<jsp:include page="./config/resume_footer.jsp" flush="false" />