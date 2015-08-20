/**
 * Created by h0ngz on 2015. 8. 18..
 */


function signup_validate(form)
{
    if(!form.memberId.value)
    {
        alert('아이디를 입력해주세요.');
        form.memberId.focus();
        return true;
    }
    else if(form.memberId.value.length < 5)
    {
        alert('아이디는 5자리 이상이어야 합니다.');
        form.memberId.focus();
        return true;
    }
    else if(!form.memberName.value)
    {
        alert('이름을 입력해주세요.');
        form.memberName.focus();
        return true;
    }
    else if(!form.memberPassword.value)
    {
        alert('패스워드를 입력해주세요');
        form.memberPassword.focus();
        return true;
    }

    else if(!form.memberPassword_Re.value)
    {
        alert('패스워드 확인을 입력해주세요.');
        form.memberPassword_Re.focus();
        return true;
    }

    else if(form.memberPassword_Re.value!=form.memberPassword.value)
    {
       alert('패스워드 입력값이 서로 다릅니다.');
        form.memberPassword.focus();
        return true;
    }

    else if(form.memberPassword.value.length < 6)
    {
        alert('비밀번호는 최소 6자리 이상이어야 합니다.');
        form.memberPassword.focus();
        return true;
    }

    else {
        form.submit();
    }
}


function login_validate(form)
{
    if(!form.memberId.value)
    {
        alert('아이디를 입력해주세요.');
        form.memberId.focus();
        return true;
    }
    else if(!form.memberPassword.value)
    {
        alert('패스워드를 입력해주세요');
        form.memberPassword.focus();
        return true;
    }
    else
    {
        form.submit();
    }
}


