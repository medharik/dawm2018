<?php 
include_once 'Helper.php';
extract($_GET);//$id
$produit=get_id($id);
extract($produit);
//salut
 ?>
<!--  test
--><!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>consultation du produit <?= $libelle ?></title>
</head>
<body>
		<h2>consultation du produit :  <?=$libelle ?></h2>
	<ul>
		<li><?= $libelle ?></li>
		<li><?=$prix ?></li>
	</ul>
</body>
</html>













