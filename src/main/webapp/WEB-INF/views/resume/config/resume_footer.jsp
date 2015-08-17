          </div>
        </div>
      </div>
    </div>
  </div>
</div>



<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<div id="siteMeshJavaScript">

  <script src="/resources/plugins/masked-input/masked-input.min.js"></script>
  <script src="/resources/js/resume-my.js"></script>
  <script src="/resources/plugins/bootstrap-wysihtml5/lib/js/wysihtml5-0.3.0.js"></script>
  <script src="/resources/plugins/bootstrap-wysihtml5/src/bootstrap-wysihtml5.js"></script>
  <script src="/resources/js/form-wysiwyg.demo.min.js"></script>
  <script src="/resources/plugins/switchery/switchery.min.js"></script>
  <script src="/resources/js/form-slider-switcher.demo.min.js"></script>
  <script>
    //example

    var handleFormMaskedInput = function() {
      "use strict";
      $(".masked-input-phone").mask("999-9999-9999");
      $(".masked-input-yyyy-mm-dd").mask("9999.99.99");
      $(".masked-input-yyyy-mm").mask("9999.99");
      $(".masked-input-period").mask("9999.99 - 9999.99");
      $("#masked-input-pno").mask("aaa-9999-a");
      $("#masked-input-pkey").mask("a*-999-a999");
    };
    $(document).ready(function() {
      App.init();
      FormWysihtml5.init();
      FormSliderSwitcher.init();

      document.getElementById("m_resume").className = "active";
      resumeBtnToolTipAndAction();
      handleFormMaskedInput();
    });







  </script>

</div>
<!-- ================== END PAGE LEVEL JS ================== -->



</body>

</html>