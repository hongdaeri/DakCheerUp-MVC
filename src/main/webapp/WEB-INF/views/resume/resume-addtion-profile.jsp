<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

<div data-scrollbar="false" data-height="100%" class="m-l-15 m-r-15">
  <div class="row">
    <div class="col-md-12">
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
          <form class="form-horizontal" action="/resume/addtion-profile" method="POST">
            <h5>가족관계</h5>
            <div class="table-responsive">
              <table class="table table-bordered table-condensed table-valign-middle text-center">
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
    </div>
  </div>
</div>


<jsp:include page="./config/resume_footer.jsp" flush="false" />