<%@ page contentType="text/html;text/css;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<head>
    <title>Progwards: Вход на сайт</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
</head>

<body>
<div class="container h-100">
    <div class="d-flex justify-content-center h-100">
        <div class="user_card">
            <div class="d-flex justify-content-center">
                <div class="brand_logo_container">
                    <img src="https://sun9-60.userapi.com/impf/c858428/v858428037/a6fc3/M5_dGvmJdrI.jpg?size=300x300&quality=96&sign=d68f0d7a90622f8443db8c19b281083f&type=album" class="brand_logo" alt="Logo">
                </div>
            </div>
            <div class="d-flex justify-content-center form_container">
                <form method="post" action="user-auth">

                          	          <div class="form-group">

                                            <label for="login1">Логин</label>
                                            <input type="text" class="form-control" name="login1" id="login1" required>
                                        </div>

                                        <div class="form-group">
                                            <label for="password1">Пароль</label>
                                            <input type="password" class="form-control" name="password1" id="password1" required>
                                        </div>
                                        <button type="submit" class="btn btn-primary">Войти</button>
                                         <a class="nav-link" href="${pageContext.request.contextPath}/registration2">Регистрация</a>
                                    </form>

                                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>