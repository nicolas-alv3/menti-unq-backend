# Menti-UNQ backend

## Para correr la app:

Se puede correr con
`bash run.sh`, o bien corriendo la app desde intellij y levantando docker compose a mano `docker compose up`

![configImage.png](/src/main/resources/configImage.png)

### Versiones
- Java SDK 11
- Springboot 2.7.3
- Maven 3.8.6

### Diagrama de clases

[Link al drive](https://app.diagrams.net/#G1YICNg5vj1PZvs2D5bFTnru9EpZPZcNd0)
![classDiagram.png](/src/main/resources/class_diagram.png)

## Docker

Para levantar el contenedor de postgres debemor correr `docker compose up` parados en el root del proyecto.
Podemos configurar DataGrip de la siguiente forma para crear la conexión
![img.png](src/main/resources/postgres_config.png)


### Swagger

Acceder luego de levantar la app a: http://localhost:8080/swagger-ui.html