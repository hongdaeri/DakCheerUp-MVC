<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

<div data-scrollbar="true" data-height="100%" class="m-l-15 m-r-15">
  <div class="row">
    <div class="col-md-12">
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
          <form name="languageExam" class="form-horizontal" action="/resume/lang-exam" method="POST">
            <div class="table-responsive">
              <table class="table table-bordered table-condensed table-valign-middle text-center">
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
    </div>
  </div>
</div>


<jsp:include page="./config/resume_footer.jsp" flush="false" />