/**
 * 
 */

function toggle(className, obj) {
    var $input = $(obj);
    if ($input.prop('checked')) $(className).hide();
    else $(className).show();
}


/****************************************************
 *    RESUME LANGUAGE-EXAM OPTION AUTO COMPLATE
 *
 ****************************************************/

//각 분류에 대한 배열
LangExamOp=new Array(11);
LangExamOp[0]="-- 선택 --";			//기본값
LangExamOp[1]=new Array(64);		//영어
LangExamOp[2]=new Array(20);		//일어
LangExamOp[3]=new Array(17);		//중국어
LangExamOp[4]=new Array(15);		//독일어
LangExamOp[5]=new Array(15);		//불어
LangExamOp[6]=new Array(6);			//스페인어
LangExamOp[7]=new Array(6);			//러시아어
LangExamOp[8]=new Array(2);			//이탈리아어
LangExamOp[9]=new Array(4);			//한국어
LangExamOp[10]=new Array(7);		//한자


//영어
LangExamOp[1][0]	="TOEIC	";
LangExamOp[1][1]	="TOEFL	";
LangExamOp[1][2]	="TEPS	";
LangExamOp[1][3]	="OPIC 영어	";
LangExamOp[1][4]	="S-ETAT2급	";
LangExamOp[1][5]	="S-TOED	";
LangExamOp[1][6]	="TOED	";
LangExamOp[1][7]	="EPQT	";
LangExamOp[1][8]	="EVQT	";
LangExamOp[1][9]	="EC-TOP(TOQ)	";
LangExamOp[1][10]	="CPET	";
LangExamOp[1][11]	="G-TELP	";
LangExamOp[1][12]	="G-ETAT	";
LangExamOp[1][13]	="S-ETAT1급	";
LangExamOp[1][14]	="공무원영어	";
LangExamOp[1][15]	="관광통역안내사 영어	";
LangExamOp[1][16]	="무역영어	";
LangExamOp[1][17]	="영어 교원자격증	";
LangExamOp[1][18]	="AP	";
LangExamOp[1][19]	="Cambridge Certification CAE	";
LangExamOp[1][20]	="Cambridge Certification CPE	";
LangExamOp[1][21]	="Cambridge Certification FCE	";
LangExamOp[1][22]	="EFB	";
LangExamOp[1][23]	="ESPT	";
LangExamOp[1][24]	="FLEX 영어	";
LangExamOp[1][25]	="GMAT	";
LangExamOp[1][26]	="GRE	";
LangExamOp[1][27]	="iB-SET	";
LangExamOp[1][28]	="IELTS	";
LangExamOp[1][29]	="IET	";
LangExamOp[1][30]	="JET	";
LangExamOp[1][31]	="JET Speacking	";
LangExamOp[1][32]	="J-TOED	";
LangExamOp[1][33]	="LSAT	";
LangExamOp[1][34]	="PELT	";
LangExamOp[1][35]	="PELT jR	";
LangExamOp[1][36]	="PELT KIDS	";
LangExamOp[1][37]	="PELT MAIN	";
LangExamOp[1][38]	="PELT PLUS	";
LangExamOp[1][39]	="PELT STANDARD	";
LangExamOp[1][40]	="PET(Preliminary English Test)	";
LangExamOp[1][41]	="SAT	";
LangExamOp[1][42]	="SEPT	";
LangExamOp[1][43]	="SLEP	";
LangExamOp[1][44]	="SNULT 영어	";
LangExamOp[1][45]	="SSAT	";
LangExamOp[1][46]	="TCT 번역능력인정시험 영어	";
LangExamOp[1][47]	="TESOL	";
LangExamOp[1][48]	="TOEFL(CBT)	";
LangExamOp[1][49]	="TOEFL(iBT)	";
LangExamOp[1][50]	="TOEFL(PBT)	";
LangExamOp[1][51]	="TOEIC Bridge	";
LangExamOp[1][52]	="TOEIC Speaking and Writing Tests	";
LangExamOp[1][53]	="TOEIC Speaking Test	";
LangExamOp[1][54]	="TOEIC Writing Test	";
LangExamOp[1][55]	="TOP	";
LangExamOp[1][56]	="TOSEL	";
LangExamOp[1][57]	="TSE	";
LangExamOp[1][58]	="TWP	";
LangExamOp[1][59]	="Y-TOED	";
LangExamOp[1][60]	="BEC Vantage	";
LangExamOp[1][61]	="BEC Higher	";
LangExamOp[1][62]	="Versant	";
LangExamOp[1][63]	="WPT(Writing Proficiency Test)	";

