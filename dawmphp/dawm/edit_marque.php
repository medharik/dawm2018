<?php 
include_once 'Helper.php';
extract($_GET);//$id
if(isset($id) && !empty($id)){
$marque=get_id($id, "marque");
if(!empty($marque))
extract($marque);
else die("erreur marque");
}else {
	die("Erreur id");
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>edition du marque <?= $nom ?></title>
</head>
<body>
	
	<h2>edition de marque <?= $nom ?></h2>
	<form action="c_marques.php?a=update" method="post" enctype="multipart/form-data">
		<input type="hidden" name="id" value="<?=$id ?>">
		<table align="center">
			<tr>
				<td>nom</td>
				<td><input type="text" name="nom" value="<?= $nom ?>"></td->
			</tr>
			<tr>
				<td>photo</td>
				<td><input type="file" name="logo"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Modifier <?= $nom ?>"></td->
			</tr>
		</table>
	</form>	
	<?= $nom ?>
	<img src="<?= $chemin; ?>" alt="">
</body>
</html>