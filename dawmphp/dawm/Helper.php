<?php 
/*create table produit(
id int primary  key auto_increment,
libelle varchar(100),
prix float
)*/
/*
$cnx=new PDO("mysql:host=localhost;dbname=dawm","root","");
$rp=$cnx->prepare("insert into produit(libelle,prix) values ('hp',900)");
$rp->execute();*/
function connecter(){
$cnx=new PDO("mysql:host=localhost;dbname=dawm","root","");
return $cnx;
}
function ajouter($libelle="",$prix=0,$categorie_id,$chemin=""){
	$cnx=connecter();
$rp=$cnx->prepare("insert into produit(libelle,prix,categorie_id,chemin) values (?,?,?,?)");
$rp->execute(array($libelle,$prix,$categorie_id,$chemin));
}
function ajouter_marque($nom="",$chemin=""){
	$cnx=connecter();
$rp=$cnx->prepare("insert into marque(nom,chemin) values (?,?)");
$rp->execute(array($nom,$chemin));
}
function supprimer($id,$table="produit"){
	$cnx=connecter();
$rp=$cnx->prepare("delete from $table where id=?");
$rp->execute(array($id));
}
function modifier($id,$libelle="",$prix=0){
	$cnx=connecter();

$rp=$cnx->prepare("update produit set libelle=? , prix=? where id = ?");
$rp->execute(array($libelle,$prix,$id));
}
function modifier_marque($id,$nom="",$chemin=""){
	$cnx=connecter();
	if(!empty($chemin)){
$rp=$cnx->prepare("update marque set nom=? , chemin=? where id = ?");
$rp->execute(array($nom,$chemin,$id));

}
else{ 
$rp=$cnx->prepare("update marque set nom=?  where id = ?");

$rp->execute(array($nom,$id));
}

}
function getall($table="produit"){
	$cnx=connecter();
$rp=$cnx->prepare("select * from  $table order by id desc");
$rp->execute(array());
$data=$rp->fetchall();

return $data;
}
function get_by($condition,$table="produit"){
	$cnx=connecter();
$rp=$cnx->prepare("select * from  $table where $condition order by id desc");
$rp->execute(array());
$data=$rp->fetchall();

return $data;
}

function get_id($id,$table ="produit"){
	$cnx=connecter();
$rp=$cnx->prepare("select * from  $table where id=?");
$rp->execute(array($id));
$l=$rp->fetch();
return $l;
}
function getMessage($a){
	$message="";
switch ($a) {
	case "create":
	$message="Ajout effecté avec succès";	
		break;
	case "delete":
	$message="suppression effectée avec succès";
	
		break;	
			case "update":
	$message="modification effectée avec succès";
	
		break;
	default:
		// code...
		break;
}
echo  $message;
}

function charger($infos, $dossier="images"){
$nom=$infos['name'];
$tmp=$infos['tmp_name'];
$taille=filesize($tmp);
$ext=pathinfo($nom, PATHINFO_EXTENSION);
$autorises=array('png','jpg','pdf','doc','docx');

if (!in_array(strtolower($ext),$autorises)) {
die("Type de fichier non autorisé");	

}
 if($taille>8000000){
die("fichier volumineu");

}
$chemin=$dossier."/".md5(date('ymdihs').rand(0,9999)).".".$ext;

if(move_uploaded_file($tmp, $chemin)) {
return $chemin;
}else {
	die("une erreur est survenue lors de l'upload du fichier");
}

}