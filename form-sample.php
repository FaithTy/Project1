<?php

	//print_r($_POST);
	if(isset($_POST['name']))
	{
		echo "<br>Hi ", $_POST['name'], ", ";
		echo "you are ", $_POST['age'], " years old.";
		echo "<br><br>";
	}
?>
<html>
<body>
<form method="post">
  Name: <input type="text" name="name" 
			value="<?php if(isset($_POST['name'])) { echo htmlentities($_POST['name']); } ?>" />
  Age: <input type="text" name="age"/>
  <input type="submit" value="Submit" />
</form>
</body>
</html>
