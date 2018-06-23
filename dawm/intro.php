<?php 
$nom='ali';
$prenom="mohamed";
$nomcomplet=$nom.' '.$prenom;
$test=&$nom;
$nom="simo";
$age=intval("8");
$m=$age>18;
var_dump($m);
var_dump($age);
if ($m) {
	$class= "maj";
	$majorite="majeur";
}else {
	//print "<h2>mineur</h2>";
	$class="min";
	$majorite="mineur";
}
$tab=["hp","dell","sony"];//tab indexé
echo $tab[0];
$hp=array("libelle"=>"hp dv6","prix"=>8000,"marque"=>"hp");//tab associatif
echo $hp['libelle'];
$menu=array("contact"=>"contact.php","qui sommes nous ?"=>"aporpos.php","nos projets"=>"projet.php","galerie"=>"g.php","nos marques"=>array("hp"=>"hp.php","dell"=>"dell.php"));
//var_dump($tab);
 ?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>intro php</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
<ul>
	<li><a href="#">Nom: <?php echo $nom ?> </a></li>
	<li><a href="#">Prénom 2 <?= $prenom ?> </a></li>
	<li><a href="#">Nom complet : <?=$nomcomplet ?></a></li>
</ul>
<h2 class="<?= $class?>"><?= $majorite ?></h2>
<h4>vous avez : <?= count($tab); ?>
 produit<?=(count($tab)>1)? "s":"" ; ?>	</h4>
<ul>
<?php foreach ($tab as $c=>$v): ?>

<li> produit <?= $c ?>	: <?= $v ?></li>
<?php endforeach ?>
</ul>













<div class="menu">
	<?php foreach ($menu as $m=>$l): ?>


		<?php if (!is_array($l)): ?>
			<a href="<?= $l; ?>" class="<?= (strlen($m)>10)? "long":"" ; ?>"><?= $m ?></a>
		<?php else: ?>

			<?php foreach ($l as $c=>$v): ?>
					<a style="background: green" href="<?= $v; ?>" class="<?= (strlen($c)>10)? "long":"" ; ?>"><?= $c ?></a>
			<?php endforeach ?>
		<?php endif ?>

	<?php endforeach ?>

</div>

<h2>informations du produit hp</h2>
<ul>
	<?php foreach ($hp as  $c=>$v): ?>
	<li><?= $c ?> est : <?=$v ?></li>	
	<?php endforeach ?>
</ul>

<hr>


	
</div>
</body>
</html>




