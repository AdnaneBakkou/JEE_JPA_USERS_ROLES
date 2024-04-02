Activité numero 2 

Application didié pour le test des relations entre classe many-many 

Projet contient 2 classes role et user le principe est d'affecter à chaque user plusieurs roles

Le projet est testé sur h2 et aussi mysql 

On a creer 2 user aussi des roles comment student admin et user et on a affecter plusieurs role a un seule user on a testé ça par l'affichage au terminale et aussi sur le web par le
package web et controller pour afficher les données des users et aussi chaques user par id .

Le projet contient aussi un simple test d'authentification et afficage des resultats en terminale à l'aide d'une méthode authenticate qui retour  
                System.out.println("user authentifié");
                 System.out.println(user.getUserId());
                 System.out.println(user.getUsername());
                 System.out.println("roles =>");
                 user.getRoles().forEach(r->{
                     System.out.println("role=>"+r.toString());
                 });
si le mot de passe est corecte sinon elle lance une exception .
