var myApp= angular.module("myApp", []);

myApp.controller("IndexController", function($scope,$http) {
	$scope.menu=["Inscription Etudiant","List des Etudiants","Gestion des Utilisateurs","Logout"];
	$scope.selectedMenu=null;
	
	$scope.select=function(m){
		$scope.selectedMenu=m;
	};
});

myApp.controller("listEtudiantsController", function($scope,$http) {
	$scope.pageEtudiants=null;
	$scope.pageCourante=0;
	$scope.size=5;
	
	$scope.listEtudiants=function(){
		$http.get("listEtudiants?page="+$scope.pageCourante+"&size="+$scope.size)
				.success(function(data) {
					$scope.pageEtudiants=data;
				})
	};
	$scope.listEtudiants();
});


myApp.controller("InscriptionController", function($scope,$http) {
	$scope.etudiant={};
	$scope.errors=null;
	$scope.mode={value:"form"};
	
	$scope.ajouterEtudiant=function(){
		$http.post("ajouterEtudiant",$scope.etudiant)
		        .success(function(data) {
		        	if(!data.errors){
		        	$scope.etudiant=data;
		        	$scope.errors=null;
		        	$scope.mode.value="confirm";
		        }
		        	else{
		        		$scope.errors=data;
		        	}
		        });
				
	};
	
	$scope.annuler=function(){
		$scope.etudiant=null;
	};
});