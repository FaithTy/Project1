<!doctype html>
<html>
<head>
	<title>New PHP</title>	
</head>
<body>
		<center>
		<h3>
			<a href="employee-list.php">Employee-list</a>
		</h3>
	<table cellspacing="1.5" border="2px" cellpadding="2">
		<thead>
			<th width="50">ID</th>
			<th width="200">Name</th>
			<th width="60">Job Position</th>
			<th width="60">Date Hired</th>
			<th width ="100">Comment</th>
		</thead>
	<tbody>
	<?php

		$employees = array(
			               "00001" => array( 'id' => '00001' , 'name' => "Faith Daal",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good"),
						   "00002" => array('id' => '00002' , 'name' => "Chloe Cataluna",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good"),
						   "00003" => array('id' => '00003' , 'name' => "Pearl Villarba",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good"),
						   "00004" => array('id' => '00004' , 'name' => "Emmarel Esguerra",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good"),
						   "00005" => array('id' => '00005' , 'name' => "Divine Vasquez",'job' => "Manager",'date' => "September 3, 2000",'comment'=>"very good"));

	
			?>
			

			<form method="get">
		
			<?php foreach($employees as $e ): ?>
			<tr>
			<td><a href="employee-details.php?id=<?php echo $e['id']; ?>"><?php echo $e['id']; ?></a></td>
			<td><a href="employee-details.php?name=<?php echo $e['name']; ?>"><?php echo $e['name']; ?></a></td>
		    <td> <?php echo $e['job']; ?>
		    <td> <?php echo $e['date']; ?>
		    <td> <?php echo $e['comment']; ?>

			<?php endforeach; ?>
		</tr>
		
	</tbody>
	</table>
	</center>
</form>
</body>
</html>