# WebService-Donuts
TD de mise en pratique :
Créez un nouveau projet Web (sans aucune option supplémentaire)
- Ecrivez un nouveau WSDL permettant trois opérations
- deposerUnDonut qui reçoit une chaîne de caractère en entrée (qui décrit le topping du donut)
et retourne un booléen pour dire si le donut a bien été stocké.
- nombreDonutsDisponibles qui ne reçoit aucun paramètre et retourne un entier
- recevoirDonuts qui reçoit le nombre de donuts souhaités (si disponibles) et retourne
une séquence (liste) de chaînes de caractères (les toppings de chaque donut)
- Implantez le WSDL en Java en générant un squelette
- Testez directement avec l'option de test de WebService de Netbeans
- Testez en écrivant un nouveau projet Java (client Java lourd ou client JEE
Web) qui implantera un client Java (techno de votre choix)
- Il déposera 4 donuts, demandera le nombre de donuts disponibles et recevra 2
donuts.
- Pour les groupes rapides, l'IHM et les possibilités d'interaction seront plus riches.

Il faut deployer le projet sur un server GlassFish :
  - WSDL : http://localhost:8080/TP2_Donuts/DonutsWSDLService?WSDL
  - Tester : http://localhost:8080/TP2_Donuts/DonutsWSDLService?Tester

M2 ICE 2016/2017 University of Toulouse II.
Enseignant : Jean-Christophe Sakdavong (University of Toulouse, Toulouse).
