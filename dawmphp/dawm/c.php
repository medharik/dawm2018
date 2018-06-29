<?php 
include 'Helper.php';
extract($_POST);//$libelle;$prix
extract($_GET);//$a,$id

switch ($a) {
	case "create":
$chemin="";
	if(isset($_FILES)){
$chemin=charger($_FILES['photo'], "images");
}
			ajouter($libelle, $prix,$categorie_id,$chemin);
			
		break;

	case "delete":
			supprimer($id);
		break;
case "edit":
			header("location:edit.php?id=$id");
			die();
		break;
		case "show":
			header("location:show.php?id=$id");
			die();
		break;












	case "update":
			modifier($id, $libelle, $prix);
			
		break;
				

	default:
		// code...
		break;

}
//redirection 
header("location:crud.php?n=$a");






?>





