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
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="style.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<?php if (isset($n)): ?>
	<?php  getMessage($n); ?>
<?php endif ?>

	<div class="alert">
		

	</div>
<form action="c.php?a=create" method="post" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<td>libellé</td>
				<td><input required="" type="text" name="libelle"></td>
			</tr>
			<tr>
				<td>prix</td>
				<td><input type="text" name="prix"></td>
			</tr>
			<tr>
				<td>Photo </td>
				<td><input type="file" required="" name="photo"></td>
			</tr>
			<tr>
				<td>Marques </td>
				<td>
<input type="text" list="liste" required="" name="categorie_id">

	<datalist  id="liste" >
	<option value=""  selected="" >Choisissez une marque</option>


<?php $marques=getall('marque'); ?>
<?php foreach ($marques as $m): ?>
	<option value="<?=$m['id'] ?>"> 
		<?=$m['nom'];  ?>
	</option>
<?php endforeach ?>
	

					</datalist>

				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="valider" class="btn btn-primary"></td->
			</tr>
		</table>
	</form>	
	<hr>
	<table class="table table-striped" width="90%" border="1" align="center">
		<tr>
			<td>#</td>

			<td>libellé</td>
			<td>prix</td>
			<td>actions</td>
		</tr>

<?php foreach ($produits as $l): ?>
	<tr>
			<td>
<?php if ( !empty($l['chemin'])): ?>
					
				<?php endif ?>
<img src="<?= $l['chemin'] ?>" alt="" width="100">
				<br><?=$l['id']; ?></td>
			<td><?=$l['libelle']; ?></td>
			<td><?=$l['prix']; ?></td>
	<td><a class="btn btn-sm btn-danger" href="c.php?a=delete&id=<?=$l['id']; ?>">Supprimer</a>
			<a href="c.php?a=edit&id=<?=$l['id']; ?>" class="btn btn-sm btn-warning">Editer</a>
			<a href="c.php?a=show&id=<?=$l['id']; ?>" class="btn btn-sm btn-info">Consulter</a></td>
	</tr>
<?php endforeach ?>

		
	</table>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>