
## Informations

Ce repo git contient l'API Rest utilisée par le site https://photogrammetrie-front.herokuapp.com

## Installation

Prérequis : VM Fedora 34

Voici les étapes à suivre :

Ouvrir le terminal et taper dans l'ordre :

```sudo dnf install eclipse```

```git clone https://github.com/HenriBoulnois/photogrammetrie-back.git```

```eclipse &```

Dans Eclipse : Menu Help > Install new software
Work with "All available site"
Dans la barre de recherche "maven"
Ajouter le premier résultat "m2e" (voici le lien : https://download.eclipse.org/technology/m2e/discovery/directory-1.15.xml )

Redémarrer Eclipse

Dans Eclipse : Menu File > Import > Maven > Existing Maven Projet 
Sélectionner "photogrammetrie-back" qui se situe dans le dossier parent

Dans le projet : back_photogrammetrie > src/main/java/com.back_photogrammetrie > BackPhotogrammetrieApplication.java
Clique droit cette classe et sélectionner "Run as Java Application"

Lancer Firefox

Taper l'url ```localhost:8080/api/contact```

## Utilisation

Une collection Postman est présente à la racine du projet, elle contient les méthodes POST, GET et DELETE.

### Requètes
#### GET 
`https://photogrammetrie-back.herokuapp.com/api/contact`
Retourne tous les contacts
#### DELETE 
`https://photogrammetrie-back.herokuapp.com/api/contact/1`
Le contact 1 est supprimé
#### POST
`https://photogrammetrie-back.herokuapp.com/api/contact`
Exemple json : 
```
{

"name":"Mona",

"email":"Mona@lisa.test",

"date":"2022-02-14T20:53:54.418Z",

"message":"Hello World"

}

