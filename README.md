# ProyeccionesJPA
Ejemplos de tipos de proyecciones en Spring Boot utilizando JPA

Las clases definidas como @Entity en Spring Boot son entidades que representan en el mundo de los objetos, el ámbito de las bases de datos entidad-relación.

Java Persistent Api por defecto trabaja con entidades, las cuales tienen la especificación de todas las columnas de una tabla, lo que a veces es considerado una ventaja, otras veces se torna un problema difícil de abordar desde un punto de vista arquitectonico, por ejemplo, cuando necesitamos retornar al cliente solamente algunos de los atributos de nuestros objetos.

En variados proyectos para cumplir con este objetivo los desarrolladores adoptamos algunas técnicas, por ejemplo:
- Mapear o convertir los objetos entitys de forma manual.
- Que nuestra consulta retorne los resultados en una clase genérica como List<Map<Object, Object>> con la cantidad de campos específicos en la consulta, lo que dificulta el trabajo posterior con los atributos.
- Settear en el controlador los atributos con valores default

Todos en algún momento nos hemos ideado más de alguna técnica para retornar solo algunos campos cuando trabajamos con JPA e Hibernate.

Una de las técnicas que me agrada para cumplir con el requerimiento mencionado es el patrón de diseño “Data Transfer Object (DTO)” el cual se refleja en este pequeño proyecto de ejemplo, donde se aplican tres tipos de proyecciones para las entidades:

-	Proyección por interfaz cerrada: En este tipo de proyecciones el nombre de los métodos es igual al nombre de los métodos getter definidos en la entidad, se definen en la interfaz solo los métodos de los campos que se quieren retornar.
-	Proyección por interfaz abierta: En este tipo de proyecciones el nombre de los métodos definidos en la interfaz puede ser diferente a los métodos getter definidos en la entidad, se mapean a través de la notación @Value
-	Proyección a través de clase: En este tipo de proyección se refleja a través de una clase POJO donde el constructor debe tener el nombre de los atributos que se van a retornar al cliente.

```
```