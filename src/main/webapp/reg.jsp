<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ page contentType="text/html;text/css;charset=UTF-8" language="java" %>
<!Doctype html>
<html>
<head>
     <meta charset="UTF-8">
  <title>Вход в систему</title>
        <link type='text/css' href="css/login2.css" rel="stylesheet" id="login2-css">
             	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
 <div class="container">
 <!---heading---->
     <header class="heading"> Registration-Form</header><hr></hr>
	<!---Form starting---->

	<div class="row ">
	 <!--- For Name---->
         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">First Name :</label> </div>
		         <div class="col-xs-8">
		             <input type="text" name="fname" id="fname" placeholder="Enter your First Name" class="form-control ">
             </div>
		      </div>
		 </div>


         <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
                     <label class="lastname">Last Name :</label></div>
				<div class ="col-xs-8">
		             <input type="text" name="lname" id="lname" placeholder="Enter your Last Name" class="form-control last">
                </div>
		     </div>
		 </div>
		 <div class="col-sm-12">
         		     <div class="row">
         			     <div class="col-xs-4">
                              <label class="lastname2">Last Name :</label></div>
         				<div class ="col-xs-8">
         		             <input type="text" name="lname" id="lname" placeholder="Enter your Last Name" class="form-control last">
                         </div>
         		     </div>
         		 </div>
     <!-----For email---->
		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="mail" >Email :</label></div>
			     <div class="col-xs-8"	>
			          <input type="email" name="email"  id="email"placeholder="Enter your email" class="form-control" >
		         </div>
		     </div>
		 </div>
	 <!-----For Password and confirm password---->
          <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="pass">Password :</label></div>
				  <div class="col-xs-8">
			             <input type="password" name="password" id="password" placeholder="Enter your Password" class="form-control">
				 </div>
          </div>
		  </div>

     <!-----------For Phone number-------->
         <div class="col-sm-12">
		     <div class ="row">
                 <div class="col-xs-4 ">
			       <label class="gender">Gender:</label>
				 </div>

			     <div class="col-xs-4 male">
				     <input type="radio" name="gender"  id="gender" value="boy">Male</input>
				 </div>

				 <div class="col-xs-4 female">
				     <input type="radio"  name="gender" id="gender" value="girl" >Female</input>
			     </div>

		  	 </div>
		  	 <form method="post" action="/auth">
                                <div class="input-group mb-3">
                                    <div class="input-group-append">
                                        <span class="input-group-text"><i class="fas fa-user"></i></span>
                                    </div>
                                    <input type="text" name="login" class="form-control input_user" value="" placeholder="username">
                                </div>
                                <div class="input-group mb-2">
                                    <div class="input-group-append">
                                        <span class="input-group-text"><i class="fas fa-key"></i></span>
                                    </div>
                                    <input type="password" name="password" class="form-control input_pass" value="" placeholder="password">
                                </div>
                                <div class="form-group">
                                    <div class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input" id="customControlInline">
                                        <label class="custom-control-label" for="customControlInline">Remember me</label>
                                    </div>
                                </div>
                                <div class="d-flex justify-content-center mt-3 login_container">

                                    <input type="submit" class="btn login_btn" value="Log In">
                                </div>
                            </form>
         <a class="nav-link" href="${pageContext.request.contextPath}/show1">Главная</a>
		   </div>
		 </div>
	 </div>

</div>
</div>

</body>
</html>
