<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

<div data-scrollbar="false" data-height="100%" class="m-l-15 m-r-15">
  <div class="row">
    <div class="col-md-12">
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
          <form class="form-horizontal" name="languageAbility" action="/resume/lang-ability" method="POST">
            <div class="table-responsive">
              <table class="table table-bordered table-condensed table-valign-middle text-center">
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
    </div>
  </div>
</div>


<jsp:include page="./config/resume_footer.jsp" flush="false" />