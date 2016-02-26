<?php
	
	if(isset($_GET['id']))
		$key=$_GET['id'];
	if(isset($_GET['name']))
		$key=$_GET['name'];
	
	$employees = array(
		 "00001" => array( 'id' => '00001' , 'name' => "Faith Daal",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good" ,'addrss' => "Candabong,Alcantara,Cebu",'number' => "091235675754",'st' => "Taken",'cit' => "Filipino" , 'spouse' => "Jayson Carl Gabales" ),
		 "00002" => array('id'  => '00002' , 'name' => "Chloe Cataluna",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good" ,'addrss' => "Candabong,Alcantara,Cebu",'number' => "091235675754",'st' => "Taken",'cit' => "Filipino" , 'spouse' => "Dave Puti" ),
		 "00003" => array('id'  => '00003' , 'name' => "Pearl Villarba",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good" ,'addrss' => "Candabong,Alcantara,Cebu",'number' => "091235675754",'st' => "Taken",'cit' => "Filipino" , 'spouse' => "Jhonney Deepweb" ),
		 "00004" => array('id'  => '00004' , 'name' => "Emmarel Esguerra",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good" ,'addrss' => "Candabong,Alcantara,Cebu",'number' => "091235675754",'st' => "Taken",'cit' => "Filipino" , 'spouse' => "Wa el Hi" ),
		 "00005" => array('id'  => '00005' , 'name' => "Divine Vasquez",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good" ,'addrss' => "Candabong,Alcantara,Cebu",'number' => "091235675754",'st' => "Taken",'cit' => "Filipino" , 'spouse' => "Eddyson Babista" )
    );
	
	$id="0000";
	
	foreach($employees as $e){
		if($e['id']==$key||$e['name']==$key)
			$id=$e['id'];
	}	
	
	
			
	if($id=="0000")
	{
		echo "Employee not found.";
		exit();
	}
	else
	{
		$e = $employees[$id];
		
	}




?>

<h1>Employee Details</h1>

<div>ID#: <?php echo htmlentities($e['id']); ?></div>
<div>Name: <?php echo htmlentities($e['name']); ?></div>
<p>
	
	<label>Position:<?php echo htmlentities($e['job']); ?></label><br>
	<label>Date Hired:<?php echo htmlentities($e['date']); ?><br>
	<label>Comment:<?php echo htmlentities($e['comment']); ?><br>
	<label>Address:<?php echo htmlentities($e['addrss']); ?><br>
	<label>Marital Status:<?php echo htmlentities($e['st']); ?><br>
	<label>Citizenship:<?php echo htmlentities($e['cit']); ?><br>
    <label>Spouse:<?php echo htmlentities($e['spouse']); ?><br>
	<label>Contact number:<?php echo htmlentities($e['number']); ?><br>
</p>
