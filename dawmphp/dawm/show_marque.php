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
	<title>consultation de la marque <?= $nom ?></title>
</head>
<body>
	Détails de la marque 
	<h2><?= $nom ?></h2>
	<img src="<?= 
	$chemin ?>" alt="">
	<a href="#" onclick="history.go(-1)">Retour</a>
</body>
</html>