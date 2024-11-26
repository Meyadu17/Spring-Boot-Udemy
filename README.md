En déplaçant les pages static et template dans un autre projet (invoise-web) et en délaçant le controller web notre projet se comporte maintenant comme une 
librairie et n'a donc plus besoin de SpringBoot mais seulement de Spring.  
Ainsi, on ajoute un package que l'on nomme core dans lequel on met le code actuel et on supprime le lanceur App, car il n'a plus lieu d'être.

applicationContext.xml est aussi à supprimer, car il n'a plus d'utilité. Voici quand même un exemple du fichier :
````xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    https://www.springframework.org/schema/context/spring-context.xsd">

    <context:property-placeholder location="classpath:application.properties"/>

    <context:component-scan base-package="fr.apside.demo.exerciceSpring.controller.web"/>
    <context:component-scan base-package="fr.apside.demo.exerciceSpring.service.prefix"/>
    <context:component-scan base-package="fr.apside.demo.exerciceSpring.repository.memory"/>

</beans>
````

On peut aussi déplacer ce que l'on avait configuré dans le fichier application.properties dans le nouveau projet (Il existe d'autre manière de faire).  

---
Spring est un framework qui simplifie l'injection de dépendance, les opérations et les interactions avec la BDD, permet de faire des 
APIRest et permet la programmation orientée aspect.

L'injection de dépendance stipule que :
- Les classes ne doivent pas instancier pleurs dépendances
- Les classes doivent instancier leurs dépendances
- Les classesne doivent pasavoir de dépendance