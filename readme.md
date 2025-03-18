# Instrucciones para levantar la app

Como requisito previo se debe contar con:
  * Maven
  * JDK (JDK 11 o superior)
  * Postman (opcional para probar realizar las peticiones)

Primero hay que clonar el repositorio

git clone https://github.com/leoduville/Ejercicio-Java-JR

Nos paramos en el directorio raíz

cd product-app

Levantamos el proyecto con Maven

mvn spring-boot:run

# Probando la API

1. Crear un producto
  
   - URL: http://localhost:8080/products
   - Método: POST
   - Body (JSON): {
            "name": "Product 1",
            "description": "Description 1",
            "price": 100.0,
            "quantity": 50
        }

2. Obtener un producto por id
  
   - URL: http://localhost:8080/products/{id}
   - Método: GET

3. Obtener un producto por nombre
  
   - URL: http://localhost:8080/products/name/{name}
   - Método: GET

4. Actualizar un producto
  
   - URL: http://localhost:8080/products/{id}
   - Método: PUT
   - Body (JSON): {
            "name": "Product 1",
            "description": "Description 1",
            "price": 200.0,
            "quantity": 50
    }

5. Eliminar un producto
  
   - URL: http://localhost:8080/products/{id}
   - Método: DELETE

6. Obtener productos ordenados por precio
  
   - URL: http://localhost:8080/products
   - Método: GET


