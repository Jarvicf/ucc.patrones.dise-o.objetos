📘 Guía de Estudio: Patrón Object Pool

🏫 Universidad Cooperativa de Colombia

📚 Curso: Patrones de Diseño OO - Semana 7

👨‍🏫 Docente: Ing. Harold Adrián Bolaños Rodríguez, MSc

📌 Descripción

Este documento explora el patrón de diseño creacional Object Pool, el cual permite la reutilización de objetos en lugar de crear nuevas instancias cada vez que se necesitan. Este enfoque mejora la eficiencia en sistemas donde la creación de objetos es costosa en términos de recursos y rendimiento.

📖 Contenido

🔹 Conceptos Claves

✅ Definición del patrón Object Pool.
✅ Cuándo aplicarlo y cuándo evitarlo.
✅ Casos de uso en aplicaciones financieras, turísticas y médicas.
✅ Problemas comunes y cómo solucionarlos.

🔹 Casos de Uso

1️⃣ Gestión de conexiones a bases de datos → Reutilización de conexiones activas para mejorar el rendimiento en aplicaciones bancarias.
2️⃣ Administración de vehículos turísticos → Asignación eficiente de recursos en agencias de viajes.
3️⃣ Manejo de equipos de realidad virtual (VR) → Optimización del uso de dispositivos en parques de diversiones.
4️⃣ Gestión de camillas en hospitales → Uso eficiente de camillas para atención de emergencias.

🔹 Problemas Comunes (Antipatrones)

❌ No liberar los objetos al Pool → Puede generar fugas de memoria.
❌ Sincronización deficiente en entornos concurrentes → Riesgo de corrupción de datos.
❌ Creación de un Pool demasiado grande → Consumo excesivo de memoria.

📚 Conclusión

El patrón Object Pool es una estrategia efectiva para optimizar el rendimiento en sistemas que requieren la reutilización de objetos costosos. Sin embargo, su implementación debe considerar la administración eficiente del pool, la sincronización en entornos concurrentes y la correcta liberación de los objetos para evitar fuga de memoria.