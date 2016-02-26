<form action="" method="get" >
    <input type="text" name="un"> 
    <input type="password" name="un2" />
    <input type="submit" value="submit" name="submit" />
</form>

<?php 
    $users1 = $_GET["un"];
    $id     = $_GET["un2"];
    echo $users1;
?>