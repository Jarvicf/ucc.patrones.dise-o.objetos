ucc.patrones.dise-o.objetos

📘 Patrones de Diseño Orientado a Objetos

🏫 Curso de Patrones de Diseño  - UCC - 2025

Repositorio creado para la materia Patrones de Diseño Orientado a Objetos.

👨‍🏫 Docente

Harold Adrián Bolaños Rodríguez

📌 Introducción

Los patrones de diseño proporcionan soluciones eficientes a problemas comunes en el desarrollo de software. En esta semana, estudiamos dos patrones creacionales:

🏛️ Singleton: Garantiza una única instancia de una clase en toda la aplicación.

🏭 Factory Method: Facilita la creación de objetos sin especificar sus clases concretas.

1️⃣ Patrón Singleton

🔹 Definición

Permite asegurar que una clase tenga solo una instancia y proporciona un punto de acceso global a ella.

🔹 Caso de Uso: Logger en una Aplicación Bancaria

Para registrar eventos como inicio de sesión, transacciones y errores, evitando múltiples instancias del Logger.

✅ Cuándo Usarlo

Gestión de recursos compartidos (conexiones a BD, logs).

Configuración centralizada en una aplicación.

❌ Casos donde NO usarlo

Aplicaciones altamente concurrentes.

Sistemas distribuidos con múltiples nodos.

2️⃣ Patrón Factory Method

🔹 Definición

Permite la creación de objetos sin especificar sus clases concretas, delegando la lógica de instanciación a una fábrica.

🔹 Caso de Uso: Creación de Vehículos

Una fábrica de automóviles genera autos eléctricos y de gasolina sin especificar directamente la clase concreta.

✅ Cuándo Usarlo

Para flexibilizar la creación de objetos.

Para evitar dependencias directas entre clases.

📚 Conclusión

🏛️ Singleton es útil para instancias únicas, pero puede causar problemas en aplicaciones multihilo.

🏭 Factory Method mejora la flexibilidad y desacoplamiento en la creación de objetos.
