<?php 
include_once 'Helper.php';
extract($_GET);//$cid
$produits=get_by("categorie_id=$cid", "produit");

 ?>
 <!DOCTYPE html>
 <html lang="en">
 <head>
 	<meta charset="UTF-8">
 	<title>Document</title>
 	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
 </head>
 <body>
 	<div class="container" align="center">
 		

 		<?php foreach ($produits as $p): ?>
 			<div class="col-sm-6 col-md-3">
 			<img src="<?=$p['chemin']; ?>" alt="" style="max-width: 100%" >
 			<h2><?=$p['libelle'];?></h2>
 			<h3><?=$p['prix'] ?>DHS</h3>

 		</div>

 		<?php endforeach ?>
 	</div>

 </body>
 </html>