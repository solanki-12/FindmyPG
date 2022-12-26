<head>
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<Style>
body
{
	background-image:url("images/S.jpg");
	background-size:100% 100%;
	background-repeat:no-repeat;
	color:white;
}

h1
{
	margin-left:26%;
	margin-top:8%;
	padding-top:15px;
	color:lime;
}

form
{
	margin-left:16%;
	margin-top:5%;
	padding-top:10px;
}
.submit
{
	width:270px;
	background-color:purple;
	color:white;

}

.l
{
	color:lime;
	font-style:lato;
	font-size:20px;
}

.l1
{
   margin-left:17%;
   color:red;
}
.l2
{
   margin-left:12%;
   color:yellow;
}
.l3
{
   margin-left:45%;
   color:aqua;
}

.Box
{
	margin-left:35%;
	margin-top:10%;
	width:800px;
	height:550px;
	background-color:navy;
	border:solid purple;
}
.Textfield
{
	width:270px;
	background-color:transparent;
	color:lime;

}
</Style>
<title>Login</title>
</head>

<body class="Login">

<div style="font-size:50px;">
<marquee behaviour="scrolling" scrollamount="10" bgcolor="navy">Welcome Anuj Solanki</marquee>
</div>
<div class="Box">
<h1>Registeration</h1>
<form action="http://localhost:8081/registersave" method="post">
<l>First Name :  </l>
<input class="TextField" type="text" name="firstname" ><br>

<l>Last Name :</l>
<input class="TextField" type="text" name="lastname" ><br><br><br>

<l>phone Number :</l><br>
<input class="TextField" type="text" name="phone" ><br><br><br>


<l>password :</l><br>
<input class="TextField" type="password" name="password" ><br><br><br>

<l>Address :</l><br>
<textarea class="TextField" name="address" rows="4" cols="50"></textarea><br><br><br>


<input class="submit" type="submit" value="Sign in" ><br><br>



</form>
<a class="l1" href="ForgotPasswordController1.jsp">Forgot  Password</a>

</div>
