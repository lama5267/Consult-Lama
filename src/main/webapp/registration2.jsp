<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ page contentType="text/html;text/css;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
<head>
     <meta charset="UTF-8">
  <title>Регистрация</title>
        <link type='text/css' href="css/login.css" rel="stylesheet" id="login-css">
             	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
 <div class="container">
 <!---heading---->
     <header class="heading"> Регистрация-Progwards</header><hr></hr>
	<!---Form starting---->
<form method="post" action="registration">
<div class="col-xs-4">
          	         <label class="firstname">
                   <div class="form-group">
                     <label for="login2">Введите логин</label></label> </div> </div>
                        <input type="text" class="form-control" id="login2" name="login2" required>

<div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
                     <label class="lastname"> <label for="password2">Введите пароль</label>

                                       		 </div>
<input type="password" id="password2" class="form-control" name="password2" minlength="5" required>
                       <small id="message-length" class="text-danger"></small>
         		 </div>
         		 </div>
 <div class="col-sm-12">
         		     <div class="row">
                              <label class="lastname2"><label for="repeated-password">Повторите пароль</label>
                                                        		     </div>
         		         <input type="password" id="repeated-password" class="form-control" name="repeated-password" minlength="5" required>
  <small id="message-length" class="text-danger"></small>
         <button type="submit" class="btn btn-primary">Далее</button>
         <a class="nav-link" href="${pageContext.request.contextPath}/login">Уже зарегистрирован!</a>
         </form>
            </div>
</body>
</html>
