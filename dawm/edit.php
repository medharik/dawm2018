<?php 
include_once 'Helper.php';
extract($_GET);//$id
$produit=get_id($id);
extract($produit);
 ?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>edition du produit <?= $libelle ?></title>
</head>
<body>
	
	<h2>edition du produit <?= $libelle ?></h2>
	<form action="c.php?a=update" method="post">
		<input type="hidden" name="id" value="<?=$id ?>">
		<table align="center">
			<tr>
				<td>libellé</td>
				<td><input type="text" name="libelle" value="<?= $libelle ?>"></td->
			</tr>
			<tr>
				<td>prix</td>
				<td><input value="<?= $produit['prix'] ?>" type="text" name="prix"></td->
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Modifier <?= $libelle ?>"></td->
			</tr>
		</table>
	</form>	
</body>
</html>