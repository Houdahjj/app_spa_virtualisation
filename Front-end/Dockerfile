# Utilisation de l'image nginx officielle en tant que base
FROM nginx:latest

# Copie des fichiers HTML et Bootstrap dans l'image
COPY templates/ /usr/share/nginx/html/

# Exposition du port 80
EXPOSE 8080

# Commande pour démarrer Nginx
CMD ["nginx", "-g", "daemon off;"]
