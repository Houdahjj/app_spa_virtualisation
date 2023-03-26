# Utilisation de l'image OpenJDK officielle en tant que base
FROM openjdk:20-jdk

# Ajout des fichiers de l'application dans l'image
ADD ../target/app_spa.jar app_spa.jar

# Exposition du port 8080
EXPOSE 9090

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app_spa.jar"]