//일어
LangExamOp[2][0]	="JLPT	";
LangExamOp[2][1]	="JPT	";
LangExamOp[2][2]	="JTRA	";
LangExamOp[2][3]	="EJU	";
LangExamOp[2][4]	="EJU 일본유학시험	";
LangExamOp[2][5]	="FLEX 일본어	";
LangExamOp[2][6]	="JET 프로그램	";
LangExamOp[2][7]	="문부성 장학생 선발시험	";
LangExamOp[2][8]	="일본어 교원자격증	";
LangExamOp[2][9]	="JLRT	";
LangExamOp[2][10]	="JTPA	";
LangExamOp[2][11]	="NIKKEN	";
LangExamOp[2][12]	="NPT	";
LangExamOp[2][13]	="SJPT	";
LangExamOp[2][14]	="SNULT 일어	";
LangExamOp[2][15]	="TCT 번역능력인정시험 일어	";
LangExamOp[2][16]	="J-TEST	";
LangExamOp[2][17]	="(新)JLPT	";
LangExamOp[2][18]	="JLT	";
LangExamOp[2][19]	="BJT	";

//중국어
LangExamOp[3][0] =	"HSK	";
LangExamOp[3][1] =	"BCT	";
LangExamOp[3][2] =	"C.TEST	";
LangExamOp[3][3] =	"CPT	";
LangExamOp[3][4] =	"FLEX 중국어	";
LangExamOp[3][5] =	"SNULT 중국어	";
LangExamOp[3][6] =	"TCT 번역능력인정시험 중국어	";
LangExamOp[3][7] =	"TSC	";
LangExamOp[3][8] =	"YCT	";
LangExamOp[3][9] =	"관광통역안내사 중국어	";
LangExamOp[3][10] =	"중국어 교원자격증	";
LangExamOp[3][11] =	"OPIC 중국어	";
LangExamOp[3][12] =	"HKC	";
LangExamOp[3][13] =	"대만화어문능력시험(SCTOP)	";
LangExamOp[3][14] =	"(新)HSK	";
LangExamOp[3][15] =	"(新)HSK회화	";
LangExamOp[3][16] =	"(新)BCT	";

//독일어
LangExamOp[4][0]	="DSH	";
LangExamOp[4][1]	="FLEX 독일어	";
LangExamOp[4][2]	="GDS	";
LangExamOp[4][3]	="KDS	";
LangExamOp[4][4]	="PWD	";
LangExamOp[4][5]	="SD1	";
LangExamOp[4][6]	="SD2	";
LangExamOp[4][7]	="SNULT 독일어	";
LangExamOp[4][8]	="TCT 번역능력인정시험 독일어	";
LangExamOp[4][9]	="TestDaF	";
LangExamOp[4][10]	="ZD	";
LangExamOp[4][11]	="ZDAF	";
LangExamOp[4][12]	="ZMP	";
LangExamOp[4][13]	="ZOP	";
LangExamOp[4][14]	="관광통역안내사 독일어	";

//불어
LangExamOp[5][0]	="DALF	";
LangExamOp[5][1]	="DELF	";
LangExamOp[5][2]	="DELF A1	";
LangExamOp[5][3]	="DELF A2	";
LangExamOp[5][4]	="DELF JUNIOR	";
LangExamOp[5][5]	="FLEX 프랑스어	";
LangExamOp[5][6]	="SNULT 프랑스어	";
LangExamOp[5][7]	="TCF	";
LangExamOp[5][8]	="TCT 번역능력인정시험 불어	";
LangExamOp[5][9]	="TEF	";
LangExamOp[5][10]	="관광통역안내사 불어	";
LangExamOp[5][11]	="DELF B1	";
LangExamOp[5][12]	="DELF B2	";
LangExamOp[5][13]	="DALF C1	";
LangExamOp[5][14]	="DALF C2	";

