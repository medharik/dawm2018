<?php 
include 'Helper.php';
extract($_POST);//$nom
extract($_GET);//$a,$id

switch ($a) {
	case "create":
$chemin="";
	if(isset($_FILES)){
$chemin=charger($_FILES['logo'], "images");
}
			ajouter_marque($nom, $chemin);
			
		break;

	case "delete":
			supprimer($id,"marque");
		break;
case "editer":
			header("location:edit_marque.php?id=$id");
			die();
		break;
		case "show":
			header("location:show_marque.php?id=$id");
			die();
		break;












	case "update":
			$chemin="";
	if(isset($_FILES) && !empty($_FILES['logo']['name'])){

var_dump($_FILES['logo']);
$chemin=charger($_FILES['logo'], "images");
}
			modifier_marque($id,$nom, $chemin);
			
		break;
				

	default:
		// code...
		break;

}
//redirection 
header("location:v_marques.php?n=$a");






?>





