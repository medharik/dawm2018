<?php 
include 'Helper.php';
extract($_GET);
$marques=getall("marque");

 ?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>marques</title>
</head>
<body>
	
	<?php if (isset($n)): ?>
		<?php  getMessage($n); ?>
	<?php endif ?>

<form action="c_marques.php?a=create"
 method="post" enctype="multipart/form-data">
		<table align="center" width="300">
			<tr>
				<td>nom</td>
				<td><input type="text" name="nom" autocomplete="off" autofocus="on"></td>
			</tr>
			<tr>
				<td>logo</td>
				<td><input type="file" name="logo"></td>
			</tr>
			<tr>
				<td></td>
				<td><button>Valider</button></td>
			</tr>
		</table>
	</form>

	<hr>
	<table border="1" align="center">
		<tr>
			<td>id</td>
			<td>nom</td>
			<td>logo</td>
			<td>actions</td>
		</tr>
<?php foreach ($marques as $m): ?>
	<tr>	<td><?= $m['id'] ?></td>
			<td><?= $m['nom']; ?></td>
			<td><img src="<?= $m['chemin'] ?>" alt="" width="100"></td>
			
			<td>
<a href="c_marques.php?a=delete&id=<?= $m['id'] ?>">Supprimer</a>
			<a href="c_marques.php?a=show&id=<?= $m['id'] ?>">consulter</a>
			<a href="c_marques.php?a=editer&id=<?=$m['id'] ?>">Editer</a>
<a href="voitures_par_marques.php?cid=<?=$m['id'] ?>">Voitures de <?= $m['nom'] ?></a>
		</td>
		</tr>
<?php endforeach ?>
		
	</table>
</body>
</html>