//스페인어
LangExamOp[6][0] =	"DELE	";
LangExamOp[6][1] =	"EPLE	";
LangExamOp[6][2] =	"FLEX 스페인어	";
LangExamOp[6][3] =	"SNULT 스페인어	";
LangExamOp[6][4] =	"TCT 번역능력인정시험 스페인어	";
LangExamOp[6][5] =	"OPIC 스페인어	";

//러시아어
LangExamOp[7][0]	=	"FLEX 러시아어	";
LangExamOp[7][1]	=	"SNULT 러시아어	";
LangExamOp[7][2]	=	"OPIC 러시아어	";
LangExamOp[7][3]	=	"TCT 번역능력인정시험 러시아어	";
LangExamOp[7][4]	=	"토르플	";
LangExamOp[7][5]	=	"관광통역안내사 노어	";

//이탈리아어
LangExamOp[8][0]	=	"CELI	";
LangExamOp[8][1]	=	"CILS	";

//한국어
LangExamOp[9][0] =	"국어능력인증시험	";
LangExamOp[9][1] =	"한국어 교원자격증	";
LangExamOp[9][2] =	"KBS 한국어능력시험	";
LangExamOp[9][3] =	"TOPIK	";

//한자
LangExamOp[10][0] =	"한자능력검정 (한국어문학회)	";
LangExamOp[10][1] =	"한자자격검정 (한자교육진흥회)	";
LangExamOp[10][2] =	"실용한자 (한국외국어평가원)	";
LangExamOp[10][3] =	"한국한자검정 (한국평생교육평가원)	";
LangExamOp[10][4] =	"한자급수자격검정 (한자급수자격검정)	";
LangExamOp[10][5] =	"한자능력자격검정 (한국한자한문능력개발원)	";
LangExamOp[10][6] =	"상공회의소 한자 (대한상공회의소)	";

//특정 채널을 선택하면 해당 카테고리를 생성
function BuildLangExamOp(num)
{

	//해당 채널의 서브 카테고리 배열 길이만큼 반복
	for(i=0;i<LangExamOp[num].length;i++)
	{
		//카테고리에 해당하는 콤보박스의 값을 채움
		document.langExamForm.langExamName.options[i]=new Option(LangExamOp[num][i],LangExamOp[num][i]);
		
	}
	//select 리스트 길이 지정
	document.langExamForm.langExamName.length=LangExamOp[num].length;
}


/****************************************************
 *    RESUME GLOBAL NATION OPTION AUTO COMPLATE
 *
 ****************************************************/
NationGroup = ["아시아","유럽","북아메리카","남아메리카","아프리카","오세아니아"];

