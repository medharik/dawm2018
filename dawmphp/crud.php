<?php 
include_once 'Helper.php';
$produits=getall();
//var_dump($produits);
extract($_GET);//$n
 ?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>crud </title>
</head>
<body>
<?php if (isset($n)): ?>
	<?php  getMessage($n); ?>
<?php endif ?>

	<div class="alert">
		

	</div>
<form action="c.php?a=create" method="post">
		<table align="center">
			<tr>
				<td>libellé</td>
				<td><input type="text" name="libelle"></td->
			</tr>
			<tr>
				<td>prix</td>
				<td><input type="text" name="prix"></td->
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="valider"></td->
			</tr>
		</table>
	</form>	
	<hr>
	<table width="90%" border="1" align="center">
		<tr>
			<td>#</td>
			<td>libellé</td>
			<td>prix</td>
			<td>actions</td>
		</tr>

<?php foreach ($produits as $l): ?>
	<tr>
			<td><?=$l['id']; ?></td>
			<td><?=$l['libelle']; ?></td>
			<td><?=$l['prix']; ?></td>
	<td><a href="c.php?a=delete&id=<?=$l['id']; ?>">Supprimer</a>
			<a href="c.php?a=edit&id=<?=$l['id']; ?>">Editer</a>
			<a href="c.php?a=show&id=<?=$l['id']; ?>">Consulter</a></td>
	</tr>
<?php endforeach ?>

		
	</table>

</body>
</html>