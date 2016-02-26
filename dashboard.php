

<html>
<style type="text/css">
.css3gradient{width:1450px00px;height:700px;
 background-color:#e2c1e3;
 filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#e2c1e3, endColorstr=#9c529e);
 background-image:-moz-linear-gradient(top, #e2c1e3 36%, #9c529e 100%);
 background-image:-webkit-linear-gradient(top, #e2c1e3 36%, #9c529e 100%);
 background-image:-ms-linear-gradient(top, #e2c1e3 36%, #9c529e 100%);
 background-image:linear-gradient(top, #e2c1e3 36%, #9c529e 100%);
 background-image:-o-linear-gradient(top, #e2c1e3 36%, #9c529e 100%);
 background-image:-webkit-gradient(linear, right top, right bottom, color-stop(36%,#e2c1e3), color-stop(100%,#9c529e));}
</style>
<body class="css3gradient">
<?php
      $mg ="";
  	if(isset($_GET['submit'])){
	  $username=$_GET['username'];
	  $password=$_GET['password'];
	if($username=="admin" && $password="Super123" ||$username=="john.smith" && $password="JOHN5ml+"||$username=="jean.doe" && $password="JeanXMean" ){
		echo 'WELCOME';
		
	}
	  else{
		  echo "Invalid username or password";
		  
	  }
	}
	   
?>
<form action="login.php" class="css3gradient">
<center>
  <br>
  <br>
  <br>
  <label for="message">
  <font size="6" face="Arial Black" color="#A33F3A"><?php echo $mg;?></font></label>
  	<input type="submit" name="submit1" value="Log out"> 
	</form>
</body>


</html>