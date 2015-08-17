<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="./config/resume_head.jsp" flush="false" />

<div data-scrollbar="false" data-height="100%" class="m-l-15 m-r-15">
  <div class="row">
    <div class="col-md-12">
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
          <form name="swot" class="form-horizontal" action="/resume/swot" method="POST">
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