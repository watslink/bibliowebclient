****************************************** BiblioWebClient **********************************************

Client pour le service BiblioService
Projet Maven multimodules.
JEE 8.

----------
Package
----------

Packagez l'application avec la commande "package mvn"

----------------------------
Déploiement Application Web
----------------------------

Déployez l'artefact "bibliowebclient-webapp-1.0-SNAPSHOT.war" du module bibliowebclient-webapp dans un serveur
d'application Tomcat 9
(!! Attention à utiliser un port différent du web service si serveur commun)

Connection test:
identifiant: melissa.hamon
mot de passe: motdepasse

-------------------
Déploiement Batch
-------------------

Extraire le contenu du Zip "bibliowebclient-batch-1.0-SNAPSHOT-batch-app-dist.zip" contenu dans le dossier target du
module bibliowebclient-batch
Cette archive à été généré par Maven.

Configurer le mail émetteur dans le fichier conf/batch.properties (les valeurs par défaut correspondent au mail test
et peuvent être utilisées.

Lancement du batch: executer start.sh dans le dossier bin.

Un mail de relance est envoyé tous les jours à 9h aux utilisateurs n'ayant pas rendu leurs livres dans les délais





