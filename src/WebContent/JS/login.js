/**
 *
 */
function validateForm() {
  var id = document.forms["login_form"]["ID"].value;
  var password = document.forms["login_form"]["PW"].value;

  if (id == "" || password == "") {
    alert("IDとパスワードを入力してください。");
    return false;
  }
}

// フォームの送信時にvalidateForm()関数を実行する
document.getElementById("login_form").onsubmit = validateForm;