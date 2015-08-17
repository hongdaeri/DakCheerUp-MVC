<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

<div data-scrollbar="true" data-height="100%" class="m-l-15 m-r-15">
  <div class="row">
    <div class="col-md-12">
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
          <form class="form-horizontal" name="license" action="/resume/license" method="POST">
            <div class="table-responsive">
              <table class="table table-bordered table-condensed table-valign-middle text-center">
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
    </div>
  </div>
</div>


<jsp:include page="./config/resume_footer.jsp" flush="false" />