Nation = new Array(6);
Nation[0] = ["그루지야","네팔","대한민국","동티모르","라오스","레바논","말레이시아","몰디브","몽골","미얀마(버마)","바레인","방글라데시","베트남","부탄","북한","브루나이","사우디아라비아","스리랑카","시리아","싱가포르","아랍에미리트","에르메니아공화국","아제르바이잔","아프가니스탄","예멘","오만","요르단","우즈베키스탄","이라크","이란","이스라엘","인도","인도네시아","일본","중국","카자흐스탄","카타르","캄보디아","쿠웨이트","키르기스스탄","태국","타이완","타자키스탄","투르크메니스탄","파키스탄","필리핀"];
Nation[1] = ["그리스","네덜란드","노르웨이","덴마크","독일","라트비아","러시아","루마니아","룩셈부르크","리투아니아","리히텐슈타인","마케도니아","모나코","몰도바","몰타","바티칸","벨기에","벨로루시","보스니아헤르체고비나","불가리아","산마리노","스웨덴","스위스","스페인","슬로바키아","슬로베니아","아이슬란드","아일랜드","안도라","알바니아","에스토니아","영국","오스트리아","우크라이나","유고슬라비아","이탈리아","체코","크로아티아","키프로스","터키","포르투갈","폴란드","프랑스","핀란드","헝가리"];
Nation[2] = ["북아메리카","과테말라","그레나다","니카라과","도미니카공화국","도미니카연방","멕시코","미국","바베이도스","바하마","벨리즈","세인트루시아","세인트빈센트그레나딘","세인트키츠네비스","아이티","앤티가바부다","엘살바도르","온두라스","자메이카","캐나다","코스타리카","쿠바","트리니다드토바고","파나마"];
Nation[3] =	["가이아나","베네수엘라공화국","볼리비아","브라질","수리남","아르헨티나","에콰도르","우루과이","칠레","콜롬비아","파라과이","페루"];
Nation[4] =	["가나","가봉","감비아","기니","기니비사우","나미비아","나이지리아","남아프리카공화국","니제르","라이베리아","레소토","르완다","리비아","마다가르카스","말라위","말리","모로코","모리셔스","모리타니","모잠비크","베냉","보츠와나","부룬디","부르키나파소","상투메프린시페","서사하라","세네갈","세이셀","소말리아","수단","스와질랜드","시에라리온","알제리","앙골라","에리트레아","에티오피아","우간다","이집트","잠비아","적도기니","중앙아프리카공화국","지부티","짐바브웨","차드","카메룬","카보베르데","케냐","코모로","코트디부아르","콩고공화국","콩고민주공화국","탄자니아","토고","튀니지"];
Nation[5] =	["나우루","뉴질랜드","마셜","미크로네시아","바누아투","서사모아","솔로몬제도","키리바시","통가","투발루","파푸아뉴기니","팔라우","피지","호주(오스트레일리아)"];

for(i=0;i<Nation.length;i++)
{
	$("#global-nation-select").append(" <optgroup label='"+NationGroup[i]+"'>")
	
	for(j=0; j<Nation[i].length; j++)
	{ 
		$("#global-nation-select").append("	<option value='"+Nation[i][j]+"'>" + Nation[i][j] +"</option>");
	}
	$("#global-nation-select").append(" </optgroup>")
}


/****************************************************
 *    RESUME ADD BUTTON
 *
 ****************************************************/
var resumeBtnToolTipAndAction = function() {

    //add    
    $('[data-click=resume-add]').hover(function() {
        $(this).tooltip({
            title: '추가',
            placement: 'top',
            trigger: 'hover',
            container: 'body'
        });
        $(this).tooltip('show');
    });
    $('[data-click=resume-add]').click(function(e) {
        e.preventDefault();
        $(this).tooltip('destroy'); 
        //이부분을 고쳐야하는데
        $(this).closest('.panel').find('.panel-body').slideToggle();
    });
    //delete    
    $('[data-click=resume-delete]').hover(function() {
        $(this).tooltip({
            title: '삭제',
            placement: 'top',
            trigger: 'hover',
            container: 'body'
        });
        $(this).tooltip('show');
    });
    $('[data-click=resume-delete]').click(function(e) {
        e.preventDefault();
        $(this).tooltip('destroy');
        //이부분을 고쳐야하는데
        $(this).closest('.panel').find('.panel-body').slideToggle();
    });    
};









/*  */

 



/****************************************************
 *    RESUME ADD ACTION
 *
 ****************************************************/
var s1_noTh = 0; 
var s2_noTh = 0; 
var s3_noTh = 0; 
var s4_noTh = 0; 
var s5_noTh = 0; 
var s6_noTh = 0; 
var s7_noTh = 0; 
var s8_noTh = 0; 
var maXnoTh = 1;

function addItem_s1() { 
        if(maXnoTh <= s1_noTh)        
        { 
                alert('자격증은 한번에 한 항목씩만 등록할 수 있습니다.'); 
                return; 
        } 
        s1_noTh = s1_noTh + 1; 


        s1.innerHTML=s1.innerHTML 
                +'<table class="table table-hover">' 
                +'	<tr>' 
                +'		<td class="col-md-2"><input type="date" class="form-control" name="certificateDate" title="예) 2014.11.15"  /></td>' 
                +'      <td class="col-md-2"><input type="text" class="form-control" name="certificateName" title="예) 컴퓨터활용능력"/></td>' 
                +'      <td class="col-md-2"><input type="text" class="form-control" name="certificateGrade" title="예) 1급"/></td>' 
				+'      <td class="col-md-2"><input type="text" class="form-control" name="certificateOrg" title="예) 대한상공회의소"/></td>' 
				+'      <td class="col-md-2"><select name="publicScope" class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
				+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
				+'      <input type="hidden" name="param" value="s1"/>' 
                +'	</tr>'; 
                +'</table>'; 
        s1.style.display = ""; 
} 
function addItem_s2() { 
    if(maXnoTh <= s2_noTh)        
    { 
            alert('어학능력은 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s2_noTh = s2_noTh + 1; 
    

    s2.innerHTML=s2.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		<td class="col-md-2"><SELECT class="form-control" Name="languageName" onChange="BuildLangExamOp(this.selectedIndex);"><OPTION Value="">------<OPTION Value="영어">영어<OPTION Value="일어">일어<OPTION Value="중국어">중국어</Select></td>' 
            +'      <td class="col-md-2"><SELECT class="form-control" Name="languageExamName"><OPTION Value="">-------</Select></td>' 
            +'      <td class="col-md-2"><div class="input-group"><input type="text" class="form-control" name="languageExamGrade" /><div class="input-group-btn"><SELECT class="form-control" Name="languageExamGradeOption"><OPTION Value="점">점<OPTION Value="급">급</Select></div></div></td>' 
			+'      <td class="col-md-2"><input type="text" class="form-control" name="languageExamOrg" title="예) 한국토익위원회" /></td>' 
			+'      <td class="col-md-2"><select class="form-control" name="publicScope"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
			+'      <input type="hidden" name="param" value="s2"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s2.style.display = ""; 
} 
function addItem_s3() { 
    if(maXnoTh <= s3_noTh)        
    { 
            alert('수상실적은 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s3_noTh = s3_noTh + 1; 

     
    s3.innerHTML=s3.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		' 
            +'      <td class="col-md-2"><input type="date" class="form-control" name="awardDate" title="예) 2014.11.15"/></td>' 
            +'      <td class="col-md-4"><input type="text" class="form-control" name="awardSubject" style="width:100%;" title="예) 2014 상상실현창의공모전 최우수상" /></td>' 
			+'      <td class="col-md-2"><input type="text" class="form-control" name="awardOrg" title="예) KT&G"/></td>' 
			+'      <td class="col-md-2"><select name="publicScope" class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
			+'      <input type="hidden" name="param" value="s3"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s3.style.display = ""; 
} 
function addItem_s4() { 
    if(maXnoTh <= s4_noTh)        
    { 
            alert('교육/연수는 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s4_noTh = s4_noTh + 1; 


    s4.innerHTML=s4.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		' 
            +'      <td class="col-md-2"><input type="text" class="form-control" name="trainingPeriod" title="예) 2014.06 - 2014.09"/></td>' 
            +'      <td class="col-md-4"><input type="text" class="form-control" name="trainingName" style="width:100%;" title="예) 청년취업아카데미 빅데이터 분석 전문가 과정"/></td>' 
			+'      <td class="col-md-2"><input type="text" class="form-control" name="trainingOrg" title="예) 고용노동부"/></td>' 
			+'      <td class="col-md-2"><select name="publicScope"  class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>'
			+'      <input type="hidden" name="param" value="s4"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s4.style.display = ""; 
}
function addItem_s5() { 
    if(maXnoTh <= s5_noTh)        
    { 
            alert('포트폴리오는 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s5_noTh = s5_noTh + 1; 


    s5.innerHTML=s5.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		' 
            +'      <td class="col-md-2"><input type="text" class="form-control" name="portfolioPeriod" style="width:100%" title="예) 2014.06 - 2014.09"/></td>' 
            +'      <td class="col-md-3"><input type="text" class="form-control" name="portfolioName" style="width:100%" title="예) 개방형 이력관리 시스템 위스펙"/></td>' 
			+'      <td class="col-md-3"><input type="text" class="form-control" name="portfolioLink" style="width:100%" title="예) http://wespec.co.kr"/></td>' 
			+'      <td class="col-md-2"><select name="publicScope" class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
			+'      <input type="hidden" name="param" value="s5"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s5.style.display = ""; 
}
function addItem_s6() { 
    if(maXnoTh <= s6_noTh)        
    { 
            alert('소프트웨어개발능력은 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s6_noTh = s6_noTh + 1; 


    s6.innerHTML=s6.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		<td class="col-md-2"><input type="text" class="form-control" name="languageName" class="form-control"/></td>' 
            +'      <td class="col-md-2"><select name="languageLevel" class="form-control"><option value="상" name="languageLevel">상</option><option value="중" name="languageLevel">중</option><option value="하" name="languageLevel">하</option></select></td>' 
            +'      <td class="col-md-2"></td>' 
			+'      <td class="col-md-2"></td>' 
			+'      <td class="col-md-2"><select name="publicScope" class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
			+'      <input type="hidden" name="param" value="s6"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s6.style.display = ""; 
}
function addItem_s7() { 
    if(maXnoTh <= s7_noTh)        
    { 
            alert('학력사항은 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s7_noTh = s7_noTh + 1; 

    
    s7.innerHTML=s7.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		<td class="col-md-2"><input type="text" class="form-control" name="academicPeriod" style="width:100%" title="예) 2011.03 - 2014.02"/></td>' 
            +'      <td class="col-md-2"><input type="text" class="form-control" name="academicName" style="width:100%" title="예) 음성고등학교"/></td>' 
            +'      <td class="col-md-2"><input type="text" class="form-control" name="academicMajor" style="width:100%" title="예) 인문계"/></td>' 
			+'      <td class="col-md-2"><select name="academicState" class="form-control"><option value="졸업" name="academicState">졸업</option><option value="재학" name="academicState">재학</option><option value="중퇴" name="academicState">중퇴</option><option value="휴학" name="academicState">휴학</option></select></td>' 
			+'      <td class="col-md-2"><select name="publicScope" class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
			+'      <input type="hidden" name="param" value="s7"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s7.style.display = ""; 
}
function addItem_s8() { 
    if(maXnoTh <= s8_noTh)        
    { 
            alert('병역 항목은 한번에 한 항목씩만 등록할 수 있습니다.'); 
            return; 
    } 
    s8_noTh = s8_noTh + 1; 


    s8.innerHTML=s8.innerHTML 
            +'<table class="table table-hover">' 
            +'	<tr>' 
            +'		<td class="col-md-2"><input type="text" class="form-control" name="militaryPeriod" style="width:100%" title="예) 2012.06.22 - 2014.06.21"/></td>' 
            +'      <td class="col-md-2"><input type="text" class="form-control" name="militaryGroup" title="예) 육군"/></td>' 
            +'      <td class="col-md-2"><input type="text" class="form-control" name="militaryRank" title="예) 병장"/></td>' 
			+'      <td class="col-md-2"><input type="text" class="form-control" name="militaryWork" title="예) 보병"/></td>' 
			+'      <td class="col-md-2"><select name="publicScope" class="form-control"><option value="전체공개" name="publicScope">전체공개</option><option value="교수공개" name="publicScope">교수공개</option><option value="비공개" name="publicScope">비공개</option></select></td>' 
			+'      <td class="col-md-2 text-right"><button title="항목삭제" type="button" class="btn btn-primary btn-xs" onClick="submit()">등록</button></td>' 
			+'      <input type="hidden" name="param" value="s8"/>' 
            +'	</tr>'; 
            +'</table>'; 
    s8.style.display = ""; 
}

